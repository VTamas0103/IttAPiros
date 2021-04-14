
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class JatekFelulet extends javax.swing.JFrame {

    int golyo;
    boolean poharA = false;
    boolean poharB = false;
    boolean poharC = false;

    public JatekFelulet() {
        initComponents();
        ujJatekHaromPohar();
    }

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
        setResizable(false);

        btPoharB.setText("Pohar");
        btPoharB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPoharBActionPerformed(evt);
            }
        });

        btPoharC.setText("Pohar");
        btPoharC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPoharCActionPerformed(evt);
            }
        });

        btPoharA.setText("Pohar");
        btPoharA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPoharAActionPerformed(evt);
            }
        });

        lbVisszajelzes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbVisszajelzes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cbUjHely.setText("Új helyre a golyót minden tippelésénél");
        cbUjHely.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUjHelyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbUjHely)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btPoharA)
                                .addGap(18, 18, 18)
                                .addComponent(btPoharB)
                                .addGap(18, 18, 18)
                                .addComponent(btPoharC)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lbVisszajelzes, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbUjHely)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(lbVisszajelzes, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btPoharB, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPoharC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btPoharA, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mnFajl.setText("Fájl");

        miUjJatek.setText("Új játék");
        miUjJatek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miUjJatekActionPerformed(evt);
            }
        });
        mnFajl.add(miUjJatek);

        miMentes.setText("Mentés");
        miMentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMentesActionPerformed(evt);
            }
        });
        mnFajl.add(miMentes);

        miBetoltes.setText("Betöltés");
        miBetoltes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBetoltesActionPerformed(evt);
            }
        });
        mnFajl.add(miBetoltes);

        jMenuBar1.add(mnFajl);

        mnJatek.setText("Játék");

        miHaromPohar.setText("3 pohár");
        miHaromPohar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miHaromPoharActionPerformed(evt);
            }
        });
        mnJatek.add(miHaromPohar);

        miNegyPohar.setText("4 pohár");
        miNegyPohar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNegyPoharActionPerformed(evt);
            }
        });
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
        tipp(1);
    }//GEN-LAST:event_btPoharAActionPerformed

    private void miNegyPoharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNegyPoharActionPerformed
        JOptionPane.showMessageDialog(null, "Ez a mód jelenleg nem elérhető!", "Információ", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_miNegyPoharActionPerformed

    private void miUjJatekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miUjJatekActionPerformed
        ujJatekHaromPohar();
    }//GEN-LAST:event_miUjJatekActionPerformed

    private void btPoharBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPoharBActionPerformed
        tipp(2);
    }//GEN-LAST:event_btPoharBActionPerformed

    private void btPoharCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPoharCActionPerformed
        tipp(3);
    }//GEN-LAST:event_btPoharCActionPerformed

    private void cbUjHelyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUjHelyActionPerformed

    }//GEN-LAST:event_cbUjHelyActionPerformed

    private void miHaromPoharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miHaromPoharActionPerformed
        ujJatekHaromPohar();
    }//GEN-LAST:event_miHaromPoharActionPerformed

    private void miMentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMentesActionPerformed
        mentes();
    }//GEN-LAST:event_miMentesActionPerformed

    private void miBetoltesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBetoltesActionPerformed
        try {
            beolvas();
        } catch (IOException ex) {
            Logger.getLogger(JatekFelulet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_miBetoltesActionPerformed

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

    private void ujJatekHaromPohar() {
        poharA = false;
        poharB = false;
        poharC = false;

        Random rnd = new Random();
        golyo = rnd.nextInt(3) + 1;
        switch (golyo) {
            case 1:
                poharA = true;
                break;
            case 2:
                poharB = true;
                break;
            case 3:
                poharC = true;
                break;
            default:
                break;
        }
        System.out.println(golyo);
        System.out.println(poharA);
        System.out.println(poharB);
        System.out.println(poharC);

    }

    private void tipp(int szam) {

        if (golyo == szam) {
            lbVisszajelzes.setText("Talált! c:");
            ujJatekHaromPohar();
        } else {
            lbVisszajelzes.setText("Nem talált! :c");
        }
        if (cbUjHely.isSelected()) {
            ujJatekHaromPohar();
        }
    }

    private void mentes() {
        String valami = "";
        switch (golyo) {
            case 1:
                valami = "poharA;";
                break;
            case 2:
                valami = "poharB;";
                break;
            case 3:
                valami = "poharC;";
                break;
            default:
                break;
        }
        valami += "false;";
        try {
            FileWriter fileIras = new FileWriter("config.txt");
            fileIras.write(valami);
            fileIras.close();
            System.out.println("Sikeres Mentés");
        } catch (IOException e) {
            System.out.println("Nem sikeres");
            e.printStackTrace();
        }
    }

    private void beolvas() throws IOException {
        List<String> mentes = Files.readAllLines(Paths.get("config.txt"));
        String[] tomb = mentes.get(0).split(";");
        switch (tomb[0]) {
            case "poharA":
                poharA = true;
                golyo = 1;
                break;
            case "poharB":
                poharB = true;
                golyo = 2;
                break;
            case "poharC":
                poharC = true;
                golyo = 3;
                break;
            default:
                break;
        }
    }
}
