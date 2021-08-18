package Fundamentos.Exercicios;

import java.util.Scanner;

public class ConversaoTemperaturaC {

    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        System.out.println("Digite a Temperatura em ºC: ");
        double celsius = dados.nextDouble();

        //logica
        final int ajuste = 32;
        final double fator = 9 / 5.0;
        double fahrenheit = (celsius * fator) + ajuste;

        System.out.printf("A conversão de %.2f ºC para fahrenheit é %.2f ºF", celsius, fahrenheit);

        dados.close();
    }
}
