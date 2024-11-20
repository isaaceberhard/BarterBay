package pack;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Always show the login screen
            LoginGUI loginGUI = new LoginGUI();
            loginGUI.createAndShowGUI();
        });
    }
}
