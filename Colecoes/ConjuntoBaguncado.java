package Colecoes;

import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class ConjuntoBaguncado {


    public static void main(String[] args) {

        HashSet conjunto = new HashSet();

        conjunto.add(1.2);
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add('x');

        System.out.println(conjunto.size());
        System.out.println(conjunto);

        conjunto.remove("teste");
        System.out.println(conjunto.size());
        System.out.println(conjunto);
        System.out.println(conjunto.contains(1.2));

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        conjunto.addAll(nums);   // união entre 2 conjuntos
        System.out.println(conjunto);

        conjunto.retainAll(nums); // interseção entre 2 conjuntos
        System.out.println(conjunto);

        conjunto.clear();// limpa
        System.out.println(conjunto);



    }
}
