package Fundamentos;

import java.net.StandardSocketOptions;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "Bom dia X";
        s = s.replace("X", "Senhora"); // Substitui "X" por "Senhora"
        s = s.toUpperCase(); // Coloca letras em maiúsculas
        s = s.concat("!!!");

        String x = "Vini".toUpperCase();
        System.out.println(s);

        String y = "Bom dia, X".replace("X", "Gui").toUpperCase().concat("!!!");
        System.out.println(y);
    }

    //Tipos primitivos não possuem operador "."
}
