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
     * Creates new form ViewGame1
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

        jbInstructions = new javax.swing.JButton();
        jbPlay = new javax.swing.JButton();
        jbWhaItIsFor = new javax.swing.JButton();
        JLbackgroundLobby = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(832, 555));
        getContentPane().setLayout(null);

        jbInstructions.setBorder(null);
        jbInstructions.setBorderPainted(false);
        jbInstructions.setContentAreaFilled(false);
        jbInstructions.setFocusable(false);
        jbInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInstructionsActionPerformed(evt);
            }
        });
        getContentPane().add(jbInstructions);
        jbInstructions.setBounds(20, 380, 180, 130);

        jbPlay.setBorder(null);
        jbPlay.setBorderPainted(false);
        jbPlay.setContentAreaFilled(false);
        jbPlay.setFocusable(false);
        jbPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPlayActionPerformed(evt);
            }
        });
        getContentPane().add(jbPlay);
        jbPlay.setBounds(240, 380, 320, 130);

        jbWhaItIsFor.setBorder(null);
        jbWhaItIsFor.setBorderPainted(false);
        jbWhaItIsFor.setContentAreaFilled(false);
        jbWhaItIsFor.setFocusable(false);
        jbWhaItIsFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbWhaItIsForActionPerformed(evt);
            }
        });
        getContentPane().add(jbWhaItIsFor);
        jbWhaItIsFor.setBounds(560, 390, 270, 120);

        JLbackgroundLobby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lobby.png"))); // NOI18N
        getContentPane().add(JLbackgroundLobby);
        JLbackgroundLobby.setBounds(0, 0, 832, 546);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPlayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPlayActionPerformed

    private void jbWhaItIsForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbWhaItIsForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbWhaItIsForActionPerformed

    private void jbInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInstructionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbInstructionsActionPerformed

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLbackgroundLobby;
    private javax.swing.JButton jbInstructions;
    private javax.swing.JButton jbPlay;
    private javax.swing.JButton jbWhaItIsFor;
    // End of variables declaration//GEN-END:variables
}
