package Colecoes;


import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<String>();
        livros.add("O pequeno Principe");
        livros.push("Vida e morte");
        livros.push("O robbit");

      System.out.println(livros.peek());
      System.out.println(livros.element());
      System.out.println(livros.poll());
      System.out.println(livros.remove());
      System.out.println(livros.pop());



    }
}
