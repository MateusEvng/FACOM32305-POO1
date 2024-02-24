/*
 * ------------------------------------------------------------
 * Cabeçalho:
 * Nome: Mateus Evangelista
 * Matrícula: 12011BSI277
 * Disciplina: FACOM32305 - Programação Orientada a Objetos
 * Data: 24/02/2024
 * Descrição: Esta classe representa uma forma geométrica básica com identificador e cor.
 * ------------------------------------------------------------
 */


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

/*
 * ------------------------------------------------------------
 * Rodapé:
 * Código desenvolvido por: Mateus Evangelista - 12011BSI277
 * Código revisado por: ChatGPT (GPT-3.5)
 * ------------------------------------------------------------
 */