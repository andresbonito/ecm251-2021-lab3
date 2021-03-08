package bonito.andre;

public class Main {

    public static void main(String[] args) {
        System.out.println("Quase 5 temporada ai!");
	    //Criar uma referência para Conta
        Conta c1;
        Conta c2;
        //Instanciar um objeto Conta
        c1 = new Conta();
        c1.cliente = new Cliente();
        c2 = new Conta();
        c2.cliente = new Cliente();

        c1.cliente.titular = "Inuyasha";
        c1.saldo = 199.99;

        c1.visaulizarSaldo();
        c1.visaulizarSaldo();

        c2.cliente.titular = "Seichonaru";
        c2.saldo = 1000;
        c2.visaulizarSaldo();

        c1.depositar(20);
        c2.depositar(35.99);

        c1.visaulizarSaldo();
        c2.visaulizarSaldo();

        if (c1.sacar(100)){
            System.out.println("Deu bom!");
        } else{
            System.out.println("Deu ruim!");
        }
        c1.visaulizarSaldo();

        if(c1.transferirPara(100,c2)){
            System.out.println("Deu bom! Transferiu!");
        } else {
            System.out.println("Deu ruim! Não foi!");
        }

        c1.visaulizarSaldo();
        c2.visaulizarSaldo();
        System.out.println("c1" + c1.toString());
        System.out.println("c2" + c2.toString());

    }
}
