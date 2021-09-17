package OO.composicao;

public class Pessoa {

    private int idade;
    private String nome;
    private String sobrenome;

    public Pessoa(int i) {

    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, String sobrenome, int idade){
        setIdade(idade);
    }

    //getters
    public int getIdade(){
        return idade;
    }


    //setter
    public void setIdade(int novaIdade){
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >=0 && novaIdade <= 120){
            this.idade = novaIdade;
        }
    }

    @Override
    public String toString(){
        return "Olá, sou o" +getNome()
                +"e tenho " +getIdade() + "anos.";
    }
}
