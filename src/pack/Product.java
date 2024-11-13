
public class Product {
    private int quantity;
    private String productName;
    private String productDesc;
    private float price;
    private String productImage;
    private String category;
    private User seller;

    public Product(int quantity, String productName, String productDesc, float price, String productImage, String category, User seller) {
        this.quantity = quantity;
        this.productName = productName;
        this.productDesc = productDesc;
        this.price = price;
        this.productImage = productImage;
        this.category = category;
        this.seller = seller;
    }

    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public String getProductDesc() { return productDesc; }
    public void setProductDesc(String productDesc) { this.productDesc = productDesc; }
    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }
    public String getProductImage() { return productImage; }
    public void setProductImage(String productImage) { this.productImage = productImage; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public User getSeller() { return seller; }
    public void setSeller(User seller) { this.seller = seller; }

    public void addProduct() {}
    public void removeProduct() {}
    public void modifyProduct() {}
    public void viewProduct() {}
}
