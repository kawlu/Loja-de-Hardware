/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;



import static Usuario.Cliente.ARQUIVO_CLIENTES;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 19346049766
 */
public class Conta {
    public static final String ARQUIVO_FUNCIONARIOS = "Funcionarios.txt";
    
    public static Boolean login_verificado;
    
    public static void inserirContratado(Scanner entrada, String nome, String senha) throws IOException {
        String linha = nome + "-" + senha;
        salvarContratado(linha);
    }
    
    public static boolean salvarContratado(String linha)throws IOException {
        try (BufferedWriter w_contratados = new BufferedWriter(new FileWriter(ARQUIVO_FUNCIONARIOS, true))) {
            w_contratados.write(linha);
            w_contratados.newLine();
        }
        JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Salvo com sucesso", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }
    
    public static void consultarContratados(String jnome, String jsenha){
        try (BufferedReader r_contratados = new BufferedReader(new FileReader(ARQUIVO_FUNCIONARIOS))) {
            String linha;
            int i = 1;

            while ((linha = r_contratados.readLine()) != null) {
                String[] campos = linha.split("-");
                if (campos.length == 2) {
                    String nome = campos[0];
                    String senha = campos[1];
                    System.out.printf("%d) Nome: %s - Senha: %s\n", i, nome, senha);
                        if (nome.equals(jnome) && senha.equals(jsenha)){
                            JOptionPane.showMessageDialog(null, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                            Funcionario.Conta.login_verificado = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos", "erro", JOptionPane.ERROR_MESSAGE);
                        }
                }
                i++;
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro!", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
