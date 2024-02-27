package B.B_filhas;

import B.Funcionario;

public class FuncionarioComissionado extends Funcionario {

    private double comissao;
    private int vendas;

    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getVendas() {
        return vendas;
    }
    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public FuncionarioComissionado(int matricula, String nome, String cpf, int idade, double comissao){
        super(matricula, nome, cpf, idade);

        setSalarioBase(2500.00);
        setComissao(comissao);
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
