package bonito.andre;

public class Usuario {
    public Usuario(String nome){
        this.nome = nome;
    }

    private String nome;
    private String sobrenome;
    private String cpf;

    @Override
    public String toString() {
        return "Usuario{" +
                "nome ='" + nome + '\'' +
                ", sobrenome ='" + sobrenome + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
