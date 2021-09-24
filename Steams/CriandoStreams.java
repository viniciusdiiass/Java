package Steams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
    public static void main(String[] args) {

        Consumer<String> Print = System.out::print;

        //Forma 01
        Stream<String> langs = Stream.of("Java ","Lua ", "JS\n");
        langs.forEach(Print);

        //Forma 02
        String[] maisLangs = {"Python ", "Lisp ", "Perl ","Go\n"};
        Stream.of(maisLangs).forEach(Print);

        //Forma 03
        Arrays.stream(maisLangs).forEach(Print);

        //Forma 04, informando chave inicial e final.
        Arrays.stream(maisLangs, 1,2).forEach(Print);
        Arrays.stream(maisLangs, 1, 4).forEach(Print);

        List<String> outrasLangs = Arrays.asList("C", "PHP", "Kotlin\n");
        outrasLangs.forEach(Print);
        outrasLangs.parallelStream().forEach(Print);

    }
}
