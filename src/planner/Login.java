/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package planner;

import compenent.Panelcover;
import compenent.Panelcover1;
import net.miginfocom.swing.MigLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;


public class Login extends javax.swing.JFrame {
private MigLayout layout;
private boolean isLogin;
private Panelcover panelcover1;
private Panelcover1 panelcover2;
private final double addSize =30;
private final double coverSize=40;
private final double loginSize=60;

private final DecimalFormat df=new DecimalFormat("##0.###");



    public Login() {
        initComponents();
        init();
    }
    private void init(){
        layout =new MigLayout("fill,insets 0");
        panelcover1=new Panelcover();
        panelcover2=new Panelcover1();
        TimingTarget target=new TimingTargetAdapter(){
            public void timingEvent(float fraction){
               double fractionCover;
               double fractionlogin;
               double size =coverSize;
               if(fraction<=0.5f){
                   size+=fraction*addSize;
               }else{
                   size+=addSize-fraction*addSize;
               }
                if(isLogin){
                   fractionCover=1f -fraction;
                   fractionlogin=fraction;
               }else{
               
                   fractionCover=fraction;
                   fractionlogin=1f -fraction;
               }
                fractionCover=Double.valueOf(df.format(fractionCover));
                 fractionlogin=Double.valueOf(df.format(fractionlogin));
                layout.setComponentConstraints(panelcover1, "width "+size+"%, pos"+fractionCover+"al 0 n 100%");
                layout.setComponentConstraints(panelcover2, "width "+loginSize+"%, pos"+fractionlogin+"1al 0 n 100%");

                jLayeredPane1.revalidate();
            }
            public void end(){
                isLogin=!isLogin;
            }
        };
                Animator animator=new Animator(1000,target);
                animator.setAcceleration(0.5f);
                animator.setDeceleration(0.5f);
                animator.setResolution(0);
        jLayeredPane1.setLayout(layout);
       
       
       jLayeredPane1.add(panelcover1,"width "+coverSize+"%, pos 0al 0 n 100%");
       jLayeredPane1.add(panelcover2,"width "+loginSize+"%, pos 1al 0 n 100%");
       panelcover1.addEvent(new ActionListener(){
    public void actionPerformed(ActionEvent ae){
        if(!animator.isRunning()){
            animator.start();
        }
    }
    
    });
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setBackground(new java.awt.Color(255, 255, 255));
        jLayeredPane1.setOpaque(true);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 866, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
        setLocationRelativeTo(null);
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
