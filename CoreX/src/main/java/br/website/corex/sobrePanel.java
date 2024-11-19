package br.website.corex;

public class sobrePanel extends javax.swing.JFrame {

    /**
     * Creates new form sobrePanel
     */
    public sobrePanel() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        nomeSite = new javax.swing.JLabel();
        desenvolvidoPor = new javax.swing.JLabel();
        integrante1 = new javax.swing.JLabel();
        integrante2 = new javax.swing.JLabel();
        integrante3 = new javax.swing.JLabel();
        integrante4 = new javax.swing.JLabel();
        integrante5 = new javax.swing.JLabel();
        versao1 = new javax.swing.JLabel();
        buttonOK = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CoreX - Sobre");

        nomeSite.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        nomeSite.setText("CoreX - Loja de Hardware");

        desenvolvidoPor.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        desenvolvidoPor.setText("Desenvolvido por:");

        integrante1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        integrante1.setText("Bruno Andrade dos Santos");

        integrante2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        integrante2.setText("Caio Fontes dos Santos Manhães");

        integrante3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        integrante3.setText("Gabriel Alves Duarte");

        integrante4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        integrante4.setText("Lucas de Santana dos Reis");

        integrante5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        integrante5.setText("Yasmin Cibreiros Chagas da Silva");

        versao1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        versao1.setText("Versão: 1.4");

        buttonOK.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        buttonOK.setText("OK");
        buttonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addComponent(nomeSite)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(integrante1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(integrante2)
                            .addComponent(desenvolvidoPor)
                            .addComponent(integrante5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(integrante4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(integrante3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(271, 271, 271)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(versao1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonOK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(nomeSite)
                .addGap(18, 18, 18)
                .addComponent(desenvolvidoPor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(integrante1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(integrante2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(integrante3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(integrante4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(integrante5)
                .addGap(27, 27, 27)
                .addComponent(versao1)
                .addGap(27, 27, 27)
                .addComponent(buttonOK, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {                                         
        dispose();
    }                                        

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
            java.util.logging.Logger.getLogger(sobrePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(sobrePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(sobrePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(sobrePanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new sobrePanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton buttonOK;
    private javax.swing.JLabel desenvolvidoPor;
    private javax.swing.JLabel integrante1;
    private javax.swing.JLabel integrante2;
    private javax.swing.JLabel integrante3;
    private javax.swing.JLabel integrante4;
    private javax.swing.JLabel integrante5;
    private javax.swing.JLabel nomeSite;
    private javax.swing.JLabel versao1;
    // End of variables declaration                   
}
