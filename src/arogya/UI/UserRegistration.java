/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya.UI;

import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import net.java.balloontip.BalloonTip;
import net.java.balloontip.styles.MinimalBalloonStyle;
import net.java.balloontip.utils.FadingUtils;


/**
 *
 * @author vimuk
 */
public class UserRegistration extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public UserRegistration() {
        initComponents();
          Rectangle maximumWindowBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        this.setBounds(0, 0, maximumWindowBounds.width, maximumWindowBounds.height);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
      public void toolt(final JComponent tf, String message) {

        JLabel lb = new JLabel();
        lb.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        lb.setText(message);
        lb.setForeground(Color.white);
//        lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/emoticon-15-16 (2).png")));

        MinimalBalloonStyle minm = new MinimalBalloonStyle(Color.gray, 3);
        final BalloonTip baloon = new BalloonTip(tf, lb, minm, BalloonTip.Orientation.RIGHT_BELOW, BalloonTip.AttachLocation.ALIGNED, 20, 5, false);
        FadingUtils.fadeInBalloon(baloon, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        for (int i = 0; i < 20; i++) {
                            if (i == 19) {
                                FadingUtils.fadeOutBalloon(baloon, new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        baloon.closeBalloon();
                                    }
                                }, 600, 24);
                            }
                            try {
                                Thread.sleep(100);
                            } catch (Exception e) {
                            }
                        }
                    }
                }).start();
            }
        }, 300, 24);

        baloon.setVisible(true);
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
        jPanel3 = new javax.swing.JPanel();
        tfid = new javax.swing.JTextField();
        Id = new javax.swing.JLabel();
        Firstname = new javax.swing.JLabel();
        tffname = new javax.swing.JTextField();
        tflname = new javax.swing.JTextField();
        Lastname = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        tfuname = new javax.swing.JTextField();
        Gender = new javax.swing.JLabel();
        tfgender = new javax.swing.JTextField();
        DOB = new javax.swing.JLabel();
        tfdob = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Password = new javax.swing.JLabel();
        tfpass = new javax.swing.JTextField();
        Height = new javax.swing.JLabel();
        tfheight = new javax.swing.JTextField();
        Weight = new javax.swing.JLabel();
        tfweight = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 1920));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arogya/Icons/arogya icon.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(33, 33, 33));

        tfid.setBackground(new java.awt.Color(33, 33, 33));
        tfid.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        tfid.setForeground(new java.awt.Color(255, 255, 255));
        tfid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        Id.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Id.setForeground(new java.awt.Color(153, 153, 153));
        Id.setText("User Id");

        Firstname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Firstname.setForeground(new java.awt.Color(153, 153, 153));
        Firstname.setText("User Firstname");

        tffname.setBackground(new java.awt.Color(33, 33, 33));
        tffname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        tffname.setForeground(new java.awt.Color(255, 255, 255));
        tffname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        tflname.setBackground(new java.awt.Color(33, 33, 33));
        tflname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tflname.setForeground(new java.awt.Color(204, 204, 204));
        tflname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        Lastname.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Lastname.setForeground(new java.awt.Color(153, 153, 153));
        Lastname.setText("User Lastname");

        Username.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Username.setForeground(new java.awt.Color(153, 153, 153));
        Username.setText("Username");

        tfuname.setBackground(new java.awt.Color(33, 33, 33));
        tfuname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tfuname.setForeground(new java.awt.Color(204, 204, 204));
        tfuname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        Gender.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Gender.setForeground(new java.awt.Color(153, 153, 153));
        Gender.setText("User Gender");

        tfgender.setBackground(new java.awt.Color(33, 33, 33));
        tfgender.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tfgender.setForeground(new java.awt.Color(204, 204, 204));
        tfgender.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        DOB.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        DOB.setForeground(new java.awt.Color(153, 153, 153));
        DOB.setText("User DOB");

        tfdob.setBackground(new java.awt.Color(33, 33, 33));
        tfdob.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tfdob.setForeground(new java.awt.Color(255, 255, 255));
        tfdob.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        tfdob.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfdobKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfdobKeyTyped(evt);
            }
        });

        Email.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Email.setForeground(new java.awt.Color(153, 153, 153));
        Email.setText("User Email");

        tfemail.setBackground(new java.awt.Color(33, 33, 33));
        tfemail.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tfemail.setForeground(new java.awt.Color(255, 255, 255));
        tfemail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        Save.setBackground(new java.awt.Color(213, 0, 0));
        Save.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Save.setForeground(new java.awt.Color(255, 255, 255));
        Save.setText("Save");
        Save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(213, 0, 0)));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        Clear.setBackground(new java.awt.Color(0, 204, 51));
        Clear.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 255, 255));
        Clear.setText("Clear");
        Clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        Password.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Password.setForeground(new java.awt.Color(153, 153, 153));
        Password.setText("Password");

        tfpass.setBackground(new java.awt.Color(33, 33, 33));
        tfpass.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tfpass.setForeground(new java.awt.Color(204, 204, 204));
        tfpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        Height.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Height.setForeground(new java.awt.Color(153, 153, 153));
        Height.setText("User Height");

        tfheight.setBackground(new java.awt.Color(33, 33, 33));
        tfheight.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tfheight.setForeground(new java.awt.Color(255, 255, 255));
        tfheight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        Weight.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Weight.setForeground(new java.awt.Color(153, 153, 153));
        Weight.setText("User Weight");

        tfweight.setBackground(new java.awt.Color(33, 33, 33));
        tfweight.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        tfweight.setForeground(new java.awt.Color(255, 255, 255));
        tfweight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfheight)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Height)
                        .addGap(0, 234, Short.MAX_VALUE))
                    .addComponent(tfweight)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfemail)
                            .addComponent(tfpass)
                            .addComponent(tffname)
                            .addComponent(tfgender)
                            .addComponent(tfdob)
                            .addComponent(tfid)
                            .addComponent(tflname)
                            .addComponent(tfuname)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Gender)
                                    .addComponent(DOB)
                                    .addComponent(Email)
                                    .addComponent(Firstname)
                                    .addComponent(Id)
                                    .addComponent(Username)
                                    .addComponent(Lastname)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Password)
                                    .addComponent(Weight))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfid, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Firstname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tffname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lastname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tflname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Username)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfuname, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Password)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfpass, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Gender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfgender, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DOB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfdob, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Email)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfemail, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Height)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfheight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Weight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfweight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel2.setBackground(new java.awt.Color(213, 0, 0));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Registration");

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arogya/Icons/icons8-back-arrow-64.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Back)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(Back)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 737, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfdobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdobKeyTyped

    }//GEN-LAST:event_tfdobKeyTyped

    private void tfdobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdobKeyReleased

    }//GEN-LAST:event_tfdobKeyReleased

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
         boolean rt = false;
         JTextField tf[] = {tflname,tfid,tffname,tfpass,tfdob,tfgender,tfheight,tfweight,tfemail,tfuname};
        for (int i = 0; i < tf.length; i++) {
            if (tf[i].getText().equals("")) {
                System.out.println(tf[i].getText());
                toolt(tf[i], "This field cannot be empty");
                rt = true;
            }   } 
    }//GEN-LAST:event_SaveActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        {
        tfid.setText("");
        tffname.setText("");
        tflname.setText("");
        tfuname.setText("");
        tfpass.setText("");
        tfgender.setText("");
        tfdob.setText("");
        tfemail.setText("");
        tfheight.setText("");
        tfweight.setText("");// TODO add your handling code here:
        }
    }//GEN-LAST:event_ClearActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

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
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegistration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                try {
                    UIManager.setLookAndFeel(new WindowsClassicLookAndFeel());
                    new UserRegistration().setVisible(true);
                } catch (Exception e) {
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Firstname;
    private javax.swing.JLabel Gender;
    private javax.swing.JLabel Height;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel Lastname;
    private javax.swing.JLabel Password;
    private javax.swing.JButton Save;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel Weight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField tfdob;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tffname;
    private javax.swing.JTextField tfgender;
    private javax.swing.JTextField tfheight;
    private javax.swing.JTextField tfid;
    private javax.swing.JTextField tflname;
    private javax.swing.JTextField tfpass;
    private javax.swing.JTextField tfuname;
    private javax.swing.JTextField tfweight;
    // End of variables declaration//GEN-END:variables
}