package Product;

public class ElectronicProduct extends Product {
    private String imei;
    private int warrantyMonths;

    public ElectronicProduct(String productId, String name, double price, String imei) {
        super(productId, name, price, "Điện tử");
        this.imei = imei;
        this.warrantyMonths = warrantyMonths;
    }

    @Override
    public void displayInfor() {
        System.out.println("SP: " + name + " | IMEI: " + imei + " | Bảo hành: " + warrantyMonths + " tháng | Giá: " + price);
    }
}
