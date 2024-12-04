package Catalogo;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import Compra.formCarrinho;
import Usuario.formLogin;
import Usuario.formCadastrar;
import br.website.corex.formSobre;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class formCatalogo extends javax.swing.JFrame {

    public static formSobre sobre = new formSobre();
    public static formCarrinho carrinhoAtual;
    public static formLogin login;
    public static formCadastrar cadastrar;
    
    public formCatalogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        BemVindo = new javax.swing.JLabel();
        PainelCatalogo = new javax.swing.JScrollPane();
        ListaProdutos = new javax.swing.JList<>();
        btnMenu = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        btnConta = new javax.swing.JMenu();
        btnLogin = new javax.swing.JMenu();
        btnCadastrar = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        SobreBtn = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CoreX - Catálogo");
        setBackground(new java.awt.Color(3, 54, 73));
        setResizable(false);

        Painel.setBackground(new java.awt.Color(3, 54, 73));

        BemVindo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BemVindo.setForeground(new java.awt.Color(232, 221, 203));
        BemVindo.setText("Catálogo");

        ListaProdutos.setBackground(new java.awt.Color(232, 221, 203));
        ListaProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        PainelCatalogo.setViewportView(ListaProdutos);

        btnMenu.setBackground(new java.awt.Color(205, 179, 128));
        btnMenu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(3, 54, 73));
        btnMenu.setText("Menu");
        btnMenu.setFocusable(false);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PainelCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 825, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BemVindo, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PainelLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(BemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelCatalogo, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addGap(23, 23, 23))
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

        jMenu4.setBackground(new java.awt.Color(232, 221, 203));
        jMenu4.setForeground(new java.awt.Color(3, 54, 73));
        jMenu4.setText("Logoff");
        jMenu4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        btnConta.add(jMenu4);

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
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Painel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SobreBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreBtnMouseClicked
        sobre.setVisible(true);
    }//GEN-LAST:event_SobreBtnMouseClicked

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

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

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        if (Usuario.Cliente.login_verificado) {
            Usuario.Cliente.login_verificado = false;
            JOptionPane.showMessageDialog(null, "Você foi deslogado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Você já não está logado.");
        }
    }//GEN-LAST:event_jMenu4MouseClicked

    private static List<Produto> produtos = new ArrayList<>();
    
    public static void construirListaProdutos() {
        produtos.add(new Produto("Processador Intel i3-13100F", "Processador de décima-terceira geração, com soquete LGA 1700, 4 núcleos, 8 threads e clock de 3.4GHz.", 599.99f, 90, "Intel-I7.png"));
        produtos.add(new Produto("Processador Intel i7-12700K", "Processador de alto desempenho com soquete LGA 1700, 12 núcleos, 20 threads, vídeo integrado e clock de 3.6GHz.", 1699.99f, 30, "Intel-I7.png"));
        produtos.add(new Produto("Memória RAM Kingston FURY Beast 32GB", "Módulo único de memória RAM para desktop com capacidade de 32GB 3200MT/s DDR4 CL16.", 599.99f, 2, "Intel-I7.png"));
        produtos.add(new Produto("Memória RAM XPG Gammix 16GB", "Módulo único de memória RAM com capacidade de 16GB 3200MHz DDR4 CL16.", 299.99f, 120, "Intel-I7.png"));
        produtos.add(new Produto("GPU Sapphire Pulse AMD RADEON RX 7900 XT", "Placa de vídeo de alto desempenho projetada para jogos, contando com 20GB de memória virtual GDDR6.", 5882.99f, 16, "Intel-I7.png"));
        produtos.add(new Produto("GPU Nvidia RTX 3060 12GB", "Placa de vídeo poderosa com capacidade de 12GB de VRAM e funcionalidade Ray Tracing.", 1639.99f, 750, "Intel-I7.png"));
        produtos.add(new Produto("SSD Sandisk Plus 1TB", "SSD para desktop, modelo SATA de 2,5 polegadas, com capacidade de 1TB", 359.89f, 60, "Intel-I7.png"));
        produtos.add(new Produto("SSD Kingston NV2 1TB", "SSD para desktop, modelo NVMe M.2 com capacidade de 1TB, leitura de 3500MB/s e gravação até 2100MB/s.", 412.90f, 300, "Intel-I7.png"));
        produtos.add(new Produto("HDD Seagate Barracuda Compute 4TB", "Hard Drive interno de alta capacidade para desktop. Conta com 4TB de capacidade e formato SATA.", 719f, 599, "Intel-I7.png"));
        produtos.add(new Produto("HDD Seagate Barracuda 500GB", "Hard Drive interno para desktop, com 500GB de capacidade e formato SATA.", 110f, 20, "Intel-I7.png"));
        produtos.add(new Produto("Fonte Corsair ATX 750W", "Fonte de alta qualidade, com 750W, certificado 80 plus bronze, e modelo ATX. Cabo de força incluso.", 646.90f, 100, "Intel-I7.png"));
        produtos.add(new Produto("Fonte Mancer Thunder 500W", "Fonte Modelo ATX com 500W e certificado 80 plus bronze. Cabo de força incluso.", 234.99f, 200, "Intel-I7.png"));
        produtos.add(new Produto("Placa Mãe AsRock B660M Phantom Gaming 4", "Placa mãe modelo B660m microatx, soquete LGA 1700, 4 slots de memória RAM DDR4, suporte para SSDs M.2, wi-fi e bluetooth.", 730f, 15, "Intel-I7.png"));
        produtos.add(new Produto("Placa Mãe Asus Tuf Gaming A520M-Plus", "Placa mãe micro atx, suporte para M.2, soquete AM4, e 4 slots de memória RAM DDR4.", 599.99f, 68, "Intel-I7.png"));
        produtos.add(new Produto("Air Cooler Gamer Rise Mode Storm 8 Black", "Air Cooler para processadores AMD/Intel, com ventoinhas de 120mm.", 129.99f, 50, "Intel-I7.png"));
        produtos.add(new Produto("Cooler Fan C3Tech F7-100BK 1200RPM", "Ventoinha para gabinetes desktop, com rolamento FDB 12v, tamanho 12x12x2,5cm e velocidade 1200RPM. Sem leds.", 30.99f, 140, "Intel-I7.png"));
        
    }
    
    public static void construirListaProdutosTxt(){
        try{
            BufferedWriter w_produtos = new BufferedWriter(new FileWriter("Produtos.txt"));
            for(int i = 0; i < produtos.size(); i++){
                w_produtos.write((i+1)+"_"+produtos.get(i).getNome()+"_"+produtos.get(i).getDescricao()+"_"
                        +produtos.get(i).getPreco()+"_"+produtos.get(i).getEstoque()+"_"+produtos.get(i).getImagem()+"\n");
            }
            w_produtos.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public static void setEstoqueProdutoEspecifico(int codigo, int estoqueNovo){
        try{
            String linha;
            BufferedWriter writer = new BufferedWriter(new FileWriter("ProdutosTemp.txt"));
            BufferedReader reader = new BufferedReader(new FileReader("Produtos.txt"));
            while((linha = reader.readLine()) != null){
                String[] campos = linha.split("_");
                int index = Integer.parseInt(campos[0]);
                if(index == codigo){
                    String nome = campos[1];
                    String descricao = campos[2];
                    float preco = Float.parseFloat(campos[3]);
                    //int estoque = Integer.parseInt(campos[4]);
                    String imagem = campos[5];
                    Produto produtoEncontrado = new Produto(nome, descricao, preco, estoqueNovo, imagem);
                    writer.write((codigo)+"_"+produtoEncontrado.getNome()+"_"+produtoEncontrado.getDescricao()+"_"
                        +produtoEncontrado.getPreco()+"_"+produtoEncontrado.getEstoque()+"_"+produtoEncontrado.getImagem()+"\n");
                    
                    //System.out.println("\n\nProduto Encontrado: "+nome+"\nEstoque Antigo: "+estoque+"\nEstoque Novo: "+(estoque-1)+"\n\n");
                }
                else{
                    //System.out.println("\n"+linha+"\n");
                    writer.write(linha+"\n");
                }
            }
            writer.close();
            reader.close();
            
            File ProdutosOld = new File("Produtos.txt");
            File ProdutosNew = new File("ProdutosTemp.txt");
            ProdutosOld.delete();
            ProdutosNew.renameTo(new File("Produtos.txt"));
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static List<Produto> getProdutos(){
        List<Produto> produtos = new ArrayList<>();
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Produtos.txt"));
            String linha;
            System.out.println("\n\n");
            while((linha = reader.readLine()) != null){
                String[] campos = linha.split("_");
                int index = Integer.parseInt(campos[0]);
                String nome = campos[1];
                String descricao = campos[2];
                float preco = Float.parseFloat(campos[3]);
                int estoque = Integer.parseInt(campos[4]);
                String imagem = campos[5];
                produtos.add(new Produto(nome, descricao, preco, estoque, imagem));
            }
            reader.close();
        }catch(IOException e){
            System.out.println(e);
        }
        return produtos;
    }
    
    public static Produto getProdutoEspecifico(int codigo){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Produtos.txt"));
            String linha;
            System.out.println("\n\n");
            while((linha = reader.readLine()) != null){
                String[] campos = linha.split("_");
                int index = Integer.parseInt(campos[0]);
                String nome = campos[1];
                String descricao = campos[2];
                float preco = Float.parseFloat(campos[3]);
                int estoque = Integer.parseInt(campos[4]);
                String imagem = campos[5];
                
                if(index == codigo){
                    Produto produtoEncontrado = new Produto(nome, descricao, preco, estoque, imagem);
                    reader.close();
                    return produtoEncontrado;
                }
            }
            reader.close();
        }catch(IOException e){
            System.out.println(e);
        }
        return null;
    }
    
    public static void setLogin(formLogin Login, formCadastrar Cadastrar){
        login = Login;
        cadastrar = Cadastrar;
    }
    
    public static void exibirProdutos(formCarrinho Carrinho){
        carrinhoAtual = Carrinho;
        formCatalogo formCatalogo = new formCatalogo();
        ArrayList<String> itens = new ArrayList<String>();
        
        for (int i = 0; i < getProdutos().size(); i++){
            StringBuilder ProdutoEmLista = new StringBuilder();
            ProdutoEmLista.append(i + 1).append(" ").append(getProdutoEspecifico(i+1).getNome()).append("\n").append("Preço: R$")
                    .append(getProdutoEspecifico(i+1).getPreco());
            
            itens.add(ProdutoEmLista.toString());
        }
        
        formCatalogo.ListaProdutos.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if (!e.getValueIsAdjusting()){
                    formCatalogo.dispose();
                    formExibirProduto formExibirProduto = new formExibirProduto();
                    formExibirProduto.setListaProdutos(formCatalogo.ListaProdutos.getSelectedIndex(), getProdutos());
                    formExibirProduto.setCarrinho(carrinhoAtual);
                    formExibirProduto.setLogin(login, cadastrar);
                    formExibirProduto.exibirProduto();
                    formExibirProduto.setVisible(true);
                    formExibirProduto.setLocationRelativeTo(null);
                }
            }
        });
        formCatalogo.ListaProdutos.setModel(new javax.swing.AbstractListModel<String>() {
            public int getSize() { return itens.size(); }
            public String getElementAt(int i) { return itens.get(i); }
        });
        formCatalogo.ListaProdutos.setCellRenderer(new RenderizadorListaMultilinha());
        
        formCatalogo.setLocationRelativeTo(null);
        formCatalogo.setVisible(true);
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
            java.util.logging.Logger.getLogger(formCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        construirListaProdutos();
        construirListaProdutosTxt();
        formCarrinho carrinho = new formCarrinho();
        exibirProdutos(carrinho);
    }

    public static boolean produtoJaNoCarrinho(int codigo, formCarrinho carrinho) {
        Produto produto = getProdutoEspecifico(codigo);
        for (Produto item : carrinho.getItensCarrinho()) {
            if (item.getNome().equals(produto.getNome())) {
                return true; // O produto já está no carrinho
            }
        }
        return false; // O produto não está no carrinho
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BemVindo;
    private javax.swing.JList<String> ListaProdutos;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel Painel;
    private javax.swing.JScrollPane PainelCatalogo;
    private javax.swing.JMenu SobreBtn;
    private javax.swing.JMenu btnCadastrar;
    private javax.swing.JMenu btnConta;
    private javax.swing.JMenu btnLogin;
    private javax.swing.JButton btnMenu;
    private javax.swing.JMenu jMenu4;
    // End of variables declaration//GEN-END:variables
}
