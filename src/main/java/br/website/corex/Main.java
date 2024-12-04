package br.website.corex;

import Usuario.formLogin;
import Usuario.formCadastrar;
import Compra.formCarrinho;
import Catalogo.formCatalogo;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    
    private final formCatalogo catalogo;
    private final formCarrinho carrinho;
    private final formSobre sobre;  
    private final formLogin login;
    private final formCadastrar cadastrar;
    
    public Main() {
        initComponents();
        setResizable(false);
        catalogo = new formCatalogo();
        carrinho = new formCarrinho();
        sobre = new formSobre();
        login = new formLogin();
        cadastrar = new formCadastrar();
        gerarProdutos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnCatalogo = new javax.swing.JButton();
        btnCarrinho = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblTitulo1 = new javax.swing.JLabel();
        logoMain = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        btnConta = new javax.swing.JMenu();
        btnLogin = new javax.swing.JMenu();
        btnCadastrar = new javax.swing.JMenu();
        btnLogoff = new javax.swing.JMenu();
        btnSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(3, 54, 73));

        lblTitulo.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(232, 221, 203));
        lblTitulo.setText("CoreX");

        btnCatalogo.setBackground(new java.awt.Color(3, 101, 100));
        btnCatalogo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnCatalogo.setForeground(new java.awt.Color(232, 221, 203));
        btnCatalogo.setText("Catálogo");
        btnCatalogo.setFocusable(false);
        btnCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCatalogoMouseClicked(evt);
            }
        });

        btnCarrinho.setBackground(new java.awt.Color(3, 101, 100));
        btnCarrinho.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnCarrinho.setForeground(new java.awt.Color(232, 221, 203));
        btnCarrinho.setText("Carrinho");
        btnCarrinho.setFocusable(false);
        btnCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCarrinhoMouseClicked(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(233, 49, 53));
        btnSair.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setFocusable(false);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lblTitulo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTitulo1.setForeground(new java.awt.Color(232, 221, 203));
        lblTitulo1.setText("Versão: 7.2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(logoMain, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(lblTitulo1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCatalogo)
                .addGap(18, 18, 18)
                .addComponent(btnCarrinho)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSair)
                .addGap(69, 69, 69))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(logoMain, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jMenuBar2.setBackground(new java.awt.Color(232, 221, 203));
        jMenuBar2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        btnConta.setBackground(new java.awt.Color(232, 221, 203));
        btnConta.setForeground(new java.awt.Color(3, 54, 73));
        btnConta.setText("Conta");
        btnConta.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        btnLogin.setBackground(new java.awt.Color(232, 221, 203));
        btnLogin.setForeground(new java.awt.Color(3, 54, 73));
        btnLogin.setText("Login");
        btnLogin.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        btnConta.add(btnLogin);

        btnCadastrar.setBackground(new java.awt.Color(232, 221, 203));
        btnCadastrar.setForeground(new java.awt.Color(3, 54, 73));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        btnConta.add(btnCadastrar);

        btnLogoff.setBackground(new java.awt.Color(232, 221, 203));
        btnLogoff.setForeground(new java.awt.Color(3, 54, 73));
        btnLogoff.setText("Logoff");
        btnLogoff.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnLogoff.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoffMouseClicked(evt);
            }
        });
        btnConta.add(btnLogoff);

        jMenuBar2.add(btnConta);

        btnSobre.setBackground(new java.awt.Color(232, 221, 203));
        btnSobre.setForeground(new java.awt.Color(3, 54, 73));
        btnSobre.setText("Sobre");
        btnSobre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSobreMouseClicked(evt);
            }
        });
        jMenuBar2.add(btnSobre);

        setJMenuBar(jMenuBar2);

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

    public void gerarProdutos(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Produtos.txt"));
        }catch(Exception e){
            catalogo.construirListaProdutos();
            catalogo.construirListaProdutosTxt();
        }
    }
    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSairActionPerformed

    private void btnSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSobreMouseClicked
        sobre.setVisible(true);
    }//GEN-LAST:event_btnSobreMouseClicked

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        if (Usuario.Cliente.login_verificado == null || Usuario.Cliente.login_verificado == false){
            login.setVisible(true);
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCatalogoMouseClicked
        catalogo.exibirProdutos(carrinho);
        catalogo.setLogin(login, cadastrar);
    }//GEN-LAST:event_btnCatalogoMouseClicked

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        if (Usuario.Cliente.login_verificado == null || Usuario.Cliente.login_verificado == false){
            cadastrar.setVisible(true);
        }
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void btnCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCarrinhoMouseClicked
        carrinho.setVisible(true);
        carrinho.setImagem();
    }//GEN-LAST:event_btnCarrinhoMouseClicked

    private void btnLogoffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoffMouseClicked
                if (Usuario.Cliente.login_verificado) {
            Usuario.Cliente.login_verificado = false;
            JOptionPane.showMessageDialog(null, "Você foi deslogado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Você já não está logado.");
        }
    }//GEN-LAST:event_btnLogoffMouseClicked
    /**
     * @param args the command line arguments
     */
    
    public void setImagem(){
        ImageIcon imageIcon = new ImageIcon("CoreX.png");
        //Image image = imageIcon.getImage();
        //Image newImg = image.getScaledInstance(349, 119, java.awt.Image.SCALE_SMOOTH);
        //imageIcon = new ImageIcon(newImg);
        logoMain.setIcon(imageIcon);
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Main main = new Main();
                main.setImagem();
                main.gerarProdutos();
                main.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCadastrar;
    private javax.swing.JButton btnCarrinho;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JMenu btnConta;
    private javax.swing.JMenu btnLogin;
    private javax.swing.JMenu btnLogoff;
    private javax.swing.JButton btnSair;
    private javax.swing.JMenu btnSobre;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblTitulo1;
    private javax.swing.JLabel logoMain;
    // End of variables declaration//GEN-END:variables
}
