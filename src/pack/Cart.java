package pack;
import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;
    private String cartID;
    private float totalAmount;

    public Cart(String cartID) {
        this.cartID = cartID;
        this.products = new ArrayList<>();
        this.totalAmount = 0;
    }

    public ArrayList<Product> getProducts() { return products; }
    public String getCartID() { return cartID; }
    public float getTotalAmount() { return totalAmount; }

    public void checkout() {}
    public void addItem(Product product) { this.products.add(product); }
    public void removeItem(Product product) { this.products.remove(product); }
    public void viewCart() {}
    public void clearCart() { this.products.clear(); }
}
