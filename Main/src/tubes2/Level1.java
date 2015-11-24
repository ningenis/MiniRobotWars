/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes2;


import java.awt.*;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 *
 * @author ikp
 */
public class Level1 extends javax.swing.JFrame {

    /**
     * Creates new form Level1
     */
    ImageIcon newIcon = new ImageIcon();
    ImageIcon transparan = createImageIcon("/img/transparant.png");

    GameController GC = new GameController();
    MainController MC = new MainController(GC);
    ArrayList<Minirobot> mini = new ArrayList<Minirobot>();
    ArrayList<GiantRobot> giant = new ArrayList<GiantRobot>();
    ArrayList<Bullet> bullet = new ArrayList<Bullet>();
    JLabel[][] slot = new JLabel[10][5];
    Arena lvl1arena = new Arena(1);
    int command1;
    int command2;
  
    public Level1() {
        initComponents();
        for (int i=0; i<10;i++){
            for(int j=0;j<5;j++){
                //slot[i][j]= new ImageIcon("/tubes2/img/transparant.png");
                slot[i][j]= new JLabel();
                slot[i][j].setBounds(i*80,j*80,80,80);
                slot[i][j].setIcon(transparan); 
            }
        }
        
        GC.Game();
        LabelinVisible();
        GiantRobot GR = new GiantRobot(20,500);
        getContentPane().add(GR.getLabel());
        
        
//        giant.add(new GiantRobot(11,11,new Rectangle(0,0,10,10),"lala",GC));
//        mini.add(new MiniGE(0,100,5,0,new Rectangle(900,600,10,10),"lili",GC));
//        giant.get(0).setEnemy(mini.get(0));
//        GC.setGiant(giant);
//        GC.setMini(mini);
//        GC.setBullet(bullet);
//        MC.run();
        
    }
    public void LabelinVisible(){
        this.jLabel1.setVisible(false);
        this.jLabel2.setVisible(false);
        this.jLabel3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jLabel5.setVisible(false);
        this.jLabel6.setVisible(false);
        this.jLabel7.setVisible(false);
        this.jLabel8.setVisible(false);
        this.jLabel9.setVisible(false);
        this.jLabel10.setVisible(false);
        this.jLabel11.setVisible(false);
        this.jLabel12.setVisible(false);
        this.jLabel13.setVisible(false);
        this.jLabel14.setVisible(false);
        this.jLabel15.setVisible(false);
        this.jLabel16.setVisible(false);
        this.jLabel17.setVisible(false);
        this.jLabel18.setVisible(false);
        this.jLabel19.setVisible(false);
        this.jLabel20.setVisible(false);
        this.jLabel21.setVisible(false);
        this.jLabel22.setVisible(false);
        this.jLabel23.setVisible(false);
        this.jLabel24.setVisible(false);
        this.jLabel25.setVisible(false);
        this.jLabel26.setVisible(false);
        this.jLabel27.setVisible(false);
        this.jLabel28.setVisible(false);
        this.jLabel29.setVisible(false);
        this.jLabel30.setVisible(false);
        this.jLabel31.setVisible(false);
        this.jLabel32.setVisible(false);
        this.jLabel33.setVisible(false);
        this.jLabel34.setVisible(false);
        this.jLabel35.setVisible(false);
        this.jLabel36.setVisible(false);
        this.jLabel37.setVisible(false);
        this.jLabel38.setVisible(false);
        this.jLabel39.setVisible(false);
        this.jLabel40.setVisible(false);
        this.jLabel41.setVisible(false);
        this.jLabel42.setVisible(false);
        this.jLabel43.setVisible(false);
        this.jLabel44.setVisible(false);
        this.jLabel45.setVisible(false);
        this.jLabel46.setVisible(false);
        this.jLabel47.setVisible(false);
        this.jLabel48.setVisible(false);
        this.jLabel49.setVisible(false);
        this.jLabel50.setVisible(false);        
    }

