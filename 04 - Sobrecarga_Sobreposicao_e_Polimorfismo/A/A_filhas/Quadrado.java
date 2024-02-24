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
