package Controller;

import javax.swing.*;
import Model.MProduct;
import View.Product;

public class CProduct {
    private final Product View;
    private final MProduct Model;
    
     public CProduct(Product View, MProduct Model) {
        this.View = View;
        this.Model = Model;
        
        // Add action listeners and set up the controller logic here
    }
     
       public void saveProductToDatabase(String proid, String proname, String supid, String quantity, double price) {
        boolean isSuccess = Model.saveProduct(proid,proname,supid,quantity,price);
        
        if (isSuccess) {
            View.displayMessage("Product Saved successfully.");
            View.addToProductList(proid,proname,supid,quantity,price);
            // Clear the input fields after successful insertion
            View.takeID();
            View.clearInputFields();
        } else {
            View.displayMessage("Failed to save.");
        }
    }
       
    
       public void deleteProduct(String proid) {
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            boolean deletionSuccessful = Model.deleteProduct(proid);

            if (deletionSuccessful) {
                // Notify the view or handle success as needed
                JOptionPane.showMessageDialog(null, "Product deleted successfully.");
                  View.takeID();
                  View.clearInputFields();
            } else {
                // Notify the view or handle failure as needed
                JOptionPane.showMessageDialog(null, "Failed to delete from the database.");
            }
        }
    }
 
}
