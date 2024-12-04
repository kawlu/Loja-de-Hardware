package Catalogo;

import Compra.formEntrega; 
import Usuario.formCadastrar;
import Usuario.formLogin;
import br.website.corex.formSobre;
import Compra.formCarrinho;
import Compra.formIdentificacao;
import java.awt.Color;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class formExibirProduto extends javax.swing.JFrame {

    public formExibirProduto() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PainelExterior = new javax.swing.JPanel();
        PainelInterno = new javax.swing.JPanel();
        NomeLabel = new javax.swing.JLabel();
        PrecoLabel = new javax.swing.JLabel();
        QuantidadeLabel = new javax.swing.JLabel();
        CompraBtn = new javax.swing.JButton();
        VoltarBtn = new javax.swing.JButton();
        DescScrollPane = new javax.swing.JScrollPane();
        DescText = new javax.swing.JTextArea();
        AddCarrinhoBtn = new javax.swing.JButton();
        VendidoLbl = new javax.swing.JLabel();
        EntregueLbl = new javax.swing.JLabel();
        Foto = new javax.swing.JLabel();
        Foto1 = new javax.swing.JLabel();
        Foto2 = new javax.swing.JLabel();
        ouLbl = new javax.swing.JLabel();
        PrecoPixLabel = new javax.swing.JLabel();
        pixLbl = new javax.swing.JLabel();
        descontoPix = new javax.swing.JLabel();
        addLbl = new javax.swing.JLabel();
        carrinhoBtn = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        btnConta = new javax.swing.JMenu();
        btnLogin = new javax.swing.JMenu();
        btnCadastrar = new javax.swing.JMenu();
        btnLogoff = new javax.swing.JMenu();
        SobreBtn = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(854, 550));
        setPreferredSize(new java.awt.Dimension(854, 480));
        setResizable(false);

        PainelExterior.setBackground(new java.awt.Color(3, 54, 73));

        PainelInterno.setBackground(new java.awt.Color(232, 221, 203));

        NomeLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        NomeLabel.setForeground(new java.awt.Color(3, 54, 73));
        NomeLabel.setText("Nome:");

        PrecoLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        PrecoLabel.setForeground(new java.awt.Color(3, 54, 73));
        PrecoLabel.setText("R$ X em 10x de X/10 sem juros ");

        QuantidadeLabel.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        QuantidadeLabel.setForeground(new java.awt.Color(3, 54, 73));
        QuantidadeLabel.setText("X Restantes no estoque");

        CompraBtn.setBackground(new java.awt.Color(51, 175, 51));
        CompraBtn.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        CompraBtn.setForeground(new java.awt.Color(3, 54, 73));
        CompraBtn.setText("Comprar Agora");
        CompraBtn.setFocusable(false);
        CompraBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompraBtnActionPerformed(evt);
            }
        });

        VoltarBtn.setBackground(new java.awt.Color(3, 54, 73));
        VoltarBtn.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        VoltarBtn.setForeground(new java.awt.Color(204, 204, 204));
        VoltarBtn.setText("Voltar");
        VoltarBtn.setFocusable(false);
        VoltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBtnActionPerformed(evt);
            }
        });

        DescText.setEditable(false);
        DescText.setColumns(20);
        DescText.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        DescText.setForeground(new java.awt.Color(3, 54, 73));
        DescText.setLineWrap(true);
        DescText.setRows(5);
        DescText.setWrapStyleWord(true);
        DescText.setFocusable(false);
        DescScrollPane.setViewportView(DescText);

        AddCarrinhoBtn.setBackground(new java.awt.Color(51, 175, 51));
        AddCarrinhoBtn.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        AddCarrinhoBtn.setForeground(new java.awt.Color(3, 54, 73));
        AddCarrinhoBtn.setText("Adicionar ao carrinho");
        AddCarrinhoBtn.setFocusable(false);
        AddCarrinhoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddCarrinhoBtnActionPerformed(evt);
            }
        });

        VendidoLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        VendidoLbl.setForeground(new java.awt.Color(3, 54, 73));
        VendidoLbl.setText("Vendida por CoreX");

        EntregueLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        EntregueLbl.setForeground(new java.awt.Color(3, 54, 73));
        EntregueLbl.setText("Entregue por CoreX");

        ouLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ouLbl.setForeground(new java.awt.Color(3, 54, 73));
        ouLbl.setText("ou");

        PrecoPixLabel.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        PrecoPixLabel.setForeground(new java.awt.Color(3, 54, 73));
        PrecoPixLabel.setText("R$ X .0.9");

        pixLbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pixLbl.setForeground(new java.awt.Color(3, 54, 73));
        pixLbl.setText("no pix");

        descontoPix.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        descontoPix.setForeground(new java.awt.Color(3, 101, 100));
        descontoPix.setText("(10% de desconto no pix)");

        addLbl.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        addLbl.setForeground(new java.awt.Color(51, 175, 51));
        addLbl.setText("Produto adicionado ao carrinho.");

        carrinhoBtn.setBackground(new java.awt.Color(3, 54, 73));
        carrinhoBtn.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        carrinhoBtn.setForeground(new java.awt.Color(204, 204, 204));
        carrinhoBtn.setLabel("Carrinho");
        carrinhoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carrinhoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelInternoLayout = new javax.swing.GroupLayout(PainelInterno);
        PainelInterno.setLayout(PainelInternoLayout);
        PainelInternoLayout.setHorizontalGroup(
            PainelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelInternoLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(PainelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelInternoLayout.createSequentialGroup()
                        .addComponent(NomeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(30, Short.MAX_VALUE))
                    .addGroup(PainelInternoLayout.createSequentialGroup()
                        .addGroup(PainelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(PainelInternoLayout.createSequentialGroup()
                                .addGroup(PainelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Foto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DescScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 24, Short.MAX_VALUE)
                        .addGroup(PainelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PainelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(QuantidadeLabel)
                                .addComponent(VendidoLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EntregueLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(AddCarrinhoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PainelInternoLayout.createSequentialGroup()
                                    .addComponent(ouLbl)
                                    .addGap(18, 18, 18)
                                    .addComponent(PrecoPixLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(pixLbl))
                                .addComponent(descontoPix)
                                .addComponent(PrecoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                                .addComponent(CompraBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PainelInternoLayout.createSequentialGroup()
                                    .addComponent(VoltarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(carrinhoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(addLbl))
                        .addGap(16, 16, 16))))
        );
        PainelInternoLayout.setVerticalGroup(
            PainelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelInternoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PainelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PainelInternoLayout.createSequentialGroup()
                        .addComponent(Foto1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(Foto2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PainelInternoLayout.createSequentialGroup()
                        .addComponent(VendidoLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EntregueLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(QuantidadeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PrecoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PainelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ouLbl)
                            .addComponent(PrecoPixLabel)
                            .addComponent(pixLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descontoPix)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addLbl))
                    .addComponent(Foto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PainelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelInternoLayout.createSequentialGroup()
                        .addComponent(CompraBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AddCarrinhoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PainelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(VoltarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(carrinhoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(DescScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout PainelExteriorLayout = new javax.swing.GroupLayout(PainelExterior);
        PainelExterior.setLayout(PainelExteriorLayout);
        PainelExteriorLayout.setHorizontalGroup(
            PainelExteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelExteriorLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(PainelInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        PainelExteriorLayout.setVerticalGroup(
            PainelExteriorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelExteriorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(PainelInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        MenuBar.setBackground(new java.awt.Color(232, 221, 203));

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

        MenuBar.add(btnConta);

        SobreBtn.setBackground(new java.awt.Color(232, 221, 203));
        SobreBtn.setForeground(new java.awt.Color(3, 54, 73));
        SobreBtn.setText("Sobre");
        SobreBtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        SobreBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SobreBtnMouseClicked(evt);
            }
        });
        MenuBar.add(SobreBtn);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PainelExterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PainelExterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CompraBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompraBtnActionPerformed
        addProdutoCarrinho();
        if(Usuario.Cliente.login_verificado == null || Usuario.Cliente.login_verificado == false){
            formIdentificacao formIdentificacao = new formIdentificacao();
            formIdentificacao.setImagem();
            formIdentificacao.carrinho = carrinho;
            formIdentificacao.setVisible(true);
        }
        else{
            dispose();
            formEntrega entrega = new formEntrega();
            entrega.setImagem();
            entrega.setEndereco();
            entrega.carrinho = carrinho;
            entrega.setVisible(true); 
        }
    }//GEN-LAST:event_CompraBtnActionPerformed

    private void VoltarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarBtnActionPerformed
        formCatalogo.exibirProdutos(carrinho);
        dispose();
    }//GEN-LAST:event_VoltarBtnActionPerformed

    private void SobreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreBtnMouseClicked
        sobre.setVisible(true);
    }//GEN-LAST:event_SobreBtnMouseClicked

    private void AddCarrinhoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddCarrinhoBtnActionPerformed
        addProdutoCarrinho();
    }//GEN-LAST:event_AddCarrinhoBtnActionPerformed

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        if (Usuario.Cliente.login_verificado == null || Usuario.Cliente.login_verificado == false){
            login.setVisible(true);
        }
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
        if (Usuario.Cliente.login_verificado == null || Usuario.Cliente.login_verificado == false){
            cadastrar.setVisible(true);
        }
    }//GEN-LAST:event_btnCadastrarMouseClicked

    private void btnLogoffMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoffMouseClicked
        if (Usuario.Cliente.login_verificado) {
            Usuario.Cliente.login_verificado = false;
            JOptionPane.showMessageDialog(null, "Você foi deslogado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Você já não está logado.");
        }
    }//GEN-LAST:event_btnLogoffMouseClicked

    private void carrinhoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carrinhoBtnActionPerformed
        carrinho.setVisible(true);
        carrinho.setImagem();
        dispose();
    }//GEN-LAST:event_carrinhoBtnActionPerformed

    public void addProdutoCarrinho(){
        if(!formCatalogo.produtoJaNoCarrinho(indexProduto, carrinho)){
            produto.setQuantidade(0);
            if(temEstoqueRestante(indexProduto)){
                produto.setQuantidade(produto.getQuantidade() + 1);
                Produto item = new Produto(produto.getNome(), produto.getDescricao(), produto.getPreco(), 
                                produto.getEstoque(), 1, produto.getValorUnitario(), produto.getImagem());
                carrinho.adicionarItem(item); // Adiciona o item ao carrinho
                addLbl.setVisible(true);
                addLbl.setText("Produto adicionado ao carrinho.");
                addLbl.setForeground(Color.decode("#33AF33"));
            }
            else{
                addLbl.setVisible(true);
                addLbl.setText("Produto indisponível. Tente novamente mais tarde.");
                addLbl.setForeground(Color.RED);
            }
        }
        else{
            if(temEstoqueRestante(indexProduto)){
                System.out.println(produto.getQuantidade());
                produto.setQuantidade(produto.getQuantidade() + 1);
                Produto prodAtual = new Produto(produto.getNome(), produto.getDescricao(), produto.getPreco(), 
                                       produto.getEstoque(), 1, produto.getValorUnitario(), produto.getImagem());;
                List<Produto> itensCarrinho = carrinho.getItensCarrinho();
                for(int i = 0; i < itensCarrinho.size(); i++){
                    if(itensCarrinho.get(i).getNome().equals(prodAtual.getNome())){
                        itensCarrinho.get(i).setQuantidade(itensCarrinho.get(i).getQuantidade() + 1);
                        carrinho.atualizarTabela();
                        addLbl.setVisible(true);
                        addLbl.setText("Produto adicionado novamente ao carrinho.");
                        addLbl.setForeground(Color.decode("#33AF33"));
                    }
                }
            }
            else{
                System.out.println(produto.getQuantidade());
                addLbl.setVisible(true);
                addLbl.setText("Produto indisponível. Tente novamente mais tarde.");
                addLbl.setForeground(Color.RED);
            }
        }
    }
    
    public boolean temEstoqueRestante(int index){
        int estoqueRestante = formCatalogo.getProdutoEspecifico(index).getEstoque();
        
        List<Produto> itensCarrinho = carrinho.getItensCarrinho();
        for(int i = 0; i < itensCarrinho.size(); i++){
            if(itensCarrinho.get(i).getNome().equals(formCatalogo.getProdutoEspecifico(index).getNome())){
                if(itensCarrinho.get(i).getQuantidade() >= estoqueRestante){
                    return false;
                }
            }
        }
        return true;
    }
    
    private static List<Produto> produtos = new ArrayList<>();
    private static Produto produto;
    private static formCarrinho carrinho;
    private static int indexProduto;
    public static formSobre sobre = new formSobre();
    public static formLogin login;
    public static formCadastrar cadastrar;
    
    public void setListaProdutos(int codigo, List<Produto> listaProdutos){
        codigo++;
        produtos = listaProdutos;
        produto = formCatalogo.getProdutoEspecifico(codigo);
        ImageIcon imageIcon = new ImageIcon(produto.getImagem());
        Image image = imageIcon.getImage();
        Image newImg = image.getScaledInstance(220, 220, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newImg);
        
        ImageIcon imageIconSmall = new ImageIcon(produto.getImagem());
        Image imageSmall = imageIconSmall.getImage();
        Image newImgSmall = imageSmall.getScaledInstance(90, 90, java.awt.Image.SCALE_SMOOTH);
        imageIconSmall = new ImageIcon(newImgSmall);
        
        Foto.setIcon(imageIcon);
        Foto1.setIcon(imageIconSmall);
        Foto2.setIcon(imageIconSmall);
        indexProduto = codigo;
    }
    
    public void setCarrinho(formCarrinho carrinhoNovo){
        carrinho = carrinhoNovo;
    }
    
    public void exibirProduto() {
        NomeLabel.setText(produto.getNome());
        DescText.setText("Descrição: " + produto.getDescricao());
        PrecoLabel.setText("R$ " + produto.getPreco() + " em 10x de " + produto.getPreco()/10 + " sem juros");
        PrecoPixLabel.setText("R$ " + String.format("%.2f", (produto.getPreco() * 0.9)));
        QuantidadeLabel.setText(produto.getEstoque() + " Restantes no estoque");
        addLbl.setVisible(false);
    }
    
    public static void setLogin(formLogin Login, formCadastrar Cadastrar){
        login = Login;
        cadastrar = Cadastrar;
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
            java.util.logging.Logger.getLogger(formExibirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formExibirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formExibirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formExibirProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formExibirProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddCarrinhoBtn;
    private javax.swing.JButton CompraBtn;
    private javax.swing.JScrollPane DescScrollPane;
    private javax.swing.JTextArea DescText;
    private javax.swing.JLabel EntregueLbl;
    private javax.swing.JLabel Foto;
    private javax.swing.JLabel Foto1;
    private javax.swing.JLabel Foto2;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel NomeLabel;
    private javax.swing.JPanel PainelExterior;
    private javax.swing.JPanel PainelInterno;
    private javax.swing.JLabel PrecoLabel;
    private javax.swing.JLabel PrecoPixLabel;
    private javax.swing.JLabel QuantidadeLabel;
    private javax.swing.JMenu SobreBtn;
    private javax.swing.JLabel VendidoLbl;
    private javax.swing.JButton VoltarBtn;
    private javax.swing.JLabel addLbl;
    private javax.swing.JMenu btnCadastrar;
    private javax.swing.JMenu btnConta;
    private javax.swing.JMenu btnLogin;
    private javax.swing.JMenu btnLogoff;
    private javax.swing.JButton carrinhoBtn;
    private javax.swing.JLabel descontoPix;
    private javax.swing.JLabel ouLbl;
    private javax.swing.JLabel pixLbl;
    // End of variables declaration//GEN-END:variables
}
