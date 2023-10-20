/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author andre
 */
public class ViewLobby extends javax.swing.JFrame {

    /**
     * Creates new form ViewGame
     */
    public ViewLobby() {
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

        jPanel = new javax.swing.JPanel();
        jbWhatFor = new javax.swing.JButton();
        jbPlay = new javax.swing.JButton();
        jbHowToPlay = new javax.swing.JButton();
        jlLobby = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        jPanel.setMinimumSize(new java.awt.Dimension(832, 560));
        jPanel.setPreferredSize(new java.awt.Dimension(832, 555));
        jPanel.setLayout(null);

        jbWhatFor.setContentAreaFilled(false);
        jbWhatFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbWhatForActionPerformed(evt);
            }
        });
        jPanel.add(jbWhatFor);
        jbWhatFor.setBounds(580, 460, 250, 100);

        jbPlay.setContentAreaFilled(false);
        jbPlay.setLabel("");
        jbPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlayActionPerformed(evt);
            }
        });
        jPanel.add(jbPlay);
        jbPlay.setBounds(250, 450, 300, 100);

        jbHowToPlay.setContentAreaFilled(false);
        jbHowToPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbHowToPlayActionPerformed(evt);
            }
        });
        jPanel.add(jbHowToPlay);
        jbHowToPlay.setBounds(30, 450, 160, 110);

        jlLobby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lobby.png"))); // NOI18N
        jPanel.add(jlLobby);
        jlLobby.setBounds(0, 0, 832, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbWhatForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbWhatForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbWhatForActionPerformed

    private void jbPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPlayActionPerformed

    private void jbHowToPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbHowToPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbHowToPlayActionPerformed

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
            java.util.logging.Logger.getLogger(ViewLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewLobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewLobby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel;
    private javax.swing.JButton jbHowToPlay;
    private javax.swing.JButton jbPlay;
    private javax.swing.JButton jbWhatFor;
    private javax.swing.JLabel jlLobby;
    // End of variables declaration//GEN-END:variables
}
