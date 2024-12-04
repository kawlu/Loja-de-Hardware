package Compra;

import static Catalogo.formCatalogo.cadastrar;
import br.website.corex.formSobre;
import Usuario.Cliente;
import static Usuario.Cliente.login_verificado;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class formIdentificacao extends javax.swing.JFrame {
    private formSobre sobre;
    public static formCarrinho carrinho;
    public formIdentificacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblTitulo1 = new javax.swing.JLabel();
        txtEmailCPF = new javax.swing.JTextField();
        lblEmailCPF = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        pswSenha = new javax.swing.JPasswordField();
        btnConfirmar = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        fotoEtapas = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 54, 73));

        lblTitulo2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo2.setForeground(new java.awt.Color(232, 221, 203));
        lblTitulo2.setText("Já possuo conta");

        jSeparator1.setForeground(new java.awt.Color(232, 221, 203));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblTitulo1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(232, 221, 203));
        lblTitulo1.setText("Não possuo conta");

        txtEmailCPF.setBackground(new java.awt.Color(232, 221, 203));
        txtEmailCPF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtEmailCPF.setForeground(new java.awt.Color(0, 0, 0));
        txtEmailCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailCPFActionPerformed(evt);
            }
        });

        lblEmailCPF.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblEmailCPF.setForeground(new java.awt.Color(232, 221, 203));
        lblEmailCPF.setText("Email ou CPF");

        lblSenha.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(232, 221, 203));
        lblSenha.setText("Senha");

        pswSenha.setBackground(new java.awt.Color(232, 221, 203));
        pswSenha.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        pswSenha.setForeground(new java.awt.Color(0, 0, 0));
        pswSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pswSenhaActionPerformed(evt);
            }
        });

        btnConfirmar.setBackground(new java.awt.Color(51, 175, 51));
        btnConfirmar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnConfirmar.setForeground(new java.awt.Color(255, 255, 255));
        btnConfirmar.setText("Continuar");
        btnConfirmar.setFocusable(false);
        btnConfirmar.setName("btnConfirmar"); // NOI18N
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCadastro.setBackground(new java.awt.Color(205, 179, 128));
        btnCadastro.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCadastro.setForeground(new java.awt.Color(3, 54, 73));
        btnCadastro.setText("Cadastrar-se");
        btnCadastro.setFocusable(false);
        btnCadastro.setName("btnConfirmar"); // NOI18N
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(233, 49, 53));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.setFocusable(false);
        btnCancelar.setName("btnConfirmar"); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(27, 27, 27)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTitulo1)
                                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitulo2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblEmailCPF)
                                .addComponent(txtEmailCPF)
                                .addComponent(lblSenha)
                                .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(fotoEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(fotoEtapas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblTitulo2)
                            .addGap(28, 28, 28)
                            .addComponent(lblEmailCPF)
                            .addGap(0, 0, 0)
                            .addComponent(txtEmailCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblSenha)
                            .addGap(0, 0, 0)
                            .addComponent(pswSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo1)
                        .addGap(52, 52, 52)
                        .addComponent(btnCadastro)
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnConfirmar))))
                .addGap(42, 42, 42))
        );

        jMenuBar1.setBackground(new java.awt.Color(232, 221, 203));

        btnSobre.setBackground(new java.awt.Color(232, 221, 203));
        btnSobre.setForeground(new java.awt.Color(3, 54, 73));
        btnSobre.setText("Sobre");
        btnSobre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSobreMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnSobre);

        setJMenuBar(jMenuBar1);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailCPFActionPerformed

    private void pswSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pswSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pswSenhaActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        String campo1 = txtEmailCPF.getText();
        String campo2 = new String(pswSenha.getPassword());
        
        if(campo1.isEmpty() || campo2.isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else if(!campo1.isEmpty() || !campo2.isEmpty()){
        Cliente.consultarClientes(campo1, campo2);
        
            if(login_verificado){
                formEntrega formEntrega = new formEntrega();
                formEntrega.setImagem();
                formEntrega.setEndereco();
                formEntrega.carrinho = carrinho;
                formEntrega.setVisible(true);
                dispose();
            }
            else{
                JOptionPane.showMessageDialog(this, "Conta não encontrada!", "Atenção", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSobreMouseClicked
        sobre.setVisible(true);
    }//GEN-LAST:event_btnSobreMouseClicked

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        cadastrar.setVisible(true);
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void setImagem(){
        ImageIcon imageIcon = new ImageIcon("etapas_identificacao.png");
        Image image = imageIcon.getImage();
        Image newImg = image.getScaledInstance(440, 150, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newImg);
        fotoEtapas.setIcon(imageIcon);
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
            java.util.logging.Logger.getLogger(formIdentificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formIdentificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formIdentificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formIdentificacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                formIdentificacao formIdentificacao = new formIdentificacao();
                formIdentificacao.setImagem();
                formIdentificacao.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JMenu btnSobre;
    private javax.swing.JLabel fotoEtapas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblEmailCPF;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel lblTitulo2;
    private javax.swing.JPasswordField pswSenha;
    private javax.swing.JTextField txtEmailCPF;
    // End of variables declaration//GEN-END:variables
}
