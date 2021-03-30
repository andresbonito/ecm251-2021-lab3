package bonito.andre;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Conta c1;
        c1 = new Conta();
        c1.usuário = new usuário();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Infome o nome do usuario 1:");
        String nomec1 = scanner.next();
        c1.usuário.nome = nomec1;
        Conta c2;
        c2 = new Conta();
        c2.usuário = new usuário();
        System.out.println("Infome o nome do usuario 2:");
        String nomec2 = scanner.next();
        c2.usuário.nome = nomec2;
        Conta c3;
        c3 = new Conta();
        c3.usuário = new usuário();
        System.out.println("Infome o nome do usuario 3:");
        String nomec3 = scanner.next();
        c3.usuário.nome = nomec3;
    }
}