package bonito.andre;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Contas 1, 2 e 3

        Scanner scanner = new Scanner(System.in);

        Contas c1;
        System.out.println("Digite nome do usuario 1:");
        String nomeC1 = scanner.next();
        c1 = new Contas(nomeC1, 1000);

        Contas c2;
        System.out.println("Digite nome do usuario 2:");
        String nomeC2 = scanner.next();
        c2 = new Contas(nomeC2, 250);


        Contas c3;
        System.out.println("Digite nome do usuario 3:");
        String nomeC3 = scanner.next();
        c3 = new Contas(nomeC3, 3000);

        //Estado Inicial codigo

        System.out.println("Estado Inicial:");
        System.out.println("Nome Usuário: " + c1.toString());
        System.out.println("Nome Usuário: " + c2.toString());
        System.out.println("Nome Usuário: " + c3.toString());

        //Estado Final codigo
        System.out.println("Estado Final:");
        System.out.println("Nome Usuario: " + );
        System.out.println("Nome Usuario: " + );
        System.out.println("Nome Usuario: " + );


    }
}