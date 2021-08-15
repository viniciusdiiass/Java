package Fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print("Dia\n\n");

        System.out.println("Bom");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Digite seu Sobrenome:");
        String sobrenome = entrada.nextLine();

        System.out.println("Digite a sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Seu nome é " + nome + " " + sobrenome + " " + "e tem" + " " + idade +" "+"anos");
        System.out.printf("%s %s tem %d anos.%n",nome, sobrenome, idade);

        entrada.close();
    }
}
