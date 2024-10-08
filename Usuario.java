import javax.swing.JOptionPane;

public class Usuario {
    // Classe interna estática para armazenar os dados do Cliente
    public static class Cliente {
        private String nome;
        private String senha;

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
                nome = null;
                senha = null;
            
        }
    }

    // Instância do Cliente compartilhada entre os métodos
    private static Cliente cliente = new Cliente();

    public static void main(String[] args) {
        String[] opcoes = {"Login", "Cadastrar", "VOLTAR"};

        int escolha = JOptionPane.showOptionDialog(null, "O que você deseja fazer?", "Escolha uma opção", 
            JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);

        switch (escolha) {
            case 0:
                // Login selecionado
                login();
                break;
            case 1:
                // Cadastrar selecionado
                cadastrar();
                login();
                break;
            case 2:
                // VOLTAR selecionado
                JOptionPane.showMessageDialog(null, "Voltando à tela anterior.");
                cliente.limparCliente(); // Limpa os dados do cliente ao voltar
                break;
            default:
                break;
        }
    }

    // Método para realizar o login
    public static void login() {
        String nome = JOptionPane.showInputDialog(null, "Usuário:", "Login", JOptionPane.PLAIN_MESSAGE);
        String senha = JOptionPane.showInputDialog(null, "Senha:", "Login", JOptionPane.PLAIN_MESSAGE);

        if (nome != null && senha != null && nome.equals(cliente.getNome()) && senha.equals(cliente.getSenha())) {
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
        }
    }

    // Método para cadastrar um novo usuário
    public static void cadastrar() {
        String nome = JOptionPane.showInputDialog(null, "Usuário:", "Cadastro", JOptionPane.PLAIN_MESSAGE);
        cliente.setNome(nome);

        String senha = JOptionPane.showInputDialog(null, "Senha:", "Cadastro", JOptionPane.PLAIN_MESSAGE);
        cliente.setSenha(senha);

        JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!\nUsuário: " + cliente.getNome() + "\nSenha:" + cliente.getSenha(), JOptionPane.PLAIN_MESSAGE);
    }
}
