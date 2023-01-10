public class Main {
    public static void main(String[] args) {
        task1 ();
        task2 ();
        task3 ();
        task4 ();
        task5 ();
        task6 ();
        task7 ();
        task8 ();
        task9 ();
        task10 ();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        for (int a=1; a<11; a++) {
            System.out.println(a);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        for (int b=10; b>0; b--) {
            System.out.println(b);
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        for (int c=0; c<=17; c=c+2) {
            System.out.println(c);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        for (int d=10; d>=-10; d--) {
            System.out.println(d);
        }
    }
    public static void task5 () {
        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                System.out.println(year + " год является високосным");
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        for (int y=7; y<=98; y=y+7){
            System.out.print(y+" ");
        }
        System.out.println();
    }
    public static void task7 () {
        System.out.println("Задача 7");
        for (int z=1; z<=512; z=z*2) {
            System.out.print(z+" ");
        }
        System.out.println();
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int salary = 29000, total = 0;
        for (int i=1; i<=12; i++) {
            total=total+salary;
            System.out.println("Месяц "+i+" сумма накоплений равна "+total+"рублей");
        }
    }
    public static void task9 () {
        System.out.println("Задача 9");
        int salary = 29000;
        double total = 0f;
        for (int i=1; i<=12; i++) {
            total=total+total*0.01;
            total=total+salary;
            System.out.printf("Месяц "+i+" сумма накоплений равна %.2f%n",total,"рублей");
        }
    }
    public static void task10 () {
        System.out.println("Задача 10");
        for (int i=1; i<=10; i++){
            int a=2*i;
            System.out.println("2*"+i+"="+a);
            }

        }
    }