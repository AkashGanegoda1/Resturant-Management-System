package View;

import KeyListeners.PhoneNumberTextFieldKeyListener;
import Controller.CSupplierData;
import Controller.CSupplier;
import Model.MSupplier;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Supplier extends javax.swing.JFrame {

   private final CSupplier controller;
    public Supplier() {
        initComponents();
        txt_sname.requestFocus();
        displayExistingSupplierData();
        String productId = generateSupplierID();
        txt_supid.setText(productId);
        MSupplier model = new MSupplier();
        controller = new CSupplier(this, model);
        txt_sname.requestFocus();
        
        txt_cn.addKeyListener(new PhoneNumberTextFieldKeyListener());
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Exit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_cn = new javax.swing.JTextField();
        txt_supid = new javax.swing.JTextField();
        txt_sname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        SupplierTable = new javax.swing.JTable();
        btnclear = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Supplier");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(102, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SUPPLIER");

        Exit1.setBackground(new java.awt.Color(204, 0, 0));
        Exit1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Exit1.setForeground(new java.awt.Color(255, 255, 255));
        Exit1.setText("X");
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 591, Short.MAX_VALUE)
                .addComponent(Exit1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Exit1))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel1.setText("Contact Number");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, -1));
        jPanel3.add(txt_cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 260, 30));

        txt_supid.setEditable(false);
        jPanel3.add(txt_supid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 260, 30));
        jPanel3.add(txt_sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 260, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel3.setText("SupplierID");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel8.setText("Supplier Name");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        SupplierTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SupplierID", "Supplier_Name", "Contact_Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SupplierTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SupplierTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SupplierTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 750, 300));

        btnclear.setBackground(new java.awt.Color(204, 102, 0));
        btnclear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel3.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 120, 30));

        btnsave.setBackground(new java.awt.Color(153, 0, 51));
        btnsave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel3.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 120, 30));

        btnupdate.setBackground(new java.awt.Color(204, 102, 0));
        btnupdate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnupdate.setForeground(new java.awt.Color(255, 255, 255));
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel3.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 120, 30));

        btndelete.setBackground(new java.awt.Color(153, 0, 51));
        btndelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        dispose();
        Dashboard L1  = new Dashboard();

        // Set the behavior of the new form (e.g., default close operation)
        L1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        L1.pack();
        L1.setVisible(true);
    }//GEN-LAST:event_Exit1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <=1.0; i = i+0.1){
            String val = i+ "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try{
                Thread.sleep(30);
            }catch(Exception e){
                
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        String supid = txt_supid.getText().trim();
        String supname = txt_sname.getText().trim();
        String supcn = txt_cn.getText().trim();
        

    if (supid.isEmpty()) {
        
       
        displayMessage("Please enter Product ID! ");
        return;
        
    }
  
    if (supname.isEmpty()) {
        
       
        displayMessage("Please enter Product Name! ");
        return;
        
    }

    
    if (supcn == null) {
        
      
        displayMessage("Please Select SupplierID! ");
        return;
    }

  
        int supcns = Integer.parseInt(supcn);
        controller.saveSupplierToDatabase(supid,supname,supcns);
    }//GEN-LAST:event_btnsaveActionPerformed

    private void SupplierTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SupplierTableMouseClicked
        int selectedRow = SupplierTable.getSelectedRow();
    if (selectedRow != -1) {
        // A row is selected, so you can retrieve the data from the selected row
        DefaultTableModel tableModel = (DefaultTableModel) SupplierTable.getModel();
        String supid = (String) tableModel.getValueAt(selectedRow, 0);
        String supname = (String) tableModel.getValueAt(selectedRow, 1);
        int supcn = (int) tableModel.getValueAt(selectedRow, 2);

        // Populate the text fields and combo box with the selected car's data
        txt_supid.setText(supid);
        txt_sname.setText(supname);
        txt_cn.setText(String.valueOf(supcn));

        // You can also enable the "Update" and "Delete" buttons here if needed
        btndelete.setEnabled(true);
        btnclear.setEnabled(true);
    }//GEN-LAST:event_SupplierTableMouseClicked
   
    }
    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int selectedRow = SupplierTable.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel tableModel = (DefaultTableModel) SupplierTable.getModel();
            String proid = (String) tableModel.getValueAt(selectedRow, 0); 

            
            controller.deleteSupplier(proid);
            
            
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a Supplier to delete.");
        }    
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clearInputFields();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        int selectedRow = SupplierTable.getSelectedRow();
        if (selectedRow != -1) {
            String supid = txt_supid.getText();
            String supname = txt_sname.getText();
            int supcn = Integer.parseInt(txt_cn.getText());
            
            
            controller.updateSupplier(selectedRow,supid, supname, supcn);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a Supplier to update.");
        }        
    }//GEN-LAST:event_btnupdateActionPerformed
  
    private void displayExistingSupplierData() {
    MSupplier mpro = new MSupplier();
    List<CSupplierData> SupplierDataList = mpro.getAllSupplierData();

    DefaultTableModel tableModel = (DefaultTableModel) SupplierTable.getModel();
    tableModel.setRowCount(0); // Clear existing rows

    for (CSupplierData Data : SupplierDataList) {
        tableModel.addRow(new Object[]{Data.getsupid(), Data.getsupname(), Data.getsupcn()});
    }
   }
    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void addToSupplierList(String supid, String supname, int supcn) {
        DefaultTableModel tableModel = (DefaultTableModel) SupplierTable.getModel();
        tableModel.addRow(new Object[]{supid, supname, supcn});
    }
    
    public void clearInputFields() {
    takeID();
    txt_sname.setText("");
    txt_cn.setText(""); // Reset to the first status option
    
}
    public static String generateSupplierID()
    {
        String prefix = "SUPD";

        try {
            // Load the JDBC driver (this is specific to MySQL)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // JDBC URL, username, and password of MySQL server
            String url = "jdbc:mysql://localhost:3306/Bakery?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String password = "";

            // Establish a connection
            try (Connection connection = DriverManager.getConnection(url, user, password)) {
                // Create a statement
                Statement statement = connection.createStatement();

                // Execute the query to find the last proid
                String lastIdQuery = "SELECT supid FROM Supplier ORDER BY supid DESC LIMIT 1";
                ResultSet resultSet = statement.executeQuery(lastIdQuery);

                // Retrieve the last ID
                String lastId = null;
                if (resultSet.next()) {
                    lastId = resultSet.getString("supid");
                }

                // Generate the new ID
                String newId;
                if (lastId == null) {
                    // If no existing ID, start with "001"
                    newId = prefix + "001";
                } else {
                    // Extract the numeric part and increment
                    int numericPart = Integer.parseInt(lastId.substring(prefix.length()));
                    numericPart++;
                    // Format the numeric part to have leading zeros
                    String formattedNumericPart = String.format("%03d", numericPart);
                    newId = prefix + formattedNumericPart;
                }

                return newId;
                
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        // Return a default ID if an error occurs
        return prefix + "001";
        
    }
    public void takeID()
    {
        String newId = generateSupplierID();
        txt_supid.setText(newId);
    }
    
    public void updateSupplierRow(int selectedRow, String supid, String supname, int supcn) {
        DefaultTableModel tableModel = (DefaultTableModel) SupplierTable.getModel();
        tableModel.setValueAt(supid, selectedRow, 0);
        tableModel.setValueAt(supname, selectedRow, 1);
        tableModel.setValueAt(supcn, selectedRow, 2);
       
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit1;
    private javax.swing.JTable SupplierTable;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_cn;
    private javax.swing.JTextField txt_sname;
    private javax.swing.JTextField txt_supid;
    // End of variables declaration//GEN-END:variables
}
