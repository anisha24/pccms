  package com.newpccms;

import com.placeholder.PlaceHolder;
import java.util.Calendar;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import com.toedter.calendar.JCalendar;
import java.sql.ResultSet;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
public class login extends javax.swing.JFrame {
    PlaceHolder p1;
    PlaceHolder p2;

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        jPanel1.setBackground(new Color(255,255,255,200));
        uname.setFocusable(true);
        pass.setFocusable(true);
        p1=new PlaceHolder(uname,"username");
        p2=new PlaceHolder(pass,"password");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jFrame1 = new javax.swing.JFrame();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        uname = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1150, 720));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(null);

        jButton2.setText("BACK TO HOME PAGE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 20, 180, 23);

        uname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                unameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                unameFocusLost(evt);
            }
        });
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });

        pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passFocusLost(evt);
            }
        });

        jButton1.setText("LOGIN");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Password");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/newpccms/logo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uname)
                    .addComponent(pass)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(80, 190, 680, 380);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/newpccms/rsz_biology-close-up-instrument-60022 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1200, 800);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        
        String u=uname.getText();
        String pas=new String(pass.getPassword());
        String hashpas = null;
        
        try 
         { 
  
            // Static getInstance method is called with hashing SHA 
            MessageDigest md = MessageDigest.getInstance("SHA-256"); 
  
            // digest() method called 
            // to calculate message digest of an input 
            // and return array of byte 
            byte[] messageDigest = md.digest(pas.getBytes()); 
  
            // Convert byte array into signum representation 
            BigInteger no = new BigInteger(1, messageDigest); 
  
            // Convert message digest into hex value 
            String hashtext = no.toString(16); 
  
            while (hashtext.length() < 32) { 
                hashtext = "0" + hashtext; 
            } 
  
            hashpas = hashtext;
        } 
  
        // For specifying wrong message digest algorithms 
        catch (NoSuchAlgorithmException e) 
        { 
            System.out.println("Exception thrown"
                               + " for incorrect algorithm: " + e); 
  
            
        } 

        if(u.equalsIgnoreCase("")==false)
        {
            if(pas.equalsIgnoreCase("")==false)
            {
                ResultSet rs;
                try
                {
                    Class.forName("com.mysql.jdbc.Driver");
                    String a="jdbc:mysql://localhost:3306/pccms";
                    Connection con;
                    con = (Connection)DriverManager.getConnection(a,"root","Password@1234");
                    Statement stmt=(Statement)con.createStatement();
                    String query="call login_secure("+"\""+u+"\""+");";
                    rs=stmt.executeQuery(query);
                    if(rs.next())
                    {
                        String userid=rs.getString(1);
                        String pwdid=rs.getString(2);
                        int check_value = Integer.parseInt(rs.getString(3));
                        if(pwdid.equals(hashpas))
                        {

                            close();

                            if(check_value == 1)
                                patient(userid);
                            else if(check_value == 2)
                                doctor(userid);

                        }
                        else
                        {

                            JOptionPane.showMessageDialog(null,"Password Incorrect!");
                        }

                        

                    }
                    else
                        JOptionPane.showMessageDialog(null,"Username is incorrect or is not registered!");
                    rs.close();

                }

                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(this,e.getMessage());
                }
            }
            else
            JOptionPane.showMessageDialog(null,"Enter your valid password!");
        }
        else
        JOptionPane.showMessageDialog(null,"Enter your username!\nYour email id is your username!");

    }//GEN-LAST:event_jButton1ActionPerformed
                    

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        home v = new home();
        v.setVisible(true);
        close();
        v.login_button.setVisible(true);
        v.pat_button.setVisible(false);
       
       v.doc_button.setVisible(false);
       
       v.reg_button.setVisible(true);
       v.back_button.setVisible(false);
       v.login_dup_button.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void unameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameFocusGained
        if(uname.getText().equals("username")){
            uname.setText("");
        }
    }//GEN-LAST:event_unameFocusGained

    private void unameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_unameFocusLost
        if(uname.getText().equals("")){
            uname.setText("username");
        }
    }//GEN-LAST:event_unameFocusLost

    private void passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusGained
        if(pass.getText().equals("password")){
            pass.setText("");
        }
    }//GEN-LAST:event_passFocusGained

    private void passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passFocusLost
         if(pass.getText().equals("")){
            pass.setText("password");
        }
    }//GEN-LAST:event_passFocusLost

    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables

    
    public void patient(String un)
    {
        PATIENTLOGIN v = new PATIENTLOGIN();
        v.setVisible(true);
        v.uname.setText(un);
       int flag = 0;
        
        v.dov_lab.setVisible(false);
        v.prob_lab.setVisible(false);
        v.syn_lab.setVisible(false);
        v.doc_name_dup.setVisible(false);
        v.dov.setVisible(false);
        v.problem.setVisible(false);
        v.synopsis.setVisible(false);
        v.med_lab.setVisible(false);
        v.table_parent_1.setVisible(false);
        v.det_pres_but.setVisible(false);
        v.no_prescription.setVisible(false);
        v.docname.setVisible(false);
                
        v.test_doc.setVisible(false);
        v.test_type.setVisible(false);
        v.test_dot.setVisible(false);
        v.test_dos.setVisible(false);
        v.test_syno.setVisible(false);
        v.test_doc_name.setVisible(false);
        v.test_doc_type.setVisible(false);
        v.test_date.setVisible(false);
        v.test_suggested_date.setVisible(false);
        v.test_synopsis.setVisible(false);
        v.test_report_button.setVisible(false);
        v.no_records_test.setVisible(false);
        
        v.docn.setVisible(false);
        v.scann.setVisible(false);
        v.scan_dos.setVisible(false);
        v.scan_sd.setVisible(false);
        v.scan_syn.setVisible(false);
        v.scan_doc.setVisible(false);
        v.scan_type.setVisible(false);
        v.scan_date.setVisible(false);
        v.scan_sugges_date.setVisible(false);
        v.scan_synop.setVisible(false);
        v.scan_det_report.setVisible(false);
        
        v.see_doc_lab.setVisible(false);
        v.doc_combox.setVisible(false);
        v.doc_search.setVisible(false);
        v.app_date.setVisible(false);
        v.appointment_date.setVisible(false);
        v.check_slot.setVisible(false);
        v.available_slots_lab.setVisible(false);
        v.nin.setVisible(false);
        v.ten.setVisible(false);
        v.ele.setVisible(false);
        v.twe.setVisible(false);
        v.two.setVisible(false);
        v.thr.setVisible(false);
        v.fou.setVisible(false);
        v.fiv.setVisible(false);
        v.appointment_submit.setVisible(false);
        
        v.no_app.setVisible(false);
        v.problems.setVisible(false);
        
        v.appointment_id_lab.setVisible(false);
        v.visit_id_info.setVisible(false);
        v.problem_lab_info.setVisible(false);
        v.cost_lab_info.setVisible(false);
        v.app_ii.setVisible(false);
        v.vis_ii.setVisible(false);
        v.pro_ii.setVisible(false);
        v.co_ii.setVisible(false);
        
        
        
        
        //Calendar cal = Calendar.getInstance();
        //cal.add(Calendar.DAY_OF_MONTH,1);
        v.appointment_date.getJCalendar().setMinSelectableDate(new Date());
        
        
                
        DefaultTableModel model = (DefaultTableModel) v.past_appointment.getModel();
        
        DefaultTableModel mod = (DefaultTableModel) v.past_test_table.getModel();
        DefaultTableModel mo = (DefaultTableModel) v.past_scan_table.getModel();
        DefaultTableModel m = (DefaultTableModel) v.upcoming_appointments.getModel();
        DefaultTableModel mdd = (DefaultTableModel) v.past_doc_bill.getModel();
        
        
        ResultSet rs;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String a="jdbc:mysql://localhost:3306/pccms";
            Connection con;
            con = (Connection)DriverManager.getConnection(a,"root","Password@1234");
            Statement stmt=(Statement)con.createStatement();
            String quer="SELECT * from patient_view where email='"+un+"';";
            rs=stmt.executeQuery(quer);
            while(rs.next())
            {
                String na=rs.getString(2);
                String pi=rs.getString(1);
                String ge=rs.getString(5);
                String dat=rs.getString(3);
                String ema=rs.getString(6);
                String addr=rs.getString(8);
                String h=rs.getString(9);
                String w=rs.getString(10);
                String blg=rs.getString(11);
                String al=rs.getString(12);
                String phnu=rs.getString(7);
                String ag =rs.getString(4);
                String nump= rs.getString(13);
                int age1=Integer.parseInt(ag);
                v.name.setText(na);
                v.p_id.setText(pi);
                v.phn.setText(phnu);
                v.nam.setText(na);
                v.age.setText(ag);
                v.dob.setText(dat);
                v.add.setText(addr);
                
                if(ge.equalsIgnoreCase("M"))
                    v.gen.setText("Male");
                else
                    v.gen.setText("Female");
                
                if(blg.equalsIgnoreCase("O+"))
                    v.bg.setText("O +ve");
                else if(blg.equalsIgnoreCase("O-"))
                    v.bg.setText("O -ve");
                else if(blg.equalsIgnoreCase("A+"))
                    v.bg.setText("A +ve");
                else if(blg.equalsIgnoreCase("A-"))
                    v.bg.setText("A -ve");
                else if(blg.equalsIgnoreCase("B+"))
                    v.bg.setText("B +ve");
                else if(blg.equalsIgnoreCase("B-"))
                    v.bg.setText("B -ve");
                else if(blg.equalsIgnoreCase("AB+"))
                    v.bg.setText("AB +ve");
                else if(blg.equalsIgnoreCase("AB-"))
                    v.bg.setText("AB -ve");
                v.hei.setText(h);
                v.wei.setText(w);
                v.all.setText(al);
                v.impid.setText(nump);
                v.impid.setVisible(false);
                
                
                
                
            }
            String pi=v.impid.getText();
            String que="call current_med_info("+pi+");";
            rs=stmt.executeQuery(que);
            while(rs.next())
            {
                String doc = rs.getString(1);
                String visd = rs.getString(2);
                String fold = rs.getString(3);
                String prob = rs.getString(4);
                String summ = rs.getString(5);
                
                v.doc_name1.setText(doc);
                v.visit_date1.setText(visd);
                v.follow_date1.setText(fold);
                v.prob1.setText(prob);
                v.synop1.setText(summ);
                
                
                
                
            }
            
           
            String q="call past_medications("+pi+");";
            rs=stmt.executeQuery(q);
            while(rs.next())
            {
                String col1=rs.getString(1);
                String col2=rs.getString(2);
                String col3=rs.getString(3);
                String col4=rs.getString(4);
                Object[] row = { col1, col2, col3, col4 };
                model.addRow(row);
                
                
            }
            
            String qwer= "call past_test_display("+pi+");";
            rs=stmt.executeQuery(qwer);
            while(rs.next())
            {
                String col1=rs.getString(1);
                String col2=rs.getString(2);
                String col3=rs.getString(3);
                Object[] row = { col1, col2, col3};
                mod.addRow(row);
            }
            
            String qweq= "call past_scan("+pi+");";
            rs=stmt.executeQuery(qweq);
            while(rs.next())
            {
                String col1=rs.getString(1);
                String col2=rs.getString(2);
                String col3=rs.getString(3);
                Object[] row = { col1, col2, col3};
                mo.addRow(row);
            }
            
            String qeq= "call upcoming_appointments("+pi+");";
            rs=stmt.executeQuery(qeq);
            while(rs.next())
            {
                String col1=rs.getString(1);
                String col2=rs.getString(2);
                String col3=rs.getString(3);
                String col4=rs.getString(4);
                int c5=rs.getInt(5);
                String col5 = "";
                if(c5 == 2)
                    col5 = "Monday";
                else if(c5 == 3)
                    col5 = "Tuesday";
                else if(c5 == 4)
                    col5 = "Wednesday";
                else if(c5 == 5)
                    col5 = "Thursday";
                else if(c5 == 6)
                    col5 = "Friday";
                else if(c5 == 7)
                    col5 = "Saturday";
                    
                Object[] row = { col1, col2, col3, col4, col5};
                m.addRow(row);
            }
            String qtt ="select isnull(t.prescription_pdf) from treatment t, visit v, patient p where v.vid = t.treatment_vid and p.pid = v.vis_pid and p.pid="+pi+";";
            rs=stmt.executeQuery(qtt);
            if(rs.next())
            {
                int i = rs.getInt(1);
                if(i==1)
                    flag =1;
            }
            String rrt = "call doctor_bill("+pi+");";
            rs=stmt.executeQuery(rrt);
            while(rs.next())
            {
                String col1=rs.getString(1);
                String col2=rs.getString(2);
                String col3=rs.getString(3);
                String col4=rs.getString(4);
                
                Object[] row = { col1, col2, col3,col4};
                mdd.addRow(row);
            }
            
            rs.close();
        }
        
        
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        
        
        
        if(mdd.getRowCount() == 0)
        {
             v.doc_tab_info.setVisible(false);
             v.past_doc_parent.setVisible(false);
             v.det_but_lab.setVisible(false);
             v.no_bill_lab.setVisible(true);
             
        }
        else
        {
            v.doc_tab_info.setVisible(true);
             v.past_doc_parent.setVisible(true);
             v.det_but_lab.setVisible(true);
             v.no_bill_lab.setVisible(false);
             v.past_doc_bill.setRowSelectionInterval(0, 0);
        }
        
        if(m.getRowCount() == 0)
        {
            v.no_app.setVisible(true);
            v.upcoming_parent.setVisible(false);
        }
        else
        {
            v.no_app.setVisible(false);
            v.upcoming_parent.setVisible(true);
        }
        
        if(mo.getRowCount() == 0)
        {
            v.past_scan_lab.setVisible(false);
            v.past_scan_parent.setVisible(false);
            v.check_but.setVisible(false);
            v.no_past_scan.setVisible(true);
        }
        else
        {
            v.past_scan_lab.setVisible(true);
            v.past_scan_parent.setVisible(true);
            v.check_but.setVisible(true);
            v.no_past_scan.setVisible(false);
            v.past_scan_table.setRowSelectionInterval(0, 0);
        }
        
        if(mod.getRowCount() == 0)
        {
            v.past_test_label.setVisible(false);
            v.past_test_parent.setVisible(false);
            v.view_test_button.setVisible(false);
            v.no_records_test.setVisible(true);
        }
        else
        {
            v.past_test_label.setVisible(true);
            v.past_test_parent.setVisible(true);
            v.view_test_button.setVisible(true);
            v.no_records_test.setVisible(false);
             v.past_test_table.setRowSelectionInterval(0, 0);
        }
        
        
        if(model.getRowCount() ==  0)
       {
          v.appointment_parent.setVisible(false);
          v.appointment_label.setVisible(false);
          v.check_button.setVisible(false);
          v.no_records.setVisible(true);
          v.dn1.setVisible(false);
          v.dv1.setVisible(false);
          v.fud1.setVisible(false);
          v.pb1.setVisible(false);
          v.syn1.setVisible(false);
          
          
          
          v.doc_name1.setVisible(false);
          v.visit_date1.setVisible(false);
          v.follow_date1.setVisible(false);
          v.prob1.setVisible(false);
          v.synop1.setVisible(false);
          
          v.no_recent_visit1.setVisible(true);
       }
       else
       {
           v.past_appointment.setRowSelectionInterval(0,0);
           v.appointment_parent.setVisible(true);
           v.appointment_label.setVisible(true);
           v.check_button.setVisible(true);
           v.no_records.setVisible(false);
           v.no_recent_visit1.setVisible(false);
       }
        if(flag == 1)
             v.see_pres_but.setVisible(false);
        
        DefaultListCellRenderer renderer = (DefaultListCellRenderer) v.s.getCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        v.may_lab.setVisible(false);
        v.bk.setVisible(false);
        
        
       
    }
    
    
    public void doctor(String un)
    {
        DOCTORLOGIN v = new DOCTORLOGIN();
        v.setVisible(true);
        v.uname.setText(un);
        
        v.app_dat.getJCalendar().setMinSelectableDate(new Date());
        long millis=System.currentTimeMillis(); 
        java.sql.Date date=new java.sql.Date(millis);
        v.app_dat.setDate(date);
        
        v.np_app_today.setVisible(false);
        v.tdap.setVisible(true);
        DefaultTableModel model = (DefaultTableModel) v.today_app_table.getModel();
        
        ResultSet rs = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String a="jdbc:mysql://localhost:3306/pccms";
            Connection con;
            con = (Connection)DriverManager.getConnection(a,"root","Password@1234");
            Statement stmt=(Statement)con.createStatement();
            String quer="SELECT * from doc_view where email='"+un+"';";
            rs = stmt.executeQuery(quer);
            while(rs.next())
            {
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);
                
                v.docid_lab.setText(s1);
                v.name.setText(s2);
                v.phone.setText(s3);
                
                
            }
            String qw = "SELECT * from doc_demo where email='"+un+"';";
            rs = stmt.executeQuery(qw);
            while(rs.next())
            {
                String spec = "";
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                int s3 = rs.getInt(3);
                if(s3 == 1)
                {
                    spec = "GENERAL SPECIALIST";
                }
                else if(s3 == 2)
                {
                     spec = "PEDIATRICIAN";
                }
                else if(s3 == 3)
                {
                     spec = "OPHTHALMOLOGIST";
                }
                else if(s3 == 4)
                {
                     spec = "ENT";
                }
                else if(s3 == 5)
                {
                     spec = "CARDIOLOGIST";
                }
                else if(s3 == 6)
                {
                     spec = "NEUROLOGIST";
                }
                else if(s3 == 7)
                {
                     spec = "ORTHOPEDIC SURGEON";
                }
                else if(s3 == 8)
                {
                     spec = "GASTROENTEROLOGIST";
                }
                else if(s3 == 9)
                {
                     spec = "DENTIST";
                }
                v.nam.setText(s1);
                v.degree.setText(s2);
                v.spec.setText(spec);
                                   
            }
            int di=Integer.parseInt(v.docid_lab.getText().substring(2)) ;
            String qwrt = "call todays_appointments("+di+");";
            rs = stmt.executeQuery(qwrt);
            while(rs.next())
            {
                
                String s1 = rs.getString(1);
                String s2 = rs.getString(2);
                String s3 = rs.getString(3);
                String s4 = rs.getString(4);
                String s5 = rs.getString(5);
                String s6 = rs.getString(7);
                
                Object[] row = { s1,s6, s2, s3, s4,s5 };
                model.addRow(row);
                
            }
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        
        if(model.getRowCount() == 0)
        {
            v.today_appointment_parent.setVisible(false);
            v.tdap.setVisible(false);
            v.see_app_but.setVisible(false);
            v.np_app_today.setVisible(true);
        }
        else
        {
            v.today_app_table.setRowSelectionInterval(0,0);
            v.today_appointment_parent.setVisible(true);
            v.tdap.setVisible(true);
            v.see_app_but.setVisible(true);
            v.np_app_today.setVisible(false);
        }
    }
    
    
    
    
    public void close()
    {
        WindowEvent winClosingEvent= new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }


    
    
}
