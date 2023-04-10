package lesson3.first;

public class PingPong {
    private final Object game = new Object();
    private volatile String currentLetter = "Ping";
    public static void main(String[] args) {
        PingPong PingPongObj = new PingPong();
        Thread thread1 = new Thread(() -> {
            PingPongObj.printPing();
        });
        Thread thread2 = new Thread(() -> {
            PingPongObj.printPong();
        });
            thread1.start();
            thread2.start();
    };
    public void printPing() {
        synchronized (game) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (currentLetter != "Ping") {
                        game.wait();
                    }
                    System.out.print("Ping");
                    currentLetter = "Pong";
                    game.notify();

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void printPong() {
        synchronized (game) {
            try {
                for (int i = 0; i < 10; i++) {
                    while (currentLetter != "Pong") {
                        game.wait();
                    }
                    System.out.print("Pong");
                    currentLetter = "Ping";
                    game.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
