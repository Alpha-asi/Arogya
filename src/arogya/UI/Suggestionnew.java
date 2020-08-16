/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arogya.UI;

import arogya.Essencials;
import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.UIManager;
import arogya.DB;
import javax.swing.JTable;
import java.awt.Color;
import java.awt.Component;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import arogya.Essencials;
import javax.swing.table.DefaultTableModel;
import arogya.JComponentTableCellRenderer;
import arogya.CustomRenderer;
import java.awt.Toolkit;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author ADMIN
 */
public class Suggestionnew extends javax.swing.JFrame {

    /**
     * Creates new form Suggestionnew
     */
     Essencials es;
     DefaultTableModel tbcus;
    
    public Suggestionnew() {
        setUndecorated(true);
        initComponents();
        Rectangle maximumWindowBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        this.setBounds(0, 0, maximumWindowBounds.width, maximumWindowBounds.height);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
      
        //es.setCenter(this);

      

     //   tfsearch.grabFocus();
     
    
    }
    
    public void dataShow(){
        
        
        es = new Essencials();
        
        String headings[] = {"Food Name", "Food Status"};
        es.customTBHEAD(jTable, headings, 2, new Color(33, 33, 33));
        tbcus = (DefaultTableModel) jTable.getModel();
    
        searchAll("SELECT\n" +
        "food.Food_name,\n" +
        "food.Food_status\n" +
        "FROM\n" +
        "foods_for_diseases\n" +
        "INNER JOIN food ON foods_for_diseases.Ffd_id = food.Food_id WHERE (foods_for_diseases.Diabetic = '" + Dia1 + "' OR foods_for_diseases.Diabetic = '" + Dia1 + "' )\n" +
        "AND ( foods_for_diseases.Cold= '" + Cold1 + "' OR foods_for_diseases.Cold = '" + Cold2 + "') \n" +
        "AND (foods_for_diseases.Diarrhea = '" + Diar1 + "' OR foods_for_diseases.Diarrhea = '" + Diar2 + "'  ) \n" +
        "AND ( foods_for_diseases.Cataract = '" + CAT1 + "' OR foods_for_diseases.Cataract = '" + CAT2 + "')\n" +
        "AND ( foods_for_diseases.Low_Blood_Pressure= '" + LBP1 + "' OR foods_for_diseases.Low_Blood_Pressure = '" + LBP2 + "')		\n" +
        "AND ( foods_for_diseases.Chicken_Pox= '" + CP1 + "' OR foods_for_diseases.Chicken_Pox = '" + CP2 + "')\n" +
        "AND ( foods_for_diseases.High_Blood_Pressure= '" + HBP1 + "' OR foods_for_diseases.High_Blood_Pressure = '" + HBP2 + "')																												\n" +
        "AND ( foods_for_diseases.Fever= '" + FEV1 + "' OR foods_for_diseases.Fever = '" + FEV2 + "')			\n" +
        "AND ( foods_for_diseases.Gastritis= '" + Gast1 + "' OR foods_for_diseases.Gastritis = '" + Gast2 + "')	\n" +
        "AND ( foods_for_diseases.Migraine= '" + Mig1 + "' OR foods_for_diseases.Migraine = '" + Mig2 + "')");
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        Back2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        Save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(33, 33, 33));

        jPanel8.setBackground(new java.awt.Color(213, 0, 0));
        jPanel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel8MouseDragged(evt);
            }
        });
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel8MousePressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Suggestions");

        Back2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arogya/Icons/icons8-back-arrow-64.png"))); // NOI18N
        Back2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Back2MouseClicked(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(213, 0, 0));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arogya/Icons/minimizepgg.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arogya/Icons/expandpgg.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arogya/Icons/exitpgg.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(Back2)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Back2))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(33, 33, 33));

        jTable.setBackground(new java.awt.Color(0, 0, 0));
        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable.setGridColor(new java.awt.Color(255, 0, 0));
        jTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(jTable);

        Save.setBackground(new java.awt.Color(234, 128, 252));
        Save.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        Save.setForeground(new java.awt.Color(38, 50, 56));
        Save.setText("Suggestion ");
        Save.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(213, 0, 0)));
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(1301, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 57, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1863, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 629, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Back2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Back2MouseClicked
          this.dispose();
          new UserDetails().setVisible(true);
    }//GEN-LAST:event_Back2MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        this.setExtendedState(Login.ICONIFIED);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        if (this.getExtendedState()!= Login.MAXIMIZED_BOTH) {
            this.setExtendedState(Login.MAXIMIZED_BOTH);

        }else{

            this.setSize(1280, 720);

        }
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jPanel8MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx, y-yy);
    }//GEN-LAST:event_jPanel8MouseDragged
