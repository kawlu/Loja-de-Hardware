/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Compra;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import Catalogo.Produto;
import static Catalogo.formCatalogo.login;
import static Catalogo.formCatalogo.sobre;
import static Catalogo.formExibirProduto.cadastrar;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class formCarrinho extends javax.swing.JFrame {
    private List<Produto> itensCarrinho;
    public double valorTotalPub;
    
    public formCarrinho() {
        this.itensCarrinho = new ArrayList<>();

        initComponents();
        ImageIcon imageIcon = new ImageIcon("etapa_carrinho.png");
        fotoCarrinho.setIcon(imageIcon);
        
        atualizarTabela();
    }

    public List<Produto> getItensCarrinho() {
        return itensCarrinho;
    }
    
    private void atualizarValorTotal() {
        double valorTotal = 0;
    
        if (!itensCarrinho.isEmpty()) {
            for (Produto item : itensCarrinho) {
                valorTotal += item.getValorTotal();
            }
        }
        lblValorTotal.setText(String.format("R$ %.2f", valorTotal));
        valorTotalPub = valorTotal;
    }

    public void atualizarTabela() {
        DefaultTableModel modeloTabela = (DefaultTableModel) tblProdutos.getModel();
        modeloTabela.setRowCount(0);
        
        for (Produto item : itensCarrinho) {
            Object[] dados = {
                item.getNome(),
                String.format("%.2f", item.getValorUnitario()),
                item.getQuantidade(),
                String.format("%.2f", item.getValorTotal())
            };
            modeloTabela.addRow(dados);
        }
        atualizarValorTotal();
    }
    
    public void adicionarItem(Produto item) {
        itensCarrinho.add(item);
        atualizarTabela();
    }
    
/**
 *
 * @author Lucas
 */

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProdutos = new javax.swing.JTable();
        lblValorTotal = new javax.swing.JLabel();
        BemVindo = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        cmbAtualizarQuantidade = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        fotoCarrinho = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnConta = new javax.swing.JMenu();
        btnLogin = new javax.swing.JMenu();
        btnCadastrar = new javax.swing.JMenu();
        btnLogoff = new javax.swing.JMenu();
        SobreBtn1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CoreX - Carrinho");
        setBackground(new java.awt.Color(0, 102, 102));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(3, 54, 73));

        btnExcluir.setBackground(new java.awt.Color(233, 49, 53));
        btnExcluir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnExcluir.setForeground(new java.awt.Color(255, 255, 255));
        btnExcluir.setText("Remover Produto");
        btnExcluir.setFocusable(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(232, 221, 203));
        jLabel3.setText("Valor Total:");

        btnLimpar.setBackground(new java.awt.Color(233, 49, 53));
        btnLimpar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnLimpar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpar.setText("Limpar Carrinho");
        btnLimpar.setFocusable(false);
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnFinalizar.setBackground(new java.awt.Color(51, 175, 51));
        btnFinalizar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnFinalizar.setForeground(new java.awt.Color(255, 255, 255));
        btnFinalizar.setText("Continuar");
        btnFinalizar.setFocusable(false);
        btnFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarActionPerformed(evt);
            }
        });

        btnAtualizar.setBackground(new java.awt.Color(43, 153, 152));
        btnAtualizar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAtualizar.setForeground(new java.awt.Color(255, 255, 255));
        btnAtualizar.setText("Atualizar");
        btnAtualizar.setFocusable(false);
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(232, 221, 203));
        jScrollPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblProdutos.setBackground(new java.awt.Color(232, 221, 203));
        tblProdutos.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tblProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome do Produto", "Valor Unitário (R$)", "Quantidade", "Valor (R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProdutos.setGridColor(new java.awt.Color(0, 0, 0));
        tblProdutos.setSelectionBackground(new java.awt.Color(232, 221, 203));
        tblProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tblProdutos);
        if (tblProdutos.getColumnModel().getColumnCount() > 0) {
            tblProdutos.getColumnModel().getColumn(0).setResizable(false);
            tblProdutos.getColumnModel().getColumn(0).setPreferredWidth(280);
            tblProdutos.getColumnModel().getColumn(1).setResizable(false);
            tblProdutos.getColumnModel().getColumn(1).setPreferredWidth(50);
            tblProdutos.getColumnModel().getColumn(2).setResizable(false);
            tblProdutos.getColumnModel().getColumn(2).setPreferredWidth(15);
            tblProdutos.getColumnModel().getColumn(3).setResizable(false);
            tblProdutos.getColumnModel().getColumn(3).setPreferredWidth(15);
        }

        lblValorTotal.setFont(new java.awt.Font("Arial", 1, 28)); // NOI18N
        lblValorTotal.setForeground(new java.awt.Color(232, 221, 203));

        BemVindo.setFont(new java.awt.Font("Arial", 1, 15)); // NOI18N
        BemVindo.setForeground(new java.awt.Color(232, 221, 203));
        BemVindo.setText("CARRINHO");

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

        cmbAtualizarQuantidade.setBackground(new java.awt.Color(43, 153, 152));
        cmbAtualizarQuantidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cmbAtualizarQuantidade.setForeground(new java.awt.Color(255, 255, 255));
        cmbAtualizarQuantidade.setMaximumRowCount(5);
        cmbAtualizarQuantidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        cmbAtualizarQuantidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAtualizarQuantidadeActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 221, 203));
        jLabel1.setText("Selecione um produto na tabela");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BemVindo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fotoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAtualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbAtualizarQuantidade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                                .addComponent(lblValorTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(12, 12, 12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(fotoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(BemVindo)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(0, 22, Short.MAX_VALUE)
                        .addComponent(cmbAtualizarQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jMenuBar1.setBackground(new java.awt.Color(232, 221, 203));

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

        jMenuBar1.add(btnConta);

        SobreBtn1.setBackground(new java.awt.Color(232, 221, 203));
        SobreBtn1.setForeground(new java.awt.Color(3, 54, 73));
        SobreBtn1.setText("Sobre");
        SobreBtn1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        SobreBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SobreBtn1MouseClicked(evt);
            }
        });
        jMenuBar1.add(SobreBtn1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbAtualizarQuantidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAtualizarQuantidadeActionPerformed

    }//GEN-LAST:event_cmbAtualizarQuantidadeActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        dispose();
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
        int linhaSelecionada = tblProdutos.getSelectedRow();

        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um produto na tabela para alterar a quantidade.");
            return;
        }

        int novaQuantidade = Integer.parseInt(cmbAtualizarQuantidade.getSelectedItem().toString());

        Produto itemSelecionado = itensCarrinho.get(linhaSelecionada);

        // Definindo o limite máximo permitido = estoque disponível ou 5
        int estoqueDisponivel = itemSelecionado.getEstoque();
        int quantidadeMaximaPermitida = Math.min(estoqueDisponivel, 5);

        if (novaQuantidade > quantidadeMaximaPermitida) {
            JOptionPane.showMessageDialog(this, 
                "A quantidade solicitada excede o limite permitido. Quantidade ajustada para " + quantidadeMaximaPermitida + ".");

            novaQuantidade = quantidadeMaximaPermitida;

            cmbAtualizarQuantidade.setSelectedItem(String.valueOf(novaQuantidade));
        }

        itemSelecionado.setQuantidade(novaQuantidade);
        itemSelecionado.calcularValorTotal();

        atualizarTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarActionPerformed
        if (getItensCarrinho().isEmpty()) {
            JOptionPane.showMessageDialog(this, "O carrinho está vazio!", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
        else if(Usuario.Cliente.login_verificado == null || Usuario.Cliente.login_verificado == false){
            formIdentificacao formIdentificacao = new formIdentificacao();
            formIdentificacao.setImagem();
            formIdentificacao.carrinho = this;
            formIdentificacao.setVisible(true);
            dispose();
        }
        else{
            formEntrega formEntrega = new formEntrega();
            formEntrega.setImagem();
            formEntrega.setEndereco();
            formEntrega.carrinho = this;
            formEntrega.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_btnFinalizarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        ((DefaultTableModel) tblProdutos.getModel()).setRowCount(0);

        itensCarrinho.clear();

        atualizarValorTotal();

        JOptionPane.showMessageDialog(this, "Carrinho limpo com sucesso.");
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int linhaSelecionada = tblProdutos.getSelectedRow();
        if (linhaSelecionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um produto na tabela para remove-lo.");
        } else {
            DefaultTableModel tabelaProduto = (DefaultTableModel) tblProdutos.getModel();

            // Obtém o nome do item removido para encontrar e remover da lista
            String nomeProduto = (String) tabelaProduto.getValueAt(linhaSelecionada, 0);

            // Remove o item correspondente da lista itensCarrinho
            itensCarrinho.removeIf(item -> item.getNome().equals(nomeProduto));

            tabelaProduto.removeRow(linhaSelecionada);
            atualizarValorTotal();
            JOptionPane.showMessageDialog(this, "Produto removido.");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void SobreBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreBtn1MouseClicked
        sobre.setVisible(true);
    }//GEN-LAST:event_SobreBtn1MouseClicked

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

    public void setImagem(){
        ImageIcon imageIcon = new ImageIcon("etapas_carrinho.png");
        Image image = imageIcon.getImage();
        Image newImg = image.getScaledInstance(349, 119, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newImg);
        fotoCarrinho.setIcon(imageIcon);
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
            java.util.logging.Logger.getLogger(formCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCarrinho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BemVindo;
    private javax.swing.JMenu SobreBtn1;
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JMenu btnCadastrar;
    private javax.swing.JMenu btnConta;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JMenu btnLogin;
    private javax.swing.JMenu btnLogoff;
    private javax.swing.JButton btnMenu;
    private javax.swing.JComboBox<String> cmbAtualizarQuantidade;
    private javax.swing.JLabel fotoCarrinho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblValorTotal;
    private javax.swing.JTable tblProdutos;
    // End of variables declaration//GEN-END:variables
}