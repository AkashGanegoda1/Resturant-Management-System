package View;

import javax.swing.*;
import Model.MProduct;
import Controller.CProduct;
import Controller.CProductData;
import KeyListeners.LettersSpaceDotTextFieldKeyListener;
import java.sql.*;
import java.util.*;
import javax.swing.table.DefaultTableModel;
import KeyListeners.NumericTextFieldKeyListener;


public class Product extends javax.swing.JFrame {

   private final CProduct controller;
    public Product() {
        initComponents();
        String productId = generateProductID();
        txt_productid.setText(productId);
        txt_quantity.addKeyListener(new NumericTextFieldKeyListener());
        txt_price.addKeyListener(new NumericTextFieldKeyListener());
        txt_proname.addKeyListener(new LettersSpaceDotTextFieldKeyListener());
        loadSupplierID();
        generateProductID();
        MProduct model = new MProduct();
        controller = new CProduct(this, model);
        displayExistingProductData();
        txt_proname.requestFocus();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Exit1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        txt_productid = new javax.swing.JTextField();
        txt_proname = new javax.swing.JTextField();
        txt_quantity = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        btnclear = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        cmb_supid = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Products");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PRODUCTS");

        Exit1.setBackground(new java.awt.Color(204, 0, 0));
        Exit1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        Exit1.setForeground(new java.awt.Color(255, 255, 255));
        Exit1.setText("X");
        Exit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Exit1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 666, Short.MAX_VALUE)
                .addComponent(Exit1)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Exit1)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel1.setText("Single Unit Price ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 250, -1, -1));
        jPanel1.add(txt_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 220, 30));

        txt_productid.setEditable(false);
        txt_productid.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_productid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 220, 30));
        jPanel1.add(txt_proname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 220, 30));
        jPanel1.add(txt_quantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 130, 220, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel2.setText("ProductID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel3.setText("SupplierID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel5.setText("Quantity");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 16)); // NOI18N
        jLabel6.setText("Product Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ProductID", "Product_Name", "SupplierID", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 870, 330));

        btnclear.setBackground(new java.awt.Color(204, 102, 0));
        btnclear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnclear.setForeground(new java.awt.Color(255, 255, 255));
        btnclear.setText("Clear");
        btnclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnclearActionPerformed(evt);
            }
        });
        jPanel1.add(btnclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 340, 120, 30));

        btnsave.setBackground(new java.awt.Color(204, 102, 0));
        btnsave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 120, 30));

        btndelete.setBackground(new java.awt.Color(153, 0, 51));
        btndelete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, 120, 30));
        jPanel1.add(cmb_supid, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 220, 30));

        jButton1.setBackground(new java.awt.Color(153, 0, 51));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Add Quantity");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 170, 120, 30));

        jLabel7.setBackground(new java.awt.Color(204, 204, 0));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel7.setText("Quantity can be added by selecting a particular Product from the table");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 470, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 0, 51));
        jLabel8.setText("NOTE  :  ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void Exit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Exit1ActionPerformed
        dispose(); 
        Dashboard L1  = new Dashboard();

        // Set the behavior of the new form (e.g., default close operation)
        L1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Display the new form
        L1.pack();
        L1.setVisible(true);
    }//GEN-LAST:event_Exit1ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
     
        
        String proid = txt_productid.getText().trim();
                        String proname = txt_proname.getText().trim();
                        String supid = (String) cmb_supid.getSelectedItem();
                        String quantity = txt_quantity.getText().trim();
                        String price = txt_price.getText().trim();

                        if (proid.isEmpty()) {
        
       
                          displayMessage("Please enter Product ID! ");
                          return;
        
                        }
  
                       if (proname.isEmpty()) {
        
       
                          displayMessage("Please enter Product Name! ");
                          return;
        
                        }

    
                        if (supid == null) {
        
      
                          displayMessage("Please Select SupplierID! ");
                          return;
                        }

   
                        if (quantity.isEmpty()) {
                
                         displayMessage("Please enter Quantity! ");
                         return;
                        }
    
                        if (price.isEmpty()) {
                
                          displayMessage("Please enter Price! ");
                          return;
                        }
    
        double prices = Double.parseDouble(price);
        controller.saveProductToDatabase(proid,proname,supid,quantity,prices);
        generateProductID();
    }//GEN-LAST:event_btnsaveActionPerformed
   
    
    
    public void ProductCountUpdate()
    {
        Connection con = null;
        try {
            // Establish a connection
            String url = "jdbc:mysql://localhost:3306/Bakery?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String password = "";
            con = DriverManager.getConnection(url, user, password);

            String selectQqinQuery = "SELECT * FROM Product WHERE proname=?";
            try (PreparedStatement selectStmt = con.prepareStatement(selectQqinQuery)) {
                selectStmt.setString(1, txt_proname.getText());
                try (ResultSet resultSet = selectStmt.executeQuery()) {
                    if (resultSet.next()) {

                        String updateQqinQuery = "UPDATE Product SET quantity=quantity+? WHERE proname=?";
                        try (PreparedStatement updateStmt = con.prepareStatement(updateQqinQuery)) {
                            updateStmt.setString(1, txt_quantity.getText());
                            updateStmt.setString(2, txt_proname.getText());
                            updateStmt.executeUpdate();
                        }
                            
                    } 
                    else 
                    {
                        displayMessage("Please Select a Product to add Quantity! ");
                    }
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Close the connection in a finally block
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    
    private void btnclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnclearActionPerformed
        clearInputFields();
    }//GEN-LAST:event_btnclearActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int selectedRow = ProductTable.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel tableModel = (DefaultTableModel) ProductTable.getModel();
            String proid = (String) tableModel.getValueAt(selectedRow, 0); // Assuming carRegistration is in the first column

            // Call the controller to delete the car
            controller.deleteProduct(proid);
            
            // Remove the selected row from the table (optional)
            tableModel.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a Product to delete.");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        int selectedRow = ProductTable.getSelectedRow();
if (selectedRow != -1) {
    // A row is selected, so you can retrieve the data from the selected row
    DefaultTableModel tableModel = (DefaultTableModel) ProductTable.getModel();
    String proid = (String) tableModel.getValueAt(selectedRow, 0);
    String proname = (String) tableModel.getValueAt(selectedRow, 1);
    String supid = (String) tableModel.getValueAt(selectedRow, 2);

    // Handle the quantity column appropriately
    Object quantityObj = tableModel.getValueAt(selectedRow, 3);
    String quantity = (quantityObj != null) ? String.valueOf(quantityObj) : "";

    // Assuming the "price" column is a double
    double price = (double) tableModel.getValueAt(selectedRow, 4);

    // Populate the text fields and combo box with the selected data
    txt_productid.setText(proid);
    txt_proname.setText(proname);
    cmb_supid.setSelectedItem(supid);
    txt_quantity.setText(quantity);
    txt_price.setText(String.valueOf(price));

    // You can also enable the "Update" and "Delete" buttons here if needed
    btndelete.setEnabled(true);
    btnclear.setEnabled(true);


    }      
    }//GEN-LAST:event_ProductTableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ProductCountUpdate();
        try {
            // Load the JDBC driver
            

            // Establish a connection
            String url = "jdbc:mysql://localhost:3306/Bakery?zeroDateTimeBehavior=CONVERT_TO_NULL";
            String user = "root";
            String password = "";
            Connection con = DriverManager.getConnection(url, user, password);

            try {

    

    // Query the database
    String query = "SELECT * FROM Product";
    PreparedStatement statement = con.prepareStatement(query);
    ResultSet resultSet = statement.executeQuery();

    // Convert ResultSet to DefaultTableModel
    DefaultTableModel model = new DefaultTableModel();
    int columnCount = resultSet.getMetaData().getColumnCount();

    // Add column headers
    for (int i = 1; i <= columnCount; i++) {
        model.addColumn(resultSet.getMetaData().getColumnName(i));
    }

    // Add rows
    while (resultSet.next()) {
        Object[] row = new Object[columnCount];
        for (int i = 1; i <= columnCount; i++) {
            // Handle different data types appropriately
            if (resultSet.getObject(i) instanceof Integer) {
                row[i - 1] = resultSet.getInt(i);
            } else {
                row[i - 1] = resultSet.getObject(i);
            }
        }
        model.addRow(row);
    }

    // Close resources
    resultSet.close();
    statement.close();
    con.close();

    // Set the model to the JTable
    ProductTable.setModel(model);

} catch (SQLException ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}

        
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public void displayMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    public void addToProductList(String proid, String proname, String supid, String quantity, double price) {
        DefaultTableModel tableModel = (DefaultTableModel) ProductTable.getModel();
        tableModel.addRow(new Object[]{proid, proname, supid, quantity, price});
    }
    
    public void clearInputFields() {
    takeID();
    txt_proname.setText("");
    txt_quantity.setText("");
    txt_price.setText("");
    cmb_supid.setSelectedIndex(-1); // Reset to the first status option
    
}
    
    private void displayExistingProductData() {
    MProduct mpro = new MProduct();
    List<CProductData> ProductDataList = mpro.getAllProductData();

    DefaultTableModel tableModel = (DefaultTableModel) ProductTable.getModel();
    tableModel.setRowCount(0); // Clear existing rows

    for (CProductData carData : ProductDataList) {
        tableModel.addRow(new Object[]{carData.getproid(), carData.getproname(), carData.getsupid(), carData.getquantity(), carData.getprice()});
    }
}
    private void loadSupplierID() {
        try {
            // Establish a database connection
           try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bakery?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "")) {
                String sql = "SELECT supid FROM Supplier";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                ResultSet resultSet = preparedStatement.executeQuery();


                // Create a DefaultComboBoxModel to store the car registration data
                DefaultComboBoxModel<String> comboBoxMode2 = new DefaultComboBoxModel<>();

                // Iterate through the result set and add car registration values to the model
                while (resultSet.next()) {
                    String Did = resultSet.getString("supid");
                    comboBoxMode2.addElement(Did);
                }

                // Set the model with car registration data to the carCom JComboBox
               cmb_supid.setModel(comboBoxMode2);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
    
    public static String generateProductID()
    {
        String prefix = "PROD";

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
                String lastIdQuery = "SELECT proid FROM Product ORDER BY proid DESC LIMIT 1";
                ResultSet resultSet = statement.executeQuery(lastIdQuery);

                // Retrieve the last ID
                String lastId = null;
                if (resultSet.next()) {
                    lastId = resultSet.getString("proid");
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
        String newId = generateProductID();
        txt_productid.setText(newId);
    }
    
    
  
    public static void main(String args[]) {
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Exit1;
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> cmb_supid;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_productid;
    private javax.swing.JTextField txt_proname;
    private javax.swing.JTextField txt_quantity;
    // End of variables declaration//GEN-END:variables
}
