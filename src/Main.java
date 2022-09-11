public class Main {
    public static void main(String[] args) {
        System.out.println("task1");
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Мы работаем над созданием приложения");
        }

        System.out.println("task2");
        int clientOperatingSystem = 1;
        int clientDeviceYear = 2011;
        if (clientOperatingSystem == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOperatingSystem == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOperatingSystem == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println("task3");
        int year = 2021;
        if (year%4==0 && year%100!=0) {
            System.out.println("високосный");
        }
        else if (year%100==0 && year%400==0){
            System.out.println("високосный");
        }
        else System.out.println("не високосный");

        System.out.println("task4");
        int deliveryDistance = 95;
        int days =0;
        if (deliveryDistance<=20) {
            days=days+1;
        }
        else if (deliveryDistance>20&&deliveryDistance<=60){
            days=days+2;
        }
        else {
            days=days+3;
        }
        System.out.println("Потребуется дней: " + days);

        System.out.println("task5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
            System.out.println("сезон этого месяца = зима");
            break;
            case 3:
            case 4:
            case 5:
            System.out.println("сезон этого месяца = весна");
            break;
            case 6:
            case 7:
            case 8:
            System.out.println("сезон этого месяца = лето");
            break;
            case 9:
            case 10:
            case 11:
            System.out.println("сезон этого месяца = осень");
            break;
            default:
                System.out.println("нет такого месяца");
        }
    }
}