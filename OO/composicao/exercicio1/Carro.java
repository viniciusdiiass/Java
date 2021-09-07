package OO.composicao.exercicio1;

public class Carro {

    Motor motor = new Motor();

    void acelerar() {
        if (motor.fatorInjecao < 2.5) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligado() {
        motor.ligado = false;
    }

    boolean EstaLigado() {
        return motor.ligado;
    }

}
