package Compra;

import Catalogo.*;
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

public class formFinalizacao extends javax.swing.JFrame {

    private formSobre sobre;
    public static formCarrinho carrinho;
    public static formLogin login;
    public static formCadastrar cadastrar;
    
    public formFinalizacao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Painel = new javax.swing.JPanel();
        pagamentoConfirmado = new javax.swing.JLabel();
        btn_sair = new javax.swing.JButton();
        lblValor = new javax.swing.JLabel();
        lblSenha1 = new javax.swing.JLabel();
        lblSenha2 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        btnSobre = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CoreX - Catálogo");
        setBackground(new java.awt.Color(3, 54, 73));
        setResizable(false);

        Painel.setBackground(new java.awt.Color(3, 54, 73));

        pagamentoConfirmado.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        pagamentoConfirmado.setForeground(new java.awt.Color(232, 221, 203));
        pagamentoConfirmado.setText("Pagamento confirmado!");

        btn_sair.setBackground(new java.awt.Color(233, 49, 53));
        btn_sair.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        btn_sair.setForeground(new java.awt.Color(255, 255, 255));
        btn_sair.setText("Sair");
        btn_sair.setFocusable(false);
        btn_sair.setName("btn_login_voltar"); // NOI18N
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        lblValor.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblValor.setForeground(new java.awt.Color(232, 221, 203));
        lblValor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblValor.setText("Valor Total: R$XXX,XX");
        lblValor.setName("lblSenhaLogin"); // NOI18N

        lblSenha1.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblSenha1.setForeground(new java.awt.Color(232, 221, 203));
        lblSenha1.setText("Aguarde mais informações na caixa de entrada ou spam do seu email.");
        lblSenha1.setName("lblSenhaLogin"); // NOI18N

        lblSenha2.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        lblSenha2.setForeground(new java.awt.Color(232, 221, 203));
        lblSenha2.setText("Seu pedido foi realizado com sucesso e iremos notificar à transportadora. ");
        lblSenha2.setName("lblSenhaLogin"); // NOI18N

        javax.swing.GroupLayout PainelLayout = new javax.swing.GroupLayout(Painel);
        Painel.setLayout(PainelLayout);
        PainelLayout.setHorizontalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 698, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addComponent(lblSenha1)
                        .addGap(119, 119, 119))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                        .addComponent(pagamentoConfirmado, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))))
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(lblValor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelLayout.createSequentialGroup()
                    .addContainerGap(124, Short.MAX_VALUE)
                    .addComponent(lblSenha2)
                    .addGap(79, 79, 79)))
        );
        PainelLayout.setVerticalGroup(
            PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(pagamentoConfirmado)
                .addGap(37, 37, 37)
                .addComponent(lblValor)
                .addGap(47, 47, 47)
                .addComponent(lblSenha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(PainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PainelLayout.createSequentialGroup()
                    .addGap(213, 213, 213)
                    .addComponent(lblSenha2)
                    .addContainerGap(268, Short.MAX_VALUE)))
        );

        MenuBar.setBackground(new java.awt.Color(232, 221, 203));

        btnSobre.setBackground(new java.awt.Color(232, 221, 203));
        btnSobre.setForeground(new java.awt.Color(3, 54, 73));
        btnSobre.setText("Sobre");
        btnSobre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSobreMouseClicked(evt);
            }
        });
        MenuBar.add(btnSobre);

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btnSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSobreMouseClicked
        sobre.setVisible(true);
    }//GEN-LAST:event_btnSobreMouseClicked

    public void setValor(double valorTotal){
        lblValor.setText("Valor Total: " + (String.format("R$ %.2f", valorTotal)));
    }
    
    public void setCarrinho(formCarrinho carrinho) {
        this.carrinho = carrinho;
    }
    
    public void mudarEstoque(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader("Produtos.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("ProdutosTemp.txt"));
            List<Produto> produtos = new ArrayList<>();
            for(Produto item : carrinho.getItensCarrinho()){
                produtos.add(item);
            }
            for(int i = 0; i < produtos.size(); i++){
                String linha;
                while((linha = reader.readLine()) != null){
                    String[] campos = linha.split("_");
                    String index = campos[0];
                    String nome = campos[1];
                    String descricao = campos[2];
                    float preco = Float.parseFloat(campos[3]);
                    String estoque = campos[4];
                    String imagem = campos[5];
                    if(nome.equals(produtos.get(i).getNome())){
                        int estoqueNovo = (Integer.parseInt(estoque) - carrinho.getItensCarrinho().get(i).getQuantidade());
                        Produto produtoEncontrado = new Produto(nome, descricao, preco, estoqueNovo, imagem);
                        writer.write(index +"_"+produtoEncontrado.getNome()+"_"+produtoEncontrado.getDescricao()+"_"
                        +produtoEncontrado.getPreco()+"_"+produtoEncontrado.getEstoque()+"_"+produtoEncontrado.getImagem()+"\n");
                    }
                    else{
                    writer.write(linha+"\n");
                    }
                }
            }
            reader.close();
            writer.close();
            
            File ProdutosOld = new File("Produtos.txt");
            File ProdutosNew = new File("ProdutosTemp.txt");
            ProdutosOld.delete();
            ProdutosNew.renameTo(new File("Produtos.txt"));
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel Painel;
    private javax.swing.JMenu btnSobre;
    private javax.swing.JButton btn_sair;
    private javax.swing.JLabel lblSenha1;
    private javax.swing.JLabel lblSenha2;
    private javax.swing.JLabel lblValor;
    private javax.swing.JLabel pagamentoConfirmado;
    // End of variables declaration//GEN-END:variables
}
