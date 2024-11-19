/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

import Usuario.Frm_Login;

/**
 * Classe Cliente para gerenciar clientes.
 */
public class Cliente {
    public static final String ARQUIVO_CLIENTES = "Clientes.txt";
    
    public static Boolean login_verificado;

    // Método para inserir cliente
    public static void inserirCliente(Scanner entrada, String nome, String senha) throws IOException {
        String linha = nome + "-" + senha;
        salvarCliente(linha);
    }

    // Método para salvar cliente no arquivo
    public static boolean salvarCliente(String linha) throws IOException {
        try (BufferedWriter w_clientes = new BufferedWriter(new FileWriter(ARQUIVO_CLIENTES, true))) {
            w_clientes.write(linha);
            w_clientes.newLine();
        }
        JOptionPane.showMessageDialog(null, "Salvo com sucesso", "Salvo com sucesso", JOptionPane.INFORMATION_MESSAGE);
        return true;
    }

    // Método para consultar clientes no arquivo
    public static void consultarClientes(String jnome,String jsenha) {
        try (BufferedReader r_clientes = new BufferedReader(new FileReader(ARQUIVO_CLIENTES))) {
            String linha;
            int i = 1;

            while ((linha = r_clientes.readLine()) != null) {
                String[] campos = linha.split("-");
                if (campos.length == 2) {
                    String nome = campos[0];
                    String senha = campos[1];
                    System.out.printf("%d) Nome: %s - Senha: %s\n", i, nome, senha);
                        if (nome.equals(jnome) && senha.equals(jsenha)){
                            JOptionPane.showMessageDialog(null, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                            login_verificado = true;
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

    public static void main(String[] args) {
        // Exemplo de uso
    }
}
