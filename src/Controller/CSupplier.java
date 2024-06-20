package Controller;

import javax.swing.*;
import Model.MSupplier;
import View.Supplier;

public class CSupplier {
    private final Supplier View;
    private final MSupplier Model;
    
     public CSupplier(Supplier View, MSupplier Model) {
        this.View = View;
        this.Model = Model;
        
        // Add action listeners and set up the controller logic here
    }
     
       public void saveSupplierToDatabase(String supid, String supname, int supcn) {
        boolean isSuccess = Model.saveSupplier(supid,supname,supcn);
        
        if (isSuccess) {
            View.displayMessage("Supplier Saved successfully.");
            View.addToSupplierList(supid,supname,supcn);

            // Clear the input fields after successful insertion
            View.takeID();
            View.clearInputFields();
        } else {
            View.displayMessage("Failed to save.");
        }
    }
       
    
       public void deleteSupplier(String proid) {
        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
            boolean deletionSuccessful = Model.deleteSupplier(proid);

            if (deletionSuccessful) {
                // Notify the view or handle success as needed
                JOptionPane.showMessageDialog(null, "Supplier deleted successfully.");
                  View.takeID();
                  View.clearInputFields();
            } else {
                // Notify the view or handle failure as needed
                JOptionPane.showMessageDialog(null, "Failed to delete from the database.");
            }
        }
    }
       public void updateSupplier(int selectedRow, String supid, String supname, int supcn) {
        int confirm = JOptionPane.showConfirmDialog(View, "Are you sure you want to update this Supplier?", "Confirm Update", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            boolean success = Model.updateSupplier(supid, supname, supcn);
            if (success) {
                // Update the view or show a success message
                View.updateSupplierRow(selectedRow, supid, supname, supcn);
                JOptionPane.showMessageDialog(View, "Supplier updated successfully.");
                  View.takeID();
                  View.clearInputFields();
            } else {
                JOptionPane.showMessageDialog(View, "Failed to update");
            }
        }
    }   
}
