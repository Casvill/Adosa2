/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author andre
 */
public class ViewInstructions extends javax.swing.JFrame {

    /**
     * Creates new form ViewInstructions
     */
    public ViewInstructions() {
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

        jbNext = new javax.swing.JButton();
        jbExitInstructions = new javax.swing.JButton();
        jlBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 832, 555));
        setMaximumSize(new java.awt.Dimension(832, 555));
        setMinimumSize(new java.awt.Dimension(832, 555));
        setPreferredSize(new java.awt.Dimension(832, 555));
        setSize(new java.awt.Dimension(832, 555));
        getContentPane().setLayout(null);

        jbNext.setBorderPainted(false);
        jbNext.setContentAreaFilled(false);
        jbNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNextActionPerformed(evt);
            }
        });
        getContentPane().add(jbNext);
        jbNext.setBounds(680, 170, 140, 70);

        jbExitInstructions.setBorderPainted(false);
        jbExitInstructions.setContentAreaFilled(false);
        getContentPane().add(jbExitInstructions);
        jbExitInstructions.setBounds(740, 20, 76, 70);

        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/instructions1.png"))); // NOI18N
        jlBackground.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jlBackground.setAlignmentY(0.0F);
        getContentPane().add(jlBackground);
        jlBackground.setBounds(0, 0, 832, 555);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbNextActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbExitInstructions;
    private javax.swing.JButton jbNext;
    private javax.swing.JLabel jlBackground;
    // End of variables declaration//GEN-END:variables
}
