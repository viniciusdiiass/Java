package Excecao;

public class ChecadaVcNaoChecada {

    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim: )");
    }

    //Não checada ou não verificada
    static void geraErro1() {
       throw  new RuntimeException("Ocorreu um erro bem legal #01");
    }

    // exceção checada ou verificada
    static void geraErro2(){
        try {
            throw new Exception("Ocorreu um erro bem legal #02");
        } catch (Exception e) {
            System.out.println("que legal!");
        }
    }
}