
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class emp extends javax.swing.JFrame {

    /**
     * Creates new form emp
     */
    public emp() {
        this.setResizable(false);        
        initComponents();
        //this.setSize(607,391);
        try
        {
            Class.forName("java.sql.DriverManager");
            Connection con = (Connection)
                    DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/coffer","root","xyz"); 
            Statement stmt3 = (Statement) con.createStatement();
                        String query3="select User from login order by id desc limit 1";
                        ResultSet rs3 = stmt3.executeQuery(query3);
                        
                if(rs3.next())
                {
                    
                String Name = rs3.getString("User");
                Statement stmt2 = (Statement) con.createStatement();
                String query2="select Uid,Name,Mobile,Email,Grade,Type from users where Uid='"+Name+"';";                   
                ResultSet rs2= stmt2.executeQuery(query2);
            while(rs2.next())
            {
                String Uid = rs2.getString("Uid");
                String Name2 = rs2.getString("Name");
                String Mobile = rs2.getString("Mobile");
                String Email = rs2.getString("Email");
                String Grade = rs2.getString("Grade");
                String Type = rs2.getString("Type");
                Statement stmt = (Statement) con.createStatement();
                String query="select BSry,txct,inc,Bonus from ecr where Grade='"+Grade+"';";                   
                ResultSet rs= stmt.executeQuery(query);                
                TA1.append("Uid : "+Uid+"\n");
                TA1.append("Name : "+Name2+"\n");
                TA1.append("Mobile : "+Mobile+"\n");
                TA1.append("Email : "+Email+"\n");
                TA1.append("Grade : "+Grade+"\n");
                TA1.append("Type : "+Type+"\n");
                while(rs.next())
                {
                    String bs = rs.getString("Bsry");
                    String txc = rs.getString("txct");
                    String inc = rs.getString("inc");
                    String bonus = rs.getString("Bonus");
                    float bs2 = Float.parseFloat(bs);
                    float txc2 = Float.parseFloat(txc);
                    float inc2 = Float.parseFloat(inc);
                    float bonus2 = Float.parseFloat(bonus);
                    float salary;
                    salary = bs2 - (txc2/100)*bs2 + (inc2/100)*bs2 + bonus2;
                    TA2.append("Base Salary : Rs. "+bs2+"\n");
                    TA2.append("Tax Cuts : "+txc2+" %\n");
                    TA2.append("Increment(s) : "+inc2+" %\n");
                    TA2.append("Bonus : Rs. "+bonus2+"\n");
                    TA2.append("\nSalary : Rs. "+salary+"\n");
                }
            }
                }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Pic = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA2 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        TA1 = new javax.swing.JTextArea();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Employee Pane");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 2, 24)); // NOI18N
        jLabel1.setText("Welcome");

        Pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Mock3.png"))); // NOI18N
        Pic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        TA2.setEditable(false);
        TA2.setBackground(new java.awt.Color(204, 255, 255));
        TA2.setColumns(20);
        TA2.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TA2.setRows(5);
        TA2.setText("Salary Details:\n\n");
        TA2.setWrapStyleWord(true);
        jScrollPane1.setViewportView(TA2);

        TA1.setEditable(false);
        TA1.setColumns(20);
        TA1.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        TA1.setRows(5);
        TA1.setText("User Info:\n\n");
        TA1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(TA1);

        B1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        B1.setText("Logout");
        B1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 204, 204))));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        B2.setText("Change Password");
        B2.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 204, 204))));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(112, 112, 112)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1)
                                .addComponent(Pic)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(50, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Pic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1)
                    .addComponent(B2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        int p= JOptionPane.showConfirmDialog(this,"Are you sure?","Back to Login?",JOptionPane.YES_NO_OPTION);
        if (p == JOptionPane.YES_OPTION)
        {
        this.setVisible(false);
        Login1 s = new Login1();
        s.setVisible(true);
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        this.setVisible(false);
        CPass s = new CPass();
        s.setVisible(true);
    }//GEN-LAST:event_B2ActionPerformed

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
            java.util.logging.Logger.getLogger(emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JLabel Pic;
    private javax.swing.JTextArea TA1;
    private javax.swing.JTextArea TA2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
