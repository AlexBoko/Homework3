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
    public static void task1 () {
        System.out.println("Задача 1");
        byte a = 15;
        System.out.println("Значение переменной а " + " с типом byte"  + " равно " + a);
        short b = 25000;
        System.out.println("Значение переменной b " + " с типом short" + " равно " + b);
        int c = 2147000000;
        System.out.println("Значение переменной c " + " с типом int" + " равно " + c);
        long d = 599995000;
        System.out.println("Значение переменной d " + " с типом long" + " равно " + d);
        float e = 3.25f;
        System.out.println("Значение переменной e " + " с типом float" + " равно " + e);
        double f = 1.7;
        System.out.println("Значение переменной f " + " с типом double" + " равно " + f);
   }
    public static void task2 () {
        System.out.println("Задача 2");
        double a = 27.12;
        System.out.println(a);
        long b = 987_678_965_549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short  e = -159;
        System.out.println(e);
        short f = 27897;
        System.out.println(f);
        byte g = 67;
        System.out.println(g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte studentLyudmilaP = 24;
        byte studentAnnaS = 27;
        byte studentEkaterinaA = 30;
        short paper = 480;
        int student = studentLyudmilaP + studentAnnaS + studentEkaterinaA;
        int studentPaper = paper / student;
        System.out.println("На каждого ученика рассчитанно " + studentPaper + " листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte bottle = 16;
        byte bottleTime = 2;
        byte hour = 60;
        byte day = 24;
        byte bottleTime1 = 20;
        byte bottleTime2 = 3;
        byte bottleTime3 = 30;
        int time = bottle / bottleTime;
        int time1 = bottleTime1 * time;
        System.out.println("За 20 минут машина произвела " + time1 + " штук бутылок");
        int time2 = day * hour * time;
        System.out.println("За сутки машина произвела " + time2 + " штук бутылок");
        int time3 = day * bottleTime2 * hour * time;
        System.out.println("За 3 дня машина произвела " + time3 + " штук бутылок");
        int time4 = day * bottleTime3 * hour * time;
        System.out.println("За 30 дней машина произвела " + time4 + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte paint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int numberClasses = whitePaint + brownPaint;
        int numberClasses1 = paint / numberClasses;
        int whitePaint1 = numberClasses1 * whitePaint;
        int brownPaint1 = numberClasses1 * brownPaint;
        System.out.println("В школе, где " + numberClasses1 + " классов, нужно " + whitePaint1 + " банок белой краски и " + brownPaint1 + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        short milk = 200;
        byte iceCream = 2;
        byte rawEggs = 4;
        byte bananas1 = 80;
        byte milkMl = 100;
        byte milk100 = 105;
        byte briquetteIce = 100;
        byte eggs = 70;
        int weightBananas = bananas * bananas1;
        int weightMilk = milk / milkMl * milk100;
        int weightCream = iceCream * briquetteIce;
        int weightEggs = rawEggs * eggs;
        int weightGrams = weightBananas + weightMilk + weightCream + weightEggs;
        System.out.println("завтрак спортсмена весит " + weightGrams + " грамм");
        float kilogram = 1000;
        float weightKilogram = weightGrams / kilogram;
        System.out.println("завтрак спортсмена весит " + weightKilogram + " килограмм");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte excessWeight = 7;
        short weightLoss1 = 250;
        short weightLoss2 = 500;
        float kilogram = 1000;
        float weightGrams = excessWeight * kilogram;
        float day250 = weightGrams / weightLoss1;
        System.out.println(day250 + " Дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        float day500 = weightGrams / weightLoss2;
        System.out.println(day500 + " Дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        byte numbers = 2;
        float averageValue = day250 + day500;
        float averageValue1 = averageValue / numbers;
        System.out.println("Может потребоваться " + averageValue1 + " день в среднем, чтобы добиться результата похудения");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int MashaGets = 67_760;
        int DenisGets = 83_690;
        int KristinaGets = 76_230;
        double increaseSalary = 0.10;
        double salaryMasha = MashaGets * increaseSalary + MashaGets;
        int month = 12;
        int oldIncome = MashaGets * month;
        double newIncome = salaryMasha * month;
        double difference = newIncome - oldIncome;
        System.out.println("Маша теперь получает " + salaryMasha + " рублей. Годовой доход вырос на " + difference + " рублей");
        double salaryDenis = DenisGets * increaseSalary + DenisGets;
        int oldIncome1 = DenisGets * month;
        double newIncome1 = salaryDenis * month;
        double difference1 = newIncome1 - oldIncome1;
        System.out.println("Денис теперь получает " + salaryDenis + " рублей. Годовой доход вырос на " + difference1 + " рублей");
        double salaryKristina = KristinaGets * increaseSalary + KristinaGets;
        int oldIncome2 = KristinaGets * month;
        double newIncome2 = salaryKristina * month;
        double difference2 = newIncome2 - oldIncome2;
        System.out.println("Кристина теперь получает " + salaryKristina + " рублей. Годовой доход вырос на " + difference2 + " рублей");


    }}