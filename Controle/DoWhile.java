package Controle;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        String texto = "";

        do { System.out.println("Você precisa digitar " +
                "as palavras mágicas!");
            System.out.print("Quer Sair?");
            texto = dados.nextLine();
        }while (!texto.equalsIgnoreCase("por favor"));
        System.out.print("Obrigado");

        dados.close();
    }
}
