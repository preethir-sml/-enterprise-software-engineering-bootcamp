const http = require("http");
const urlDatabase = new Map();
const crypto = require("crypto");
const server = http.createServer((req, res) => {
    if (req.method === "POST" && req.url === "/shorten") {
        let body = "";
        req.on("data", chunk => {
            body += chunk;
        });
        req.on("end", () => {
            const data = JSON.parse(body);
            const shortId = crypto.randomBytes(4).toString("hex");
            urlDatabase.set(shortId, data.url);
            res.end("http://localhost:3000/" + shortId);
        });
    }
    else if (req.method === "GET") {
        const shortId = req.url.substring(1);
        const originalUrl = urlDatabase.get(shortId);
        if (originalUrl) {
            res.writeHead(302, {
                Location: originalUrl
            });
            res.end();
        } else {
            res.statusCode = 404;
            res.end("Short URL not found");
        }
    }
    else {
        res.end("URL Shortener Server");
    }
});
server.listen(3000, () => {
    console.log("Server is running on port 3000");
});