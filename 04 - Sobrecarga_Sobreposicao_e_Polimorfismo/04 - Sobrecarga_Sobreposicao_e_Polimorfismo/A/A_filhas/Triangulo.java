/*
 * ------------------------------------------------------------
 * Cabeçalho:
 * Nome: Mateus Evangelista
 * Matrícula: 12011BSI277
 * Disciplina: FACOM32305 - Programação Orientada a Objetos
 * Data: 24/02/2024
 * Descrição: Esta classe representa um triângulo bidimensional com base e altura, herdando de FormaBidimensional.
 * ------------------------------------------------------------
 */


package A.A_filhas;

import A.FormaBidimensional;

public class Triangulo extends FormaBidimensional{
    
    private double base;
    private double altura;


    public Triangulo(String id, String c, double x, double y, double base, double altura){
        super(id, c, x, y);

        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }


    @Override
    public double obterArea() {
        return base*altura;
    }

}

/*
 * ------------------------------------------------------------
 * Rodapé:
 * Código desenvolvido por: Mateus Evangelista - 12011BSI277
 * Código revisado por: ChatGPT (GPT-3.5)
 * ------------------------------------------------------------
 */
