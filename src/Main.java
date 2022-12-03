public class Main {
    public static void main(String[] args) {
        byte a = 1;
        short b = 1000;
        int c = 32000;
        long d = 100000L;
        float e = 3.5f;
        double f = 7.2;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с тимпом long равно " + d);
        System.out.println("Значение переменной e с тимпом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        float one = 27.12f;
        long second = 987678965549L;
        float free = 2.786f;
        short four = 569;
        int five = 27897;
        byte six = 67;
        var liudmilaPavlovna = 23;
        var annaSergeevna = 27;
        var ekaterinaAndreevna = 30;
        var paper = 480;
        var numberStudent = liudmilaPavlovna + annaSergeevna + ekaterinaAndreevna;
        int paperStudent = paper / numberStudent;
        System.out.println("На каждого ученика расчитано " + paperStudent + " листов бумаги");
        byte bottle = 16;
        byte minutes = 2;
        int oneMinuteBottle = bottle / minutes;
        int twentyMinutesBottle = oneMinuteBottle * 20;
        System.out.println("За 20 минут машина произвела " + twentyMinutesBottle + " бутылок");
        int minutesDay = 60 * 24;
        int bottleDay = oneMinuteBottle * minutesDay;
        System.out.println("За сутки машина произвела " + bottleDay + " бутылок");
        int freeDayBottles = bottleDay * 3;
        System.out.println("За три дня машина произвела " + freeDayBottles + " бутылок");
        int monthBottles = bottleDay * 30;
        System.out.println("За 1 месяц машина произвела " + monthBottles + " бутылок");
        byte banks = 120;
        byte oneClassroomWhite = 2;
        byte oneClassroomBrown = 4;
        int banksClassroom = oneClassroomBrown + oneClassroomWhite;
        int numberClassroom = banks / banksClassroom;
        int numberBanksWhite = numberClassroom * oneClassroomWhite;
        int numberBanksBrown = numberClassroom * oneClassroomBrown;
        System.out.println("В школе, где " + numberClassroom + " классов, нужно " + numberBanksWhite + " бвнок белой краски и " + numberBanksBrown + " банок коричневой краски.");
        short bananaWeight = 5 * 80;
        short milksWeight = (200 / 100) * 105;
        short iceCreamWeight = 2 * 100;
        short eggsWeight = 4 * 70;
        int breakfastWeight = bananaWeight + milksWeight + iceCreamWeight + eggsWeight;
        float breakfastWeightKg = breakfastWeight / 1000f;
        System.out.println("Вес завтрака " + breakfastWeight + " гр ( " + breakfastWeightKg + " кг)");

        // Далее задача №7
        short sportsmanWeight = 7 * 1000;
        short numberDay1 = (short) (sportsmanWeight / 250);
        System.out.println(numberDay1);
        short numberDay2 = (short) (sportsmanWeight / 500);
        System.out.println(numberDay2);
        int average = numberDay1 - (numberDay1 - numberDay2) / 2;
        System.out.println(average);

        // Далее задача № 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int salaryMasha = masha + (masha / 10);// ключ к лучшему понимаю остатка деления на цело в этой строчке
        int salary
        System.out.println(salaryMasha);


        
        

        

         
    }
}