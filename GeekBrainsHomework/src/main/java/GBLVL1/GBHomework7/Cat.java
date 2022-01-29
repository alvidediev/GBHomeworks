package GBLVL1.GBHomework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean isHungry;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public Cat() {
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)) {
            System.out.println("Котик покушал");
            isHungry = false;
        } else {
            System.out.println(name + " слишком прожорлив. Съев все оставщееся он все равно не насытился!");
            isHungry = true;
        }
    }


    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    @Override
    public String toString() {
        return "Котэ{" +
                "Имя= " + name + '\'' +
                ", Аппетит= " + appetite +
                ", Котейка голоден?=" + isHungry +
                '}';
    }
}
