package Chernovik;

import java.util.Random;
import java.util.concurrent.Phaser;

public class TaskPotoki3 {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        new Thread (new PhaseThread(phaser, "философ 1 ")).start();
        new Thread (new PhaseThread(phaser, "философ 2 ")).start();

        int phase= phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза"+ phase + " заверщена");

        phase= phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза"+ phase + " заверщена");

        phase= phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза"+ phase + " заверщена");

        phaser.arriveAndDeregister();



    }

}

class PhaseThread implements Runnable {
    Phaser phaser;
    String name;

    PhaseThread(Phaser p, String n) {
        this.phaser = p;
        this.name = n;
        phaser.register();
    }

    public void run() {
        System.out.println(name + "колдует в" + phaser.getPhase() + " раз." );
        phaser.arriveAndAwaitAdvance();// достигнута 1 фаза

        System.out.println(name + "колдует в" + phaser.getPhase() + " раз." );
        phaser.arriveAndAwaitAdvance();// достигнута 2 фаза

        System.out.println(name + "колдует в" + phaser.getPhase() + " раз." );
        phaser.arriveAndAwaitAdvance();// достигнута последняя фаза-и удаляем с регистрации объекты
    }



}



