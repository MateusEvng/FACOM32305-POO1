/*
 * ------------------------------------------------------------
 * Cabeçalho:
 * Nome: Mateus Evangelista
 * Matrícula: 12011BSI277
 * Disciplina: FACOM32305 - Programação Orientada a Objetos
 * Data: 24/02/2024
 * Descrição: Esta classe representa uma esfera tridimensional com raio, herdando de FormaTridimensional.
 * ------------------------------------------------------------
 */


package A.A_filhas;

import A.FormaTridimensional;

public class Esfera extends FormaTridimensional {

    private double raio;

    public Esfera(String id, String c, double x, double y, double z, double raio){
        super(id, c, x, y, z);

        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }


    @Override
    public double obterVolume() {
        return (4.0/3.0)*Math.PI*(raio*raio*raio);
    }
    
}

/*
 * ------------------------------------------------------------
 * Rodapé:
 * Código desenvolvido por: Mateus Evangelista - 12011BSI277
 * Código revisado por: ChatGPT (GPT-3.5)
 * ------------------------------------------------------------
 */