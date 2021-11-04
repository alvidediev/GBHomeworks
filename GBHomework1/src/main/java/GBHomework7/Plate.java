package GBHomework7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int n) {
        if (food > n) {
            food -= n;
            return true;
        } else food = 0;
        return false; //слишком спать хочу и мой мозг выдает только индусский код.
    }

    public void info() {
        System.out.println("В миске осталось еды: " + food);
    }

    public void setFood(int food) {
        this.food += food;
        System.out.println("Подсыпали еще корма: " + food);
    }

    public int getFood() {
        return food;
    }
}

