package model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String customerName;
    private List<Product> productList;
    private PaymentMethod paymentMethod;

    public Order(String customerName, PaymentMethod paymentMethod) {
        this.customerName = customerName;
        this.paymentMethod = paymentMethod;
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public double getTotalAmount() {
        double total = 0;
        for (Product p : productList) {
            total += p.getprice();
        }
        return total;
    }

    public void checkout() {
        double total = getTotalAmount();
        paymentMethod.pay(total, customerName);
    }
}

