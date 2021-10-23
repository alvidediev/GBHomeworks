import java.util.Arrays;

public class GBHomework3 {
    public static void main(String[] args) {
        swapElementsOfArray(new int[10], 5);
    }

    public static void invertArray() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else array[i] = 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void changeArray() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static void fillDiagonal() {
        int arrayLength = 5;
        int[][] array = new int[arrayLength][arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i][i] = 1;
            array[i][arrayLength - 1 - i] = 1;
        }
    }

    public static int[] lenLengthArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void minAndMaxInArray() {
        int[] array = {10, 20, 4, 2, 78, 6, 100, 234, 1};
        Arrays.sort(array);
        System.out.println("Минимальное число в массиве: " + array[0] + "\n" + "Максимальное число в массиве: " + array[array.length - 1]);
    }

    public static void swapElementsOfArray(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < n; i++) {
            int lastInd = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, array[array.length - 1]);
            array[0] = lastInd;
        }
        System.out.println(Arrays.toString(array));
    }
}//Может я слишком серьезно отношусь к задаче №8...не знаю. Время на часах 00:17. Спать хочу. Голова не соображает(
