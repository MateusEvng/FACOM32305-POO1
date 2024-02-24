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
        return (4/3)*Math.PI*(raio*raio*raio);
    }
    
}
