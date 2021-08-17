package Fundamentos.Operadores;

public class DesafioLogicos {
    public static void main(String[] args) {
        //Trabalho na terça(V OU F)
        //Trabalho na Quinta (V ou F)
        //se um der certo no final de semana compro TV 30"
        //se ambos derem certo no final de semana compro TV 50"
        // indo shopping todos tomam sorvete

        boolean trabalho1 = true;
        boolean trabalho2 = true;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean maisSaudavel = !comprouSorvete;

        System.out.println("Comprou Tv 50\"?" + comprouTv50);
        System.out.println("Comprou Tv 32\"?" + comprouTv32);
        System.out.println("Comprou sorvete\"?" + comprouSorvete);
        System.out.println("Mais Saudável sorvete\"?" + maisSaudavel);





    }
}