static int xx,yy;
    private void jPanel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MousePressed
        xx = evt.getX();
        yy = evt.getY();
    }//GEN-LAST:event_jPanel8MousePressed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed

    }//GEN-LAST:event_SaveActionPerformed

    /**
     * @param args the command line arguments
     */
    int Dia1,Dia2,LBP1,LBP2,Cold1,Cold2,Diar1,Diar2,CP1,CP2,HBP1,HBP2,CAT1,CAT2,FEV1,FEV2,Gast1,Gast2,Mig1,Mig2,Coh1,Coh2;
    public void getUserIllnessData(int Ill1,int Ill2,int Ill3,int Ill4,int Ill5,int Ill6,int Ill7,int Ill8,int Ill9,int Ill10){
    
     System.out.println(Ill3);
     System.out.println(Ill3);
     System.out.println(Ill3);
     System.out.println(Ill3);
     System.out.println(Ill3);
     System.out.println(Ill3);

    
    if(Ill1==1){
    
        Dia1=1;
        Dia2=1;
    
    }else{
    
        Dia1=1;
        Dia2=0;

    }
    
     if(Ill2==1){
    
        LBP1=1;
        LBP2=1;
    
    }else{
    
        LBP1=1;
        LBP2=0;
    }
     
     
       if(Ill3==1){
    
        Cold1=1;
        Cold2=1;
    
    }else{
    
        Cold1=1;
        Cold2=0;
    }
       
       
         if(Ill4==1){
    
        Diar1=1;
        Diar2=1;
    
    }else{
    
        Diar1=1;
        Diar2=0;
    }
    
         
         if(Ill5==1){
    
        CP1=1;
        CP2=1;
    
    }else{
    
        CP1=1;
        CP2=0;
    }
    
         
         
         if(Ill6==1){
    
        HBP1=1;
        HBP2=1;
    
    }else{
    
        HBP1=1;
        HBP2=0;
    }
         
         
         
         
         if(Ill7==1){
    
        CAT1=1;
        CAT2=1;
    
    }else{
    
        CAT1=1;
        CAT2=0;
    }
    
         
         
         if(Ill8==1){
    
        FEV1=1;
        FEV2=1;
    
    }else{
    
        FEV1=1;
        FEV2=0;
    }
         
         
         
         if(Ill9==1){
    
        Gast1=1;
        Gast2=1;
    
    }else{
    
        Gast1=1;
        Gast2=0;
    }
    
         
         
           if(Ill10==1){
    
        Mig1=1;
        Mig2=1;
    
    }else{
    
        Mig1=1;
        Mig2=0;
    }
           
           
    
    }
    
      public void searchAll(String query) {
        try {
            ResultSet rs = DB.search(query);
            tbcus.setRowCount(0);
            while (rs.next()) {
                Vector v = new Vector();
                v.add(rs.getString(1));
                v.add(rs.getString(2));
              
              
                tbcus.addRow(v);

                ///////////TABLE ROW COLOR
                final ArrayList ar = new ArrayList();

                for (int i = 0; i < tbcus.getRowCount(); i++) {
                    ar.add(i);
                }

                jTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
                    @Override
                    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                        final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                        if (Integer.parseInt(ar.get(row).toString()) % 2 == 1) {
                            c.setBackground(new java.awt.Color(253, 253, 253));
                        } else {
                            c.setBackground(new Color(240, 240, 240));
                        }
                        return c;
                    }
                });

                /////////////////////////
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

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
            java.util.logging.Logger.getLogger(TargetTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TargetTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TargetTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TargetTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UIManager.setLookAndFeel(new WindowsClassicLookAndFeel());
                    new Suggestionnew().setVisible(true);
                } catch (Exception e) {
                }
            }
        });
    }
     

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back2;
    private javax.swing.JButton Save;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
