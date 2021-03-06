package GBLVL3.Homework1.BoxOfFruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> implements Comparable<Box> {
    List<T> fruits;

    //Коробка ArrayList
    public Box(T... fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    //Вес коробки
    public float getWeight() {
        float totalWeightOfBox = 0f;
        for (T fruit : fruits) {
            totalWeightOfBox = totalWeightOfBox + fruit.weight;
        }
        return totalWeightOfBox;
    }

    /**
     * Моя уверенность в данном ДЗ окончательно пошатнулась на этом моменте. Если этот велосипедный завод каким то
     * чудом окажется правильным, то просьба подсказать как сделать получше...
     */
    public boolean compare(Box<? extends Fruit> anotherBox) {
        return getWeight() == anotherBox.getWeight();
    }

    public void replaceFruitsToAnotherBox(Box<T> anotherBox){
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }

    //добавить фрукты в корзину
    public void addFruits(T fruit){
        fruits.add(fruit);
    }
    //Попытка переопределить метод Сompare
    @Override
    public int compareTo(Box o) {
        return Float.compare(getWeight(), o.getWeight());
    }
}
