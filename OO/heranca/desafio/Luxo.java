package OO.heranca.desafio;

public interface Luxo {

    void ligarAr();
    void desligarAr();

    default int velocidadeAr(){
        return 1;
    }

}
