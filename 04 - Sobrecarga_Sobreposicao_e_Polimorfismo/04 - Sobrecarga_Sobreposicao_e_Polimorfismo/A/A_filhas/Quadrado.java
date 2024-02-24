/*
 * ------------------------------------------------------------
 * Cabeçalho:
 * Nome: Mateus Evangelista
 * Matrícula: 12011BSI277
 * Disciplina: FACOM32305 - Programação Orientada a Objetos
 * Data: 24/02/2024
 * Descrição: Esta classe representa um quadrado bidimensional com lado, herdando de FormaBidimensional.
 * ------------------------------------------------------------
 */


package A.A_filhas;

import A.FormaBidimensional;

public class Quadrado extends FormaBidimensional {
    
    private double lado;

    public Quadrado(String id, String c, double x, double y, double lado){
        super(id, c, x, y);

        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        // TODO Auto-generated method stub
        return lado*lado;
    }

}

/*
 * ------------------------------------------------------------
 * Rodapé:
 * Código desenvolvido por: Mateus Evangelista - 12011BSI277
 * Código revisado por: ChatGPT (GPT-3.5)
 * ------------------------------------------------------------
 */
