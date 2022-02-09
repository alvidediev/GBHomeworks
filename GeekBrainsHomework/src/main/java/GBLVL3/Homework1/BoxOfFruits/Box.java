package GBLVL3.Homework1.BoxOfFruits;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    List<T> fruits;

    //Коробка ArrayList
    public Box(T fruits) {
        this.fruits = new ArrayList<>(Arrays.asList(fruits));
    }

    //Вес коробки
    private float getWeight() {
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
    private boolean compare(Box<? extends Fruit> anotherBox) {
        return getWeight() == anotherBox.getWeight();
    }

    //добавить фрукты в корзину
    private void addFruits(T fruit){
        fruits.add(fruit);
    }
}
