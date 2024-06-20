package Model;

import java.sql.*;


public class LoginUser {
    public boolean validateLogin(String username, String password) {
        try (Connection connection = DatabaseConnection.getConnection()){
            String sql = "SELECT * FROM login WHERE username = ? AND password = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            ResultSet resultSet = preparedStatement.executeQuery();

          return resultSet.next(); // If there's a match, resultSet will have at least one row
        } catch (SQLException e) {
            return false;
        }
    }
}
