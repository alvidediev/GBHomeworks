package GBHomework6;

public class Cat extends Animal {
    private static int COUNTER = 0;

    @Override
    public void run(int runDistance) {
        if(runDistance > 200 || runDistance < 0){
            System.out.println("Кошки столько не бегают");
        }else super.run(runDistance);
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println("Кошки не умеют плыть!");
    }

    public Cat(String name) {
        super(name);
        COUNTER++;
    }

    public static int getCOUNTER() {
        return COUNTER;
    }
}
