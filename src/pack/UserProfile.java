package pack;

import javax.swing.*;

public class UserProfile {
    private String userID;            // Unique identifier for the user
    private String profile;           // Profile information
    private String name;              // User's name
    private String password;          // User's password
    private String shippingAddress;   // User's shipping address
    private Payment paymentMethod;    // Payment method object

    // Constructor
    public UserProfile(String userID, String profile, String name, String password, String shippingAddress, Payment paymentMethod) {
        this.userID = userID;
        this.profile = profile;
        this.name = name;
        this.password = password;
        this.shippingAddress = shippingAddress;
        this.paymentMethod = paymentMethod;
    }

    // Getter and Setter methods
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Payment getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Payment paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Methods
    public void login(String userID, String password) {
        // Logic for user login
    }

    public void register(String userID, String password) {
        // Logic for user registration
    }

    public void viewProfile() {
        // Logic for viewing user profile
    }

    public void logout() {
        // Logic for logging out
    }

    public void editProfile(String newProfile, String newName, String newShippingAddress) {
        this.profile = newProfile;
        this.name = newName;
        this.shippingAddress = newShippingAddress;
    }
    public void showUserProfilePage() {
        // Create JFrame for User Profile Page
        JFrame frame = new JFrame("User Profile");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel and add components
        JPanel panel = new JPanel();
        JLabel profileLabel = new JLabel("Welcome to your User Profile!");
        JButton backButton = new JButton("Back to Main Menu");

        // Add components to the panel
        panel.add(profileLabel);
        panel.add(backButton);

        // Add panel to the frame
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);

        // Add Action Listener for the Back button
        backButton.addActionListener(e -> {
            frame.dispose(); // Close User Profile Page
            MainMenuGUI mainMenu = new MainMenuGUI(); // Open Main Menu
            mainMenu.showMainMenu();
        });
    }
}

