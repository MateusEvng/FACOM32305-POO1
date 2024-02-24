/*
 * ------------------------------------------------------------
 * Cabeçalho:
 * Nome: Mateus Evangelista
 * Matrícula: 12011BSI277
 * Disciplina: FACOM32305 - Programação Orientada a Objetos
 * Data: 24/02/2024
 * Descrição: Esta classe representa um círculo bidimensional com raio, herdando de FormaBidimensional.
 * ------------------------------------------------------------
 */


package A.A_filhas;


import A.FormaBidimensional;

public class Circulo extends FormaBidimensional{

    private double raio;

    public Circulo(String id, String c, double x, double y, double raio){
        super(id, c, x, y);

        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        // TODO Auto-generated method stub
        return Math.PI * (raio*raio);
    }


    
}

/*
 * ------------------------------------------------------------
 * Rodapé:
 * Código desenvolvido por: Mateus Evangelista - 12011BSI277
 * Código revisado por: ChatGPT (GPT-3.5)
 * ------------------------------------------------------------
 */
