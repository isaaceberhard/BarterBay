package pack;
public class User {
    private String userID;
    private String name;
    private String email;
    private String password;

    public User(String userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getUserID() { return userID; }
    public void setUserID(String userID) { this.userID = userID; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public void login(String userID, String password) {
        // Logic for logging in a user
    }

    public void register(String userID, String name, String email, String password) {
        // Logic for registering a user
    }

    public void logout() {
        // Logic for logging out a user
    }

    public void viewProfile() {
        // Logic for viewing user profile
    }

    public void editProfile(String newName, String newEmail, String newPassword) {
        this.name = newName;
        this.email = newEmail;
        this.password = newPassword;
    }
}
