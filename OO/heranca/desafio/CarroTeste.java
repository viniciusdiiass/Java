package OO.heranca.desafio;

public class CarroTeste {
    public static void main(String[] args) {

        Carro carro1 = new Civic();
        carro1.acelerar();
        carro1.acelerar();
        carro1.acelerar();
        carro1.frear();
        carro1.frear();
        carro1.frear();
        System.out.println(carro1.mostraVelocidade());

        Carro carro2 = new Ferrari();
        carro2.acelerar();
        carro2.acelerar();
        carro2.acelerar();
        carro2.frear();
        System.out.println(carro2.mostraVelocidade());
    }

}
