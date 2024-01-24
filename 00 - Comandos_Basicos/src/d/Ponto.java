package d;

public class Ponto {
    
    char id;
    double x, y;

    //getters e setters
    public char getId() {
        return id;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public void setId(char id) {
        this.id = id;
    }
    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }

    void start(){
        setX(0.0);
        setY(0.0);
    }

    double calculaDistanciaEuclidiana(Ponto b){
        double radicando = Math.pow((b.getX()-getX()), 2) + Math.pow((b.getY()-getY()), 2);
        return Math.sqrt(radicando);
    }

}
