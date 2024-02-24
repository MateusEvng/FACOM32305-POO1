/*
 * ------------------------------------------------------------
 * Cabeçalho:
 * Nome: Mateus Evangelista
 * Matrícula: 12011BSI277
 * Disciplina: FACOM32305 - Programação Orientada a Objetos
 * Data: 24/02/2024
 * Descrição: Esta classe representa uma forma tridimensional com coordenadas x, y e z, herdando de Forma.
 * ------------------------------------------------------------
 */


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

/*
 * ------------------------------------------------------------
 * Rodapé:
 * Código desenvolvido por: Mateus Evangelista - 12011BSI277
 * Código revisado por: ChatGPT (GPT-3.5)
 * ------------------------------------------------------------
 */