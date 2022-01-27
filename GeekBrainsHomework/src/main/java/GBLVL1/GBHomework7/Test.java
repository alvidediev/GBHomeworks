package GBLVL1.GBHomework7;

public class Test {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Гордыня ", 10);
        cats[1] = new Cat("Зависть", 10);
        cats[2] = new Cat("Чревоугодие", plate.getFood());

        plate.info();

        cats[0].eat(plate);
        System.out.println(cats[0].getName() + ", голоден? " + cats[0].isHungry() + " !");
        plate.info();

        cats[1].eat(plate);
        System.out.println(cats[1].getName() + ", голоден? " + cats[1].isHungry() + " !");
        plate.info();

        plate.setFood(20);
        plate.info();

        cats[2].eat(plate);
        System.out.println(cats[2].getName() + ", голоден? " + cats[2].isHungry() + " !");
        plate.info();

        //пробую вывести информацию через переопределенный метод toString()
        System.out.println(cats[0].toString());
        System.out.println(cats[1].toString());
        System.out.println(cats[2].toString());
    }
}
