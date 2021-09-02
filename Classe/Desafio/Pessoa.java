package Classe.Desafio;

public class Pessoa {
        String nomePessoa;
        Double pesoPessoa;

        Pessoa(String nomeInicial, Double pesoInicial){
            nomePessoa = nomeInicial;
            pesoPessoa = pesoInicial;
        }

        void comer(Comida comida){
            if(comida != null){
                pesoPessoa += comida.peso;
            }
        }
        String apresentar(){
            return "Olá eu sou o " + nomePessoa + " e tenho" + pesoPessoa + "kg";
        }
}
