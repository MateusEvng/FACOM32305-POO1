package A;

public class FormaBidimensional extends Forma{
    
    private double x;
    private double y;

    public FormaBidimensional(String id, String c, double x, double y){
        super(id, c);

        this.x = x;
        this.y = y;
    }

    public double obterArea(){
        return 0;
    }



}
