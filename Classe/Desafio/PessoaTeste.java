package Classe.Desafio;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Vinicius Dias", 102.0);

        Comida c1 = new Comida("arroz", 0.265);

        System.out.println(p1.apresentar());
        p1.comer(c1);
        System.out.println(p1.apresentar());


    }
}
