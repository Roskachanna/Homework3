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
        System.out.println("Задача 1 ");
        int flowers = 1000000;
        System.out.println("Значение переменной flowers c типом int равно " + flowers);
        byte life = 1;
        System.out.println("Значение переменной life с типом byte равно " + life);
        short pages = 30000;
        System.out.println("Значение переменной pages с типом short равно " + pages);
        long stars = 90000000L;
        System.out.println("Значение переменной stars с типом long равно " + stars);
        float apple = 1.5F;
        System.out.println("Значение переменной apple с типом float равно " + apple);
        double box = 10.5;
        System.out.println("Значение переменной box с типом double равно " + box);
    }

    public static void task2() {
        System.out.println("Задача 2");
        double a = 27.12;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        byte f = 67;
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte pupils1 = 23;
        System.out.println("У Людмилы Петрововны " + pupils1 + " ученика ");
        byte pupils2 = 27;
        System.out.println("У Анны Сергеевны " + pupils2 + " учеников ");
        byte pupils3 = 30;
        System.out.println("У Екатерины Андреевны " + pupils3 + " учеников ");
        byte pupilsTotal = (byte) (pupils1 + pupils2 + pupils3);
        System.out.println("Общее количевтыо учеников в трех классах " + pupilsTotal + " учеников ");
        short sheetsTotal = 480;
        System.out.println("Общее количество бумаги " + sheetsTotal + " листов ");
        byte sheetsPupil = (byte) (sheetsTotal / pupilsTotal);
        System.out.println("На каждого ученика рассчитано " + sheetsPupil + " листов бумаги ");
    }

    public static void task4() {
        System.out.println("Задача 4");
        byte bottleMinutes2 = 16;
        System.out.println("Количество бутылок за две минуты " + bottleMinutes2 + "шт");
        byte bottleMinutes = (byte) (bottleMinutes2 / 2);
        System.out.println("Количество бутылок в минуту " + bottleMinutes + "шт ");
        short bottleMinutes20 = (short) (bottleMinutes * 20);
        System.out.println("За 20 минут машина произвела " + bottleMinutes20 + " штук бутылок ");
        short bottleDay = (short) (bottleMinutes * 60 * 24);
        System.out.println("За сутки машина произвела " + bottleDay + " штук бутылок ");
        int bottleDay3 = (int) (bottleDay * 3);
        System.out.println("За три дня машина произвела " + bottleDay3 + " штук бутылок ");
        int bottleDay31 = (int) (bottleDay * 31);
        System.out.println("За месяц машина произвела " + bottleDay31 + " штук бутылок ");

    }
    public static void task5() {
        System.out.println("Задача 5");
        byte classroom1 = 6;
        byte classAmount = (byte) (120 / 6);
        System.out.println("Количество классов " + classAmount );
        byte whiteAmount = (byte) (classAmount * 2);
        System.out.println("Количество белой краски " + whiteAmount + "шт ");
        byte brownAmount = (byte) (classAmount * 4);
        System.out.println("Количество коричневой краски " + brownAmount + "шт ");
        System.out.println("В школе, где " + classAmount + " классов, нужно " + whiteAmount + " банок белой краски и " + brownAmount + " банок коричневой краски. " );

    }
    public static void task6() {
        System.out.println("Задача 6");
        byte bananasWeight = 80;
        System.out.println("Вес одного банана " + bananasWeight + "грамм ");
        float milkWeight = 1.50F;
        System.out.println("Вес одного милилитра молока " + milkWeight + "грамм ");
        byte iceWeight = 100;
        System.out.println("Вес одного брикета мороженого " + iceWeight + "грамм ");
        byte eggWeight = 70;
        System.out.println("Вес одного яйца " + eggWeight + "грамм " );
        byte bananas = 5;
        System.out.println("Колличество батанов " + bananas + "шт ");
        short milk = 200;
        System.out.println("Количество молока " + milk + "мл ");
        byte ice = 2;
        System.out.println("Количество мороженого " + ice + "брикета ");
        byte egg = 4;
        System.out.println("Количество яиц " + egg + "штук ");
        short totalWeight = (short) (bananasWeight * bananas + milkWeight * milk + iceWeight * ice + eggWeight * egg );
        System.out.println("Общий вес завтрака спортсмена " + totalWeight + "грамм ");

    }
    public static void task7() {
        System.out.println("Задача 7");
        short diet1 = 250;
        short diet2 = 500;
        short results = 7000;
        byte dietDay1 = (byte) (results / diet1);
        System.out.println("Количество дней диеты №1 - " + dietDay1);
        byte dietDay2 = (byte) (results / diet2);
        System.out.println("Количество дней диеты №2 - " + dietDay2);
        byte averageDay = (byte) (results / (diet1 = diet2));
        System.out.println("Среднее количество дней - " + averageDay );

    }
    public static void task8() {
        System.out.println("Задача 8");
        int incomeMasha = 67760;
        System.out.println("Доход Маши " + incomeMasha + " рублей в месяц ");
        int incomeDenis = 83690;
        System.out.println("Доход Дениса " + incomeDenis + " рублей в месяц ");
        int incomeKristina = 76230;
        System.out.println("Доход Кристины " + incomeKristina + " рублей в месяц ");
        int incomeMasha10 = (int) (incomeMasha + incomeMasha * 0.1);
        int differenceMasha = (int) (incomeMasha10 - incomeMasha);
        int Masha12 = (int) (differenceMasha * 12);
        System.out.println("Маша теперь получает " + incomeMasha10 + " рублей. Годовой доход вырос на " + Masha12 + " рублей.");
        int incomeDenis10 = (int) (incomeDenis + incomeDenis * 0.1);
        int differenceDenis = (int) (incomeDenis10 - incomeDenis);
        int Denis12 = (int) (differenceDenis * 12);
        System.out.println("Денис теперь получает " + incomeDenis10 + " рублей. Годовой доход вырос на " + Denis12 + " рублей.");
        int incomeKristina10 = (int) (incomeKristina * 0.1);
        int differenceKristina = (int) (incomeKristina10 - incomeKristina);
        int Kristina12 = (int) (differenceKristina * 12);
        System.out.println("Кристина теперь получает " + incomeKristina10 + " рублей. Годовой доход вырос на " + Kristina12 + " рублей.");



    }

}


