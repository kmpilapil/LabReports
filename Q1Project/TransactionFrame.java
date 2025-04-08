package Q1Project;

import javax.swing.JOptionPane;

public class TransactionFrame extends javax.swing.JFrame {

    //Parameterized Constructor to handle product list from StoreFrame
    public TransactionFrame(String[] products) {
        initComponents(); // Initialize components
        ProductComboBox.removeAllItems();  // CLEAN. make sures to remove existing items from JComboBox
        for (String product : products) { // Add products to JComboBox via for loop and short hand notation
            ProductComboBox.addItem(product);
        }
    }
    
    //default Constructor
    public TransactionFrame() {
        initComponents();
    }

//-----------------------------------------Form method DO NOT MODIFY!
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ProductComboBox = new javax.swing.JComboBox<>();
        InputQuantity = new java.awt.TextField();
        CashRadioButton = new javax.swing.JRadioButton();
        CardRadioButton = new javax.swing.JRadioButton();
        ProductLabel = new javax.swing.JLabel();
        QuantityLabel = new javax.swing.JLabel();
        PaymentMethod = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ItemDisplayTable = new javax.swing.JTable();
        AddToCartButton = new javax.swing.JButton();
        TotalCostButton = new javax.swing.JButton();
        TotalPriceLabel = new javax.swing.JLabel();
        ConcludeTransactionButton = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setToolTipText("");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        ProductComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductComboBoxActionPerformed(evt);
            }
        });

        InputQuantity.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        InputQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputQuantityActionPerformed(evt);
            }
        });

        buttonGroup1.add(CashRadioButton);
        CashRadioButton.setSelected(true);
        CashRadioButton.setText("Cash");

        buttonGroup1.add(CardRadioButton);
        CardRadioButton.setText("Card");
        CardRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CardRadioButtonActionPerformed(evt);
            }
        });

        ProductLabel.setText("Select Product:");

        QuantityLabel.setText("Quantity:");

        PaymentMethod.setText("Payment Method:");

        ItemDisplayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ItemDisplayTable);

        AddToCartButton.setText("Add To Cart");
        AddToCartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddToCartButtonActionPerformed(evt);
            }
        });

        TotalCostButton.setText("Calculate Total");
        TotalCostButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalCostButtonActionPerformed(evt);
            }
        });

        TotalPriceLabel.setText("Total Price:");

        ConcludeTransactionButton.setText("Conclude Transaction >");
        ConcludeTransactionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConcludeTransactionButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ProductComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProductLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(QuantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(245, 245, 245))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(InputQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AddToCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(TotalCostButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PaymentMethod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CashRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CardRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(45, 45, 45)))
                        .addGap(13, 13, 13))
                    .addComponent(jScrollPane1))
                .addGap(113, 113, 113))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(499, 499, 499)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ConcludeTransactionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                        .addGap(9, 9, 9))
                    .addComponent(TotalPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(145, 145, 145))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(ProductLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                .addGap(4, 4, 4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(PaymentMethod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ProductComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                                .addGap(1, 1, 1))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TotalCostButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddToCartButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CashRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(CardRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(QuantityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(InputQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TotalPriceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ConcludeTransactionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//-----------------------------------------Form method END
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void CardRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CardRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CardRadioButtonActionPerformed

    private void InputQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputQuantityActionPerformed

    private void TotalCostButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalCostButtonActionPerformed
        double total = 0.0;
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) ItemDisplayTable.getModel();
        // Loop through the table to sum the total prices
        for (int i = 0; i < model.getRowCount(); i++) {
            String priceText = model.getValueAt(i, 2).toString().replace("P", ""); // Remove "P or pesos sign"
            total += Double.parseDouble(priceText); // Convert to double and add to total
        }

        // Display the total into the TotalPriceJLabel
        TotalPriceLabel.setText(String.format("Total: P%.2f", total));
    }//GEN-LAST:event_TotalCostButtonActionPerformed

    private void AddToCartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddToCartButtonActionPerformed
 String selectedProduct = (String) ProductComboBox.getSelectedItem();  // Get selected product
    String quantityText = InputQuantity.getText();

    // Error handling for empty quantity field
    if (quantityText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a quantity.");
        return;
    }

    double quantity;

    // Check if quantity input is valid (only for Rice, decimals are allowed)
    if (selectedProduct.equalsIgnoreCase("Rice")) {
        if (!quantityText.matches("\\d+(\\.\\d+)?")) { // Regex to match numbers with or without decimals
            JOptionPane.showMessageDialog(this, "Please enter a valid quantity for Rice (e.g., 1.5).");
            return;
        }
        quantity = Double.parseDouble(quantityText);
    } else {
        // For other products, only allow whole numbers
        if (!quantityText.matches("\\d+")) { // Matches only whole numbers
            JOptionPane.showMessageDialog(this, "Only whole number quantities are allowed for " + selectedProduct + ".");
            return;
        }
        quantity = Integer.parseInt(quantityText);
    }

    // Define product prices using hashmap (!!! Must match StoreFrame's prices)
    java.util.Map<String, Double> priceMap = new java.util.HashMap<>();
    priceMap.put("Water 1L", 20.0);
    priceMap.put("Loaf Bread", 70.0);
    priceMap.put("3 in 1 Cofee", 8.0);
    priceMap.put("Rice", 50.0);  // Assuming per kilo
    priceMap.put("Cigarette", 7.0);  // Assuming per stick

    // Error handling to check if product exists in the price list
    if (!priceMap.containsKey(selectedProduct)) {
        javax.swing.JOptionPane.showMessageDialog(this, "Price not found for selected product!", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    double price = priceMap.get(selectedProduct);
    double totalPrice = price * quantity;

    // Add to the ItemDisplayTable (convert to DefaultTableModel to store values)
    javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) ItemDisplayTable.getModel();
    model.addRow(new Object[]{selectedProduct, quantity, "P" + totalPrice});

    // Clear input field automatically for next entry
    InputQuantity.setText("");
    }//GEN-LAST:event_AddToCartButtonActionPerformed

    private void ConcludeTransactionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConcludeTransactionButtonActionPerformed
        // TODO add your handling code here:
        // Calculate total price from the cart
        double totalPrice = calculateTotal();  // Make sure this method exists and correctly calculates the total

        // Determine the payment method
        String paymentMethod = CashRadioButton.isSelected() ? "Cash" : "Card";

        // Call the concludeTransaction method with the required parameters
        concludeTransaction(totalPrice, paymentMethod);
    }//GEN-LAST:event_ConcludeTransactionButtonActionPerformed

    private void ProductComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductComboBoxActionPerformed
    private void concludeTransaction(double totalPrice, String paymentMethod) {
        String message = "Transaction Complete!\n"
                + "Total Paid: P" + totalPrice + "\n"
                + "Payment Method: " + paymentMethod;

        Object[] options = {"Return to Main Store"};
        javax.swing.JOptionPane.showOptionDialog(this, message, "Success", javax.swing.JOptionPane.DEFAULT_OPTION, javax.swing.JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        // Clears the cart
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) ItemDisplayTable.getModel();
        model.setRowCount(0); // Clears all rows

        this.dispose(); // Close Transaction Frame
    }

    private double calculateTotal() {
        double total = 0;
        javax.swing.table.DefaultTableModel model = (javax.swing.table.DefaultTableModel) ItemDisplayTable.getModel();

        // Loop through all rows and sum up the total prices
        for (int i = 0; i < model.getRowCount(); i++) {
            String priceText = model.getValueAt(i, 2).toString().replace("P", ""); // Remove "P" symbol
            total += Double.parseDouble(priceText);
        }

        return total;
    }

//-----------------------------------------Main method
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
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TransactionFrame().setVisible(true);
            }
        });
    }
//-----------------------------------------Form method END!
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddToCartButton;
    private javax.swing.JRadioButton CardRadioButton;
    private javax.swing.JRadioButton CashRadioButton;
    private javax.swing.JButton ConcludeTransactionButton;
    private java.awt.TextField InputQuantity;
    private javax.swing.JTable ItemDisplayTable;
    private javax.swing.JLabel PaymentMethod;
    private javax.swing.JComboBox<String> ProductComboBox;
    private javax.swing.JLabel ProductLabel;
    private javax.swing.JLabel QuantityLabel;
    private javax.swing.JButton TotalCostButton;
    private javax.swing.JLabel TotalPriceLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
