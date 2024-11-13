package pack;
public class Order {
    private String orderID;
    private User user;
    private Cart cart;
    private String status;
    private float totalAmount;

    public Order(String orderID, User user, Cart cart, String status, float totalAmount) {
        this.orderID = orderID;
        this.user = user;
        this.cart = cart;
        this.status = status;
        this.totalAmount = totalAmount;
    }

    public String getOrderID() { return orderID; }
    public User getUser() { return user; }
    public Cart getCart() { return cart; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public float getTotalAmount() { return totalAmount; }

    public void placeOrder() {}
    public void cancelOrder() {}
    public void trackOrder() {}
    public void viewOrder() {}
}
