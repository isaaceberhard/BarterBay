package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ProductGUI {
    private List<Product> productList = new ArrayList<>(); // Store products

    public void showProductGUI() {
        // Create JFrame for Product Management
        JFrame frame = new JFrame("Product Management");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Main Panel
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Components
        JTextArea productDisplayArea = new JTextArea(10, 50);
        productDisplayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(productDisplayArea);

        JButton addButton = new JButton("Add Product");
        JButton modifyButton = new JButton("Modify Product");
        JButton viewButton = new JButton("View Products");

        // Add Components to Panel
        panel.add(scrollPane);
        panel.add(addButton);
        panel.add(modifyButton);
        panel.add(viewButton);

        // Add Panel to Frame
        frame.add(panel);

        // Add Action Listeners
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add Product Logic
                try {
                    String productName = JOptionPane.showInputDialog(frame, "Enter Product Name:");
                    String productDesc = JOptionPane.showInputDialog(frame, "Enter Product Description:");
                    float price = Float.parseFloat(JOptionPane.showInputDialog(frame, "Enter Price:"));
                    String category = JOptionPane.showInputDialog(frame, "Enter Category:");
                    int quantity = Integer.parseInt(JOptionPane.showInputDialog(frame, "Enter Quantity:"));

                    Product product = new Product(quantity, productName, productDesc, price, "", category, null);
                    productList.add(product); // Add product to list
                    productDisplayArea.append("Product Added: " + productName + "\n");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid input. Please try again.");
                }
            }
        });

        modifyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Modify Product Logic (Placeholder)
                JOptionPane.showMessageDialog(frame, "Modify Product Functionality Coming Soon!");
            }
        });

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // View Products Logic
                if (productList.isEmpty()) {
                    productDisplayArea.setText("No products available.\n");
                } else {
                    productDisplayArea.setText("Products:\n");
                    for (Product product : productList) {
                        productDisplayArea.append(productToString(product) + "\n");
                    }
                }
            }
        });

        // Set Frame Visible
        frame.setVisible(true);
    }

    private String productToString(Product product) {
        return "Name: " + product.getProductName() +
                ", Description: " + product.getProductDesc() +
                ", Price: $" + product.getPrice() +
                ", Category: " + product.getCategory() +
                ", Quantity: " + product.getQuantity();
    }
}
