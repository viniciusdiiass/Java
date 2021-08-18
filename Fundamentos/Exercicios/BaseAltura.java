package Fundamentos.Exercicios;

import java.util.Scanner;

public class BaseAltura {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Digite a base: ");
        String sBase = dados.next();

        System.out.print("Digite a altura: ");
        String sAltura = dados.next();

        double area = Double.parseDouble(sBase) * Double.parseDouble(sAltura) / 2;
        System.out.printf("Base = %.2f | Altura =  %.2f | A área do triangulo é %.2f",
                Double.parseDouble(sBase), Double.parseDouble(sAltura), area);
        dados.close();
    }
}
