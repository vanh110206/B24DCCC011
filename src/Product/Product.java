package Product;

public abstract class Product {
    protected String productId;
    protected String name;
    protected double price;
    protected String category;

    public Product(String productID , String name , double price , String category) {
        this.productId = productID;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getProductID() {
        return productId;
    }
    public String getname() {
        return name;
    }
    public String  getcategory() {
        return category;
    }
    public double getprice() {
        return price;
    }

    public abstract void displayInfor();
}
