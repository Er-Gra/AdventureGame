/*
 * March 12, 2020
 * Erika Graham
 * First own adventure game
 */

/**
 *
 * @author ergra0573
 */
public class FrmOwnAdventure extends javax.swing.JFrame {

    /**
     * Creates new form FrmOwnAdventure
     */
    public FrmOwnAdventure() {
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
        lblTitle = new javax.swing.JLabel();
        lblStory1 = new javax.swing.JLabel();
        lblStory2 = new javax.swing.JLabel();
        lblStory3 = new javax.swing.JLabel();
        lblStory4 = new javax.swing.JLabel();
        txtDesicion1 = new javax.swing.JTextArea();
        txtDesicion2 = new javax.swing.JTextArea();
        btnDecision1 = new javax.swing.JButton();
        btnDecision2 = new javax.swing.JButton();
        btnRestart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("TI Uni", 1, 18)); // NOI18N
        lblTitle.setText("Choose your own adventure");

        lblStory1.setText("Instructions: write the number of your desicion.");

        lblStory2.setText("You are a plane crash survivor trying to stay alive in an island.");

        lblStory3.setText("You have to try to survive until you get rescued.");

        lblStory4.setText("The first thing you do is...");

        txtDesicion1.setColumns(20);
        txtDesicion1.setRows(5);
        txtDesicion1.setText("1)\nlook around the\nplane for food and\ntools");

        txtDesicion2.setColumns(20);
        txtDesicion2.setRows(5);
        txtDesicion2.setText("2)\nGo swimming");

        btnDecision1.setText("1");
        btnDecision1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecision1ActionPerformed(evt);
            }
        });

        btnDecision2.setText("2");
        btnDecision2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecision2ActionPerformed(evt);
            }
        });

        btnRestart.setText("Restart");
        btnRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblStory4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblStory2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblStory1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblStory3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDesicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(btnDecision1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDesicion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnDecision2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)
                                        .addComponent(btnRestart)
                                        .addGap(8, 8, 8)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStory1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStory2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStory3)
                .addGap(12, 12, 12)
                .addComponent(lblStory4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesicion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDecision1)
                    .addComponent(btnDecision2)
                    .addComponent(btnRestart))
                .addContainerGap(17, Short.MAX_VALUE))
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

    private void btnDecision1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecision1ActionPerformed
        
        lblStory1.setText("You find enough food for a few weeks");
        lblStory2.setText("but you are too tired of searching.");
        lblStory3.setText(" You...");
        lblStory4.setText(" ");
        txtDesicion1.setText("Take a nap\n"+
                "in the plane");
        txtDesicion2.setText("Search for wood\n"+
                "to make a fire");
        btnDecision2.setVisible(false);
        btnRestart.setVisible(false);
        btnDecision1.setVisible(false);
        
    }//GEN-LAST:event_btnDecision1ActionPerformed

    private void btnDecision2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecision2ActionPerformed
        
        lblStory1.setText("You have a fun time until you realize that");
        lblStory2.setText("you are too far from the island and a shark eats you.");
        lblStory3.setText("Do you want to restart?");
        lblStory4.setText(" ");
        txtDesicion1.setText(" ");
        txtDesicion2.setText(" ");
        btnDecision1.setVisible(false);
        btnDecision2.setVisible(false);
        btnRestart.setVisible(true);
    }//GEN-LAST:event_btnDecision2ActionPerformed

    private void btnRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestartActionPerformed
        
        lblStory1.setText("Instructions: click the button corresponding to your decision.");
        lblStory2.setText("You are a plane crash survivor trying to stay alive in an island.");
        lblStory3.setText("You have to try to survive until you get rescued.");
        lblStory4.setText("The first thing you do is...");
        txtDesicion1.setText("1)\n" +
                    "look around the\n" +
                    "plane for food and\n" +
                    "tools");
        txtDesicion2.setText("2)\n" +
                    "Go swimming");
        btnDecision1.setVisible(true);
        btnDecision2.setVisible(true);
        btnRestart.setVisible(false);
    }//GEN-LAST:event_btnRestartActionPerformed

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
            java.util.logging.Logger.getLogger(FrmOwnAdventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmOwnAdventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmOwnAdventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmOwnAdventure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmOwnAdventure().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDecision1;
    private javax.swing.JButton btnDecision2;
    private javax.swing.JButton btnRestart;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblStory1;
    private javax.swing.JLabel lblStory2;
    private javax.swing.JLabel lblStory3;
    private javax.swing.JLabel lblStory4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtDesicion1;
    private javax.swing.JTextArea txtDesicion2;
    // End of variables declaration//GEN-END:variables
}
