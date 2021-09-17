package OO.abstrato;

public class testeAbstrato {
    public static void main(String[] args) {
        Animal a = new Cachorro();
        System.out.println(a.respirar());
        System.out.println(a.mover());
    }
}
