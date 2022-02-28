package GBLVL3.Homework5;

import java.util.concurrent.*;

public class Main {

    public static final int CARS_COUNT = 4;


    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(CARS_COUNT);
        System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Подготовка!!!");
        CyclicBarrier cb = new CyclicBarrier(CARS_COUNT + 1,
                ()-> System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка началась!!!"));
        CountDownLatch cdl = new CountDownLatch(CARS_COUNT);

        Race race = new Race(new Road(60), new Tunnel(), new Road(40));
        Car[] cars = new Car[CARS_COUNT];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(race, 20 + (int) (Math.random() * 10), cb, cdl);
        }

        for (int i = 0; i < cars.length; i++) {
            exec.execute(cars[i]);
        }
        try {
            cb.await();
        } catch (InterruptedException | BrokenBarrierException ex) {
            ex.printStackTrace();
        }
        try {
            cdl.await();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("ВАЖНОЕ ОБЪЯВЛЕНИЕ >>> Гонка закончилась!!!");
            exec.shutdown();
        }
    }
}
