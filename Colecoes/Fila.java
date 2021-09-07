package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> acrescentam a lista
        // diferença é o comportamento quando a fila está cheia
        fila.add("Ana");
        fila.offer("Bia"); //lança uma exceção
        fila.add("carlos"); // retorna falso
        fila.offer("daniel");
        fila.add("gui");
        fila.offer("chica");

        // peek e Element -> obtem próximo elemento sem remover

        System.out.println(fila.peek()); // retorna falso se a fila estiver vazia
        System.out.println(fila.element());// lança uma exceção;


//        fila.size(); // Tamanho da fila
//        fila.clear(); // limpa fila
//        fila.isEmpty() // verifica se a fila está vazia


        //Pool e Remove -> obtem o próximo da fila e remove
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());


    }
}
