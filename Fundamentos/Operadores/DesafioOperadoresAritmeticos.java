package Fundamentos.Operadores;

public class DesafioOperadoresAritmeticos {
    public static void main(String[] args) {

        double fracao1_ResultMulti = (6 * (3+2));
        double fracao1_ResultPotencia = Math.pow(fracao1_ResultMulti, 2);
        double fracao1_ResultFinal = fracao1_ResultPotencia / 6;

        double fracao2_ResultMulti = ((1 -5 ) * (2-7) / 2);
        double fracao2_ResultFinal = Math.pow(fracao2_ResultMulti,2);

       double fracaoP3 = fracao1_ResultFinal - fracao2_ResultFinal;

       double fracaoP3Potencia = 10;

       double fracaoP4 = fracaoP3 / fracaoP3Potencia;
       double fracaoP5 = Math.pow(fracaoP4, 3);

       System.out.println(fracaoP5);

    }
}
