package GBLVL3.Homework1.ArraysTest;

import java.util.ArrayList;
import java.util.Arrays;

public class GenericsHomework {

    public <T> void swapElements(T[] arr, int elementOne, int elementTwo) throws WrongPosition {
        if(elementOne > 0 && elementOne < arr.length && elementTwo > 0 && elementTwo < arr.length) {
            T arrayElement = arr[elementOne];
            arr[elementOne] = arr[elementTwo];
            arr[elementTwo] = arrayElement;
        }else {
            throw new WrongPosition("Выход за пределы массива. Введите корректные данные!");
        }
    }

    public <T> ArrayList<T> convertToArrayList(T[] arr){
        return new ArrayList<T>(Arrays.asList(arr));
    }
}
