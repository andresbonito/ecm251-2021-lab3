package bonito.andre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta c1;
        System.out.println("Digite nome do usuario 1:");
        String nomeC1 = scanner.next();
        c1 = new Conta(nomeC1, 1000);
        Conta c2;
        System.out.println("Digite nome do usuario 2:");
        String nomeC2 = scanner.next();
        c2 = new Conta(nomeC2, 250);
        Conta c3;
        System.out.println("Digite nome do usuario 3:");
        String nomeC3 = scanner.next();
        c3 = new Conta(nomeC3, 3000);
        System.out.println("idUsuario 1: " + c1.idConta );
        System.out.println("idUsuario 2: " + c2.idConta );
        System.out.println("idUsuario 3: " + c3.idConta );
    }
}