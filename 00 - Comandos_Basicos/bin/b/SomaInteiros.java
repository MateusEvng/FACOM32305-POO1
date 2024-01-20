package b;

import java.util.Scanner;

public class SomaInteiros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int inteiroUm, inteiroDois = 0;

        System.out.println("Insira dois valores e eu retornarei a soma deles: ");
        inteiroUm = scanner.nextInt();
        inteiroDois = scanner.nextInt();

        int SomaInteiros = inteiroUm + inteiroDois;

        System.out.println("A soma dos inteiros é: " + SomaInteiros);


        scanner.close();

    }
}
