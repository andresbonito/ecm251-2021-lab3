package bonito.andre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Cria um objeto do tipo Conta
        Conta c1;
        //Instancia um objeto Conta
        String nomeC1 = scanner.next();
        c1 = new Conta(nomeC1, 1000);
        Conta c2 = new Conta("Goku", "123456789-9");
        c1.depositar(300);
        c1.sacar(250);
        System.out.println("Conta 1:" + c1.toString());;
        System.out.println("Conta 2:" + c2.toString());;
    }

}