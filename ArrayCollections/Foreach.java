package ArrayCollections;

public class Foreach {
    public static void main(String[] args) {

        double[] notas = {6.2, 9.5, 8.9, 7.7};

        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");}

        for(double nota:notas){
            System.out.print(nota + " ");
        }
    }
}
