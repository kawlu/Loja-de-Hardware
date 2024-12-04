package Usuario;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Cliente {
    public static final String ARQUIVO_CLIENTES = "Clientes.txt";
    public static String cpfUsuario = null;
    public static String senhaUsuario = null;
    public static Boolean login_verificado = false;
    public static Boolean encontrado = false;

    public static void inserirCliente(String nome, String email, String CPF, String senha, String cep, String estado, String bairro, String cidade, String logradouro, String numero, String complemento) throws IOException {
        verificarDados(CPF, email);

        if (!encontrado) { // Só salva se os dados não forem encontrados
            String linha = nome + "_" + CPF + "_" + email + "_" + senha + "_"+ cep + "_" + estado + "_" + bairro + "_" + cidade + "_" + logradouro + "_" + numero + "_" 
                    + complemento + "______";
            salvarCliente(linha);
        } else {
            JOptionPane.showMessageDialog(null, "E-mail ou CPF já está sendo usado", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void salvarCliente(String linha) throws IOException {
        try (BufferedWriter w_clientes = new BufferedWriter(new FileWriter(ARQUIVO_CLIENTES, true))) {
            w_clientes.write(linha);
            w_clientes.newLine();
        }
        JOptionPane.showMessageDialog(null, "Cliente salvo com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    }

    // Método para verificar se os dados já foram usados
    public static void verificarDados(String jcpf, String jemail) {
        encontrado = false;

        try (BufferedReader r_clientes = new BufferedReader(new FileReader(ARQUIVO_CLIENTES))) {
            String linha;

            while ((linha = r_clientes.readLine()) != null) {
                linha = linha.trim();
                if (linha.isEmpty()) continue;

                String[] campos = linha.split("_");
                
                if (campos.length < 2) continue;
                
                String cpf = campos[1];
                String email = campos[2];
                

                if (cpf.equals(jcpf) && email.equals(jemail)) {
                    encontrado = true;
                    break;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método para consultar clientes no arquivo
    public static void consultarClientes(String texto, String jsenha) {
        login_verificado = false;

        try (BufferedReader r_clientes = new BufferedReader(new FileReader(ARQUIVO_CLIENTES))) {
            String linha;

            while ((linha = r_clientes.readLine()) != null) {
                linha = linha.trim();
                if (linha.isEmpty()) continue;

                String[] campos = linha.split("_");
                if (campos.length < 2) continue;

                String cpf = campos[1];
                String email = campos[2];
                String senha = campos[3];

                if (senha.equals(jsenha) && (cpf.equals(texto) || email.equals(texto))) {
                    JOptionPane.showMessageDialog(null, "Login bem-sucedido!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    cpfUsuario = cpf;
                    senhaUsuario = senha;
                    login_verificado = true;
                    break;
                }
            }
            
            if (!login_verificado) {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static String consultarEnderecoCliente(String texto, String senha){
        try{
            BufferedReader r_clientes = new BufferedReader(new FileReader(ARQUIVO_CLIENTES));
            String linha;
            
            while ((linha = r_clientes.readLine()) != null) {
                linha = linha.trim();
                if (linha.isEmpty()) continue;
                String[] campos = linha.split("_");
                String nome = campos[0];
                String cpf = campos[1];
                String Email = campos[2];
                String Senha = campos[3];
                String CEP = campos[4];
                String estado = campos[5];
                String bairro = campos[6];
                
                if(senha.equals(Senha) && (cpf.equals(texto) || Email.equals(texto))){
                    return bairro;
                }
            }
            r_clientes.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    
    public static void salvarCartaoCliente(String texto, String senha, String cartaoNumero, String cartaoNome, String cartaoMes, String cartaoAno, String cartaoCvv){
        try{
            BufferedReader r_clientes = new BufferedReader(new FileReader(ARQUIVO_CLIENTES));
            BufferedWriter w_clientes = new BufferedWriter(new FileWriter("ClientesTemp.txt"));
            String linha;

            while ((linha = r_clientes.readLine()) != null) {
                linha = linha.trim();
                if (linha.isEmpty()) continue;

                String[] campos = linha.split("_");
                String nome = campos[0];
                String cpf = campos[1];
                String Email = campos[2];
                String Senha = campos[3];
                String CEP = campos[4];
                String estado = campos[5];
                String bairro = campos[6];
                String cidade = campos[7];
                String logradouro = campos[8];
                String numero = campos[9];
                String complemento = campos[10];
                String numeroCartao;
                String nomeCartao;
                String mesCartao;
                String anoCartao;
                String cvv;
                
                if(senha.equals(Senha) && (cpf.equals(texto) || Email.equals(texto))){
                    numeroCartao = cartaoNumero;
                    nomeCartao = cartaoNome;
                    mesCartao = cartaoMes;
                    anoCartao = cartaoAno;
                    cvv = cartaoCvv;
                    w_clientes.write(nome + "_" + cpf + "_" + Email + "_" + Senha + "_"+ CEP + "_" + estado + "_" + bairro + "_" + cidade + "_" + 
                            logradouro + "_" + numero + "_" + complemento + "_" + numeroCartao + "_" + nomeCartao + "_" + mesCartao 
                            + "_" + anoCartao + "_" + cvv + "\n");
                }
                else{
                    //System.out.println("\n"+linha+"\n");
                    w_clientes.write(linha+"\n");
                }
            }
            w_clientes.close();
            r_clientes.close();
            
            File ClientesOld = new File("Clientes.txt");
            File ClientesNew = new File("ClientesTemp.txt");
            ClientesOld.delete();
            ClientesNew.renameTo(new File("Clientes.txt"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao acessar o arquivo!", "Erro", JOptionPane.ERROR_MESSAGE);
        }

    } 
}