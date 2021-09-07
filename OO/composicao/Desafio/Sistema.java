package OO.composicao.Desafio;

public class Sistema {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.adicionarItem("camisa",25.90,2);
        compra1.adicionarItem("cueca",2.80,2);

        Compra compra2 = new Compra();
        compra2.adicionarItem("bermuda",88.90,2);

        Cliente cliente = new Cliente("Vinicius Dias");
        cliente.adicionarCompras(compra1);
        cliente.adicionarCompras(compra2);

        System.out.println("O saldo total é " + cliente.obterValorTotal());





    }
}
