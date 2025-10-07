package model;

import java.time.LocalDate;

public class FoodProduct extends Product {
    private LocalDate expiryDate;

    public FoodProduct(String productId, String name, double price, LocalDate expiryDate) {
        super(productId, name, price, "Thực phẩm");
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayInfor() {
        System.out.println("SP: " + name + " | HSD: " + expiryDate + " | Giá: " + price);
    }
}
