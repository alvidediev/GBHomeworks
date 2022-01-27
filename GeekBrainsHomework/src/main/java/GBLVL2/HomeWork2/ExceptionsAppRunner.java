package GBLVL2.HomeWork2;

public class ExceptionsAppRunner {
    public static void main(String[] args) {
        String[][] newArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            System.out.println(myArr(newArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка на столбце" + e.i + " в ячейке " + e.j);
        }
    }

    public static int myArr(String[][] arrayForCheck) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        //проверка двумерного массива выход за пределы [4][4]
        if (arrayForCheck.length != 4) {
            throw new MyArraySizeException("Выход столбцов за пределы двумерного массива: [4][4]");
        }
        for (int i = 0; i < arrayForCheck.length; i++) {
            if (arrayForCheck[i].length != 4) {
                throw new MyArraySizeException("Выход строк за пределы двумерного массива: [4][4]");
            }
        }
        //преобразование элементов массива в числа, проверка является ли содержимое элемента числом и суммирование
        for (int i = 0; i < arrayForCheck.length; i++) {
            for (int j = 0; j < arrayForCheck[i].length; j++) {
                try {
                    sum += Integer.parseInt(arrayForCheck[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}