package B.B_filhas;

import B.Funcionario;

public class FuncionarioNoturno extends Funcionario {

    private double valorHora;
    private int noiteTrabalhada;
    
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getNoiteTrabalhada() {
        return noiteTrabalhada;
    }
    public void setNoiteTrabalhada(int noiteTrabalhada) {
        this.noiteTrabalhada = noiteTrabalhada;
    }

    public FuncionarioNoturno(int matricula, String nome, String cpf, int idade, double valorHora){
        super(matricula, nome, cpf, idade);

        setSalarioBase(2500.00);
        setValorHora(valorHora);
        setNoiteTrabalhada(0);

    }

    public void adicionaNoite(){
        setNoiteTrabalhada(getNoiteTrabalhada() + 1);
    }

    public void zeraNoite(){
        setNoiteTrabalhada(0);
    }

    @Override
    public void calculaSalarioMensal() {
        setSalarioMensal(getSalarioBase() + (getNoiteTrabalhada() * getValorHora()));
    }
}
