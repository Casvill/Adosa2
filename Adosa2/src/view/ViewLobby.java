/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.event.ActionListener;

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
        setSize(846, 583);
    }
    
    public void addBtnInstructionsListener(ActionListener listenControllers){
        jbInstructions.addActionListener(listenControllers);
    }
    
    public void addBtnPlayListener(ActionListener listenControllers){
        jbPlay.addActionListener(listenControllers);
    }
    
    public void addBtnWhatItIsForListener(ActionListener listenControllers){
        jbWhaItIsFor.addActionListener(listenControllers);
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

        jbInstructions.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        jbInstructions.setForeground(new java.awt.Color(30, 30, 30));
        jbInstructions.setText("instructions");
        jbInstructions.setBorder(null);
        jbInstructions.setBorderPainted(false);
        jbInstructions.setContentAreaFilled(false);
        jbInstructions.setFocusable(false);
        getContentPane().add(jbInstructions);
        jbInstructions.setBounds(20, 380, 180, 130);

        jbPlay.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        jbPlay.setText("play");
        jbPlay.setBorder(null);
        jbPlay.setBorderPainted(false);
        jbPlay.setContentAreaFilled(false);
        jbPlay.setFocusable(false);
        getContentPane().add(jbPlay);
        jbPlay.setBounds(240, 380, 310, 130);

        jbWhaItIsFor.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        jbWhaItIsFor.setText("whatItIsFor");
        jbWhaItIsFor.setBorder(null);
        jbWhaItIsFor.setBorderPainted(false);
        jbWhaItIsFor.setContentAreaFilled(false);
        jbWhaItIsFor.setFocusable(false);
        getContentPane().add(jbWhaItIsFor);
        jbWhaItIsFor.setBounds(570, 390, 250, 120);

        JLbackgroundLobby.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lobby.png"))); // NOI18N
        getContentPane().add(JLbackgroundLobby);
        JLbackgroundLobby.setBounds(0, 0, 832, 546);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
