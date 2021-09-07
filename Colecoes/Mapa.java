package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer , String> usuarios = new HashMap<>();
        usuarios.put(1, "Roberto");
        usuarios.put(12, "Ricardo");
        usuarios.put(10, "Ricard");
        usuarios.put(122, "Bruno");

        System.out.println(usuarios.size());
        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.containsKey(12));
        System.out.println(usuarios.entrySet());
        System.out.println(usuarios.containsValue("Bruno"));
        System.out.println("Removeu?"+usuarios.remove(122, "Bruno"));

        for (int chave:usuarios.keySet()){
            System.out.println(chave);}

        for (String valor:usuarios.values()) {
            System.out.println(valor);}

        for (Map.Entry<Integer , String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + ">>>");
            System.out.println(registro.getValue());
        }

    }
}
