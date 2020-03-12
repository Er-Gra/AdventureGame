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
        txtUserInput = new javax.swing.JTextField();
        txtDesicion1 = new javax.swing.JTextArea();
        txtDesicion2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("TI Uni", 1, 18)); // NOI18N
        lblTitle.setText("Choose your own adventure");

        lblStory1.setText("Instructions: write the number of your desicion.");

        lblStory2.setText("You are a plane crash survivor trying to stay alive in an island.");

        lblStory3.setText("You have to try to survive until you get rescued.");

        lblStory4.setText("The first thing you do is...");

        txtUserInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserInputActionPerformed(evt);
            }
        });

        txtDesicion1.setColumns(20);
        txtDesicion1.setRows(5);
        txtDesicion1.setText("1)\nlook around the\nplane for food and\ntools");

        txtDesicion2.setColumns(20);
        txtDesicion2.setRows(5);
        txtDesicion2.setText("2)\nGo swimming");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(txtUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(136, 136, 136))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtDesicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtDesicion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblStory4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStory2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStory1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblStory3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap(32, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStory4)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDesicion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesicion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(txtUserInput, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void txtUserInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserInputActionPerformed
        int answer = Integer.parseInt(txtUserInput.getText());
        String answerYN = txtUserInput.getText();
        if (answer == 1)
        {
        lblStory1.setText("You find enough food for a few weeks");
        lblStory2.setText("but you are too tired of searching.");
        lblStory3.setText(" ");
        lblStory4.setText(" ");
        txtDesicion1.setText("an option");
        txtDesicion2.setText("another option");
        
        }
        else if (answer == 2)
        {
            lblStory1.setText("You have a fun time until you realize that");
            lblStory2.setText("you are too far from the island and a shark eats you.");
            lblStory3.setText("Go back to the start.");
            lblStory4.setText(" ");
            txtDesicion1.setText("1)\n" +
                        "look around the\n" +
                        "plane for food and\n" +
                        "tools");
            txtDesicion2.setText("2)\n" +
                        "Go swimming");
        } else      //invalid input: choice to go back or exit the program
        {
            lblStory1.setText("Invalid input");
            lblStory2.setText("Input must be one of the options");
            lblStory3.setText("would you like to restart?");
            lblStory4.setText("Write yes or no");
            txtDesicion1.setText(" ");
            txtDesicion2.setText(" ");
            if ((answerYN.equals ("Yes"))||(answerYN.equals("yes")))
            {
                lblStory1.setText("Instructions: write the number of your desicion.");
                lblStory2.setText("You are a plane crash survivor trying to stay alive in an island.");
                lblStory3.setText("You have to try to survive until you get rescued.");
                lblStory4.setText("The first thing you do is...");
                txtDesicion1.setText("1)\n" +
                            "look around the\n" +
                            "plane for food and\n" +
                            "tools");
                txtDesicion2.setText("2)\n" +
                            "Go swimming");
            } 
            else if ((answerYN.equals ("No"))||(answerYN.equals("no")))
            {
                System.out.println("Program closed");
            }
        }
    }//GEN-LAST:event_txtUserInputActionPerformed

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblStory1;
    private javax.swing.JLabel lblStory2;
    private javax.swing.JLabel lblStory3;
    private javax.swing.JLabel lblStory4;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextArea txtDesicion1;
    private javax.swing.JTextArea txtDesicion2;
    private javax.swing.JTextField txtUserInput;
    // End of variables declaration//GEN-END:variables
}
