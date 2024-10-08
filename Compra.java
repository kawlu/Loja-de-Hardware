package Loja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Compra {

    private JPanel painel_principal;
    private JLabel label_resumo_venda, label_login_verificado, label_endereco;
    private JTextField campo_endereco;
    private JButton botao_finalizar;
    private boolean login_verificado = false; // Verifica o login, se estiver true vai prosseguir, se estiver false vai negar e pedir para que seja feito o login

    public Compra() {
        CriarPainel();
    }

    public void CriarPainel() {
        painel_principal = new JPanel();
        painel_principal.setLayout(new GridLayout(5, 1));

        // Resumo venda
        label_resumo_venda = new JLabel("Resumo da venda: Produto Abacate - R$ 1000000,00");
        painel_principal.add(label_resumo_venda);

        // Verificação login
        label_login_verificado = new JLabel("Login Verificado: " + (login_verificado ? "Sim" : "Não"));
        painel_principal.add(label_login_verificado);

        // Campo endereço
        label_endereco = new JLabel("Insira seu Endereço (Rua e Número):");
        painel_principal.add(label_endereco);

        campo_endereco = new JTextField();
        painel_principal.add(campo_endereco);

        // Botão de finalizar compra
        botao_finalizar = new JButton("Finalizar Compra");
        botao_finalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (login_verificado) { 
                    // Se o login estiver verificado, tenta finalizar a compra
                    ValidarEndereco();
                } else {
                    // Se o login não estiver verificado, direciona o usuário para a página de cadastro
                    JOptionPane.showMessageDialog(null, "Login não verificado. Por favor, realize o cadastro ou login.", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        painel_principal.add(botao_finalizar);

        // Exibe o painel com botões personalizados ("Cancelar" em vez de "OK")
        Object[] opcoes = {"Cancelar"};
        int resultado = JOptionPane.showOptionDialog(null, painel_principal, "Finalização de Compra", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
        
        if (resultado == JOptionPane.CLOSED_OPTION || resultado == 0) {
            JOptionPane.showMessageDialog(null, "Compra cancelada!", "Cancelamento", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0); // Fechar o programa após exibir a mensagem
        }
    }

    // Valida o endereço
    public void ValidarEndereco() {
        String endereco = campo_endereco.getText();
        if (endereco.matches(".+\\d+")) {
            PerguntarNovaCompra();
        } else {
            JOptionPane.showMessageDialog(null, "Endereço inválido! Insira um endereço no formato 'Rua, Número'.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Pergunta se o usuário quer fazer uma nova compra
    public void PerguntarNovaCompra() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar uma nova compra?", "Nova Compra", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            campo_endereco.setText(""); // Vai limpar o campo para uma nova compra ser feita
        } else {
            JOptionPane.showMessageDialog(null, "Compra finalizada! Obrigado!");
            System.exit(0); // Vai fechar o programa
        }
    }

    public static void main(String[] args) {
        new Compra();
    }
}
