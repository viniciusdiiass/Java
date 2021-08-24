package Controle;

import java.util.Scanner;

public class DesafioDiaSemana {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Digite o dia da semana:");
        String dia = dados.nextLine();

        if ("domingo".equals(dia)){
            System.out.printf("Vc digitou %s = 1.", dia); }
        else if ("segunda".equals(dia)){
            System.out.printf("Vc digitou %s = 2.", dia); }
        else if ("terça".equals(dia)
                || "terca".equals(dia)){
            System.out.printf("Vc digitou %s = 3.", dia); }
        else if ("quarta".equals(dia)){
            System.out.printf("Vc digitou %s = 4.", dia); }
        else if ("quinta".equals(dia)){
            System.out.printf("Vc digitou %s = 5.", dia); }
        else if ("sexta".equals(dia)){
            System.out.printf("Vc digitou %s = 6.", dia); }
        else if ("Sábado".equals(dia) ||
        "sabado".equals(dia)){
            System.out.printf("Vc digitou %s = 7.", dia); }
        else{
            System.out.print("Vc digitou um dia da semana inválido"); }

            dados.close();
    }
}
