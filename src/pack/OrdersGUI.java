
package pack;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class OrdersGUI {
    public void showOrdersPage(List<Order> orders) {
        // Create JFrame for Orders page
        JFrame frame = new JFrame("Orders");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JPanel for displaying orders
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Loop through the orders list and add them to the panel
        for (Order order : orders) {
            JPanel orderPanel = new JPanel();
            orderPanel.setLayout(new FlowLayout());
            
            JLabel orderLabel = new JLabel("Order ID: " + order.getOrderID() + " | Status: " + order.getStatus() + " | Total: $" + order.getTotalAmount());
            JButton viewButton = new JButton("View Order");
            viewButton.addActionListener(e -> {
                // Logic to show order details (you can create a method for detailed view)
                JOptionPane.showMessageDialog(frame, "Viewing order: " + order.getOrderID());
            });

            orderPanel.add(orderLabel);
            orderPanel.add(viewButton);
            panel.add(orderPanel);
        }

        // Add the panel to the frame
        frame.add(new JScrollPane(panel)); // Scrollable panel
        frame.setVisible(true);
    }
}
