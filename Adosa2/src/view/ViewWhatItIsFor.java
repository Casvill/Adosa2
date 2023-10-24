package view;

import controller.ControllerWhatItIsFor;
import java.awt.event.ActionListener;

/**
 *
 * @author andre
 */
public class ViewWhatItIsFor extends javax.swing.JFrame {

  
    public ViewWhatItIsFor() {
        initComponents();
    }

    public void addBtnExitWhatItIsForListener(ActionListener listenControllers){
        jButtonExitWhatItIsFor.addActionListener(listenControllers);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonExitWhatItIsFor = new javax.swing.JButton();
        jlBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButtonExitWhatItIsFor.setContentAreaFilled(false);
        jButtonExitWhatItIsFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitWhatItIsForActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExitWhatItIsFor);
        jButtonExitWhatItIsFor.setBounds(750, 20, 72, 60);

        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/what_it_is_for.png"))); // NOI18N
        getContentPane().add(jlBackground);
        jlBackground.setBounds(0, 0, 832, 555);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExitWhatItIsForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitWhatItIsForActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonExitWhatItIsForActionPerformed

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
            java.util.logging.Logger.getLogger(ViewWhatItIsFor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewWhatItIsFor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewWhatItIsFor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewWhatItIsFor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewWhatItIsFor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExitWhatItIsFor;
    private javax.swing.JLabel jlBackground;
    // End of variables declaration//GEN-END:variables

    public void addButtonExitWhatItIsForListener(ActionListener listenControllers){
      jButtonExitWhatItIsFor.addActionListener(listenControllers);
    }
}
