package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        // Scanner para pegar 3 strings com next line para receber salarios e tirar media

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o Valor do seu salário no mês atual: ");
        String mesAtual = entrada.nextLine().replace(",",".");

        System.out.print("Digite o Valor do seu salário no mês anterior: ");
        String mesAnterior = entrada.nextLine().replace(",",".");

        System.out.print("Digite o Valor do seu salário de três meses atras: ");
        String tresMesesAtras = entrada.nextLine().replace(",",".");

        Double salario1 = Double.parseDouble(mesAtual) ;
        Double salario2 = Double.parseDouble(mesAnterior);
        Double salario3 = Double.parseDouble(tresMesesAtras);

        double soma = salario1 + salario2 + salario3;
        double media = soma/3;

        System.out.printf("A soma dos três meses é R$ %.2f. e a media é R$ %.2f.", soma, media);

        entrada.close();

    }
}
