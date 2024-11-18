package Catalogo;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import carrinho.formCarrinho;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class formCatalogo extends javax.swing.JFrame {

    public static formCarrinho carrinhoAtual;
    
    public formCatalogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                                                
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        BemVindo = new javax.swing.JLabel();
        PainelCatalogo = new javax.swing.JScrollPane();
        ListaProdutos = new javax.swing.JList<>();
        VoltarBtn = new javax.swing.JButton();
        ErroLabel = new javax.swing.JLabel();
        CarrinhoBtn = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        Sair = new javax.swing.JMenu();
        Sobre = new javax.swing.JMenu();

        jScrollPane2.setViewportView(jTextPane2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        BemVindo.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        BemVindo.setText("Bem-vindo ao catálogo! Selecione o produto desejado.");

        ListaProdutos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        PainelCatalogo.setViewportView(ListaProdutos);

        VoltarBtn.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        VoltarBtn.setText("Voltar");
        VoltarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarBtnActionPerformed(evt);
            }
        });

        ErroLabel.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        ErroLabel.setText("Erro: Produto selecionado já está no carrinho.");

        CarrinhoBtn.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        CarrinhoBtn.setText("Carrinho");
        CarrinhoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarrinhoBtnActionPerformed(evt);
            }
        });

        Sair.setText("Sair");
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
        });
        MenuBar.add(Sair);

        Sobre.setText("Sobre");
        Sobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SobreMouseClicked(evt);
            }
        });
        MenuBar.add(Sobre);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BemVindo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PainelCatalogo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(VoltarBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CarrinhoBtn))
                            .addComponent(ErroLabel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BemVindo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PainelCatalogo, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ErroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VoltarBtn)
                    .addComponent(CarrinhoBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                                              

    private void SairMouseClicked(java.awt.event.MouseEvent evt) {                                  
        System.exit(0);
    }                                 

    private void SobreMouseClicked(java.awt.event.MouseEvent evt) {                                   
        //Adicionar página de créditos/sobre/participantes do grupo
    }                                  

    private void VoltarBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        dispose();
    }                                         

    private void CarrinhoBtnActionPerformed(java.awt.event.ActionEvent evt) {                                            
        carrinhoAtual.setVisible(true);
        dispose();
    }                                           

    private static List<Produto> produtos = new ArrayList<>();

    public static void construirListaProdutos() {
        produtos.add(new Produto("Processador Intel i3-13100F", "Processador de décima-terceira geração, com soquete LGA 1700, 4 núcleos, 8 threads e clock de 3.4GHz.", 599.99f, 90));
        produtos.add(new Produto("Processador Intel i7-12700K", "Processador de alto desempenho com soquete LGA 1700, 12 núcleos, 20 threads, vídeo integrado e clock de 3.6GHz.", 1699.99f, 30));
        produtos.add(new Produto("Memória RAM Kingston FURY Beast 32GB", "Módulo único de memória RAM para desktop com capacidade de 32GB 3200MT/s DDR4 CL16.", 599.99f, 2));
        produtos.add(new Produto("Memória RAM XPG Gammix 16GB", "Módulo único de memória RAM com capacidade de 16GB 3200MHz DDR4 CL16.", 299.99f, 120));
        produtos.add(new Produto("GPU Sapphire Pulse AMD RADEON RX 7900 XT", "Placa de vídeo de alto desempenho projetada para jogos, contando com 20GB de memória virtual GDDR6.", 5882.99f, 16));
        produtos.add(new Produto("GPU Nvidia RTX 3060 12GB", "Placa de vídeo poderosa com capacidade de 12GB de VRAM e funcionalidade Ray Tracing.", 1639.99f, 750));
        produtos.add(new Produto("SSD Sandisk Plus 1TB", "SSD para desktop, modelo SATA de 2,5 polegadas, com capacidade de 1TB", 359.89f, 60));
        produtos.add(new Produto("SSD Kingston NV2 1TB", "SSD para desktop, modelo NVMe M.2 com capacidade de 1TB, leitura de 3500MB/s e gravação até 2100MB/s.", 412.90f, 300));
        produtos.add(new Produto("HDD Seagate Barracuda Compute 4TB", "Hard Drive interno de alta capacidade para desktop. Conta com 4TB de capacidade e formato SATA.", 719f, 599));
        produtos.add(new Produto("HDD Seagate Barracuda 500GB", "Hard Drive interno para desktop, com 500GB de capacidade e formato SATA.", 110f, 20));
        produtos.add(new Produto("Fonte Corsair ATX 750W", "Fonte de alta qualidade, com 750W, certificado 80 plus bronze, e modelo ATX. Cabo de força incluso.", 646.90f, 100));
        produtos.add(new Produto("Fonte Mancer Thunder 500W", "Fonte Modelo ATX com 500W e certificado 80 plus bronze. Cabo de força incluso.", 234.99f, 200));
        produtos.add(new Produto("Placa Mãe AsRock B660M Phantom Gaming 4", "Placa mãe modelo B660m microatx, soquete LGA 1700, 4 slots de memória RAM DDR4, suporte para SSDs M.2, wi-fi e bluetooth.", 730f, 15));
        produtos.add(new Produto("Placa Mãe Asus Tuf Gaming A520M-Plus", "Placa mãe micro atx, suporte para M.2, soquete AM4, e 4 slots de memória RAM DDR4.", 599.99f, 68));
        produtos.add(new Produto("Air Cooler Gamer Rise Mode Storm 8 Black", "Air Cooler para processadores AMD/Intel, com ventoinhas de 120mm.", 129.99f, 50));
        produtos.add(new Produto("Cooler Fan C3Tech F7-100BK 1200RPM", "Ventoinha para gabinetes desktop, com rolamento FDB 12v, tamanho 12x12x2,5cm e velocidade 1200RPM. Sem leds.", 30.99f, 140));
        
    }
    
    public static void construirListaProdutosTxt(){
        try{
            BufferedWriter w_produtos = new BufferedWriter(new FileWriter("Produtos.txt"));
            for(int i = 0; i < produtos.size(); i++){
                w_produtos.write((i+1)+"_"+produtos.get(i).getNome()+"_"+produtos.get(i).getDescricao()+"_"
                        +produtos.get(i).getPreco()+"_"+produtos.get(i).getEstoque()+"\n");
            }
            w_produtos.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    public static List<Produto> lerProdutos(){
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
                produtos.add(new Produto(nome, descricao, preco, estoque));
                System.out.println("\nCódigo: " +index+ "\nNome: " +nome+ "\nDescrição: " +descricao+ 
                        "\nPreço: " +preco+ "\nEstoque: " +estoque +"\n");
            }
            reader.close();
        }catch(IOException e){
            System.out.println(e);
        }
        return produtos;
    }
    
    public static Produto lerProdutoEspecifico(int codigo){
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
                
                if(index == codigo){
                    System.out.println("\nCódigo: " +index+ "\nNome: " +nome+ "\nDescrição: " +descricao+ 
                        "\nPreço: " +preco+ "\nEstoque: " +estoque +"\n");
                    Produto produtoEncontrado = new Produto(nome, descricao, preco, estoque);
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

    public static void exibirProdutos(formCarrinho Carrinho){
        carrinhoAtual = Carrinho;
        formCatalogo formCatalogo = new formCatalogo();
        ArrayList<String> itens = new ArrayList<String>();
        formCatalogo.ErroLabel.setVisible(false);
        
        for (int i = 0; i < lerProdutos().size(); i++){
            StringBuilder ProdutoEmLista = new StringBuilder();
            ProdutoEmLista.append(i + 1).append(" ").append(lerProdutoEspecifico(i+1).getNome()).append("\n").append("Preço: R$")
                    .append(lerProdutoEspecifico(i+1).getPreco());
            
            itens.add(ProdutoEmLista.toString());
        }
        
        formCatalogo.ListaProdutos.addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e){
                if (!e.getValueIsAdjusting()){
                    formCatalogo.dispose();
                    formExibirProduto formExibirProduto = new formExibirProduto();
                    formExibirProduto.setListaProdutos(formCatalogo.ListaProdutos.getSelectedIndex(), lerProdutos());
                    formExibirProduto.setCarrinho(carrinhoAtual);
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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        construirListaProdutos();
        construirListaProdutosTxt();
        formCarrinho carrinho = new formCarrinho();
        exibirProdutos(carrinho);
    }

    public static boolean produtoJaNoCarrinho(int codigo, formCarrinho carrinho) {
        Produto produto = lerProdutoEspecifico(codigo+1);
        for (Produto item : carrinho.getItensCarrinho()) {
            if (item.getNome().equals(produto.getNome())) {
                return true; // O produto já está no carrinho
            }
        }
        return false; // O produto não está no carrinho
    }

    

    // Variables declaration - do not modify                     
    private javax.swing.JLabel BemVindo;
    private javax.swing.JButton CarrinhoBtn;
    private javax.swing.JLabel ErroLabel;
    private javax.swing.JList<String> ListaProdutos;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JScrollPane PainelCatalogo;
    private javax.swing.JMenu Sair;
    private javax.swing.JMenu Sobre;
    private javax.swing.JButton VoltarBtn;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane2;
    // End of variables declaration                   
}
