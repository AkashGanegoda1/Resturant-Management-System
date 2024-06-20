
package Model;

import java.sql.*;
import java.util.*;
import Controller.CProductData;


public class MProduct {
    public boolean saveProduct(String proid, String proname, String supid, String quantity, double price) {
        try (Connection connection = DatabaseConnection.getConnection()) {
            String sql = "INSERT INTO Product (proid,proname,supid,quantity,price) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, proid);
            preparedStatement.setString(2, proname);
            preparedStatement.setString(3, supid);
            preparedStatement.setString(4, quantity);
            preparedStatement.setDouble(5, price);

            int rowsAffected = preparedStatement.executeUpdate();

            return rowsAffected > 0;
        } catch (SQLException ex) {
            return false;
        }
    }
    
    
     public List<CProductData> getAllProductData() {
        List<CProductData> ProductDataList = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection()){
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT proid, proname, supid, quantity, price FROM Product");
             ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String proid = resultSet.getString("proid");
                String proname = resultSet.getString("proname");
                String supid = resultSet.getString("supid");
                String quantity = resultSet.getString("quantity");
                double price = resultSet.getDouble("price");

                CProductData proData = new CProductData(proid, proname, supid, quantity, price);
                ProductDataList.add(proData);
            }
        } catch (SQLException ex) {
        }

        return ProductDataList;
    }
    
    
     public boolean deleteProduct(String proid) {
        try (Connection connection = DatabaseConnection.getConnection()){
            // Define the SQL query to delete the car
            String sql = "DELETE FROM Product WHERE proid = ?";
            
            // Prepare the SQL statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, proid);
            
            // Execute the SQL query and get the number of affected rows
            int rowsAffected = preparedStatement.executeUpdate();
            
            return rowsAffected > 0;
        } catch (SQLException ex) {
// Handle any database-related exceptions here
                        return false;
        }
    } 

}
