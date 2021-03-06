package GBLVL1;

public class GBHomework2 {
    public static void main(String[] args) {
        System.out.println(isNumberInRange(4, 15));
        System.out.println(isNumberInteger(2));
        System.out.println(positiveOrNegativeNumber(6));
        stringNumberTimes("Hello GB", 6);
        System.out.println(isLeapYear(2015));

    }

    public static boolean isNumberInRange(int a, int b){
        int c = a + b;

        if(c >= 10 && c <= 20){
            return true;
        }else return false;
    }

    public static String isNumberInteger(int number){
        if(number > 0){
            return "Положительное число";
        }else return "Отрицательное число";
    }

    public static boolean positiveOrNegativeNumber(int boolNumber){
        return boolNumber < 0;

    }

    public static void stringNumberTimes(String string, int numberOfStrings){
        for (int i = 0; i < numberOfStrings; i++) {
            System.out.println(string);
        }
    }

    public static boolean isLeapYear(int year){
        if(year % 4 == 0 || year % 400 == 0){
            return true;
        }else if(year % 100 == 0){
            return false;
        }else return false;
    }
}//Второе домашнее задание
