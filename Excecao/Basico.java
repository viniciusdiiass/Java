package Excecao;

import OO.composicao.exercicio3.Aluno;

public class Basico {
    public static void main(String[] args) {
        Aluno a1 = null;
        try{
            imprimirNomeDoAluno(a1);}
        catch (Exception excecao){
            System.out.println("Ocorreu um erro no momento da " +
                    "impressão do nome");
        }
        try {
            System.out.println(7/0);
        } catch (Exception ArithmeticException) {
            System.out.println("Ocorreu um erro: "+ArithmeticException.getMessage() );
        }
        System.out.println("Fim");
    }

    private static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno);
    }
}