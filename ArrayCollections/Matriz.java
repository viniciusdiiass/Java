package ArrayCollections;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        System.out.print("Quantos Alunos?");
        int qtdAlunos = dados.nextInt();

        System.out.println("Quantas notas por aluno?");
        int qtdNotas = dados.nextInt();

        double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

        double total=0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {
                System.out.printf("Informe a nota %d do aluno %d: ", n +1 ,a + 1);
                notasDaTurma[a][n] = dados.nextDouble();
                total += notasDaTurma[a][n];}}

        double media = total / (qtdAlunos * qtdNotas);
        System.out.println("Média da turma é: " + media);

        for (double[] notasDoAluno: notasDaTurma) {
            System.out.println(Arrays.toString(notasDoAluno));
        }
        dados.close();
    }
}
