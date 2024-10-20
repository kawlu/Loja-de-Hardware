package br.website.corex;

import Carrinho.formCarrinho;
import Catalogo.formCatalogo;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    private formCatalogo catalogo;
    private formCarrinho carrinho;

    public Main() {
        initComponents();
        setResizable(false);
        catalogo = new formCatalogo();
        carrinho = new formCarrinho();
        catalogo.construirListaProdutos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        textoTitulo = new javax.swing.JLabel();
        verCatalogo = new javax.swing.JButton();
        verCarrinho = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        barraMenuSobre = new javax.swing.JMenuBar();
        btnSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");

        textoTitulo.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        textoTitulo.setText("Escolha uma opção:");

        verCatalogo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        verCatalogo.setText("Ver catálogo");
        verCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCatalogoActionPerformed(evt);
            }
        });

        verCarrinho.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        verCarrinho.setText("Ver carrinho");
        verCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCarrinhoActionPerformed(evt);
            }

            private void verCarrinhoActionPerformed(ActionEvent evt) {
                carrinho.setVisible(true);
            }
        });

        sair.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        btnSobre.setText("Sobre");
        barraMenuSobre.add(btnSobre);

        setJMenuBar(barraMenuSobre);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(textoTitulo)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(verCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(textoTitulo)
                .addGap(18, 18, 18)
                .addComponent(verCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(verCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void verCatalogoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        formCatalogo.exibirProdutos(carrinho);
    }                                                                   

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {                                     
         JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema!");
        System.exit(0);
    }                                    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JMenuBar barraMenuSobre;
    private javax.swing.JMenu btnSobre;
    private javax.swing.JButton sair;
    private javax.swing.JLabel textoTitulo;
    private javax.swing.JButton verCarrinho;
    private javax.swing.JButton verCatalogo;
    // End of variables declaration                   
}
