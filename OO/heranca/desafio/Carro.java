package OO.heranca.desafio;

public class Carro {

    int velocidadeAtual = 0;

    void acelerar() {
            velocidadeAtual += 5;
        }

        void frear() {
            if (velocidadeAtual >= 5) {
                velocidadeAtual -= 5;
            } else {
                velocidadeAtual = 0;
            }
        }

        public String mostraVelocidade(){
        return "Velocidade atual é " + velocidadeAtual + "Km/h";
    }
    }
