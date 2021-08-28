package Controle.Exercicios;

import java.util.Scanner;

public class AnoAtual {
    public static void main(String[] args) {

        System.out.print("Digite o ano: ");
        Scanner dados = new Scanner(System.in);

        int ano = dados.nextInt();
        int bissexto = ano %4;

        if (bissexto ==0){
            System.out.printf("O ano %d é bissexto!",ano);
        } else {
            System.out.printf("O ano %d não é bissexto", ano);
        }


        dados.close();
    }
}
