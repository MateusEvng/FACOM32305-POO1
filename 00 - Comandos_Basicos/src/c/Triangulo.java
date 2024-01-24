package c;

public class Triangulo {
    
    public double Lado1, Lado2, Lado3;

    //getters e setters
    public double getLado1() {
        return Lado1;
    }
    public double getLado2() {
        return Lado2;
    }
    public double getLado3() {
        return Lado3;
    }

    public void setLado1(double lado1) {
        Lado1 = lado1;
    }
    public void setLado2(double lado2) {
        Lado2 = lado2;
    }
    public void setLado3(double lado3) {
        Lado3 = lado3;
    }

    //perimetro
    double calculaPerimetro(){
        return getLado1() + getLado2() + getLado3();
    }

    int defineTipo(){
        if (getLado1() == getLado2() && getLado2() == getLado3()) {
            return 1; //equilatero
        }
        else if (getLado1() == getLado2() || getLado2() == getLado3() || getLado3() == getLado1()) {
            return 2; //isosceles
        }
        else return 3;
    }


}
