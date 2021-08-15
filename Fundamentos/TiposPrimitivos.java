package Fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do Funcionário

        //Tipos Númericos Inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L;

        //Númericos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2_991_797_103.01;

        //Booleano
        boolean estaDeFerias = true;

        //tipo de caractere
        char status = 'A'; // ativo

        // Dias de Empresa
        System.out.println("Possui " + anosDeEmpresa*365 +" dias de empresa");

        //Número de Viagens
        System.out.println("Realizou " + numeroDeVoos/2 + " Viagens");

        //Pontos por Real
        System.out.println("Acumulou"+pontosAcumulados/vendasAcumuladas+" Pontos de fidelidade");
        System.out.println(id + ":ganha -->"+ salario);
        System.out.println("Férias:"+ estaDeFerias);
        System.out.println("Status:"+ status);

    }
}
