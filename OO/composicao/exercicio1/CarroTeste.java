package OO.composicao.exercicio1;

import OO.composicao.exercicio1.Carro;

public class CarroTeste {
    public static void main(String[] args) {

        Carro c1 = new Carro();
        System.out.println("O carro está ligado? " + c1.EstaLigado());
        c1.ligar();

        System.out.println("O carro está ligado? " + c1.EstaLigado());
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println("Quantos giros? " + c1.motor.giros());
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();

        System.out.println("Quantos giros? " + c1.motor.giros());
    }
}
