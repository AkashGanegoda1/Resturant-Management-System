package Model;

import Controller.CSupplierData;
import java.sql.*;
import java.util.*;


public class MSupplier {
    public boolean saveSupplier(String supid, String supname, int supcn) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO Supplier (supid,supname,cn) VALUES (?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, supid);
            preparedStatement.setString(2, supname);
            preparedStatement.setInt(3, supcn);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    
     public List<CSupplierData> getAllSupplierData() {
        List<CSupplierData> SupplierDataList = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection()){
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT supid, supname, cn FROM Supplier");
             ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String supid = resultSet.getString("supid");
                String supname = resultSet.getString("supname");
                int supcn = resultSet.getInt("cn");

                CSupplierData proData = new CSupplierData(supid, supname, supcn);
                SupplierDataList.add(proData);
            }
        } catch (SQLException ex) {
        }

        return SupplierDataList;
    }
    
    
     public boolean deleteSupplier(String supid) {
        try (Connection connection = DatabaseConnection.getConnection()){
            // Define the SQL query to delete the car
            String sql = "DELETE FROM Supplier WHERE supid = ?";
            
            // Prepare the SQL statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, supid);
            
            // Execute the SQL query and get the number of affected rows
            int rowsAffected = preparedStatement.executeUpdate();
            
            return rowsAffected > 0;
        } catch (SQLException ex) {
// Handle any database-related exceptions here
                        return false;
        }
    }
     
     public boolean updateSupplier(String supid, String supname, int supcn) {
        try {
            // Establish a database connection
           Connection connection = DatabaseConnection.getConnection();

            // Define the SQL query to update the record in the database
            String sql = "UPDATE Supplier SET supname=?, cn=? WHERE supid=?";

            // Prepare the statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, supname);
            preparedStatement.setInt(2, supcn);
            preparedStatement.setString(3, supid);

            // Execute the update
            int rowsAffected = preparedStatement.executeUpdate();

            // Close the database    connection.close();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            return false;
        }
     }
}
