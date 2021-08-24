package Controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        int quantidadeNotas = 0;
        double nota = 0;
        double total = 0;

        Scanner dados = new Scanner(System.in);

        while(nota != -1){
            System.out.print("Digite a nota: Ou -1 para Sair: \n");
            nota = dados.nextDouble();

            if(nota <= 10 && nota >=0){
                total += nota;
                quantidadeNotas++;
            } else if(nota != -1) {
                System.out.print("Nota Inválida! ;D ");
            }
        }
        double media = total / quantidadeNotas;
        System.out.printf(("Média = " + media));

        dados.close();
        }
}
