package com.example.threads2;

public class ThreadDemo{

    public static void main(String[] args) {
        new ThreadDemo().start();
    }

    public void start(){
        new Thread(this::run).start();
        new Thread(this::run).start();
        new Thread(this::run).start();
        new Thread(this::run).start();
        new Thread(this::run).start();

        Thread thread = new Thread(this::run);
        thread.setPriority(Thread.MAX_PRIORITY);
        //thread.setDaemon(true);
        thread.setName("Custom thread");
        thread.start();
    }

    public void run() {
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + Thread.currentThread().getName() + ", " + i);
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " +  Thread.currentThread().getName() + " interrupted.");
        }
    }
}
