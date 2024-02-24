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
