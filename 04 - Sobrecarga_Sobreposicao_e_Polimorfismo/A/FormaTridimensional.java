package A;

public class FormaTridimensional extends Forma {
    
    private double x;
    private double y;
    private double z;


    public FormaTridimensional(String id, String c, double x, double y, double z){
        super(id, c);

        this.x = x;
        this.y = y;
        this.z = z;
    
    }

    public double obterVolume(){
        return 0;
    }



}
