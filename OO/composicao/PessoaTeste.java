package OO.composicao;

public class PessoaTeste {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa(30);

        p1.setIdade(-30); // alterar

        System.out.println(p1.toString());
    }
}