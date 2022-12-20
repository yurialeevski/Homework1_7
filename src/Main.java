public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задача 1");
        System.out.println("Задача 1_1 накопления без процентов");
        int monthDeposit = 15000;
        int totalDeposit = 0;
        int i = 1;
        while (totalDeposit <= 2459000) {
            totalDeposit = totalDeposit + monthDeposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + totalDeposit + " рублей");
            i++;
        }
        System.out.println("Задача 1_2 накопления на вкладе 12% годовых");
        int monthDeposit12 = 15000;
        int totalDeposit12 = 0;
        int j = 1;
        while (totalDeposit12 <= 2459000) {
            totalDeposit12 = totalDeposit12 + totalDeposit12/100 + monthDeposit12;
            System.out.println("Месяц " + j + ", сумма накоплений равна " + totalDeposit12 + " рублей");
            j++;
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while(i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int population = 12000000;
        int birthRate = 17;
        int deathRate = 8;
        int ratePerNumber = 1000;
        for (int yearsNumber = 1; yearsNumber <=10; yearsNumber++) {
            population = population + population * (birthRate - deathRate) / ratePerNumber;
            System.out.println("Год " + yearsNumber + ", численность населения составляет " + population);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int perCentMonth = 7;
        int deposit = 15000;
        int goalAmount = 12000000;
        int monthNumber = 1;
        while(deposit <= goalAmount ){
            deposit = deposit + deposit / 100 * perCentMonth;
            System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + deposit);
            monthNumber++;
        }
        System.out.println();
    }
    public static void task5() {
        System.out.println("Задача 5");
        int perCentMonth = 7;
        int deposit = 15000;
        int goalAmount = 12000000;
        int monthNumber = 1;
        while(deposit <= goalAmount ){
                deposit = deposit + deposit / 100 * perCentMonth;
            if(monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + deposit);
            }
            monthNumber++;
        }
        System.out.println();
    }
    public static void task6() {
        System.out.println("Задача 6");
        int perCentMonth = 7;
        int deposit = 15000;
        int depositYears = 9;
        for(int monthNumber = 1; monthNumber <= depositYears * 12; monthNumber++ ){
            deposit = deposit + deposit / 100 * perCentMonth;
            if(monthNumber % 6 == 0) {
                System.out.println("Месяц " + monthNumber + ", сумма накоплений равна " + deposit);
            }
        }
        System.out.println();
    }
    public static void task7() {
        System.out.println("Задача 7");
        int firstFriDec2022 = 2;
        for (int i = 1; i <= 31 ; i++) {
            if((i - firstFriDec2022) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет");
            }
        }
        System.out.println();
    }
    public static void task8() {
        System.out.println("Задача 8");
        int cometPeriodYears = 79;
        int currentYear = 2022;
        for (int i = 0; i <= currentYear + 101; i = i + cometPeriodYears) {
            if(i >= currentYear - 200 && i <= currentYear + 100) {
                System.out.println(i);
            }
        }
    }
}