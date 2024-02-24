/*
 * ------------------------------------------------------------
 * Cabeçalho:
 * Nome: Mateus Evangelista
 * Matrícula: 12011BSI277
 * Disciplina: FACOM32305 - Programação Orientada a Objetos
 * Data: 24/02/2024
 * Descrição: Esta classe representa um cubo tridimensional com lado, herdando de FormaTridimensional.
 * ------------------------------------------------------------
 */


package A.A_filhas;

import A.FormaTridimensional;

public class Cubo extends FormaTridimensional{
    
    private double lado;

    public Cubo(String id, String c, double x, double y, double z, double lado){
        super(id, c, x, y, z);

        this.lado = lado;
    }


    public double getLado() {
        return lado;
    }
    public void setLado(double lado) {
        this.lado = lado;
    }


    @Override
    public double obterVolume() {
        return lado*lado*lado;
    }

}

/*
 * ------------------------------------------------------------
 * Rodapé:
 * Código desenvolvido por: Mateus Evangelista - 12011BSI277
 * Código revisado por: ChatGPT (GPT-3.5)
 * ------------------------------------------------------------
 */