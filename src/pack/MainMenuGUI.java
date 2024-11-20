package pack;

import javax.swing.*;
import java.awt.*;

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
        panel.add(orderButton);
        panel.add(logoutButton);

        // Add panel to the frame
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);

        // Add Action Listeners
        logoutButton.addActionListener(e -> {
            frame.dispose(); // Close main menu
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.createAndShowGUI(); // Show login screen
        });
    }
}
