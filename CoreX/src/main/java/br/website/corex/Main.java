package br.website.corex;

import Usuario.Cliente;
import Usuario.Frm_Login;
import Usuario.Frm_Cadastrar;
import carrinho.formCarrinho;
import Catalogo.formCatalogo;
import Catalogo.formExibirProduto;
import javax.swing.JMenu;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    private formCatalogo catalogo;
    private formCarrinho carrinho;
    private sobrePanel sobre;  
    private Frm_Login login;
    private Frm_Cadastrar cadastrar;
    

    public Main() {
        initComponents();
        setResizable(false);
        catalogo = new formCatalogo();
        carrinho = new formCarrinho();
        sobre = new sobrePanel();
        login = new Frm_Login();  // Passa referência para controle após login
        cadastrar = new Frm_Cadastrar();
        catalogo.construirListaProdutos();
        catalogo.construirListaProdutosTxt();
         // Configura menus baseados no estado inicial de login
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {
        textoTitulo = new javax.swing.JLabel();
        verCatalogo = new javax.swing.JButton();
        verCarrinho = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        btnSobre = new javax.swing.JMenu();
        btnLogin = new javax.swing.JMenu();
        btnCadastrar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CoreX - Menu");

        textoTitulo.setFont(new java.awt.Font("Arial", 1, 36)); 
        textoTitulo.setText("Escolha uma opção:");

        verCatalogo.setFont(new java.awt.Font("Arial", 0, 18)); 
        verCatalogo.setText("Ver catálogo");
        verCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCatalogoActionPerformed(evt);
            }
        });

        verCarrinho.setFont(new java.awt.Font("Arial", 0, 18)); 
        verCarrinho.setText("Ver carrinho");
        verCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCarrinhoActionPerformed(evt);
            }
        });

        sair.setFont(new java.awt.Font("Arial", 0, 18)); 
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });

        btnSobre.setText("Sobre");
        btnSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSobreMouseClicked(evt);
            }
        });
        barraMenu.add(btnSobre);

        btnLogin.setText("Login");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });
        barraMenu.add(btnLogin);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastrarMouseClicked(evt);
            }
        });
        barraMenu.add(btnCadastrar);

        setJMenuBar(barraMenu);

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
    }

    private void verCatalogoActionPerformed(java.awt.event.ActionEvent evt) {
        catalogo.exibirProdutos(carrinho);
    }

    private void verCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {
        carrinho.setVisible(true);
    }

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {
        if (Usuario.Cliente.login_verificado == true){
            Usuario.Cliente.login_verificado = false;
            JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema!");
        }
    }

    private void btnSobreMouseClicked(java.awt.event.MouseEvent evt) {
        sobre.setVisible(true);
    }

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {
        if (Usuario.Cliente.login_verificado == null || Usuario.Cliente.login_verificado == false){
            login.setVisible(true);
        }
        
        
    }

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {
         if (Usuario.Cliente.login_verificado == null || Usuario.Cliente.login_verificado == false){
            cadastrar.setVisible(true);
        }
        
    }


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
                
            }
        });
    }

    // Variables declaration
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu btnSobre;
    private javax.swing.JMenu btnLogin;
    private javax.swing.JMenu btnCadastrar;
    private javax.swing.JButton sair;
    private javax.swing.JLabel textoTitulo;
    private javax.swing.JButton verCarrinho;
    private javax.swing.JButton verCatalogo;
    // End of variables declaration
}
