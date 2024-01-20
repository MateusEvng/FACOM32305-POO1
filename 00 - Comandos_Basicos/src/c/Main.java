package c;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner sc = new Scanner(System.in);

        int op = 0;
        int uPos = -1;
        int qt = 3;
        
        Triangulo triangulo[] = new Triangulo[qt];
        main.start(triangulo);

        do {
            System.out.println();
            System.out.println("**** PRÁTICA 00 - C ****\n");

            System.out.println("Escolha uma das opções: \n");
            System.out.println("1- Inserir um novo triângulo.");
            System.out.println("2- Mostrar todos os triângulos.");
            System.out.println("3- Mostrar número de equiláteros.");
            System.out.println("4- Mostrar o triângulo de maior perímetro.");
            System.out.println("5- Sair.");
            
            op = sc.nextInt();

            switch (op) {
                case 1:
                
                    for (int i = uPos +1; i < triangulo.length; i++) {
                        int op_for = 0;
                        triangulo[i] = new Triangulo();
                        System.out.println();
                        System.out.printf("**** TRIÂNGULO %d ****\n", i+1);
                        System.out.println("Insira o valor do Lado1: ");
                        triangulo[i].setLado1(sc.nextDouble());
                        System.out.println("Insira o valor do Lado2: ");
                        triangulo[i].setLado2(sc.nextDouble());
                        System.out.println("Insira o valor do Lado2: ");
                        triangulo[i].setLado3(sc.nextDouble());

                        if (i != triangulo.length - 1) {
                            System.out.println();
                            System.out.println("Você deseja adicionar mais um triângulo?");
                            System.out.println("\t 1- SIM 2- NÃO");
                            op_for = sc.nextInt();  

                            if (op_for == 2) {
                                uPos = i;
                                break;
                            }

                        }
                    }
                    break;
                case 2:
                    main.mostraTriangulos(triangulo);
                    break;
                case 3:
                    System.out.println();
                    System.out.println("O número de triângulos equiláteros é: " + main.calculaEquilatero(triangulo));
                    break;
                case 4:
                    main.maiorTriangulo(triangulo);
                    break;
                case 5:
                    System.out.println("Operação encerrada! :)");
                    break;
                default:
                    System.out.println("Opção inválida. Serviço encerrado.");
                    break;
            }

        } while (op != 5);
        
        sc.close();
    }

        
    String informaTipo(Triangulo tr[], int pos){
    
        String tipo = "incialização";

        int codigoTipo = tr[pos].defineTipo();

            switch (codigoTipo) {
                case 1:
                    tipo = "equilátero";
                    break;
                case 2:
                    tipo = "isósceles";
                    break;
                case 3:
                    tipo = "escaleno";
                    break;
                default:
                    break;
            }

        return tipo;
    }

    int calculaEquilatero(Triangulo tr[]){

        int count = 0;

        for (int i = 0; i < tr.length; i++) {
            if (tr[i].defineTipo() == 1) {
                count ++;
            }
        }

        return count;

    }

    void maiorTriangulo(Triangulo tr[]){

        double maior = tr[0].calculaPerimetro();
        int pos = 0;

        for (int i = 0; i < tr.length; i++) {
            if (maior < tr[i].calculaPerimetro()) {
                maior = tr[i].calculaPerimetro();
                pos = i;
            }
        }
        
        System.out.println();
        System.out.println("Traingulo " + (pos+1) + ": ");
        System.out.printf("Lado1: %.2f Lado2: %.2f Lado3: %.2f\n", tr[pos].getLado1(),tr[pos].getLado2(), tr[pos].getLado3());
        System.out.println("Tipo do Triangulo: " + this.informaTipo(tr, pos));
        System.out.printf("Perímetro igual a %.2f\n", tr[pos].calculaPerimetro());
        System.out.println();

    }

    void mostraTriangulos(Triangulo tr[]){

        for (int i = 0; i < tr.length; i++) {
            System.out.println();
            System.out.println("Triângulo " +(i+1)+ ": ");
            System.out.printf("Lado1: %.2f Lado2: %.2f Lado3: %.2f\n", tr[i].getLado1(),tr[i].getLado2(), tr[i].getLado3());
            System.out.println("Tipo do Triangulo: " + this.informaTipo(tr, i));
            System.out.printf("Perímetro igual a %.2f\n", tr[i].calculaPerimetro());
            System.out.println();
        }
    }

    void start(Triangulo tr[]){

        for (int i = 0; i < tr.length; i++) {
            tr[i] = new Triangulo();
        }
    }


    //getters

}


