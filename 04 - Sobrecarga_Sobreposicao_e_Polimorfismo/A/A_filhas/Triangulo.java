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
