/*
 * ------------------------------------------------------------
 * Cabeçalho:
 * Nome: Mateus Evangelista
 * Matrícula: 12011BSI277
 * Disciplina: FACOM32305 - Programação Orientada a Objetos
 * Data: 24/02/2024
 * Descrição: Esta classe representa um tetraedro tridimensional com base, altura e altura da base, herdando de FormaTridimensional.
 * ------------------------------------------------------------
 */


package A.A_filhas;

import A.FormaTridimensional;

public class Tetraedro extends FormaTridimensional{

    private double base;
    private double altura;
    private double alturaBase;

    public Tetraedro(String id, String c, double x, double y, double z, double base, double altura, double alturaBase){
        super(id, c, x, y, z);

        this.altura = altura;
        this.base = base;
        this.alturaBase = alturaBase;
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
    
    public double getAlturaBase() {
        return alturaBase;
    }
    public void setAlturaBase(double alturaBase) {
        this.alturaBase = alturaBase;
    }

    @Override
    public double obterVolume() {
        return (1.0/3.0)*alturaBase*altura;
    }

}

/*
 * ------------------------------------------------------------
 * Rodapé:
 * Código desenvolvido por: Mateus Evangelista - 12011BSI277
 * Código revisado por: ChatGPT (GPT-3.5)
 * ------------------------------------------------------------
 */