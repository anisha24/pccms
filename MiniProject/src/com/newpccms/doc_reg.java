package com.newpccms;


import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class doc_reg extends javax.swing.JFrame {

    /**
     * Creates new form doc_reg
     */
    public doc_reg() {
        initComponents();
        bgpanel.setBackground(new Color(255,255,255,235));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        bgpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        deg = new javax.swing.JTextField();
        phnum = new javax.swing.JTextField();
        u = new javax.swing.JTextField();
        pas1 = new javax.swing.JPasswordField();
        pas2 = new javax.swing.JPasswordField();
        m = new javax.swing.JRadioButton();
        f = new javax.swing.JRadioButton();
        reg = new javax.swing.JButton();
        spec = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        blp = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bgpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DOCTOR REGISTRATION");
        bgpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 410, 41));

        jLabel2.setText("First Name");
        bgpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 88, -1, -1));

        jLabel3.setText("Last Name");
        bgpanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 126, -1, -1));

        jLabel4.setText("Mobile Number");
        bgpanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 240, -1, -1));

        jLabel5.setText("email");
        bgpanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 319, -1, -1));

        jLabel6.setText("Gender");
        bgpanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 279, -1, -1));

        jLabel7.setText("Create Password");
        bgpanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 357, -1, -1));

        jLabel8.setText("Confirm Password");
        bgpanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 395, -1, -1));

        jLabel9.setText("Speciality");
        bgpanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 202, -1, -1));

        jLabel10.setText("Degree");
        bgpanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 164, -1, -1));
        bgpanel.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 85, 193, -1));
        bgpanel.add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 123, 193, -1));
        bgpanel.add(deg, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 161, 193, -1));
        bgpanel.add(phnum, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 237, 193, -1));
        bgpanel.add(u, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 316, 193, -1));
        bgpanel.add(pas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 354, 193, -1));
        bgpanel.add(pas2, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 392, 193, -1));

        buttonGroup1.add(m);
        m.setText("Male");
        bgpanel.add(m, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 275, -1, -1));

        buttonGroup1.add(f);
        f.setText("Female");
        bgpanel.add(f, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 275, -1, -1));

        reg.setText("REGISTER");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        bgpanel.add(reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, -1, -1));

        spec.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "GENERAL SPECIALIST", "PEDIATRICIAN", "OPHTHALMOLOGIST", "ENT", "CARDIOLOGIST", "NEUROLOGIST", "ORTHOPEDIC SURGEON", "GASTROENTEROLOGIST", "DENTIST" }));
        bgpanel.add(spec, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 190, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/newpccms/logo.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        bgpanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 140, 100));

        blp.setText("BACK TO LOGIN PAGE");
        blp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blpActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/newpccms/rsz_close-up-doctor-health-42273 (1).jpg"))); // NOI18N
        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(720, 720, 720)
                        .addComponent(blp))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(bgpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(blp))
            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(bgpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
       
        int val = 2;
        String uname=u.getText();
        String pas=new String(pas1.getPassword());
        int lenpas1=pas.length();
        String pass2=new String(pas2.getPassword());
        int lenpas2=pass2.length();
        String fna=fname.getText();
        String lna=lname.getText();
        String ph=phnum.getText();
        int p=ph.length();
        int s=spec.getSelectedIndex();
        String d=deg.getText();
        String hashpas = null;
        try 
         { 
  
            
            MessageDigest md = MessageDigest.getInstance("SHA-256"); 
  
            
            byte[] messageDigest = md.digest(pass2.getBytes()); 
  
            
            BigInteger no = new BigInteger(1, messageDigest); 
  
            
            String hashtext = no.toString(16); 
  
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
  
            hashpas = hashtext;
        } 
        
        catch (NoSuchAlgorithmException e) 
        { 
            System.out.println("Exception thrown"
                               + " for incorrect algorithm: " + e); 
  
            
        } 
        
 

        if(fna.equalsIgnoreCase("")==false)
        {
            if(lna.equalsIgnoreCase("")==false)
            {
                if(uname.equalsIgnoreCase("")==false)
                {
                    if(ph.equalsIgnoreCase("")==false && p == 10)
                    {
                        if(d.equalsIgnoreCase("")==false)
                        {
                            if(s != 0)
                            {
                                
                              
                                if(m.isSelected() || f.isSelected())
                                {
                                    
                                    
                                        
                                        
                                           
                                                
                                                   
                                                       if(pas.equalsIgnoreCase("")==false &&(lenpas1>4))
                                                       {
                                                           if(pass2.equalsIgnoreCase("")==false && (lenpas1 == lenpas2))
                                                           {
                                                               if(pas.equals(pass2))
                                                               {
                                                                  
                                                                    char ge;
                                                                    if(m.isSelected())
                                                                        ge='M';
                                                                    else
                                                                        ge='F';

                                                                    try
                                                                    {
                                                                        Class.forName("com.mysql.jdbc.Driver");
                                                                        String a="jdbc:mysql://localhost:3306/pccms";
                                                                        Connection con;
                                                                     con = (Connection)DriverManager.getConnection(a,"root","Password@1234");
                                                                        Statement stmt=(Statement)con.createStatement();
                                                                        Statement stm=(Statement)con.createStatement();
                                                                        String q1= "INSERT INTO doctor(fname,lname,gender,phone,email,degree,speciality) VALUES('"+fna+"','"+lna+"','"+ge+"','"+ph+"','"+uname+"','"+d+"','"+s+"');";
                                                                        stmt.executeUpdate(q1);
                                                                        String query="INSERT INTO login VALUES('"+uname+"','"+hashpas+"','"+val+"');";
                                                                        stm.executeUpdate(query);
                                                                        reg.setVisible(false);
                                                                        blp.setVisible(true);
                                                                        JOptionPane.showMessageDialog(null,"You have successfully registered \n Please go back to login page!");
                                                                        
                                                                        
                                                                        
                                                                    }
                                                                    catch(Exception e)
                                                                    {
                                                                        JOptionPane.showMessageDialog(this,e.getMessage());
                                                                    }

                                                               }
                                                               else
                                                               {
                                                                   JOptionPane.showMessageDialog(null,"Your passwords dont match.Please type them again!");
                                                               }
                                                           }
                                                           else
                                                           {
                                                               JOptionPane.showMessageDialog(null,"Your passwords dont match.Please type them again!");
                                                           }
                                                       }
                                                       else
                                                       {
                                                           JOptionPane.showMessageDialog(null,"Password should be minimum 5 characters long!");
                                                       }
                                                    
                                                
                                            
                                        
                                        
                                    
                                    
                                }
                                else
                                    JOptionPane.showMessageDialog(null,"Select Gender!");
                                    
                            }
                            else
                                JOptionPane.showMessageDialog(null,"Select an area of specilization!");
                        }
                        else
                            JOptionPane.showMessageDialog(null,"Enter your Degree!");
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Enter valid mobile number!");
                 
                }
                else
                   JOptionPane.showMessageDialog(null,"Enter valid email address!");
            }      
            else
                JOptionPane.showMessageDialog(null,"Enter Last Name!");
        }
        else
            JOptionPane.showMessageDialog(null,"Enter First Name!");
        
    
    


    }//GEN-LAST:event_regActionPerformed

    private void blpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blpActionPerformed
       close();
       login v=new login();
       v.setVisible(true);
       
    }//GEN-LAST:event_blpActionPerformed

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
            java.util.logging.Logger.getLogger(doc_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doc_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doc_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doc_reg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new doc_reg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgpanel;
    public javax.swing.JButton blp;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField deg;
    private javax.swing.JRadioButton f;
    private javax.swing.JTextField fname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton m;
    private javax.swing.JPasswordField pas1;
    private javax.swing.JPasswordField pas2;
    private javax.swing.JTextField phnum;
    private javax.swing.JButton reg;
    private javax.swing.JComboBox<String> spec;
    private javax.swing.JTextField u;
    // End of variables declaration//GEN-END:variables

public void close()
    {
WindowEvent winClosingEvent= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);

}
}
