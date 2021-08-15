package Fundamentos;

import java.util.Scanner;

public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá, Pessoal".charAt(2));

        String s = "Boa Tarde";
        s = s.toUpperCase();
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("B"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Vinicius";
        var sobrenome ="Dias";
        var idade = 23;
        var salario = 1263.00;
        System.out.println("Nome: "+ nome + "\nSobrenome: "+sobrenome);
        System.out.printf("Nome: %s %s tem %d anos e ganha R$%.2f.", nome, sobrenome, idade, salario);
        String frase = String.format("\nO senhor %s %s tem %d anos e ganha %.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase);


    }

}
