package e;

public class Cliente {
    
    String nome;
    String cpf;
    int idade;
    String telefone;

    //getters setters
    public String getCpf() {
        return cpf;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    void cadastraCliente(String nome, String cpf, int idade, String telefone){
        setCpf(cpf);
        setIdade(idade);
        setNome(nome);
        setTelefone(telefone);
    }

    void mostrarDadosCliente(){
        System.out.println(getCpf());
        System.out.println(getIdade());
        System.out.println(getNome());
        System.out.println(getTelefone());
    }

}
