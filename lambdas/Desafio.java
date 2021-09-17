package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {

        Produto p = new Produto("Ipad", 3235.89, 0.50);

        Function<Produto, Double> precoFinal =
                produto -> produto.preco * (1 - produto.desconto);

        UnaryOperator<Double> impostoMunicipal =
                preco -> preco >= 2500.00 ? preco * 1.085 : preco;
        UnaryOperator<Double> Frete = preco ->
                preco >= 3000.00 ? preco + 100.00 : preco + 50.00;
        UnaryOperator<Double> arredondar =
                preco -> Double.parseDouble(String.format("%.2f",preco));
        Function<Double, String> formatar =
                preco -> ("R$" + preco).replace(".", ",");


        String preco = precoFinal
                .andThen(impostoMunicipal)
                .andThen(Frete)
                .andThen(arredondar)
                .andThen(formatar)
                .apply(p);

        System.out.printf("O preco final é %s",preco);
    }
}
