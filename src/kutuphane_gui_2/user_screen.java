/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kutuphane_gui_2;

import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author mobyrktr
 */
public class user_screen extends javax.swing.JFrame {
    String tckn;
    
    public user_screen()
    {
        initComponents();
    }
    /**
     * Creates new form user_screen
     * @param tckn
     */
    public user_screen(String tckn) {
        initComponents();
        this.tckn = tckn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_ara = new javax.swing.JButton();
        btn_odunc = new javax.swing.JButton();
        btn_iade = new javax.swing.JButton();
        btn_ceza = new javax.swing.JButton();
        btn_cikis = new javax.swing.JButton();
        btn_odunc_goster = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kullanıcı Ekranı");
        setLocation(new java.awt.Point(500, 200));

        btn_ara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        btn_ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_araActionPerformed(evt);
            }
        });

        btn_odunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/borrow.png"))); // NOI18N
        btn_odunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_oduncActionPerformed(evt);
            }
        });

        btn_iade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/return.png"))); // NOI18N
        btn_iade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iadeActionPerformed(evt);
            }
        });

        btn_ceza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/banned.png"))); // NOI18N
        btn_ceza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cezaActionPerformed(evt);
            }
        });

        btn_cikis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/quit.png"))); // NOI18N
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        btn_odunc_goster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/book.png"))); // NOI18N
        btn_odunc_goster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_odunc_gosterActionPerformed(evt);
            }
        });

        jLabel1.setText("Kitap Ara");

        jLabel2.setText("Ödünç Al");

        jLabel3.setText("Geri Ver");

        jLabel4.setText("Ödünç Alınmış");

        jLabel5.setText("Kitaplar");

        jLabel6.setText("Cezalarım");

        jLabel7.setText("Çıkış Yap");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addGap(129, 129, 129)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(109, 109, 109))
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(btn_odunc, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_iade, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_odunc_goster, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(btn_ceza, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn_cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(100, 100, 100))))
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_ara, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_odunc, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_iade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_odunc_goster, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ceza, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cikis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_araActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_araActionPerformed
        kitap_ara k = new kitap_ara();
        this.setVisible(false);
        k.setVisible(true);
    }//GEN-LAST:event_btn_araActionPerformed

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
        login_screen l = new login_screen();
        this.setVisible(false);
        l.setVisible(true);
    }//GEN-LAST:event_btn_cikisActionPerformed

    private void btn_oduncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_oduncActionPerformed
        odunc_ekrani o = new odunc_ekrani(tckn);
        this.setVisible(false);
        o.setVisible(true);
    }//GEN-LAST:event_btn_oduncActionPerformed

    private void btn_cezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cezaActionPerformed
        try {
            ceza_ekrani c = new ceza_ekrani(tckn);
            this.setVisible(false);
            c.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(user_screen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_cezaActionPerformed

    private void btn_odunc_gosterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_odunc_gosterActionPerformed
        try {
            odunc_gorme_ekrani o = new odunc_gorme_ekrani(tckn);
            if(o.oduncVarMi())
            {
                this.setVisible(false);
                o.setVisible(true);
                o.oduncleriGor();
            }
            
            else
            {
                JOptionPane.showMessageDialog(this, "Ödünç alınmış kitap bulunamadı.", "Uyarı", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ParseException ex) {
            Logger.getLogger(user_screen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_odunc_gosterActionPerformed

    private void btn_iadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iadeActionPerformed
        try {
            iade_ekrani i = new iade_ekrani(tckn);
            if(i.oduncVarMi())
            {
                this.setVisible(false);
                i.setVisible(true);
                i.oduncleriGor();
            }
            
            else
            {
                JOptionPane.showMessageDialog(this, "Ödünç alınmış kitap bulunamadı.", "Uyarı", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (ParseException ex) {
            Logger.getLogger(user_screen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_iadeActionPerformed

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
            java.util.logging.Logger.getLogger(user_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_screen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_screen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ara;
    private javax.swing.JButton btn_ceza;
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_iade;
    private javax.swing.JButton btn_odunc;
    private javax.swing.JButton btn_odunc_goster;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}