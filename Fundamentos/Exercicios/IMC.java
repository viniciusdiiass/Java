package Fundamentos.Exercicios;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        //Captura e leitura de strings
        System.out.print("Qual o seu peso?");
        double peso = dados.nextDouble();

        System.out.print("Qual a sua altura? ex: 178  ");
        double altura = dados.nextDouble();

        double imc = Math.pow(peso / altura,2)*100;

        System.out.printf("Peso: %.2f | Altura: %.2f = Seu IMC é %.2f", peso, altura,imc);
    }
}
