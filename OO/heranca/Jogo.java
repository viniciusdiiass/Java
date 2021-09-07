package OO.heranca;

public class Jogo {
    public static void main(String[] args) {
        Jogador monstro = new Jogador();
        monstro.x = 10;
        monstro.y = 10;

        Jogador heroi = new Jogador();
        heroi.x = 10;
        heroi.y = 11;

        System.out.println("Monstro tem ==> " + monstro.vida);
        System.out.println("Heroi tem ==> " +heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);
        heroi.atacar(monstro);
        heroi.atacar(monstro);

        System.out.println("Monstro tem ==> " + monstro.vida);
        System.out.println("Heroi tem ==> " +heroi.vida);

    }
}
