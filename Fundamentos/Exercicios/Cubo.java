package Fundamentos.Exercicios;

import java.util.Scanner;

public class Cubo {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        String  num1 = dados.next();
        double num = Double.parseDouble(num1);

        double cubo = Math.pow(num,3);
        double quadrado = Math.pow(num,2);

        System.out.printf("O valor de %.2f ao cubo é %.2f e ao quadrado é %.2f", num, cubo, quadrado) ;
        dados.close();
    }
}
