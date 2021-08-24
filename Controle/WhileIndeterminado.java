package Controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Digite Sair para encerrar!");
        String user = dados.next();

        while (!"sair".equalsIgnoreCase(user)){
            System.out.print("Digite Sair para encerrar!");
            user = dados.nextLine();
        }
        System.out.print("Vc digitou Sair");

    dados.close();
    }
}
