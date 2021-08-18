package Fundamentos.Exercicios;

import java.util.Scanner;

public class ConversaoTemperaturaF {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.println("Digite a Temperatura em ºF: ");
        double fahrenheit = dados.nextDouble();

        //logica
        final int ajuste = 32;
        final double fator = 5/9.0;
        double celsius = (fahrenheit - ajuste) * fator;

        System.out.printf("A conversão de %.2f ºF para Celsius é %.2f ºC", fahrenheit,celsius );

        dados.close();
    }
}
