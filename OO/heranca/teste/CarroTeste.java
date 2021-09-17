package OO.heranca.teste;

import OO.heranca.desafio.Carro;
import OO.heranca.desafio.Civic;
import OO.heranca.desafio.Ferrari;

public class CarroTeste {
    public static void main(String[] args) {

        Civic carro1 = new Civic();
        System.out.println(carro1.mostraVelocidade());
        carro1.acelerar();
        carro1.ligarTurbo();
        carro1.acelerar();
        System.out.println(carro1.mostraVelocidade());

        Ferrari carro2 = new Ferrari(400);
        System.out.println(carro2.mostraVelocidade());
        carro2.acelerar();
        carro2.ligarTurbo();
        carro2.acelerar();
        carro2.velocidadeAr();
        System.out.println(carro2.mostraVelocidade());

    }

}
