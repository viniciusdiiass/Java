package lambdas;

public class Threads {
    public static void main(String[] args) {

        Runnable trabalho1 = new trabalho1();
        Runnable trabalho2 = new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Tarefa #02");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e){
                    }
                }
            }
        };

        Thread t1 = new Thread(trabalho1);
        Thread t2 = new Thread(trabalho2);
        t1.start();
        t2.start();
    }
}
