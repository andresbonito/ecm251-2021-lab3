package bonito.andre;

public class Conta {

    public Usuario getUsuario() {
        return usuario;
    }

    public int getNumero() {
        return idConta;
    }


    private Usuario usuario;
    private double saldo;
    public int idConta;
    public Conta(String nomeUsuario, double saldoInicial){
        this.saldo = saldoInicial;
        this.usuario = new Usuario(nomeUsuario);
    }

    public int idInicial = 0;
    private int idAtual;
    private int setId(){
        int idAtual = idInicial + 1;
        idInicial += 1;
        return this.idAtual;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor) {

        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferirDinheiro(Conta destino, double valor) {
        if(this.sacar(valor)){
            destino.depositar(valor);
            return true;
        }
        return false;
    }


    public void visualizarSaldo() {
        System.out.println("Saldo atual: R$" + this.saldo);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "cliente=" + usuario.toString() +
                ", saldo=" + saldo +
                ", numero=" + idConta +
                '}';
    }
}