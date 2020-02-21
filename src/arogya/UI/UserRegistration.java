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
import arogya.User;
import com.sun.glass.events.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import arogya.UI.Fail;
import static arogya.UI.Login.xx;


/**
 *
 * @author vimuk
 */
public class UserRegistration extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public UserRegistration() {
         setUndecorated(true);
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
        Firstname = new javax.swing.JLabel();
        tffname = new javax.swing.JTextField();
        tflname = new javax.swing.JTextField();
        Lastname = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        tfuname = new javax.swing.JTextField();
        nic = new javax.swing.JLabel();
        tfmnic = new javax.swing.JTextField();
        DOB = new javax.swing.JLabel();
        tfdob = new javax.swing.JTextField();
        Email = new javax.swing.JLabel();
        tfemail = new javax.swing.JTextField();
        Save = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Password = new javax.swing.JLabel();
        Height = new javax.swing.JLabel();
        tfheight = new javax.swing.JTextField();
        Weight = new javax.swing.JLabel();
        tfweight = new javax.swing.JTextField();
        gender = new javax.swing.JLabel();
        tfgen = new javax.swing.JTextField();
        tfpass = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));
        jPanel1.setPreferredSize(new java.awt.Dimension(1080, 1920));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arogya/Icons/arogya icon.png"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(33, 33, 33));
        jPanel3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jPanel3KeyTyped(evt);
            }
        });

        Firstname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Firstname.setForeground(new java.awt.Color(153, 153, 153));
        Firstname.setText("User Firstname");

        tffname.setBackground(new java.awt.Color(33, 33, 33));
        tffname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tffname.setForeground(new java.awt.Color(255, 255, 255));
        tffname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        tffname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tffnameActionPerformed(evt);
            }
        });
        tffname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tffnameKeyTyped(evt);
            }
        });

        tflname.setBackground(new java.awt.Color(33, 33, 33));
        tflname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tflname.setForeground(new java.awt.Color(255, 255, 255));
        tflname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        tflname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tflnameActionPerformed(evt);
            }
        });

        Lastname.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Lastname.setForeground(new java.awt.Color(153, 153, 153));
        Lastname.setText("User Lastname");

        Username.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Username.setForeground(new java.awt.Color(153, 153, 153));
        Username.setText("Username");

        tfuname.setBackground(new java.awt.Color(33, 33, 33));
        tfuname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tfuname.setForeground(new java.awt.Color(255, 255, 255));
        tfuname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        nic.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nic.setForeground(new java.awt.Color(153, 153, 153));
        nic.setText("User NIC");

        tfmnic.setBackground(new java.awt.Color(33, 33, 33));
        tfmnic.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tfmnic.setForeground(new java.awt.Color(255, 255, 255));
        tfmnic.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        tfmnic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmnicActionPerformed(evt);
            }
        });

        DOB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DOB.setForeground(new java.awt.Color(153, 153, 153));
        DOB.setText("User DOB");

        tfdob.setEditable(false);
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

        Email.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
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

        Password.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Password.setForeground(new java.awt.Color(153, 153, 153));
        Password.setText("Password");

        Height.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Height.setForeground(new java.awt.Color(153, 153, 153));
        Height.setText("User Height");

        tfheight.setBackground(new java.awt.Color(33, 33, 33));
        tfheight.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tfheight.setForeground(new java.awt.Color(255, 255, 255));
        tfheight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        tfheight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfheightActionPerformed(evt);
            }
        });
        tfheight.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfheightKeyTyped(evt);
            }
        });

        Weight.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Weight.setForeground(new java.awt.Color(153, 153, 153));
        Weight.setText("User Weight");

        tfweight.setBackground(new java.awt.Color(33, 33, 33));
        tfweight.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tfweight.setForeground(new java.awt.Color(255, 255, 255));
        tfweight.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        tfweight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfweightActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gender.setForeground(new java.awt.Color(153, 153, 153));
        gender.setText("User Gender");

        tfgen.setEditable(false);
        tfgen.setBackground(new java.awt.Color(33, 33, 33));
        tfgen.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tfgen.setForeground(new java.awt.Color(255, 255, 255));
        tfgen.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        tfpass.setBackground(new java.awt.Color(33, 33, 33));
        tfpass.setFont(new java.awt.Font("Segoe UI Semibold", 0, 15)); // NOI18N
        tfpass.setForeground(new java.awt.Color(255, 255, 255));
        tfpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfheight)
                    .addComponent(tfweight)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfemail)
                            .addComponent(tffname)
                            .addComponent(tfdob)
                            .addComponent(tflname)
                            .addComponent(tfuname)
                            .addComponent(tfgen)
                            .addComponent(tfpass)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(DOB)
                                    .addComponent(Email)
                                    .addComponent(Firstname)
                                    .addComponent(Username)
                                    .addComponent(Lastname)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Password)
                                    .addComponent(Weight)
                                    .addComponent(gender))
                                .addGap(0, 105, Short.MAX_VALUE))
                            .addComponent(tfmnic))
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Height)
                            .addComponent(nic))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
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
                .addComponent(tfpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfmnic, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(gender)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        jPanel2.setBackground(new java.awt.Color(213, 0, 0));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("User Registration");

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arogya/Icons/icons8-back-arrow-64.png"))); // NOI18N
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(213, 0, 0));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arogya/Icons/minimizepgg.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arogya/Icons/expandpgg.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arogya/Icons/exitpgg.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Back)
                .addGap(31, 31, 31)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(345, 345, 345)
                        .addComponent(jLabel1)
                        .addContainerGap(67, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 657, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfdobKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdobKeyTyped

    }//GEN-LAST:event_tfdobKeyTyped

    private void tfdobKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfdobKeyReleased

    }//GEN-LAST:event_tfdobKeyReleased

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
         boolean rt = false;
         JTextField tf[] = {tflname,tffname,tfpass,tfdob,tfmnic,tfheight,tfweight,tfemail,tfuname};
        for (int i = 0; i < tf.length; i++) {
            if (tf[i].getText().equals("")) {
                System.out.println(tf[i].getText());
                toolt(tf[i], "This field cannot be empty");
                rt = true;
                
            }else{
                
       String uname = tfuname.getText();
       String pass = tfpass.getText();
       String mail = tfemail.getText();
       String dob = tfdob.getText();
       String gender = tfgen.getText();
       String hi = tfheight.getText();
       String we = tfweight.getText();
       String fn = tffname.getText();
       String ln = tflname.getText();
        String nic = tfmnic.getText();
         
         User newuser = new User();
                try {
                    newuser.userUpadate(nic,uname, pass, mail, dob, gender, hi, we, fn, ln);
                    clear();
                } catch (SQLException ex) {
                    new Fail().setVisible(true);
                    Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    new Fail().setVisible(true);
                    Logger.getLogger(UserRegistration.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
                
                }
        
  
                                                       
                                                       
               
       
       
    }//GEN-LAST:event_SaveActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        {
        tffname.setText("");
        tflname.setText("");
        tfuname.setText("");
        tfpass.setText("");
        tfmnic.setText("");
        tfdob.setText("");
        tfgen.setText("");
        tfemail.setText("");
        tfheight.setText("");
        tfweight.setText("");// TODO add your handling code here:
        }
    }//GEN-LAST:event_ClearActionPerformed

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_BackMouseClicked

    private void tfmnicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmnicActionPerformed
         int Day = 0;
        String year = "";
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Calendar c = Calendar.getInstance();

        if (tfmnic.getText().length() == 10) {
            String nic = tfmnic.getText().substring(0, 5);
            year = "19" + nic.substring(0, 2);
            String days = nic.substring(2);
            Day = Integer.parseInt(days);
        } else if (tfmnic.getText().length() == 12) {
            String nic = tfmnic.getText().substring(0, 7);
            System.out.println(nic);
            year = nic.substring(0, 4);
            System.out.println(year);
            String days = nic.substring(4);
            System.out.println(days);
            Day = Integer.parseInt(days);
        } else {

        }
