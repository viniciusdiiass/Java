package Fundamentos.Operadores;

public class Ternario {
    public static void main(String[] args) {
        double media = 0.6;
        String resultado = media >= 7.0?
                "Aprovado" : "em recuperação";

        System.out.println("O aluno está" +" "+ resultado);
    }
}
