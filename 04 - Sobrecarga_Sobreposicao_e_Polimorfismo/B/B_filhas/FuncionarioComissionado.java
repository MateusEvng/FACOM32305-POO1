/*
 * ------------------------------------------------------------
 * Cabeçalho:
 * Nome: Mateus Evangelista
 * Matrícula: 12011BSI277
 * Data: 27/02/2024
 * Descrição: Esta classe representa um funcionário comissionado, herdando de Funcionario, com informações sobre comissão e vendas.
 * ------------------------------------------------------------
 */


package B.B_filhas;

import B.Funcionario;

public class FuncionarioComissionado extends Funcionario {

    private double comissao;
    private int vendas;

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        if (comissao >= 0) {
            this.comissao = comissao;
        } else {
            System.out.println("A comissão não pode ser negativa.");
        }
    }
    

    public int getVendas() {
        return vendas;
    }
    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public FuncionarioComissionado(int matricula, String nome, String cpf, int idade) {
        super(matricula, nome, cpf, idade);
        setSalarioBase(2500.00);
        setComissao(0.0); // Define a comissão inicial como zero
        setVendas(0);
    }
    

    public void zeraComissao(){
        setComissao(0.0);
    }

    @Override
    public void calculaSalarioMensal() {
        setSalarioMensal(getSalarioBase() + getComissao());
    }

    public void adicionaVenda(double comissao){
        setVendas(getVendas() + 1);
        setComissao(getComissao() + comissao);
    }




}
