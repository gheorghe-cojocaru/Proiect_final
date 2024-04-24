package userManagement;

import java.util.List;

public class UserManagementSystem {

    private DatabaseManager databaseManager;

    public UserManagementSystem() {
        this.databaseManager = new DatabaseManager();
    }

    public void addUser(User user) {
        databaseManager.addUser(user);

    }

    public void deleteUser(int userId) {
        databaseManager.deleteUser(userId);

    }

    public void modifyEmail(int userId, String newEmail) {
        databaseManager.updateUserEmail(userId, newEmail);

    }

    public User getUserById(int userId) {
        User user = databaseManager.getUserById(userId);

        return user;
    }

    public List<User> getAllUsers() {
        List<User> users = databaseManager.getAllUsers();

        return users;
    }

    public void displayUserById(int userId) {
        User user = getUserById(userId);
        if (user != null) {
            System.out.println(user);
        } else {
            System.out.println("Userul cu id-ul " + userId + " nu exista.");
        }
    }

    public void displayAllUsers() {
        List<User> users = getAllUsers();
        System.out.println("Toti utilizatorii: ");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
