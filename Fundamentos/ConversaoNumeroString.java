package Fundamentos;

public class ConversaoNumeroString {
    public static void main(String[] args) {
        Integer num1 = 10000;
        System.out.println(num1.toString().length());

        Integer num2 = 100000;
        System.out.println(num2.toString(num2).length());

        System.out.println(("" + num2).length());


    }
}
