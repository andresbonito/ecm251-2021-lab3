package bonito.andre;

public class Basico1 {
    public static void main(String[] args) {
        //Tipos primitivos
        int numero;
        float hp;
        double atk;
        boolean gigantamax;
        String nome;

        //Atribuição para as variaveis
        numero = 25;
        hp = 155.0f;
        atk = 255.0;
        gigantamax = true;
        nome = "Pikachu" ;


        //Exibe os valores das variaveis
        System.out.println("Nome:" + nome);
        System.out.println("Gigantamax:" + gigantamax);
        System.out.println("HP:" + hp + " atk:" + atk);
    }
}
