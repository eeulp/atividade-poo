public class Pessoa {

        // Atributos privados
        private String nome;
        private String cpf;
        private int idade;
    
        // Construtor padrão
        public Pessoa() {}
    
        // Construtor com parâmetros
        public Pessoa(String nome, String cpf, int idade) {
            this.nome = nome;
            this.cpf = cpf;
            this.idade = idade;
        }
    
        // Métodos get e set para nome
        public String getNome() {
            return nome;
        }
    
        public void setNome(String nome) {
            this.nome = nome;
        }
    
        // Métodos get e set para CPF
        public String getCpf() {
            return cpf;
        }
    
        public void setCpf(String cpf) {
            this.cpf = cpf;
        }
    
        // Métodos get e set para idade
        public int getIdade() {
            return idade;
        }
    
        public void setIdade(int idade) {
            this.idade = idade;
        }
    }
    

