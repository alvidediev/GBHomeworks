package GBLVL3.Homework5;

import java.util.concurrent.Semaphore;

public class Tunnel extends Stage {
    public Semaphore tunnel;
    public Tunnel() {
        this.length = 80;
        tunnel = new Semaphore(Main.CARS_COUNT / 2, true);
        this.description = "Тоннель " + length + " метров";
    }
    @Override
    public void go(Car c) {
        try {
            try {
                System.out.println(c.getName() + " готовится к этапу(ждет): " + description);
                tunnel.acquire();
                System.out.println(c.getName() + " начал этап: " + description);
                Thread.sleep(length / c.getSpeed() * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(c.getName() + " закончил этап: " + description);
                tunnel.release();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

