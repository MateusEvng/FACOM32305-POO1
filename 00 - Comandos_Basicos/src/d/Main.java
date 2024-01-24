package d;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main programa = new Main();
        Scanner sc = new Scanner(System.in);


        Ponto ponto[] = new Ponto[2];
        programa.startPonto(ponto);
        
        for (int i = 0; i < ponto.length; i++) {
            System.out.println("Insira uma letra para nomear o Ponto: ");
            ponto[i].setId(sc.next().charAt(0));
            System.out.println("Insira o valor da Coordenada X: ");
            ponto[i].setX(sc.nextDouble());
            System.out.println("Insira o valor da Coordenada Y: ");
            ponto[i].setY(sc.nextDouble());
            System.out.println();
        }
        programa.distancia(ponto);





        sc.close();
    }

    void startPonto(Ponto ponto[]){
        for (int i = 0; i < ponto.length; i++) {
            ponto[i] = new Ponto();
            ponto[i].start();
        }
    }

    void distancia(Ponto p[]){
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p.length; j++) {
                System.out.println("A distancia entre o ponto " + p[i].id + " e o ponto " + p[j].id + " é: " + String.format("%.2f", p[i].calculaDistanciaEuclidiana(p[j])));
            }
        }
    }

}
