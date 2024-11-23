
package pack;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainMenuGUI {

	public void showMainMenu() {
		// Create JFrame for Main Menu
		JFrame frame = new JFrame("Main Menu");
		frame.setSize(600, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		// Main Menu Panel
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		// "Barter Bay" Text Label
        JLabel titleLabel = new JLabel("Barter Bay");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.BLACK);
        titleLabel.setHorizontalAlignment(SwingConstants.LEFT);
        titleLabel.setVerticalAlignment(SwingConstants.TOP);


		// Add buttons to the panel
		JButton userProfileButton = new JButton("User Profile");
		JButton productButton = new JButton("Products");
		JButton cartButton = new JButton("Cart");
		JButton orderButton = new JButton("Orders");
		JButton logoutButton = new JButton("Logout");

		designButtons(userProfileButton, productButton, cartButton, orderButton, logoutButton);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10)); // Align buttons to the right with spacing

		buttonPanel.add(userProfileButton);
		buttonPanel.add(productButton);
		buttonPanel.add(cartButton);
		buttonPanel.add(orderButton);
		buttonPanel.add(logoutButton);

		panel.add(buttonPanel, BorderLayout.EAST);

		// Add panel to the frame
		frame.add(panel);

		// Set frame visibility
		frame.setVisible(true);

		userProfileButton.addActionListener(e -> {
			frame.dispose(); // Close Main Menu
			UserProfile userProfilePage = new UserProfile(null, null, null, null, null, null); // Open User Profile Page
			userProfilePage.showUserProfilePage();
		});

		// Add Action Listeners
		orderButton.addActionListener(e -> {
			// Dummy data for orders, replace with actual data
			// List<Order> orders = new ArrayList<>();
			// orders.add(new Order("O123", new User("U001", "John Doe", "john@example.com",
			// "password"), new Cart("C001"), "Pending", 99.99f));
			// orders.add(new Order("O124", new User("U002", "Jane Doe", "jane@example.com",
			// "password"), new Cart("C002"), "Shipped", 129.50f));
			//
			// Open Orders Page with the order data
			frame.dispose();
			OrdersGUI ordersGUI = new OrdersGUI();
			ordersGUI.showOrdersPage();
		});

		logoutButton.addActionListener(e -> {
			frame.dispose(); // Close main menu
			LoginGUI loginGUI = new LoginGUI();
			loginGUI.createAndShowGUI(); // Show login screen
		});

		productButton.addActionListener(e -> {
			ProductGUI productGUI = new ProductGUI();
			productGUI.showProductGUI();
		});

	}

	private void designButtons(JButton userProfileButton, JButton productButton, JButton cartButton,
			JButton orderButton, JButton logoutButton) {
		userProfileButton.setBackground(Color.BLACK);
		userProfileButton.setOpaque(true);
		userProfileButton.setBorderPainted(false);
		userProfileButton.setForeground(Color.WHITE);
		userProfileButton.setFocusable(false);

		productButton.setBackground(Color.BLACK);
		productButton.setOpaque(true);
		productButton.setBorderPainted(false);
		productButton.setForeground(Color.WHITE);
		productButton.setFocusable(false);

		orderButton.setBackground(Color.BLACK);
		orderButton.setOpaque(true);
		orderButton.setBorderPainted(false);
		orderButton.setForeground(Color.WHITE);
		orderButton.setFocusable(false);

		cartButton.setBackground(Color.BLACK);
		cartButton.setOpaque(true);
		cartButton.setBorderPainted(false);
		cartButton.setForeground(Color.WHITE);
		cartButton.setFocusable(false);

		logoutButton.setBackground(Color.BLACK);
		logoutButton.setOpaque(true);
		logoutButton.setBorderPainted(false);
		logoutButton.setForeground(Color.WHITE);
		logoutButton.setFocusable(false);
	}
}
