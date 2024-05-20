/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbConnector;
import java.awt.Color;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import login_Register.login;
import static login_Register.login.passwordHash;
import net.proteanit.sql.DbUtils;
import userformscrud.add;

/**
 *
 * @author Admin
 */
public class UserForm extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public UserForm() {
        initComponents();
        displayData();
    }

    
    public void displayData(){
        try{
            dbConnector dbc = new dbConnector();
            ResultSet rs = dbc.getData("SELECT * FROM tbl_user");
            tb.setModel(DbUtils.resultSetToTableModel(rs));
             rs.close();
        }catch(SQLException ex){
            System.out.println("Errors: "+ex.getMessage());
       
        }
        
    }
    
     public static String email, username;
   
    public boolean duplicateCheck(){
       
        dbConnector dcc = new dbConnector();
        try{
            String query = "SELECT * FROM tbl_user  WHERE username = '" + un.getText() + "' OR email = '" + em.getText() + "'";
            ResultSet resultSet = dcc.getData(query);
           
           
            if(resultSet.next()){
                email = resultSet.getString("email");
                if(email.equals(em.getText())){
                    JOptionPane.showMessageDialog(null,"Email already used");
                    em.setText("");
                }
                username = resultSet.getString("username");
                 if(username.equals(un.getText())){
                    JOptionPane.showMessageDialog(null,"Username already used");
                    un.setText("");
                }
                return true;

            }else{
                return false;
            }
           
        }catch(SQLException ex){
            System.out.println(""+ex);
           
        }
        return false;
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        updatebtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        deletebtn = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        em = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        un = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ut = new javax.swing.JComboBox<>();
        fn = new javax.swing.JTextField();
        jid = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        st = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ps = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        addbtn = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Users Details");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 10, 200, 32);

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(420, 60, 550, 402);

        updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updatebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updatebtnMouseExited(evt);
            }
        });

        jLabel4.setText("Update");

        javax.swing.GroupLayout updatebtnLayout = new javax.swing.GroupLayout(updatebtn);
        updatebtn.setLayout(updatebtnLayout);
        updatebtnLayout.setHorizontalGroup(
            updatebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatebtnLayout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        updatebtnLayout.setVerticalGroup(
            updatebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updatebtnLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel1.add(updatebtn);
        updatebtn.setBounds(630, 500, 140, 60);

        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deletebtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deletebtnMouseExited(evt);
            }
        });

        jLabel5.setText("Delete");

        javax.swing.GroupLayout deletebtnLayout = new javax.swing.GroupLayout(deletebtn);
        deletebtn.setLayout(deletebtnLayout);
        deletebtnLayout.setHorizontalGroup(
            deletebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletebtnLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        deletebtnLayout.setVerticalGroup(
            deletebtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletebtnLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jPanel1.add(deletebtn);
        deletebtn.setBounds(820, 500, 130, 60);

        jPanel2.setBackground(new java.awt.Color(255, 255, 51));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("PLEASE FILL UP THE FORM");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(100, 10, 210, 54);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Last Name");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 180, 73, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 230, 63, 30);
        jPanel2.add(ln);
        ln.setBounds(130, 180, 233, 40);
        jPanel2.add(em);
        em.setBounds(130, 230, 232, 38);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("User Name");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 280, 86, 40);
        jPanel2.add(un);
        un.setBounds(130, 280, 231, 36);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 330, 71, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Account Type");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 380, 95, 40);

        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "User" }));
        jPanel2.add(ut);
        ut.setBounds(130, 380, 233, 38);
        jPanel2.add(fn);
        fn.setBounds(130, 130, 233, 40);

        jid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jid.setText("ID");
        jPanel2.add(jid);
        jid.setBounds(130, 70, 17, 40);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Status");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 430, 45, 40);

        st.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Inactive", "Pending", " " }));
        jPanel2.add(st);
        st.setBounds(130, 430, 233, 38);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("First Name");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(20, 130, 74, 40);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("ID No.");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(20, 70, 45, 40);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(303, 60, 90, 40);
        jPanel2.add(ps);
        ps.setBounds(130, 330, 230, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Black Yellow Modern Black Friday Facebook Post.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 410, 560);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 30, 410, 510);

        addbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addbtnMouseExited(evt);
            }
        });

        jLabel12.setText("ADD");

        javax.swing.GroupLayout addbtnLayout = new javax.swing.GroupLayout(addbtn);
        addbtn.setLayout(addbtnLayout);
        addbtnLayout.setHorizontalGroup(
            addbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addbtnLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel12)
                .addContainerGap(61, Short.MAX_VALUE))
        );
        addbtnLayout.setVerticalGroup(
            addbtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addbtnLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel12)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel1.add(addbtn);
        addbtn.setBounds(440, 500, 140, 60);

        jButton2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(860, 10, 110, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Black Yellow Modern Black Friday Facebook Post.png"))); // NOI18N
        jLabel11.setText("jLabel3");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 0, 940, 580);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Black Yellow Modern Black Friday Facebook Post.png"))); // NOI18N
        jLabel16.setText("jLabel3");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(0, 0, 980, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 982, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseClicked
        // TODO add your handling code here:
        
          if(em.getText().isEmpty()||ln.getText().isEmpty()||un.getText().isEmpty()||ps.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "You need to Fill up all the details");
        }else if(ps.getText().length()<8){
            JOptionPane.showMessageDialog(null,"Password character should be 8 above");
            ps.setText("");
        }else if(duplicateCheck()){
            System.out.println("Duplicate exist");
        }else{

            dbConnector dbc = new dbConnector();

            String password = passwordHash(ps.getText());

            if(dbc.insertData("INSERT INTO tbl_user (fname, lname, email, username, password, accnt_type, status) VALUES ('"+fn.getText()+"', '"+ln.getText()+"', '"+em.getText()+"', '"+un.getText()+"', '"+password+"', '"+ut.getSelectedItem()+"', '"+st.getSelectedItem()+"') ")){
                JOptionPane.showMessageDialog(null, "Inserted Successfully!");
                

            }else{
                JOptionPane.showMessageDialog(null, "NO INTERNET GAME");
            }
        }
          
        jid.setText("");
        fn.setText("");
        ln.setText("");
        em.setText(""); 
        un.setText("");
        ps.setText("");
        ut.setSelectedItem(""); 
        st.setSelectedItem("");
          
          
          displayData();
        
        
    }//GEN-LAST:event_addbtnMouseClicked

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        // TODO add your handling code here:
        
        int r = tb.getSelectedRow();
        
        String id = tb.getValueAt(r, 0).toString();
        String firstname = tb.getValueAt(r, 1).toString();
        String lastname = tb.getValueAt(r, 2).toString();
        String email = tb.getValueAt(r, 3).toString();
        String usernames = tb.getValueAt(r, 4).toString();
        String passwords = tb.getValueAt(r, 5).toString();  
        String account_type = tb.getValueAt(r, 6).toString();   
        String stat = tb.getValueAt(r, 7).toString();
                
        
        jid.setText(id);
        fn.setText(firstname);
        ln.setText(lastname);
        em.setText(email); 
        un.setText(usernames);
      
        ut.setSelectedItem(account_type); 
        st.setSelectedItem(stat);
            
    }//GEN-LAST:event_tbMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         jid.setText("");
        fn.setText("");
        ln.setText("");
        em.setText(""); 
        un.setText("");
        ps.setText("");
        ut.setSelectedItem(""); 
        st.setSelectedItem("");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseEntered
        // TODO add your handling code here:
        
        addbtn.setBackground(Color.GREEN);
    }//GEN-LAST:event_addbtnMouseEntered

    private void addbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addbtnMouseExited
        // TODO add your handling code here:
        addbtn.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_addbtnMouseExited

    private void updatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtnMouseClicked
        // TODO add your handling code here:

        
        String ids = jid.getText();
        String firstnames = fn.getText();
        String lastnames = ln.getText();
        String emails = em.getText();
        String account_types = ut.getSelectedItem().toString();
        String usernamess = un.getText();
        String passwordss = ps.getText();
        String Stat = st.getSelectedItem().toString();
        
        
         
        
        try{
            
             dbConnector dbc = new dbConnector();
            
            String newPassword = passwordss; 
            if (!newPassword.isEmpty()) {
            newPassword = passwordHash(newPassword);
            }
            
            String query = "UPDATE tbl_user SET fname ='" + firstnames + "', "
                + "lname ='" + lastnames + "', email ='" + emails + "',"
                + " username ='"+usernamess+"', accnt_type ='"+account_types+"', "
                + " Status ='"+Stat+"' ";

            if (!passwordss.isEmpty()) {
            query += ", password ='" + newPassword + "'";
            }

            query += " WHERE id ='" + ids + "'";

            if (dbc.insertData(query)) {
            JOptionPane.showMessageDialog(null, "Data Updated");
            }
 
        } catch (Exception e){
            
            System.out.println(e);
        }
        jid.setText("");
        fn.setText("");
        ln.setText("");
        em.setText(""); 
        un.setText("");
        ps.setText("");
        ut.setSelectedItem(""); 
        st.setSelectedItem("");
        displayData();
    }//GEN-LAST:event_updatebtnMouseClicked

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:
        
        String userid = jid.getText();
         
         dbConnector dbc = new dbConnector();
        
        try{
            if(dbc.deleteData("DELETE FROM tbl_user WHERE id = '"+userid+"' ")){
            
                JOptionPane.showMessageDialog(null, "Data Deleted");
            }
              
            
        } catch (Exception e){
            
            System.out.println(e);

        }
        jid.setText("");
        fn.setText("");
        ln.setText("");
        em.setText(""); 
        un.setText("");
        ps.setText("");
        ut.setSelectedItem(""); 
        st.setSelectedItem("");
        displayData();
    }//GEN-LAST:event_deletebtnMouseClicked

    private void updatebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtnMouseEntered
        // TODO add your handling code here:
        
         updatebtn.setBackground(Color.GREEN);
        
    }//GEN-LAST:event_updatebtnMouseEntered

    private void updatebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtnMouseExited
        // TODO add your handling code here:
        
         updatebtn.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_updatebtnMouseExited

    private void deletebtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseEntered
        // TODO add your handling code here:
        
         deletebtn.setBackground(Color.RED);
    }//GEN-LAST:event_deletebtnMouseEntered

    private void deletebtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseExited
        // TODO add your handling code here:
        
         deletebtn.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_deletebtnMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:    
        adminDashboard log = new adminDashboard();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addbtn;
    private javax.swing.JPanel deletebtn;
    private javax.swing.JTextField em;
    private javax.swing.JTextField fn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jid;
    private javax.swing.JTextField ln;
    private javax.swing.JPasswordField ps;
    private javax.swing.JComboBox<String> st;
    private javax.swing.JTable tb;
    private javax.swing.JTextField un;
    private javax.swing.JPanel updatebtn;
    private javax.swing.JComboBox<String> ut;
    // End of variables declaration//GEN-END:variables
}
