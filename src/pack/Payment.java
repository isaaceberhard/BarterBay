package pack;

public class Payment {
    private String cardHolder;
    private int cardNumber;
    private String billingAddress;
    private String paymentMethod;
    private String CVV;

    public Payment(String cardHolder, int cardNumber, String billingAddress, String paymentMethod, String CVV) {
        this.cardHolder = cardHolder;
        this.cardNumber = cardNumber;
        this.billingAddress = billingAddress;
        this.paymentMethod = paymentMethod;
        this.CVV = CVV;
    }

    public String getCardHolder() { return cardHolder; }
    public void setCardHolder(String cardHolder) { this.cardHolder = cardHolder; }
    public int getCardNumber() { return cardNumber; }
    public void setCardNumber(int cardNumber) { this.cardNumber = cardNumber; }
    public String getBillingAddress() { return billingAddress; }
    public void setBillingAddress(String billingAddress) { this.billingAddress = billingAddress; }
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
    public String getCVV() { return CVV; }
    public void setCVV(String CVV) { this.CVV = CVV; }

    public void completePayment() {}
    public void cancelPayment() {}
    public void refundPayment() {}
    public void savePayment() {}
}