//        String nic = tfmnic.getText().substring(0, 5);
//        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        Calendar c = Calendar.getInstance();
//        String year = "19" + nic.substring(0, 2);
//        System.out.println(date);
//        String days = nic.substring(2);
//        System.out.println(days);
//        c.setTime(new Date(date));
//        int Day = Integer.parseInt(days);
//        c.add(Calendar.DATE, (dt));
//        System.out.println(sdf.format(c.getTime()));


        if (Day > 500) //Can Be Women's NIC No
        {
            tfgen.setText("Female");
            Day = Day - 500;
        }

        if (Day > 0 && Day < 367) {
            tfgen.setText("Male");
            if (Day > 335) {
                Day = Day - 335;
                showDate(year, "12", "0"+ Day);
            } else if (Day > 305) {
                Day = Day - 305;
                showDate(year, "11", "0" + Day);
            } else if (Day > 274) {
                Day = Day - 274;
                showDate(year, "10", "0" + Day);
            } else if (Day > 244) {
                Day = Day - 244;
                showDate(year, "09", "0" + Day);
            } else if (Day > 213) {
                Day = Day - 213;
                showDate(year, "08", "0" + Day);
            } else if (Day > 182) {
                Day = Day - 182;
                showDate(year, "07", "0" + Day);
            } else if (Day > 152) {
                Day = Day - 152;
                showDate(year, "06", "0" + Day);
            } else if (Day > 121) {
                Day = Day - 121;
                showDate(year, "05", "0" + Day);
            } else if (Day > 91) {
                Day = Day - 91;
                showDate(year, "04", "0" + Day);
            } else if (Day > 60) {
                Day = Day - 60;
                showDate(year, "03", "0" + Day);
            } else if (Day < 32) {
                showDate(year, "-01", "0" + Day);
            } else if (Day > 31) {
                Day = Day - 31;
                showDate(year, "02", "0" + Day);
            }
        }
    }//GEN-LAST:event_tfmnicActionPerformed

    private void tfheightKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfheightKeyTyped
        // TODO add your handling code here:
      
    }//GEN-LAST:event_tfheightKeyTyped

    private void tflnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tflnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tflnameActionPerformed

    private void jPanel3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPanel3KeyTyped
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jPanel3KeyTyped

    private void tffnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tffnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tffnameActionPerformed

    private void tffnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tffnameKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_tffnameKeyTyped

    private void tfheightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfheightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfheightActionPerformed

    private void tfweightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfweightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfweightActionPerformed
