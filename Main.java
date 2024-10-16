package Swing.co.CoreX;

import Swing.co.CoreX.Carrinho.Carrinho;
import Swing.co.CoreX.Catalogo.Catalogo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    private static JTextField inputField;
    private static JButton okButton;
    private static JButton cancelButton;
    private static Catalogo catalogo;
    private static Carrinho carrinho;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public Main() {
        setTitle("Escolha uma opção");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Painel principal com BoxLayout (vertical)
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Define margens internas

        // Criação dos componentes
        JLabel label0 = new JLabel("Escolha uma opção:");
        JLabel label1 = new JLabel("1 - Ir para o catálogo");
        JLabel label2 = new JLabel("2 - Ver Carrinho");
        JLabel label3 = new JLabel("3 - Sair");
        label0.setAlignmentX(Component.CENTER_ALIGNMENT);
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        label2.setAlignmentX(Component.CENTER_ALIGNMENT);
        label3.setAlignmentX(Component.CENTER_ALIGNMENT);

        label0.setFont(new Font("Arial",Font.PLAIN,15));
        label1.setFont(new Font("Arial",Font.PLAIN,15));
        label2.setFont(new Font("Arial",Font.PLAIN,15));
        label3.setFont(new Font("Arial",Font.PLAIN,15));

        inputField = new JTextField(10);
        inputField.setMaximumSize(new Dimension(200, 30)); // Define o tamanho máximo do campo de input
        inputField.setAlignmentX(Component.CENTER_ALIGNMENT); // Centraliza o input

        // Painel para os botões, com FlowLayout para deixá-los lado a lado
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 0)); // Espaçamento entre os botões

        okButton = new JButton("OK");
        cancelButton = new JButton("Cancelar");
        okButton.setFont(new Font("Arial",Font.BOLD,13));
        cancelButton.setFont(new Font("Arial",Font.BOLD,13));

        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        // Criação das instâncias de catálogo e carrinho (fora do método para manter o estado)
        catalogo = new Catalogo();
        carrinho = new Carrinho();

        // Construção da lista de produtos uma única vez
        catalogo.construirListaProdutos();

        okAction();

        panel.add(label0);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Espaço entre o label e o campo de input
        panel.add(inputField);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Espaço entre o input e os botões
        panel.add(buttonPanel);

        // Adiciona o painel principal à janela
        add(panel);
    }

    public static void okAction() {
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                boolean continuar = true;

                while(continuar){
                    String input = inputField.getText();

                    if (input == null || input.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Por favor, insira uma opção válida.", "Erro", JOptionPane.ERROR_MESSAGE);
                        inputField.setText("");
                        break;
                    }

                    switch (input) {
                        case "1":
                            catalogo.exibirProdutos(carrinho);  // Usar o carrinho persistente
                            break;
                        case "2":
                            carrinho.escolherOperacao();  // Operação no carrinho persistente
                            break;
                        case "3":
                            JOptionPane.showMessageDialog(null, "Obrigado por usar o sistema!");
                            continuar = false;
                            System.exit(0);
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Erro: Nenhuma opção foi selecionada. Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
                            break;
                    }
                    inputField.setText("");
                    break;
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Operação cancelada.");
                inputField.setText("");
                System.exit(0);
            }
        });
    }
}
