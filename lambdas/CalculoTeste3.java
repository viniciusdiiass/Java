package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
        public static void main(String[] args) {

            BinaryOperator<Double> calculo1 = (x, y) -> { return x + y;};
            System.out.println(calculo1.apply(2.0,3.0));

            BinaryOperator<Integer> calculo2 = (x, y) -> x * y;
            System.out.println(calculo2.apply(2,3));


        }
    }
