/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package compenent;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
public class Panelcover extends javax.swing.JPanel {
private ActionListener event;
   
    public Panelcover() {
        initComponents();
        setOpaque(false);
    }

    
    @SuppressWarnings("unchecked")
    
    
    
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButton1)
                .addContainerGap(472, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(128, 128, 128))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

event.actionPerformed(evt);

        
    }//GEN-LAST:event_jButton1ActionPerformed
@Override
  protected void paintComponent(Graphics grphcs){
      Graphics2D g2=(Graphics2D) grphcs;
      GradientPaint gra=new GradientPaint(0,0,new Color(35,166,97),0,getHeight(),new Color(22,116,66));
      g2.setPaint(gra);
      g2.fillRect(0,0,getWidth(),getHeight());
      super.paintComponent(grphcs);
  }

    /**
     *
     * @param event
     */
    public void addEvent(ActionListener event){
        this.event =event;
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
