package Classe;

public class DataTeste {
    public static void main(String[] args) {

        Data inicial = new Data(25,8,2021);

        var inicial2 = new Data();
        inicial2.ano = 2021;

        System.out.println(inicial.obterDataFormatada());
        System.out.println(inicial2.obterDataFormatada());

    }
}
