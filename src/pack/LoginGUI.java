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

        // Create and add components
        JPanel panel = createLoginPanel(frame);
        frame.add(panel);

        // Set frame visibility
        frame.setVisible(true);
    }

    private JPanel createLoginPanel(JFrame frame) {
        // Create JPanel
        JPanel panel = new JPanel();
        panel.setLayout(null);

        // Create labels and text fields
        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField(20);
        userText.setBounds(150, 50, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 90, 80, 25);
        panel.add(passwordLabel);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(150, 90, 165, 25);
        panel.add(passwordText);

        // Create login button
        JButton loginButton = new JButton("Login");
        loginButton.setBounds(50, 140, 120, 25);
        panel.add(loginButton);

        // Create register button
        JButton registerButton = new JButton("Register");
        registerButton.setBounds(200, 140, 120, 25);
        panel.add(registerButton);

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
