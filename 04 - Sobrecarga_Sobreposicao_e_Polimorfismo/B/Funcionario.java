/*
 * ------------------------------------------------------------
 * Cabeçalho:
 * Nome: Mateus Evangelista
 * Matrícula: 12011BSI277
 * Data: 27/02/2024
 * Descrição: Esta classe representa um funcionário básico com informações como matrícula, nome, CPF, idade e salário.
 * ------------------------------------------------------------
 */


package B;

public class Funcionario {

    private int matricula;
    private String nome;
    private String CPF;
    private int idade;

    private double salarioBase;
    private double salarioMensal;

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String cPF) {
        CPF = cPF;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    public Funcionario(int matricula, String nome, String cpf, int idade){

        setCPF(cpf);
        setIdade(idade);
        setMatricula(matricula);
        setNome(nome);
        setSalarioMensal(0.0);
        setSalarioBase(0.0);

    }

    public void calculaSalarioMensal(){
        setSalarioMensal(getSalarioBase());
    }
    
}
