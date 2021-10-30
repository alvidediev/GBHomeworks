package GBHomework6;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Золотой");
        Cat cat1 = new Cat("Мурзик");
        Dog dog = new Dog("Шарик");
        Dog dog1 = new Dog("Шарик");

        cat.run(100);
        cat.swim(1);
        cat1.run(250);
        cat1.swim(1);
        dog.run(100);
        dog1.run(521);
        System.out.println("Котиков создано: " + Cat.getCOUNTER());
        System.out.println("Собачек создано: " + Dog.getCOUNTER());
        System.out.println("Всего животных создано: " + Animal.getCOUNTER());
    }
}
