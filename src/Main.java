public class Main {
    public static void main(String[] args) {
        // Criação de instância do gerenciador de pessoas
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();

        // Cadastro de duas pessoas
        Pessoa pessoa1 = new Pessoa("Ana", "123.456.789-00", 25);
        Pessoa pessoa2 = new Pessoa("Carlos", "987.654.321-11", 30);
        
        gerenciador.cadastrarPessoa1(pessoa1);
        gerenciador.cadastrarPessoa2(pessoa2);

        // Exibição dos dados das pessoas cadastradas
        gerenciador.exibirPessoa1();
        gerenciador.exibirPessoa2();

        // Atualização dos dados de Pessoa 1
        Pessoa pessoaAtualizada = new Pessoa("Ana Maria", "123.456.789-00", 26);
        gerenciador.atualizarPessoa1(pessoaAtualizada);

        // Exibição após a atualização
        gerenciador.exibirPessoa1();
    }
}
