/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foradminupdate;

import admin.adminDashboard;
import viewdetailsusers.*;
import config.Session;
import config.dbConnector;
import java.sql.ResultSet;
import user.userDashboard;

/**
 *
 * @author Sofia
 */
public class viewdetailsadmin extends javax.swing.JFrame {

    /**
     * Creates new form viewdetails
     */
    public viewdetailsadmin() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jfname = new javax.swing.JLabel();
        jlastname = new javax.swing.JLabel();
        jemail = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jid = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 150, 90, 17);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("First Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 110, 100, 17);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Email");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 190, 80, 17);

        jfname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jfname.setText("First Name");
        jPanel1.add(jfname);
        jfname.setBounds(140, 110, 140, 15);

        jlastname.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jlastname.setText("Last Name");
        jPanel1.add(jlastname);
        jlastname.setBounds(140, 150, 130, 15);

        jemail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jemail.setForeground(new java.awt.Color(255, 255, 255));
        jemail.setText("Email");
        jPanel1.add(jemail);
        jemail.setBounds(140, 190, 120, 15);

        jLabel4.setFont(new java.awt.Font("Stencil", 1, 18)); // NOI18N
        jLabel4.setText("Personal Information");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 40, 250, 19);

        jButton1.setText("Update information");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 240, 150, 40);

        jButton2.setText("Update Password");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(200, 240, 130, 40);

        jid.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jid.setText("ID");
        jPanel1.add(jid);
        jid.setBounds(140, 70, 34, 15);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("ID");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 70, 50, 17);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(280, 20, 55, 23);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Black Yellow Modern Black Friday Facebook Post.png"))); // NOI18N
        jLabel6.setText("jLabel3");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 940, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       //update infor button
       
       this.dispose();
       
        String ids = jid.getText();
        
        dbConnector dbc = new dbConnector();
        
        try{
            
            String query =("SELECT * FROM tbl_user WHERE id ='"+ids+"' ");
            ResultSet rs = dbc.getData(query);
            
            if(rs.next()){
                
                Session sess = Session.getInstance(); 
                
                updatedetailsadmin upd = new updatedetailsadmin();
                upd.jid.setText(""+sess.getId());
                upd.jfname.setText(""+sess.getFirst());
                upd.jlastname.setText(""+sess.getLast());
                upd.jemail.setText(""+sess.getEmail_add());

                upd.setVisible(true);
                
            
            }
        
        
        }catch(Exception e){
        
        
        
        }

       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        
        String ids = jid.getText();
        
        dbConnector dbc = new dbConnector();
        
        try{
            
            String query =("SELECT * FROM tbl_user WHERE id ='"+ids+"' ");
            ResultSet rs = dbc.getData(query);
            
            if(rs.next()){
                
                updatepassadmin upd = new updatepassadmin();
                upd.display_id.setText(rs.getString("id"));
                upd.reguser.setText(rs.getString("username"));
              
                
                upd.setVisible(true);
                
            
            }
        
        
        }catch(Exception e){
        
        
        
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        this.dispose();
        adminDashboard us = new adminDashboard();
        us.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(viewdetailsadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewdetailsadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewdetailsadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewdetailsadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewdetailsadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel jemail;
    public javax.swing.JLabel jfname;
    public javax.swing.JLabel jid;
    public javax.swing.JLabel jlastname;
    // End of variables declaration//GEN-END:variables
}
