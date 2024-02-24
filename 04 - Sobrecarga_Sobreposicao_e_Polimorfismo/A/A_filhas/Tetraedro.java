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
        return (1/3)*alturaBase*altura;
    }

}
