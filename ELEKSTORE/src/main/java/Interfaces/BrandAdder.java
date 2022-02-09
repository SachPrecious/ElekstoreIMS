/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author sachithra
 */
public class BrandAdder extends javax.swing.JFrame {

    /**
     * Creates new form BrandAdder
     */
    public BrandAdder() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnViewProducts = new java.awt.Button();
        btnViewBrands = new java.awt.Button();
        btnAddCategory = new java.awt.Button();
        btnAddProduct3 = new java.awt.Button();
        btnAddBrand = new java.awt.Button();
        btnAddProduct5 = new java.awt.Button();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnViewCustomers = new java.awt.Button();
        btnDailySales = new java.awt.Button();
        btnTodaySales = new java.awt.Button();
        btnLogOut = new java.awt.Button();
        btnViewOrders = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().setLayout(null);

        btnViewProducts.setBackground(new java.awt.Color(153, 153, 255));
        btnViewProducts.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnViewProducts.setLabel("View Products");
        getContentPane().add(btnViewProducts);
        btnViewProducts.setBounds(366, 125, 187, 49);

        btnViewBrands.setBackground(new java.awt.Color(153, 153, 255));
        btnViewBrands.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnViewBrands.setLabel("View Brands");
        getContentPane().add(btnViewBrands);
        btnViewBrands.setBounds(366, 243, 187, 49);

        btnAddCategory.setBackground(new java.awt.Color(153, 153, 255));
        btnAddCategory.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAddCategory.setLabel("Add Category");
        getContentPane().add(btnAddCategory);
        btnAddCategory.setBounds(169, 184, 187, 49);

        btnAddProduct3.setBackground(new java.awt.Color(153, 153, 255));
        btnAddProduct3.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAddProduct3.setLabel("Add Product");
        getContentPane().add(btnAddProduct3);
        btnAddProduct3.setBounds(169, 125, 187, 49);

        btnAddBrand.setBackground(new java.awt.Color(153, 153, 255));
        btnAddBrand.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAddBrand.setLabel("Add Brand");
        getContentPane().add(btnAddBrand);
        btnAddBrand.setBounds(169, 243, 187, 49);

        btnAddProduct5.setBackground(new java.awt.Color(153, 153, 255));
        btnAddProduct5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnAddProduct5.setLabel("View Categories");
        getContentPane().add(btnAddProduct5);
        btnAddProduct5.setBounds(366, 184, 187, 49);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ELEKSTORE ADMIN PANEL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(158, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 722, 107);

        btnViewCustomers.setBackground(new java.awt.Color(153, 153, 255));
        btnViewCustomers.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnViewCustomers.setLabel("View Customers");
        getContentPane().add(btnViewCustomers);
        btnViewCustomers.setBounds(169, 302, 187, 49);

        btnDailySales.setBackground(new java.awt.Color(153, 153, 255));
        btnDailySales.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnDailySales.setLabel("Daily Sales");
        getContentPane().add(btnDailySales);
        btnDailySales.setBounds(169, 361, 187, 49);

        btnTodaySales.setBackground(new java.awt.Color(153, 153, 255));
        btnTodaySales.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnTodaySales.setLabel("Today Sales");
        getContentPane().add(btnTodaySales);
        btnTodaySales.setBounds(366, 361, 187, 49);

        btnLogOut.setBackground(new java.awt.Color(153, 153, 255));
        btnLogOut.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnLogOut.setLabel("Log Out");
        getContentPane().add(btnLogOut);
        btnLogOut.setBounds(286, 420, 187, 49);

        btnViewOrders.setBackground(new java.awt.Color(153, 153, 255));
        btnViewOrders.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btnViewOrders.setLabel("View Orders");
        getContentPane().add(btnViewOrders);
        btnViewOrders.setBounds(366, 302, 187, 49);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(BrandAdder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BrandAdder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BrandAdder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BrandAdder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BrandAdder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnAddBrand;
    private java.awt.Button btnAddCategory;
    private java.awt.Button btnAddProduct3;
    private java.awt.Button btnAddProduct5;
    private java.awt.Button btnDailySales;
    private java.awt.Button btnLogOut;
    private java.awt.Button btnTodaySales;
    private java.awt.Button btnViewBrands;
    private java.awt.Button btnViewCustomers;
    private java.awt.Button btnViewOrders;
    private java.awt.Button btnViewProducts;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
