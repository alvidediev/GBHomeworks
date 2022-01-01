package GBLVL2.Homework1;

public class Cat implements RunnableAndJumpable{
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Cat(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int jump() {
        return jumpHeight;
    }

    @Override
    public int run() {
        return runDistance;
    }
}
