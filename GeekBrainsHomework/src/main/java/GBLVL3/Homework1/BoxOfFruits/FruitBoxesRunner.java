package GBLVL3.Homework1.BoxOfFruits;

public class FruitBoxesRunner {
    public static void main(String[] args) {
        //добавляем фрукты в корзину
        Box<Orange> orangeBox = new Box<>(new Orange(1.5f), new Orange(1.5f), new Orange(1.5f));
        Box<Apple> appleBox = new Box<>(new Apple(1.0f), new Apple(1.0f), new Apple(1.0f));
        Box<Apple> anotherAppleBox = new Box<>(new Apple(1.0f));
        Box<Orange> anotherOrangeBox = new Box<>(new Orange(1.5f));
        Box<Orange> emptyOrangeBox = new Box<>();

        //вывод веса корзины
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());
        //тест метода на добавление
        orangeBox.addFruits(new Orange(1.5f));
        appleBox.addFruits(new Apple(1.0f));
        //вес корзины после добавления фруктов
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.getWeight());
        //тест метода compare
        System.out.println(orangeBox.compare(anotherOrangeBox));
        System.out.println(orangeBox.compare(anotherAppleBox));
        //тест метода для переложения фруктов
        System.out.println(anotherOrangeBox.getWeight());
        orangeBox.replaceFruitsToAnotherBox(anotherOrangeBox);
        System.out.println(anotherOrangeBox.getWeight());
        anotherOrangeBox.replaceFruitsToAnotherBox(emptyOrangeBox);
    }

}
