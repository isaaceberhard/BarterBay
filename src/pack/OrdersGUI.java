
package pack;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class OrdersGUI {

	public void showOrdersPage() {
		List<Order> orders = new ArrayList<>();
		orders.add(new Order("O123", new User("U001", "John Doe", "john@example.com", "password"), new Cart("C001"),
				"Pending", 99.99f));
		orders.add(new Order("O124", new User("U002", "Jane Doe", "jane@example.com", "password"), new Cart("C002"),
				"Shipped", 129.50f));

		// Create JFrame for Orders page
		JFrame frame = new JFrame("Orders");
		frame.setSize(600, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		JButton sellButton = new JButton("Sell");
		JButton buyButton = new JButton("Buy");
		JButton profileButton = new JButton("Profile");
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 10)); // Align buttons to the right with spacing

		buttonPanel.add(buyButton);
		buttonPanel.add(sellButton);
		buttonPanel.add(profileButton);
		
		
		setButtonStyle(sellButton, buyButton, profileButton);


		// Create a JPanel for displaying orders
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		panel.add(buttonPanel, BorderLayout.EAST);

		// Loop through the orders list and add them to the panel
		for (Order order : orders) {
			JPanel orderPanel = new JPanel();
			orderPanel.setLayout(new FlowLayout());

			JLabel orderLabel = new JLabel("Order ID: " + order.getOrderID() + " | Status: " + order.getStatus()
			+ " | Total: $" + order.getTotalAmount());
			JButton viewButton = new JButton("View Order");
			
		
			
			viewButton.addActionListener(e -> {
				// Logic to show order details (you can create a method for detailed view)
				JOptionPane.showMessageDialog(frame, "Viewing order: " + order.getOrderID());
			});

			orderPanel.add(orderLabel);
			orderPanel.add(viewButton);
			panel.add(orderPanel);
		}
		
		profileButton.addActionListener(e -> {
			
			frame.dispose();
			UserProfile userProfile = new UserProfile(null, null, null, null, null, null);
			userProfile.showUserProfilePage();
			
			
			
			
		});

		// Add the panel to the frame
		frame.add(new JScrollPane(panel));
		frame.setVisible(true);
	}

	private void setButtonStyle(JButton sellButton, JButton buyButton, JButton profileButton) {
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

		profileButton.setBackground(Color.BLACK);
		profileButton.setOpaque(true);
		profileButton.setBorderPainted(false);
		profileButton.setForeground(Color.WHITE);
		profileButton.setFocusable(false);
	}
}
