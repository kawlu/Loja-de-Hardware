package Loja;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Compra {

    private JPanel painelPrincipal;
    private JLabel labelResumoVenda, labelLoginVerificado, labelEndereco;
    private JTextField campoEndereco;
    private JButton botaoFinalizar;
    private boolean loginVerificado = true; // Verifica o login, se estiver true vai prosseguir, se estiver false vai negar e pedir para que seja feito o login

    public Compra() {
        criarPainel();
    }

    public void criarPainel() {
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new GridLayout(5, 1));

        // Resumo venda
        labelResumoVenda = new JLabel("Resumo da venda: Produto Abacate - R$ 1000000,00");
        painelPrincipal.add(labelResumoVenda);

        // Verificação login
        labelLoginVerificado = new JLabel("Login Verificado: " + (loginVerificado ? "Sim" : "Não"));
        painelPrincipal.add(labelLoginVerificado);

        // Campo endereço
        labelEndereco = new JLabel("Insira seu Endereço (Rua e Número):");
        painelPrincipal.add(labelEndereco);

        campoEndereco = new JTextField();
        painelPrincipal.add(campoEndereco);

        // Botão de finalizar compra
        botaoFinalizar = new JButton("Finalizar Compra");
        botaoFinalizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (loginVerificado) { 
                    // Se o login estiver verificado, tenta finalizar a compra
                    validarEndereco();
                } else {
                    // Se o login não estiver verificado, direciona o usuário para a página de cadastro
                    JOptionPane.showMessageDialog(null, "Login não verificado. Por favor, realize o cadastro ou login.", "Atenção", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        painelPrincipal.add(botaoFinalizar);
        
        Object[] opcoes = {"Cancelar"};
        int resultado = JOptionPane.showOptionDialog(null, painelPrincipal, "Finalização de Compra", 
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
        
        if (resultado == JOptionPane.CLOSED_OPTION || resultado == 0) {
            JOptionPane.showMessageDialog(null, "Compra cancelada!", "Cancelamento", JOptionPane.INFORMATION_MESSAGE);
            System.exit(0); // Fecha o programa após exibir a mensagem
        }
    }

    // Valida o endereço
    public void validarEndereco() {
        String endereco = campoEndereco.getText();
        if (endereco.matches(".+\\d+")) {
            perguntarNovaCompra();
        } else {
            JOptionPane.showMessageDialog(null, "Endereço inválido! Insira um endereço no formato 'Rua, Número'.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Pergunta se o usuário quer fazer uma nova compra
    public void perguntarNovaCompra() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar uma nova compra?", "Nova Compra", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            campoEndereco.setText(""); // Vai limpar o campo para uma nova compra ser feita
        } else {
            JOptionPane.showMessageDialog(null, "Compra finalizada! Obrigado!");
            System.exit(0); // Vai fechar o programa
        }
    }

    public static void main(String[] args) {
        new Compra();
    }
}
