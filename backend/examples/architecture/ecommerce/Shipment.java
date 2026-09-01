package backend.examples.architecture.ecommerce;

public class Shipment {
    private int shipmentId;
    private String trackingNumber;
    private String address;
    private String status;

    public Shipment(int shipmentId, String trackingNumber, String address, String status) {
        this.shipmentId = shipmentId;
        this.trackingNumber = trackingNumber;
        this.address = address;
        this.status = status;
    }
}
