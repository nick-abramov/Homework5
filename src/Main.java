
public class Main {
    public static void main(String[] args) {

        System.out.println(" Задача 1 ");

        int clientOS = 0;

        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;

            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;

            default:
                System.out.println("Выберете корректную OS из списка");
        }


        System.out.println(" Задача 2 ");

        int clientDeviceYear = 2014;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегчённую версию приложения для Android по ссылке");
        }


        System.out.println(" Задача 3 ");

        int year = 1200;

        if (year < 1584) {
            System.out.println(year + " год не является високосным");
        } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
             System.out.println( year + " год является високосным");
             } else {
             System.out.println(year + " год не является високосным");
         }

        System.out.println(" Задача 4 ");

         int deliveryDistant = 95;
         if ( deliveryDistant <= 20) {
             System.out.println("Потребуется дней: 1 ");
         } else if (deliveryDistant > 20 && deliveryDistant <= 60) {
             System.out.println("Потребуется дней: 2 ");
         } else if (deliveryDistant > 60 && deliveryDistant <= 100) {
             System.out.println("Потребуется дней: 3 ");
         } else  {
             System.out.println("Достваки нет");
         }

        System.out.println(" Задача 5 ");

         int monthNumber = 33;

         switch (monthNumber) {
             case (1):
             case (2):
             case (12):
                 System.out.println("ЗИМА");
             case (3):
             case (4):
             case (5):
                 System.out.println("ВЕСНА");
             case (6):
             case (7):
             case (8):
                 System.out.println("ЛЕТО");
             case (9):
             case (10):
             case (11):
                 System.out.println("ОСЕНЬ");
             default:
                 System.out.println("Ошибка, введите корректный номер месяца");
         }











    }
}