    public void LabelVisible(){
        this.jLabel1.setVisible(true);
        this.jLabel2.setVisible(true);
        this.jLabel3.setVisible(true);
        this.jLabel4.setVisible(true);
        this.jLabel5.setVisible(true);
        this.jLabel6.setVisible(true);
        this.jLabel7.setVisible(true);
        this.jLabel8.setVisible(true);
        this.jLabel9.setVisible(true);
        this.jLabel10.setVisible(true);
        this.jLabel11.setVisible(true);
        this.jLabel12.setVisible(true);
        this.jLabel13.setVisible(true);
        this.jLabel14.setVisible(true);
        this.jLabel15.setVisible(true);
        this.jLabel16.setVisible(true);
        this.jLabel17.setVisible(true);
        this.jLabel18.setVisible(true);
        this.jLabel19.setVisible(true);
        this.jLabel20.setVisible(true);
        this.jLabel21.setVisible(true);
        this.jLabel22.setVisible(true);
        this.jLabel23.setVisible(true);
        this.jLabel24.setVisible(true);
        this.jLabel25.setVisible(true);
        this.jLabel26.setVisible(true);
        this.jLabel27.setVisible(true);
        this.jLabel28.setVisible(true);
        this.jLabel29.setVisible(true);
        this.jLabel30.setVisible(true);
        this.jLabel31.setVisible(true);
        this.jLabel32.setVisible(true);
        this.jLabel33.setVisible(true);
        this.jLabel34.setVisible(true);
        this.jLabel35.setVisible(true);
        this.jLabel36.setVisible(true);
        this.jLabel37.setVisible(true);
        this.jLabel38.setVisible(true);
        this.jLabel39.setVisible(true);
        this.jLabel40.setVisible(true);
        this.jLabel41.setVisible(true);
        this.jLabel42.setVisible(true);
        this.jLabel43.setVisible(true);
        this.jLabel44.setVisible(true);
        this.jLabel45.setVisible(true);
        this.jLabel46.setVisible(true);
        this.jLabel47.setVisible(true);
        this.jLabel48.setVisible(true);
        this.jLabel49.setVisible(true);
        this.jLabel50.setVisible(true);        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MiniGEButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 640));
        getContentPane().setLayout(null);

        MiniGEButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/MiniEnergi.png"))); // NOI18N
        MiniGEButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MiniGEButtonActionPerformed(evt);
            }
        });
        getContentPane().add(MiniGEButton);
        MiniGEButton.setBounds(790, 0, 113, 100);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(820, 490, 80, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(730, 490, 80, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(550, 490, 80, 80);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(640, 490, 80, 80);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 490, 80, 80);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 490, 80, 80);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(190, 490, 80, 80);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(280, 490, 80, 80);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 490, 80, 80);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(100, 490, 80, 80);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(100, 400, 80, 80);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(10, 400, 80, 80);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel13);
        jLabel13.setBounds(820, 400, 80, 80);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel14);
        jLabel14.setBounds(730, 400, 80, 80);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel15);
        jLabel15.setBounds(550, 400, 80, 80);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel16);
        jLabel16.setBounds(640, 400, 80, 80);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(370, 400, 80, 80);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel18);
        jLabel18.setBounds(460, 400, 80, 80);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel19);
        jLabel19.setBounds(190, 400, 80, 80);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel20);
        jLabel20.setBounds(280, 400, 80, 80);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel21);
        jLabel21.setBounds(820, 310, 80, 80);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel22);
        jLabel22.setBounds(730, 310, 80, 80);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel23);
        jLabel23.setBounds(550, 310, 80, 80);

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel24);
        jLabel24.setBounds(640, 310, 80, 80);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel25);
        jLabel25.setBounds(370, 310, 80, 80);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel26);
        jLabel26.setBounds(460, 310, 80, 80);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel27);
        jLabel27.setBounds(190, 310, 80, 80);

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel28);
        jLabel28.setBounds(280, 310, 80, 80);

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel29);
        jLabel29.setBounds(10, 310, 80, 80);

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel30);
        jLabel30.setBounds(100, 310, 80, 80);

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel31);
        jLabel31.setBounds(100, 220, 80, 80);

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel32);
        jLabel32.setBounds(10, 220, 80, 80);

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel33);
        jLabel33.setBounds(820, 220, 80, 80);

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel34);
        jLabel34.setBounds(730, 220, 80, 80);

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel35);
        jLabel35.setBounds(550, 220, 80, 80);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel36);
        jLabel36.setBounds(640, 220, 80, 80);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel37);
        jLabel37.setBounds(370, 220, 80, 80);

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel38);
        jLabel38.setBounds(460, 220, 80, 80);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel39);
        jLabel39.setBounds(190, 220, 80, 80);

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel40);
        jLabel40.setBounds(280, 220, 80, 80);

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel41);
        jLabel41.setBounds(100, 130, 80, 80);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel42);
        jLabel42.setBounds(10, 130, 80, 80);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel43);
        jLabel43.setBounds(820, 130, 80, 80);

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel44);
        jLabel44.setBounds(730, 130, 80, 80);

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel45);
        jLabel45.setBounds(550, 130, 80, 80);

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel46);
        jLabel46.setBounds(640, 130, 80, 80);

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel47);
        jLabel47.setBounds(370, 130, 80, 80);

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel48);
        jLabel48.setBounds(460, 130, 80, 80);

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel49);
        jLabel49.setBounds(190, 130, 80, 80);

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/transparant.png"))); // NOI18N
        getContentPane().add(jLabel50);
        jLabel50.setBounds(280, 130, 80, 80);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/evening.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, -30, 1050, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void MiniGEButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MiniGEButtonActionPerformed
        this.LabelVisible();
        this.command1=1;
        
    }//GEN-LAST:event_MiniGEButtonActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        LabelinVisible();
        
        jLabel2.setIcon(MiniGEButton.getIcon());
        
        jLabel2.setVisible(true);
        if (this.command1==1){
           
        }
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        LabelinVisible();
        
        jLabel2.setIcon(MiniGEButton.getIcon());
        
        jLabel2.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
         LabelinVisible();
        
        jLabel2.setIcon(MiniGEButton.getIcon());
        
        jLabel2.setVisible(true);
        Background.setVisible(false);
    }//GEN-LAST:event_jLabel1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        
        
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Level1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Level1().setVisible(true);
                
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton MiniGEButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables

   protected ImageIcon createImageIcon(String path) {
    java.net.URL imgURL = getClass().getResource(path);
    if (imgURL != null) {
        return new ImageIcon(imgURL);
    } else {
        System.err.println("Couldn't find file: " + path);
        return null;
    }
}
}
