/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tamás
 */
public class JatekFelulet extends javax.swing.JFrame {

    /**
     * Creates new form JatekFelulet
     */
    public JatekFelulet() {
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

        jPanel1 = new javax.swing.JPanel();
        btPoharB = new javax.swing.JButton();
        btPoharC = new javax.swing.JButton();
        btPoharA = new javax.swing.JButton();
        lbVisszajelzes = new javax.swing.JLabel();
        cbUjHely = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFajl = new javax.swing.JMenu();
        miUjJatek = new javax.swing.JMenuItem();
        miMentes = new javax.swing.JMenuItem();
        miBetoltes = new javax.swing.JMenuItem();
        mnJatek = new javax.swing.JMenu();
        miHaromPohar = new javax.swing.JMenuItem();
        miNegyPohar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btPoharB.setText("Pohar");

        btPoharC.setText("Pohar");

        btPoharA.setText("Pohar");
        btPoharA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPoharAActionPerformed(evt);
            }
        });

        lbVisszajelzes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbVisszajelzes.setText("Talált");

        cbUjHely.setText("Új helyre a golyót minden tippelésénél");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbUjHely)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btPoharA)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbVisszajelzes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btPoharB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(btPoharC)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbUjHely)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(lbVisszajelzes)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPoharB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPoharC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPoharA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mnFajl.setText("Fájl");

        miUjJatek.setText("Új játék");
        mnFajl.add(miUjJatek);

        miMentes.setText("Mentés");
        mnFajl.add(miMentes);

        miBetoltes.setText("Betöltés");
        mnFajl.add(miBetoltes);

        jMenuBar1.add(mnFajl);

        mnJatek.setText("Játék");

        miHaromPohar.setText("3 pohár");
        mnJatek.add(miHaromPohar);

        miNegyPohar.setText("4 pohár");
        mnJatek.add(miNegyPohar);

        jMenuBar1.add(mnJatek);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btPoharAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPoharAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btPoharAActionPerformed

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
            java.util.logging.Logger.getLogger(JatekFelulet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JatekFelulet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JatekFelulet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JatekFelulet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JatekFelulet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btPoharA;
    private javax.swing.JButton btPoharB;
    private javax.swing.JButton btPoharC;
    private javax.swing.JCheckBox cbUjHely;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbVisszajelzes;
    private javax.swing.JMenuItem miBetoltes;
    private javax.swing.JMenuItem miHaromPohar;
    private javax.swing.JMenuItem miMentes;
    private javax.swing.JMenuItem miNegyPohar;
    private javax.swing.JMenuItem miUjJatek;
    private javax.swing.JMenu mnFajl;
    private javax.swing.JMenu mnJatek;
    // End of variables declaration//GEN-END:variables
}