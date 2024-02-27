/*
 * ------------------------------------------------------------
 * Cabeçalho:
 * Nome: Mateus Evangelista
 * Matrícula: 12011BSI277
 * Data: 27/02/2024
 * Descrição: Esta classe representa um funcionário noturno, herdando de Funcionario, com informações sobre o valor da hora e noites trabalhadas.
 * ------------------------------------------------------------
 */


package B.B_filhas;

import B.Funcionario;

public class FuncionarioNoturno extends Funcionario {

    private double valorHora;
    private int noiteTrabalhada;
    
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        if (valorHora >= 0) {
            this.valorHora = valorHora;
        } else {
            System.out.println("O valor da hora não pode ser negativo.");
        }
    }
    

    public int getNoiteTrabalhada() {
        return noiteTrabalhada;
    }
    public void setNoiteTrabalhada(int noiteTrabalhada) {
        this.noiteTrabalhada = noiteTrabalhada;
    }

    public FuncionarioNoturno(int matricula, String nome, String cpf, int idade, double valorHora) {
        super(matricula, nome, cpf, idade);
        setSalarioBase(2500.00);
        setValorHora(valorHora);
        setNoiteTrabalhada(0); // Define o número de noites trabalhadas inicialmente como zero
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
