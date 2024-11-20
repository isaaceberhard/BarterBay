
package pack;

import java.io.*;

public class User {
    private String userID;
    private String name;
    private String email;
    private String password;

    // Constructor
    public User(String userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Getter and Setter methods
    public String getUserID() { return userID; }
    public void setUserID(String userID) { this.userID = userID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    // Method to register a new user by saving it to a file
    public static void registerUser(String userID, String name, String email, String password) throws IOException {
        FileWriter fileWriter = new FileWriter("users.txt", true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(userID + "," + password + "\n"); // Save username and password
        bufferedWriter.close();
    }

    // Method to check if user exists and if the password matches
    public static boolean checkLogin(String userID, String password) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("users.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            String[] credentials = line.split(",");
            if (credentials[0].equals(userID) && credentials[1].equals(password)) {
                return true;
            }
        }
        bufferedReader.close();
        return false;
    }
}
