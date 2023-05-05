/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package planner;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LENOVO
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
    Connect();
        Load_Class();
       

    }

   Connection con;
    PreparedStatement pat;
    ResultSet re;

    public void Connect(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3308/sys","root","Test@123");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(page1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(page1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
  
  public void Load_Class()
  {
   
       
        try {
            pat =con.prepareStatement("select Distinct class from class");
            re=pat.executeQuery();
            comclass.removeAllItems();
            while(re.next()){
                comclass.addItem(re.getString("class"));
            } 
        } catch (SQLException ex) {
            Logger.getLogger(page2.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  
  
  
  
  
  
  
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        comclass = new javax.swing.JComboBox<>();
        comdays = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(189, 214, 255));
        setForeground(new java.awt.Color(204, 204, 255));
        setMinimumSize(new java.awt.Dimension(949, 590));
        setResizable(false);
        setSize(new java.awt.Dimension(949, 590));
        getContentPane().setLayout(null);

        comclass.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        comclass.setForeground(new java.awt.Color(255, 255, 255));
        comclass.setBorder(null);
        comclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comclassActionPerformed(evt);
            }
        });
        getContentPane().add(comclass);
        comclass.setBounds(120, 100, 90, 30);

        comdays.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        comdays.setForeground(new java.awt.Color(255, 255, 255));
        comdays.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuseday", "Wednesday", "Thursday", "Friday" }));
        comdays.setBorder(null);
        getContentPane().add(comdays);
        comdays.setBounds(310, 100, 100, 30);

        jButton1.setFont(new java.awt.Font("Segoe Print", 3, 23)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\button (2).png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(460, 100, 100, 30);

        jTable1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Segoe UI Semilight", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAlignmentX(50.0F);
        jTable1.setAlignmentY(50.0F);
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        jTable1.setRowHeight(42);
        jTable1.setRowMargin(20);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 250, 860, 280);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\LENOVO\\Downloads\\Untitled.jpg")); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, -20, 1150, 580);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("SansSerif", 3, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(21, 150, 189));
        jLabel7.setText("      Subject");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(250, 150, 230, 40);

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("SansSerif", 3, 30)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(21, 150, 189));
        jLabel9.setText("      Subject");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        getContentPane().add(jLabel9);
        jLabel9.setBounds(250, 150, 230, 40);

        jLabel10.setFont(new java.awt.Font("SansSerif", 3, 30)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(21, 150, 189));
        jLabel10.setText(" Faculty Name");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 204, 0), 2, true));
        getContentPane().add(jLabel10);
        jLabel10.setBounds(480, 150, 230, 40);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {
            String classs=comclass.getSelectedItem().toString();
            String days=comdays.getSelectedItem().toString();
            pat=con.prepareStatement("select * from timetable where class=? && days=?");
            pat.setString(1, classs);
            pat.setString(2, days);
            ResultSet r = pat.executeQuery();
            
            
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
            java.sql.ResultSetMetaData RSMD=r.getMetaData();
            int CC=RSMD.getColumnCount();
            DefaultTableModel DFT=(DefaultTableModel) jTable1.getModel();
            DFT.setRowCount(0);
            
            
            while(r.next()){
                Vector v2=new Vector();
                for(int li=1;li<=CC;li++)
                
                {
                     v2.add(r.getString("Time"));
                    v2.add(r.getString("Subject"));
                     v2.add(r.getString("Teacher"));
                     v2.add(r.getString("Venue"));
                   
                    
                }
                DFT.addRow(v2);
                
            }
            jTable1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(View.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        



    }//GEN-LAST:event_jButton1ActionPerformed

    private void comclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comclassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comclassActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comclass;
    private javax.swing.JComboBox<String> comdays;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
