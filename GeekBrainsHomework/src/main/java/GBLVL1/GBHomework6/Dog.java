package GBLVL1.GBHomework6;

public class Dog extends Animal {
    private static int COUNTER = 0;

    @Override
    public void run(int runDistance) {
        if(runDistance > 500 || runDistance < 0){
            System.out.println("Собаки столько не бегают!");
        }else super.run(runDistance);
    }

    @Override
    public void swim(int swimDistance) {
        if(swimDistance > 10 || swimDistance < 0){
            System.out.println("Собаки могут плыть только 10 метров");
        }else super.swim(swimDistance);
    }

    public Dog(String name) {
        super(name);
        COUNTER++;
    }

    public static int getCOUNTER() {
        return COUNTER;
    }
}
