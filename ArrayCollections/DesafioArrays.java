package ArrayCollections;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArrays {
    public static void main(String[] args) {

        System.out.println("Quantas notas você quer informar?");

        /*Pede quantidade de dados ao usuário*/
        Scanner dados = new Scanner(System.in);
        int qtdNotas = dados.nextInt();

        /*Inicializa Array   */
        double[] notas = new double[qtdNotas];
        System.out.println(Arrays.toString(notas));


        /* Recebe notas e armazena no Array  */
        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            notas[i] = dados.nextDouble();}

        /* Realizando soma */
        double total = 0;
        for (double nota:notas){
          total +=nota;}

        /*média das notas */
        double media = total / notas.length;

        System.out.println("A média é " + media + "!");

        dados.close();
    }
}
