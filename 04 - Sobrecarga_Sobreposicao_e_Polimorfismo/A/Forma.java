package A;

public class Forma {
    
    private String identificador;
    private String cor;

    public Forma(String id, String c){
        this.cor = c;
        this.identificador = id;
    }

    public String getCor() {
        return cor;
    }
    public String getIdentificador() {
        return identificador;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    

}
