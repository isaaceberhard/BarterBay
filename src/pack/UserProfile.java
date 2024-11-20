package pack;

import javax.swing.*;
import java.awt.*;

public class UserProfile {
	private String userID; // Unique identifier for the user
	private String profile; // Profile information
	private String name; // User's name
	private String password; // User's password
	private String shippingAddress; // User's shipping address
	private Payment paymentMethod; // Payment method object

	// Constructor
	public UserProfile(String userID, String profile, String name, String password, String shippingAddress,
			Payment paymentMethod) {
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

	    // Create main panel with BorderLayout
	    JPanel mainPanel = new JPanel(new BorderLayout());
	    mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // Add padding

	    // LEFT: Add an image
	    JLabel imageLabel = new JLabel();
	    ImageIcon userIcon = new ImageIcon(getClass().getResource("/pack/userProfileImage.png"));	    
	    Image scaledImage = userIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH); // Resize image
	    imageLabel.setIcon(new ImageIcon(scaledImage));
	    mainPanel.add(imageLabel, BorderLayout.WEST);

	    // CENTER: Create panel for input fields with BoxLayout
	    JPanel formPanel = new JPanel();
	    formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));

	    // Create components for "Change Username"
	    JLabel usernameLabel = new JLabel("Change Username:");
	    JTextField usernameField = new JTextField(20);

	    // Create components for "Change Password"
	    JLabel passwordLabel = new JLabel("Change Password:");
	    JPasswordField passwordField = new JPasswordField(20);

	    // Create components for "Add Phone Number for MFA"
	    JLabel phoneLabel = new JLabel("Add Phone Number for MFA:");
	    JTextField phoneField = new JTextField(15);

	    // Back button
	    JButton backButton = new JButton("Back to Main Menu");

	    // Save changes button
	    JButton saveButton = new JButton("Save Changes");

	    // Add components to formPanel with spacing
	    formPanel.add(usernameLabel);
	    formPanel.add(usernameField);
	    formPanel.add(Box.createVerticalStrut(10)); // Add vertical spacing

	    formPanel.add(passwordLabel);
	    formPanel.add(passwordField);
	    formPanel.add(Box.createVerticalStrut(10)); // Add vertical spacing

	    formPanel.add(phoneLabel);
	    formPanel.add(phoneField);
	    formPanel.add(Box.createVerticalStrut(20)); // Add larger spacing

	    formPanel.add(saveButton);
	    formPanel.add(Box.createVerticalStrut(10)); // Add vertical spacing
	    formPanel.add(backButton);

	    // Add formPanel to mainPanel CENTER region
	    mainPanel.add(formPanel, BorderLayout.CENTER);

	    // Add main panel to the frame
	    frame.add(mainPanel);

	    // Set frame visibility
	    frame.setVisible(true);

	    // Add Action Listener for the Back button
	    backButton.addActionListener(e -> {
	        frame.dispose(); // Close User Profile Page
	        MainMenuGUI mainMenu = new MainMenuGUI(); // Open Main Menu
	        mainMenu.showMainMenu();
	    });

	    // Add Action Listener for the Save button
	    saveButton.addActionListener(e -> {
	        String newUsername = usernameField.getText();
	        String newPassword = new String(passwordField.getPassword());
	        String phoneNumber = phoneField.getText();

	        // Simulate saving the data (replace with actual logic as needed)
	        JOptionPane.showMessageDialog(frame, 
	            "Changes Saved:\nUsername: " + newUsername + 
	            "\nPassword: " + (newPassword.isEmpty() ? "Not Changed" : "Changed") + 
	            "\nPhone: " + (phoneNumber.isEmpty() ? "Not Added" : phoneNumber));
	    });
	}

}
