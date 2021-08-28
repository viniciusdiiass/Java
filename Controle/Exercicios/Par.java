package Controle.Exercicios;

import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
     Scanner dados = new Scanner(System.in);
     System.out.print("Digite um número: ");
     double num = dados.nextDouble();
     double resultado = num % 2;
     if (resultado == 0 ){
         System.out.printf("A número %.2f é par ", num);}
     else{
         System.out.printf("O número %.2f é impar!",num);
        }
     dados.close();

    }
}
