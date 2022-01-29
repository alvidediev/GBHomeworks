package GBLVL2.Homework1;

public class Human implements RunnableAndJumpable{

    private String name;
    private int runDistance;
    private int jumpHeight;

    public Human(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public int jump() {
        return jumpHeight;
    }

    @Override
    public int run() {
        return runDistance;
    }

    @Override
    public String toString() {
        return  name;
    }
}
