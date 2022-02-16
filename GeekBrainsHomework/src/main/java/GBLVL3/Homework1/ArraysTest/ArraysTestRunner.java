package GBLVL3.Homework1.ArraysTest;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysTestRunner {
    public static void main(String[] args) {
        GenericsHomework genericTest = new GenericsHomework();
        Integer[] nums = new Integer[10];
        String[] strings = new String[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i;
            strings[i] = Integer.toString(i);
        }

        //Задание 1. Поменять местами два элемента массива с любым ссылочным типом.
        try {
            genericTest.swapElements(nums, -6, 4);//выход за пределы массива. Для демонстрации ошибки.
            genericTest.swapElements(strings, 6, 7);
        } catch (WrongPosition e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(strings));

        //Задание 2. Как Вы и показывали, через .var присваиет правильные типы. Не Object.
        ArrayList<String> arrayListStrings = genericTest.convertToArrayList(strings);
        ArrayList<Integer> integers = genericTest.convertToArrayList(nums);

    }
}
