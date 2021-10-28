package GBHomework5;

public class EmployeeArray {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Дедиев Альви", "Маркетолог", "huskartp@gmail.com",
                "+79227293790", 16000, 31);
        employeeArray[1] = new Employee("Иванов Иван", "Киллер", "killer007@gmail.com",
                "+7999999999", 500000, 30);
        employeeArray[2] = new Employee("Сергей Ефремов", "Верховный программист", "efremov@gmail.com",
                "+2147483647", 2147483640, 40);
        employeeArray[3] = new Employee("Unnamed Person", "Agent", "fbi@gmail.com",
                "+00000000000", 99999, 99);
        employeeArray[4] = new Employee("Илон Маск", "Не знаю", "elonmusk@gmail.com",
                "+79001113344", 2147000, 42);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].printEmployee();
            }
        }
    }
}
