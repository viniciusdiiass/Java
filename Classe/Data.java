package Classe;

public class Data {
    int dia;
    int mes;
    int ano;

    Data(int diaInicial, int mesInicial, int anoInicial){
        this.dia = diaInicial;
        this.mes = mesInicial;
        this.ano = anoInicial;
    }

    Data(){
    dia = 1;
    mes = 1;
    ano = 1970;
    }

    String obterDataFormatada(){
        return String.format("%d/%d/%d",dia,mes,ano); }
}

