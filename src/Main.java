public class Main {
    public static void main(String[] args) {
        //задача 1
        checkingTheYear(2021);
        //задача 2
        checkingTheDevice(1, 2012);
        //задача 3
        int days = deliveryDistance(95);
        System.out.println("Потребуется дней " + days);
    }

    public static void taskOne() {
        System.out.println("Задание 1");
    }

    public static void taskTwo() {
        System.out.println("Задание 2");
    }

    public static void taskThree() {
        System.out.println("Задание 3");
    }

    public static void checkingTheYear(int year) {
        taskOne();
        if ((year % 100 != 0 && year % 4 == 0) || (year % 400 == 0)) {
            System.out.println(year + " год-високосный");
        } else {
            System.out.println(year + " год- не високосный");
        }
    }

    public static void checkingTheDevice(int clientOS, int clientDeviceYear) {
        taskTwo();
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке ");
        } else if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке ");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке ");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке ");
        }
    }


    public static int deliveryDistance(int deliveryDistanceTime) {
        taskThree();
        if (deliveryDistanceTime > 0 && deliveryDistanceTime <= 20) {
            return 1;
        } else if (deliveryDistanceTime > 20 && deliveryDistanceTime <= 60) {
            return 2;
        } else if (deliveryDistanceTime > 60 && deliveryDistanceTime <= 100) {
            return 3;
        } else
            return 0;
    }

}
