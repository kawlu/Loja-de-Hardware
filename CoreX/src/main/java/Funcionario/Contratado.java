/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funcionario;



import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 19346049766
 */
public class Contratado {
    public static final String ARQUIVO_FUNCIONARIOS = "Funcionarios.txt";
    
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
    
    public static void consultarContratados(){
    
    }
}
