
public class Main {
    public static void main(String[] args) {

        System.out.println(" Задача 1 ");

        int clientOS = 0;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Выберете корректную OS из списка");
        }


        System.out.println(" Задача 2 ");

        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        } else {
            System.out.println("Выберете корректную OS из списка");
        }


        System.out.println(" Задача 3 ");

        int year = 1200;

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        System.out.println(" Задача 4 ");

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 ");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 ");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3 ");
        } else {
            System.out.println("Достваки нет");
        }

        System.out.println(" Задача 5 ");

        int monthNumber = 13;

        switch (monthNumber) {
            case (1):
            case (2):
            case (3):
                System.out.println("ЗИМА");

            case (4):
            case (5):
            case (6):
                System.out.println("ВЕСНА");

            case (7):
            case (8):
            case (9):
                System.out.println("ЛЕТО");

            case (10):
            case (11):
            case (12):
                System.out.println("ОСЕНЬ");

            default:
                System.out.println("Ошибка, введите корректный номер месяца");
        }


    }
}