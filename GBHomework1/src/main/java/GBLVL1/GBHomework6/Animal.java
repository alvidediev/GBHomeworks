package GBLVL1.GBHomework6;

public class Animal {
    private static int COUNTER = 0;

    private String name;


    public void run(int runDistance) {
        System.out.println(name + " пробежал " + runDistance + " м");
    }

    public void swim(int swimDistance) {
        System.out.println(name + " пробежал " + swimDistance + " м");
    }

    public Animal(String name) {
        this.name = name;
        COUNTER++;
    }

    public static int getCOUNTER() {
        return COUNTER;
    }
}
