/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package planner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
    import java.sql.ResultSet;
import javax.swing.JOptionPane;


/**
 *
 * @author LENOVO
 */
public class page2 extends javax.swing.JFrame {

    /**
     * Creates new form page2
     */
    public page2() {
        initComponents();
        Connect();
        Load_Class();
        Load_Subject();
        Load_Teacher();

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
    public void Load_Subject()
  {
   
        try {
            pat =con.prepareStatement("select Distinct subject from subject");
            re=pat.executeQuery();
            comsubject.removeAllItems();
            while(re.next()){
                comsubject.addItem(re.getString("subject"));
            } } catch (SQLException ex) {
           Logger.getLogger(page2.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  
     public void Load_Teacher()
  {
   
        try {
            pat =con.prepareStatement("select Distinct teacher from teacher");
            re=pat.executeQuery();
            comteacher.removeAllItems();
            while(re.next()){
                comteacher.addItem(re.getString("teacher"));
            } } catch (SQLException ex) {
           Logger.getLogger(page2.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
  
  
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        comclass = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        comsubject = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        comteacher = new javax.swing.JComboBox<>();
        comtime = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        comdays1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtvenue = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("TimeTable Registration");

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Class");

        comclass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comclass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comclassActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Subject");

        comsubject.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comsubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comsubjectActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Timing");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Teacher");

        comteacher.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comteacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comteacherActionPerformed(evt);
            }
        });

        comtime.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comtime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9.00 to 10.50", "9.00 to 9.55", "9.55 to 10.50", "11.05 to 12.00", "12.00 to 12.55", "11.05 to 12.55", "1.55 to 2.50", "2.50 to 3.45", "1.55 to 3.45" }));
        comtime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comtimeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Days");

        comdays1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        comdays1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Monday", "Tuseday", "Wednesday", "Thursday", "Friday" }));
        comdays1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comdays1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Venue");

        txtvenue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(216, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(149, 149, 149)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comclass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comteacher, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comdays1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtvenue, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(242, 242, 242))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comclass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comsubject, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comteacher))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comdays1))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtvenue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void comclassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comclassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comclassActionPerformed

    private void comsubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comsubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comsubjectActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

try{

            String classname=comclass.getSelectedItem().toString();
            String subjectname=comsubject.getSelectedItem().toString();
            String teachername=comteacher.getSelectedItem().toString();
            String daysname=comdays1.getSelectedItem().toString();
            String timename=comtime.getSelectedItem().toString();
            String  venuename=txtvenue.getText();           

            
            pat=con.prepareStatement("insert into timetable (class,teacher,subject,days,time,venue)values(?,?,?,?,?,?)");
            pat.setString(1,classname);
            pat.setString(2,teachername);
              pat.setString(3,subjectname);
            pat.setString(4,daysname);
              pat.setString(5,timename);
              pat.setString(6,venuename);
                          

            
            
            pat.executeUpdate();
            
            JOptionPane.showMessageDialog(this,"Time Table Added Successfully");
            comclass.setSelectedIndex(-1);
             comteacher.setSelectedIndex(-1);
              comsubject.setSelectedIndex(-1);
               comdays1.setSelectedIndex(-1);
                comtime.setSelectedIndex(-1);
                            txtvenue.setText("");

             
               
        } catch (SQLException ex) {
            Logger.getLogger(page1.class.getName()).log(Level.SEVERE, null, ex);
        }















    }//GEN-LAST:event_jButton1ActionPerformed

    private void comteacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comteacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comteacherActionPerformed

    private void comtimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comtimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comtimeActionPerformed

    private void comdays1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comdays1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comdays1ActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(page2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new page2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comclass;
    private javax.swing.JComboBox<String> comdays1;
    private javax.swing.JComboBox<String> comsubject;
    private javax.swing.JComboBox<String> comteacher;
    private javax.swing.JComboBox<String> comtime;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtvenue;
    // End of variables declaration//GEN-END:variables
}
