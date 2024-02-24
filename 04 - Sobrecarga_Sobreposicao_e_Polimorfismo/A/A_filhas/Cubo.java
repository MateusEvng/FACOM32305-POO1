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
