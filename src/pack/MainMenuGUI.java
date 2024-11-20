
package pack;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class MainMenuGUI {
    public void showMainMenu() {
        // Create JFrame for Main Menu
        JFrame frame = new JFrame("Main Menu");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main Menu Panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Add buttons to the panel
        JButton userProfileButton = new JButton("User Profile");
        JButton productButton = new JButton("Products");
        JButton cartButton = new JButton("Cart");
        JButton orderButton = new JButton("Orders");
        JButton logoutButton = new JButton("Logout");

        panel.add(userProfileButton);
        panel.add(productButton);
        panel.add(cartButton);
        panel.add(orderButton); // Add Orders button here
        panel.add(logoutButton);

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
            List<Order> orders = new ArrayList<>();
            orders.add(new Order("O123", new User("U001", "John Doe", "john@example.com", "password"), new Cart("C001"), "Pending", 99.99f));
            orders.add(new Order("O124", new User("U002", "Jane Doe", "jane@example.com", "password"), new Cart("C002"), "Shipped", 129.50f));
            
            // Open Orders Page with the order data
            OrdersGUI ordersGUI = new OrdersGUI();
            ordersGUI.showOrdersPage(orders);
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
}
