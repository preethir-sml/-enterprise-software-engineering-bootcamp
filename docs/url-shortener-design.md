# URL Shortener - System Design
## Components

### 1. Load Balancer

The Load Balancer receives incoming requests from users and distributes them to the API Service.

### 2. API Service

The API Service handles the main URL shortening and URL redirection logic.

It:
- Accepts the long URL.
- Generates a short URL.
- Checks the cache when a short URL is requested.
- Fetches the original URL from the database when it is not available in the cache.

### 3. Cache

The Cache stores frequently accessed short URLs and their corresponding original URLs.

This helps reduce database access and improves response time.

### 4. Database

The Database stores the mapping between the short URL and the original long URL.

Example:

| Short URL | Original URL |
|---|---|
| abc123 | https://example.com/long-url |