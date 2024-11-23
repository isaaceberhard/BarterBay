
package pack;

import javax.swing.*;
import javax.swing.border.Border;

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

				try {
				    UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
				 } catch (Exception e) {
				            e.printStackTrace();
				 }

		// Create JFrame for User Profile Page
		JFrame frame = new JFrame("User Profile");
		frame.setSize(1280, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		// Create main panel with BorderLayout
		JPanel mainPanel = new JPanel(new BorderLayout());
		mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30)); // Add padding

		// LEFT: Add an image
		JLabel imageLabel = new JLabel();
		ImageIcon userIcon = new ImageIcon(getClass().getResource("/pack/userProfileImage.png"));	    
		Image scaledImage = userIcon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH); // Resize image
		imageLabel.setIcon(new ImageIcon(scaledImage));
		mainPanel.add(imageLabel, BorderLayout.WEST);

		// CENTER: Create panel for input fields with BoxLayout
		JPanel formPanel = new JPanel();
		formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));

		// Create components for "Change Username"
		JLabel usernameLabel = new JLabel("Change Username:");
		usernameLabel.setFont(new Font("Arial", Font.BOLD, 18)); // Make the text bold
		JTextField usernameField = new JTextField(1);

		// Create components for "Change Password"
		JLabel passwordLabel = new JLabel("Change Password:");
		JPasswordField passwordField = new JPasswordField(1);
		passwordLabel.setFont(new Font("Arial", Font.BOLD, 18)); // Make the text bold

		// Create components for "Add Phone Number for MFA"
		JLabel phoneLabel = new JLabel("Add Phone Number for MFA:");
		JTextField phoneField = new JTextField(1);
		phoneLabel.setFont(new Font("Arial", Font.BOLD, 18)); // Make the text bold

		JButton sellButton = new JButton("Sell");
		JButton buyButton = new JButton("Buy");
		JButton ordersButton = new JButton("My Orders");


		JPanel topPanel = new JPanel(new BorderLayout());

		// Add the "Profile" label to the left (WEST) of the top panel
		JLabel profileLabel = new JLabel("Profile");
		profileLabel.setFont(new Font("Arial", Font.BOLD, 30)); // Make the text bold
		topPanel.add(profileLabel, BorderLayout.WEST);

		// Create button panel for the top-right of the screen
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10)); // Align buttons to the right with spacing

		buttonPanel.add(buyButton);
		buttonPanel.add(sellButton);
		buttonPanel.add(ordersButton);

		// Add the button panel to the right (EAST) of the top panel
		topPanel.add(buttonPanel, BorderLayout.EAST);

		// Add the top panel to the NORTH of the main panel
		mainPanel.add(topPanel, BorderLayout.NORTH);

		usernameField.setPreferredSize(new Dimension(100, 20));
		// Add components to formPanel with spacing
		formPanel.add(usernameLabel);
		formPanel.add(usernameField);
		formPanel.add(Box.createVerticalStrut(50)); // Add vertical spacing

		formPanel.add(passwordLabel);
		formPanel.add(passwordField);
		formPanel.add(Box.createVerticalStrut(50)); // Add vertical spacing

		formPanel.add(phoneLabel);
		formPanel.add(phoneField);
		formPanel.add(Box.createVerticalStrut(50)); // Add larger spacing

		mainPanel.add(formPanel, BorderLayout.CENTER);

		frame.add(mainPanel);
		frame.setVisible(true);


		buyButton.setBackground(Color.BLACK);
		buyButton.setOpaque(true);
		buyButton.setBorderPainted(false);
		buyButton.setForeground(Color.WHITE);
		buyButton.setFocusable(false);

		sellButton.setBackground(Color.BLACK);
		sellButton.setOpaque(true);
		sellButton.setBorderPainted(false);
		sellButton.setForeground(Color.WHITE);
		sellButton.setFocusable(false);

		ordersButton.setBackground(Color.BLACK);
		ordersButton.setOpaque(true);
		ordersButton.setBorderPainted(false);
		ordersButton.setForeground(Color.WHITE);
		ordersButton.setFocusable(false);


		// Add Action Listener for the Back button
		sellButton.addActionListener(e -> {
			frame.dispose(); // Close User Profile Page
			MainMenuGUI mainMenu = new MainMenuGUI(); // Open Main Menu
			mainMenu.showMainMenu();
		});

		// Add Action Listener for the Save button
		buyButton.addActionListener(e -> {
			String newUsername = usernameField.getText();
			String newPassword = new String(passwordField.getPassword());
			String phoneNumber = phoneField.getText();

			// Simulate saving the data (replace with actual logic as needed)
			JOptionPane.showMessageDialog(frame, 
					"Changes Saved:\nUsername: " + newUsername + 
					"\nPassword: " + (newPassword.isEmpty() ? "Not Changed" : "Changed") + 
					"\nPhone: " + (phoneNumber.isEmpty() ? "Not Added" : phoneNumber));
		});

		ordersButton.addActionListener(e -> {

			frame.dispose();
			OrdersGUI ordersGui = new OrdersGUI();
			ordersGui.showOrdersPage();



		});
	}

}
