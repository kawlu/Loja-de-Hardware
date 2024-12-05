package Compra;

import Usuario.Cliente;
import br.website.corex.formSobre;
import javax.swing.JOptionPane;

public class formCartao extends javax.swing.JFrame {

    private formSobre sobre; 
    public static formCarrinho carrinho;
    
    public formCartao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listCartoes = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCartao = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtMes = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCVV = new javax.swing.JTextField();
        cboxSalvarCartao = new javax.swing.JCheckBox();
        btnContinuar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        cmbParcelamento = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jMenuBar1 = new javax.swing.JMenuBar();
        SobreBtn1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(3, 54, 73));

        jPanel2.setBackground(new java.awt.Color(43, 104, 109));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(232, 221, 203));
        jLabel1.setText("Método de pagamento: Cartão");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(232, 221, 203));

        listCartoes.setBackground(new java.awt.Color(232, 221, 203));
        listCartoes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        listCartoes.setForeground(new java.awt.Color(3, 54, 73));
        listCartoes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cartão 1" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listCartoes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jScrollPane1.setViewportView(listCartoes);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jLabel3.setBackground(new java.awt.Color(232, 221, 203));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(232, 221, 203));
        jLabel3.setText("Parcelamento");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(232, 221, 203));
        jLabel4.setText("Cadastrar um novo cartão");

        jLabel2.setBackground(new java.awt.Color(232, 221, 203));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(232, 221, 203));
        jLabel2.setText("Cartões salvos");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(232, 221, 203));
        jLabel5.setText("Número do cartão");

        txtCartao.setBackground(new java.awt.Color(232, 221, 203));
        txtCartao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCartao.setForeground(new java.awt.Color(3, 54, 73));
        txtCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCartaoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(232, 221, 203));
        jLabel6.setText("Nome impresso no cartão");

        txtNome.setBackground(new java.awt.Color(232, 221, 203));
        txtNome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtNome.setForeground(new java.awt.Color(3, 54, 73));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(232, 221, 203));
        jLabel7.setText("Validade");

        txtMes.setBackground(new java.awt.Color(232, 221, 203));
        txtMes.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMes.setForeground(new java.awt.Color(3, 54, 73));
        txtMes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMesActionPerformed(evt);
            }
        });

        txtAno.setBackground(new java.awt.Color(232, 221, 203));
        txtAno.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtAno.setForeground(new java.awt.Color(3, 54, 73));
        txtAno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(232, 221, 203));
        jLabel8.setText("CVV");

        txtCVV.setBackground(new java.awt.Color(232, 221, 203));
        txtCVV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtCVV.setForeground(new java.awt.Color(3, 54, 73));
        txtCVV.setToolTipText("");

        cboxSalvarCartao.setBackground(new java.awt.Color(3, 54, 73));
        cboxSalvarCartao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cboxSalvarCartao.setForeground(new java.awt.Color(232, 221, 203));
        cboxSalvarCartao.setText("Salvar cartão para as próximas compras ");

        btnContinuar.setBackground(new java.awt.Color(51, 175, 51));
        btnContinuar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(233, 49, 53));
        btnCancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        cmbParcelamento.setBackground(new java.awt.Color(232, 221, 203));
        cmbParcelamento.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        cmbParcelamento.setForeground(new java.awt.Color(3, 54, 73));
        cmbParcelamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 x de (valor) R$XXX", "XX sem juros" }));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(232, 221, 203));
        jLabel9.setText("(YY)");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(232, 221, 203));
        jLabel10.setText("(MM)");

        jSeparator1.setForeground(new java.awt.Color(232, 221, 203));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbParcelamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cboxSalvarCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(txtCartao)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtAno))))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNome))
                .addGap(122, 122, 122))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbParcelamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(txtCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addGap(2, 2, 2)
                                .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jSeparator1)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboxSalvarCartao)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        jMenuBar1.setBackground(new java.awt.Color(232, 221, 203));
        jMenuBar1.setForeground(new java.awt.Color(3, 54, 73));
        jMenuBar1.setBorderPainted(false);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCartaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCartaoActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtMesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMesActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        boolean pagpreenchida = true;
        
        String cartao = txtCartao.getText();
        String nome = txtNome.getText();
        String mes = txtMes.getText();
        String ano = txtAno.getText();
        String cvv = txtCVV.getText();
        
        String cartaoRegex = "^(?:\\d{4}[-\\s]?){3}\\d{4}$";
        String nomeRegex = "^[A-Za-zÀ-ÿ]+(?: [A-Za-zÀ-ÿ]+)+$";
        String mesRegex = "^1[0-2]$|^0[1-9]$";
        String anoRegex = "^\\d{2}$";
        String cvvRegex = "^\\d{3}$";
        
        while(pagpreenchida){
            if(listCartoes.getSelectedValue() == null){
                if(cartao.isEmpty()){
                    JOptionPane.showMessageDialog(rootPane, "O campo Cartão é obrigatório.", "Erro", JOptionPane.WARNING_MESSAGE);
                    pagpreenchida = false;
                    break;
                }
                else if(!cartao.matches(cartaoRegex)){
                    JOptionPane.showMessageDialog(rootPane, "Por favor insira um número de cartão válido.", "Erro", JOptionPane.WARNING_MESSAGE);
                    pagpreenchida = false;
                    break;
                }

                if (nome.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "O campo Nome é obrigatório.", "Erro", JOptionPane.WARNING_MESSAGE);
                    pagpreenchida = false;
                    break;
                }
                else if(!nome.matches(nomeRegex)){
                    JOptionPane.showMessageDialog(rootPane, "O Nome deve conter pelo menos nome e sobrenome separados por espaço.", "Erro", JOptionPane.WARNING_MESSAGE);
                    pagpreenchida = false;
                    break;
                }    

                if (mes.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "O campo Mês é obrigatório.", "Erro", JOptionPane.WARNING_MESSAGE);
                    pagpreenchida = false;
                    break;
                }
                else if(!mes.matches(mesRegex)){
                    JOptionPane.showMessageDialog(rootPane, "Por favor insira um mês válido.", "Erro", JOptionPane.WARNING_MESSAGE);
                    pagpreenchida = false;
                    break;
                }  

                if (ano.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "O campo Ano é obrigatório.", "Erro", JOptionPane.WARNING_MESSAGE);
                    pagpreenchida = false;
                    break;
                }
                else if(!ano.matches(anoRegex)){
                    JOptionPane.showMessageDialog(rootPane, "Por favor insira um ano válido.", "Erro", JOptionPane.WARNING_MESSAGE);
                    pagpreenchida = false;
                    break;
                }
                                
                if (cvv.isEmpty()) {
                    JOptionPane.showMessageDialog(rootPane, "O campo CVV é obrigatório.", "Erro", JOptionPane.WARNING_MESSAGE);
                    pagpreenchida = false;
                    break;
                }
                else if(!cvv.matches(cvvRegex)){
                    JOptionPane.showMessageDialog(rootPane, "Por favor insira um CVV válido.", "Erro", JOptionPane.WARNING_MESSAGE);
                    pagpreenchida = false;
                    break;
                } 
                break;
            }
            else{
                break;
            }
        }
        
        if(pagpreenchida){
            if(cboxSalvarCartao.isSelected() && listCartoes.getSelectedValue() == null){
                String cpfCliente = Cliente.cpfUsuario;
                String senhaCliente = Cliente.senhaUsuario;
                Cliente.salvarCartaoCliente(cpfCliente, senhaCliente, cartao, nome, mes, ano, cvv);
            }
            formFinalizacao formFinalizacao = new formFinalizacao();
            formFinalizacao.setCarrinho(carrinho);
            formFinalizacao.setValor(carrinho.valorTotalPub);
            formFinalizacao.mudarEstoque();
            formFinalizacao.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void txtAnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnoActionPerformed

    private void SobreBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SobreBtn1MouseClicked
        sobre.setVisible(true);
    }//GEN-LAST:event_SobreBtn1MouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    public void atualizarParcelamento() {
        double valorTotal = carrinho.valorTotalPub;
        cmbParcelamento.removeAllItems();

        int maxParcelas = 10;

        for (int i = 1; i <= maxParcelas; i++) {
            double valorParcela = valorTotal / i;
            String opcao = i + "x de R$ " + String.format("%.2f", valorParcela) + " sem juros";
            cmbParcelamento.addItem(opcao);
        }
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
            java.util.logging.Logger.getLogger(formCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formCartao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCartao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu SobreBtn1;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JCheckBox cboxSalvarCartao;
    private javax.swing.JComboBox<String> cmbParcelamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JList<String> listCartoes;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JTextField txtCartao;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtNome;
    // End of variables declaration//GEN-END:variables
}
