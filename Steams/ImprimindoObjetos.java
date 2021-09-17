package Steams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Ana", "Lu", "Gui", "Luca");

        for (String nome : aprovados) {
            System.out.println(nome);
        }

        System.out.println("\nUsando Iterator");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nUsando Stream & ForEach");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); // Laço Interno
    }
}
