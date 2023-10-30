package view;

import javax.swing.JFrame;

/**
 *
 * @author Daniel Casvill
 */
public class ViewStats extends javax.swing.JFrame {

    /**
     * Creates new form ViewStats
     */
    public ViewStats() {
        initComponents();
        setSize(832,555);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void setJlHits(short hits)
    {
        this.jlHits.setText("Aciertos: "+hits);
        
    }
    
    public void setJlFailures(short failures)
    {        
        this.jlFailures.setText("Errores: "+failures);
    }
    
    public void setJlScore(int score)
    {
        jlScore.setText("Puntuación: "+score);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlScore = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jlFailures = new javax.swing.JLabel();
        jlHits = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(832, 555));
        setMinimumSize(new java.awt.Dimension(832, 555));
        setPreferredSize(new java.awt.Dimension(832, 555));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(832, 555));
        jPanel1.setMinimumSize(new java.awt.Dimension(832, 555));
        jPanel1.setPreferredSize(new java.awt.Dimension(832, 555));

        jlScore.setBackground(new java.awt.Color(255, 255, 255));
        jlScore.setFont(new java.awt.Font("Wide Latin", 0, 30)); // NOI18N
        jlScore.setForeground(new java.awt.Color(255, 255, 255));
        jlScore.setText("Puntuación:");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fin del Juego");

        jlFailures.setBackground(new java.awt.Color(255, 255, 255));
        jlFailures.setFont(new java.awt.Font("Wide Latin", 0, 30)); // NOI18N
        jlFailures.setForeground(new java.awt.Color(255, 255, 255));
        jlFailures.setText("Errores:");

        jlHits.setBackground(new java.awt.Color(255, 255, 255));
        jlHits.setFont(new java.awt.Font("Wide Latin", 0, 30)); // NOI18N
        jlHits.setForeground(new java.awt.Color(255, 255, 255));
        jlHits.setText("Aciertos:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlScore, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                    .addComponent(jlFailures, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlHits, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(168, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(122, 122, 122)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addComponent(jlHits, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlFailures, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlScore, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(40, 40, 40)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(442, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 832, 555);

        pack();
    }// </editor-fold>//GEN-END:initComponents



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlFailures;
    private javax.swing.JLabel jlHits;
    private javax.swing.JLabel jlScore;
    // End of variables declaration//GEN-END:variables
}
