
package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class LoginGUI {
    public void createAndShowGUI() {
        // Create JFrame
        JFrame frame = new JFrame("Login");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        // Create and add components
        JPanel panel = createLoginPanel(frame);
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);
    }

    private JPanel createLoginPanel(JFrame frame) {
        // Create JPanel
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // Add spacing between components
        gbc.fill = GridBagConstraints.HORIZONTAL;
        

        // Create labels and text fields
        JLabel userLabel = new JLabel("Username:");
        gbc.gridx = 0; // Column 0
        gbc.gridy = 0; // Row 0
        gbc.gridwidth = 2; // Span across 2 columns
        panel.add(userLabel, gbc);

        JTextField userText = new JTextField(20);
        gbc.gridy = 1; // Row 1 (below the label)
        panel.add(userText, gbc);
        userText.setText("admin");

        JLabel passwordLabel = new JLabel("Password:");
        gbc.gridy = 2; // Row 2
        panel.add(passwordLabel, gbc);

        JPasswordField passwordText = new JPasswordField(20);
        gbc.gridy = 3; // Row 3
        panel.add(passwordText, gbc);
        passwordText.setText("password");


        // Create login button
        JButton loginButton = new JButton("Login");
        gbc.gridy = 4; // Row 4
        gbc.gridx = 0; // First column
        gbc.gridwidth = 1; // Span 1 column
        panel.add(loginButton, gbc);

        // Create register button
        JButton registerButton = new JButton("Register");
        gbc.gridx = 1; // Second column
        panel.add(registerButton, gbc);
        
     // Create "Forgot Password?" label
        JLabel forgotPasswordLabel = new JLabel("<html><u>Forgot Password?</u></html>");
        forgotPasswordLabel.setForeground(Color.BLUE); // Make it look like a link
        forgotPasswordLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // Change cursor on hover

        gbc.gridy = 5; // Row 5 (below the buttons)
        gbc.gridx = 0;
        gbc.gridwidth = 2; // Center across both columns
        panel.add(forgotPasswordLabel, gbc);

        // Action listener for login
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                try {
                    if (User.checkLogin(username, password)) {
                        JOptionPane.showMessageDialog(frame, "Login Successful!");
                        frame.dispose(); // Close the login window
                        MainMenuGUI mainMenuGUI = new MainMenuGUI();
                        mainMenuGUI.showMainMenu();
                    } else {
                        JOptionPane.showMessageDialog(frame, "Invalid Username or Password.");
                    }
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        // Action listener for register
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = userText.getText();
                String password = new String(passwordText.getPassword());

                try {
                    User.registerUser(username, username, username + "@example.com", password);
                    JOptionPane.showMessageDialog(frame, "Registration Successful!");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            }
        });

        return panel;
    }
}
