/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author Menino Lindo
 */
public class Usuario {
    public static class Cliente {
        public String nome;
        public String senha;

        // Getter para nome
        public String getNome() {
            return nome;
        }

        // Setter para nome
        public void setNome(String newNome) {
            this.nome = newNome;
        }

        // Getter para senha
        public String getSenha() {
            return senha;
        }

        // Setter para senha
        public void setSenha(String newSenha) {
            this.senha = newSenha;
        }

        // Método para limpar os dados do cliente
        public void limparCliente() {
            this.nome = null;
            this.senha = null;
        }
    }
    public static void main(String args[]) {
        
    }
}
