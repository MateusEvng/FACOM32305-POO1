/*
 * ------------------------------------------------------------
 * Cabeçalho:
 * Nome: Mateus Evangelista
 * Matrícula: 12011BSI277
 * Disciplina: FACOM32305 - Programação Orientada a Objetos
 * Data: 24/02/2024
 * Descrição: Esta classe representa uma forma bidimensional com coordenadas x e y, herdando de Forma.
 * ------------------------------------------------------------
 */


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

/*
 * ------------------------------------------------------------
 * Rodapé:
 * Código desenvolvido por: Mateus Evangelista - 12011BSI277
 * Código revisado por: ChatGPT (GPT-3.5)
 * ------------------------------------------------------------
 */