package OO.composicao.exercicio2;

public class CompraTeste {
    public static void main(String[] args) {


        Compra compra1 = new Compra();
        compra1.cliente = "Vinicius";

        compra1.adicionarItem("Caneta",2,2.99);
        compra1.adicionarItem("Lápis",2,3.99);
        compra1.adicionarItem("Caderno",2,12.99);
        compra1.adicionarItem(new Item("camisa",8,5.99));

        System.out.println("A quantidade de itens é "+compra1.itens.size());
        System.out.println("O total é R$ " + compra1.obtervalorTotal());

    }
}