static int xx,yy;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
         if (this.getExtendedState()!= Login.MAXIMIZED_BOTH) {
            this.setExtendedState(Login.MAXIMIZED_BOTH);
            
        }else{
        
        this.setSize(1280, 720);
        
        }
    }//GEN-LAST:event_jLabel3MousePressed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setExtendedState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    /**
     * @param args the command line arguments
     */
    private void showDate(String year, String month, String date) {
        //System.out.println(year + " " + month + " " + date);
        tfdob.setText(year + "-" + month + "-" + date);
    }
    
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
    public void clear()
    {
        
         tffname.setText("");
        tflname.setText("");
        tfuname.setText("");
        tfpass.setText("");
        tfmnic.setText("");
        tfdob.setText("");
        tfgen.setText("");
        tfemail.setText("");
        tfheight.setText("");
        tfweight.setText("");
        
    }
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton Clear;
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel Firstname;
    private javax.swing.JLabel Height;
    private javax.swing.JLabel Lastname;
    private javax.swing.JLabel Password;
    private javax.swing.JButton Save;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel Weight;
    private javax.swing.JLabel gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel nic;
    private javax.swing.JTextField tfdob;
    private javax.swing.JTextField tfemail;
    private javax.swing.JTextField tffname;
    private javax.swing.JTextField tfgen;
    private javax.swing.JTextField tfheight;
    private javax.swing.JTextField tflname;
    private javax.swing.JTextField tfmnic;
    private javax.swing.JPasswordField tfpass;
    private javax.swing.JTextField tfuname;
    private javax.swing.JTextField tfweight;
    // End of variables declaration//GEN-END:variables
}
