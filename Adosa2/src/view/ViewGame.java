package view;

import java.awt.event.ActionListener;
import javax.swing.Icon;

/**
 *
 * @author andre
 */
public class ViewGame extends javax.swing.JFrame {

    /**
     * Creates new form ViewGame
     */
    public ViewGame() {
        initComponents();
        setSize(846, 592);
    }
    
    public void addBtnButtonListener(ActionListener listenControllers){
        jButton.addActionListener(listenControllers);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jlLive1 = new javax.swing.JLabel();
        jlLive2 = new javax.swing.JLabel();
        jlLive3 = new javax.swing.JLabel();
        jlScore = new javax.swing.JLabel();
        jButton = new javax.swing.JButton();
        jlBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(832, 555));
        setPreferredSize(new java.awt.Dimension(832, 555));
        setSize(new java.awt.Dimension(832, 555));
        getContentPane().setLayout(null);

        jLabel1.setPreferredSize(new java.awt.Dimension(120, 118));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(355, 140, 120, 118);

        jLabel2.setPreferredSize(new java.awt.Dimension(120, 118));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(355, 310, 120, 118);

        jLabel3.setPreferredSize(new java.awt.Dimension(120, 118));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(355, 430, 120, 118);

        jLabel4.setPreferredSize(new java.awt.Dimension(120, 118));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(540, 220, 120, 118);

        jLabel5.setPreferredSize(new java.awt.Dimension(120, 118));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(690, 220, 120, 118);

        jLabel6.setPreferredSize(new java.awt.Dimension(120, 118));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 220, 120, 118);

        jLabel7.setPreferredSize(new java.awt.Dimension(120, 118));
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 220, 120, 118);

        jLabel8.setPreferredSize(new java.awt.Dimension(120, 118));
        getContentPane().add(jLabel8);
        jLabel8.setBounds(355, 10, 120, 118);

        jlLive1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/live_green.png"))); // NOI18N
        getContentPane().add(jlLive1);
        jlLive1.setBounds(740, 10, 70, 70);

        jlLive2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/live_green.png"))); // NOI18N
        getContentPane().add(jlLive2);
        jlLive2.setBounds(650, 10, 70, 70);

        jlLive3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/live_green.png"))); // NOI18N
        getContentPane().add(jlLive3);
        jlLive3.setBounds(560, 10, 70, 70);

        jlScore.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jlScore.setForeground(new java.awt.Color(0, 0, 204));
        jlScore.setText("Puntuación:");
        getContentPane().add(jlScore);
        jlScore.setBounds(10, 10, 310, 30);

        jButton.setFont(new java.awt.Font("Segoe UI", 0, 1)); // NOI18N
        jButton.setText("button");
        jButton.setBorderPainted(false);
        jButton.setContentAreaFilled(false);
        jButton.setFocusPainted(false);
        getContentPane().add(jButton);
        jButton.setBounds(610, 390, 140, 140);

        jlBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/game.png"))); // NOI18N
        jlBackground.setAlignmentY(0.0F);
        jlBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(jlBackground);
        jlBackground.setBounds(0, 0, 832, 555);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jlBackground;
    private javax.swing.JLabel jlLive1;
    private javax.swing.JLabel jlLive2;
    private javax.swing.JLabel jlLive3;
    private javax.swing.JLabel jlScore;
    // End of variables declaration//GEN-END:variables

    public void setJlLive1Icon(String imagePath)
    {
        jlLive1.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagePath)));
    }
    
    public void setJlLive2Icon(String imagePath)
    {
        jlLive2.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagePath)));
    }
    
    public void setJlLive3Icon(String imagePath)
    {
        jlLive3.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagePath)));
    }

    public void setJLabel1Icon(String imagePath)
    {
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagePath)));
    }
    
    public void setJLabel2Icon(String imagePath)
    {
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagePath)));
    }
    
    public void setJLabel3Icon(String imagePath)
    {
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagePath)));
    }
    
    public void setJLabel4Icon(String imagePath)
    {
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagePath)));
    }
    
    public void setJLabel5Icon(String imagePath)
    {
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagePath)));
    }
    
    public void setJLabel6Icon(String imagePath)
    {
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagePath)));
    }
    
    public void setJLabel7Icon(String imagePath)
    {
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagePath)));
    }
    
    public void setJLabel8Icon(String imagePath)
    {
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource(imagePath)));
    }
    
}
