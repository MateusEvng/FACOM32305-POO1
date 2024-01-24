package e;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main sistema = new Main();
        Scanner sc = new Scanner(System.in);

        Cliente cliente[] = new Cliente[2];
        sistema.start(cliente);

        for (int i = 0; i < cliente.length; i++) {
            System.out.println("Insira o nome do Cliente, CPF, Idade e Telefone: ");
            cliente[i].cadastraCliente(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLine());
        }

        for (int i = 0; i < cliente.length; i++) {
            System.out.println("Relatório de Clientes: ");
            System.out.println();
            cliente[i].mostrarDadosCliente();
        }

        
        sc.close();
    }

    void start(Cliente c[]){
        for (int i = 0; i < c.length; i++) {
            c[i] = new Cliente();
        }
    }
}
