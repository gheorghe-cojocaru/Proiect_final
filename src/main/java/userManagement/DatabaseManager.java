package userManagement;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseManager {
    private static final String URL = "jdbc:mysql://localhost:3306/usermanagement";
    private static final String USERNAME = "Admin";
    private static final String PASSWORD = "54321";
    private Connection connection;

    // Constructorul clasei
    public DatabaseManager() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Conexiune la baza de date realizată cu succes!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Conexiunea la baza de date a eșuat!");
        }
    }

    // Metodă pentru închiderea conexiunii la baza de date
    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
                System.out.println("Conexiune închisă cu succes!");
            }
        } catch (SQLException e) {
            System.out.println("Eroare la închiderea conexiunii!");
        }
    }

    // Metodă pentru adăugarea unui utilizator în baza de date
    public void addUser(User user) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "INSERT INTO users (id, name, surname, email, age) VALUES (?, ?, ?, ?, ?)");
            statement.setInt(1, user.getId());
            statement.setString(2, user.getName());
            statement.setString(3, user.getSurname());
            statement.setString(4, user.getEmail());
            statement.setInt(5, user.getAge());
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Eroare la adăugarea utilizatorului în baza de date!");
        }
    }

    // Metodă pentru ștergerea unui utilizator din baza de date
    public void deleteUser(int userId) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "DELETE FROM users WHERE id = ?");
            statement.setInt(1, userId);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Eroare la ștergerea utilizatorului din baza de date!");
        }
    }

    // Metodă pentru actualizarea adresei de email a unui utilizator în baza de date
    public void updateUserEmail(int userId, String newEmail) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "UPDATE users SET email = ? WHERE id = ?");
            statement.setString(1, newEmail);
            statement.setInt(2, userId);
            statement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Eroare la actualizarea adresei de email a utilizatorului!");
        }
    }

    // Metodă pentru obținerea unui utilizator după ID-ul său din baza de date
    public User getUserById(int userId) {
        try {
            PreparedStatement statement = connection.prepareStatement(
                    "SELECT * FROM users WHERE id = ?");
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String email = resultSet.getString("email");
                int age = resultSet.getInt("age");
                return new User(id, name, surname, email, age);
            }
        } catch (SQLException e) {
            System.out.println("Eroare la obținerea utilizatorului din baza de date după ID!");
        }
        return null;
    }

    // Metodă pentru obținerea tuturor utilizatorilor din baza de date
    public List<User> getAllUsers() {
        List<User> Users = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                String email = resultSet.getString("email");
                int age = resultSet.getInt("age");
                Users.add(new User(id, name, surname, email, age));
            }
        } catch (SQLException e) {
            System.out.println("Eroare la obținerea tuturor utilizatorilor din baza de date!");
        }
        return Users;
    }
}
