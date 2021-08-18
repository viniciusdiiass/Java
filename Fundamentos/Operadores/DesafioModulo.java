package Fundamentos.Operadores;

import java.util.Scanner;

public class DesafioModulo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a operação que deseja realizar: ");
        var operacao = entrada.nextLine();

        System.out.println("Digite o primeiro valor");
        String Snum1 = entrada.nextLine();
        double num1 = Double.parseDouble(Snum1);


        System.out.println("Digite o segundo valor");
        String Snum2 = entrada.nextLine();
        double num2 = Double.parseDouble(Snum2);

        //logica
        double resultado = "+".equals(operacao) ? num1 + num2: 0;
        resultado = "-".equals(operacao) ? num1 -  num2: resultado;
        resultado = "*".equals(operacao) ? num1 * num2: resultado;
        resultado = "/".equals(operacao) ? num1 / num2: resultado;
        resultado = "%".equals(operacao) ? num1 % num2: resultado;



        System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
        entrada.close();



    }
}
