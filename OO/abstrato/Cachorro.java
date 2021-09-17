package OO.abstrato;

public class Cachorro extends Mamifero{

    public String mamar() {
        return "usando leite";
    }

    public String mover() {
        return super.mover();
    }
}
