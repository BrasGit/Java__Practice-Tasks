package Chernovik;

import java.util.Random;

public class Zar {
    public static void main(String[] args) {
        System.out.println("Main started");
        MyThread myThread1 = new MyThread();
        new Thread(myThread1,"Mashenka").start();
        MyThread myThread2 = new MyThread();
        new Thread(myThread2,"Bashenka").start();
        MyThread myThread3 = new MyThread();
        new Thread(myThread3,"Kvashenka").start();

// способ создания
//        Thread myThread2 = new Thread(
//                new MyThread(),"Dashenka");
//        Thread myThread3 = new Thread(
//                new MyThread(),"Sashenka");
//        myThread2.start();
//        myThread3.start();

        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myThread1.disable();
        myThread2.disable();
        myThread3.disable();
        System.out.println("Main has ended");
    }
}

class MyThread implements Runnable{

    private boolean isActive = true;

    public void disable(){
        isActive = false;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " started");
        Random random = new Random();
        while (isActive){
            System.out.println(Thread.currentThread().getName());
            System.out.println("Go to forest!|_|_|_| ");
            try {
                System.out.println("I wanna sleep...");
                Thread.sleep((random.nextInt(10)+1)*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Good morning!");
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println("Time to go home |-|-|-|");
    }
}