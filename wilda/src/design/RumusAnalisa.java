/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design;

import design.panel.AnalisaPanel;
import java.awt.FlowLayout;
import java.util.List;
import javax.swing.*;
import model.MinMaxData;
import model.TestConnection;

/**
 *
 * @author rachmad
 */
public class RumusAnalisa extends javax.swing.JFrame {
    private MinMaxData minMaxData;
    private String min, max;
    private TestConnection tc;
    private List columnData, columnName;
    private JPanel mainPanel;
    /**
     * Creates new form RumusAnalisa
     */
    public RumusAnalisa(String getModelName, List columnData, List columnName) {
        tc = new TestConnection();
        minMaxData = new MinMaxData(tc.getConnection(), "mobil", "harga");
        max = minMaxData.getMax();
        min = minMaxData.getMin();
        this.columnData = columnData;
        this.columnName = columnName;
        mainPanel = new JPanel();
        //initComponents();
        design(getModelName);
    }
    
    private void design(String getModelName){
        setDefaultCloseOperation(javax.swing.JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
	getRootPane().setWindowDecorationStyle(JRootPane.NONE);
	setLocation(0,0);
        setLayout(new java.awt.GridLayout(1,1));
        add(new JScrollPane(mainPanel));
        mainPanel.setLayout(new java.awt.GridLayout((int)Math.ceil(columnData.size()/2), 2));
        System.out.println(columnName.size());
        for(int i=1; i<columnName.size(); i++){
            mainPanel.add(new AnalisaPanel(getModelName, columnName.get(i), columnData.get(i)));
        }
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    /*
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblColumn = new javax.swing.JLabel();
        lblMax = new javax.swing.JLabel();
        lblMin = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCurrent = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        txtMax1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtResult = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblModel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jPanel1.setLayout(null);

        lblColumn.setText("Bobot Harga =");
        jPanel1.add(lblColumn);
        lblColumn.setBounds(10, 50, 110, 16);

        lblMax.setText("Batas harga max");
        jPanel1.add(lblMax);
        lblMax.setBounds(120, 40, 120, 16);

        lblMin.setText("Harga mobil");
        jPanel1.add(lblMin);
        lblMin.setBounds(270, 40, 160, 16);

        jLabel1.setText("-");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(250, 40, 10, 16);

        jSeparator1.setBackground(java.awt.Color.black);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(110, 120, 280, 10);

        jLabel2.setText("Batas harga max");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 70, 110, 16);

        jLabel3.setText("-");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(250, 70, 10, 16);

        jLabel4.setText("Batas Harga min");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(270, 70, 110, 16);

        txtMax.setText("728000000");
        jPanel1.add(txtMax);
        txtMax.setBounds(120, 130, 120, 20);

        jLabel5.setText("-");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(250, 100, 10, 16);

        txtCurrent.setText("137400000");
        jPanel1.add(txtCurrent);
        txtCurrent.setBounds(270, 100, 110, 20);

        jSeparator2.setBackground(java.awt.Color.black);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(110, 60, 280, 10);

        txtMax1.setText("728000000");
        jPanel1.add(txtMax1);
        txtMax1.setBounds(120, 100, 120, 20);

        jLabel6.setText("-");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(250, 130, 10, 16);

        txtMin.setText("137000000");
        jPanel1.add(txtMin);
        txtMin.setBounds(270, 130, 110, 20);

        jLabel7.setText("100%");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(400, 110, 36, 16);

        jLabel8.setText("100%");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(400, 50, 36, 16);

        txtResult.setText("99,93");
        jPanel1.add(txtResult);
        txtResult.setBounds(120, 160, 45, 26);

        jPanel2.setBackground(new java.awt.Color(175, 179, 251));

        lblModel.setText("Brio Satya");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblModel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblModel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 560, 30);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    */
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(RumusAnalisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(RumusAnalisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(RumusAnalisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(RumusAnalisa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new RumusAnalisa().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblColumn;
    private javax.swing.JLabel lblMax;
    private javax.swing.JLabel lblMin;
    private javax.swing.JLabel lblModel;
    private javax.swing.JTextField txtCurrent;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMax1;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
