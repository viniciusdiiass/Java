package OO.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {


    String nome;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void adicionarCompras(Compra compra) {
        this.compras.add(compra);}

        double obterValorTotal () {
            double total = 0;
            for (Compra compra : compras) {
                total += compra.obterValorTotal();
            }
            return total;
        }
    }