package Controle.Exercicios;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        double nota1 = dados.nextDouble();
        System.out.print("Digite a nota 2: ");
        double nota2 = dados.nextDouble();
        double media = (nota1+nota2)/2;

        if (media >= 7){
            System.out.printf("Sua média final é %.2f, APROVADO!",media); }
        else if(media >= 4){
            System.out.printf("Sua média final é %.2f , EM RECUPERAÇÃO!",media);
        }else{
        System.out.print("Reprovado!");}
        dados.close();
    }

}
