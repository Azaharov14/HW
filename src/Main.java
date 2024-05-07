public class Main {
    public static void main(String[] args) {
        int aB = 50000000;
        System.out.println(aB);
        byte bC = 100;
        System.out.println(bC);
        short cD = 20000;
        System.out.println(cD);
        long dF = 400000000;
        System.out.println(dF);
        float fG = 3.10f;
        System.out.println(fG);
        double gH = 6.1234567;
        System.out.println(gH);


        float a = 27.12f;
        System.out.println(a);
        Long b = 987678965549L;
        System.out.println(b);
        float c = 2.786f;
        System.out.println(c);
        short d = 569;
        System.out.println(d);
        short f = -159;
        System.out.println(f);
        short g = 27897;
        System.out.println(g);
        byte h = 67;
        System.out.println(h);


        byte aTeacher = 23;
        System.out.println(aTeacher);
        byte bTeacher = 27;
        System.out.println(bTeacher);
        byte cTeacher = 30;
        System.out.println(cTeacher);
        short sheets = 480;
        System.out.println(sheets);
        int result = sheets / (aTeacher + bTeacher + cTeacher);
        System.out.println(" На каждого ученика рассчитано " + result + " листов бумаги");


        byte minutesInterval = 2;
        System.out.println(minutesInterval);
        byte performanceTwoMinutes = 16;
        System.out.println(performanceTwoMinutes);
        byte oneTime = 20;
        System.out.println(oneTime);
        short result1 = (short) ((oneTime / minutesInterval) * performanceTwoMinutes);
        System.out.println(" За " + oneTime + " машина произвела " + result1 + " штук бутылок");
        short twoTime = 1440;
        System.out.println(twoTime);
        short result2 = (short) ((twoTime / minutesInterval) * performanceTwoMinutes);
        System.out.println(" За " + twoTime + " машина произвела " + result2 + " штук бутылок");
        short threeTime = 4320;
        System.out.println(threeTime);
        int result3 = ((threeTime / minutesInterval) * performanceTwoMinutes);
        System.out.println(" За " + threeTime + " машина произвела " + result3 + " штук бутылок");
        int fourTime = 43200;
        System.out.println(fourTime);
        int result4 = ((fourTime / minutesInterval) * performanceTwoMinutes);
        System.out.println(" За " + fourTime + " машина произвела " + result4 + " штук бутылок");


        byte totalCans = 120;
        System.out.println(totalCans);
        byte whiteCans = 2;
        System.out.println(whiteCans);
        byte brownCans = 4;
        System.out.println(brownCans);
        byte oneClass = 6;
        System.out.println(oneClass);
        byte result5 = (byte) (totalCans / oneClass);
        System.out.println(result5);
        byte result6 = (byte) ((totalCans / oneClass) * 2);
        System.out.println(result6);
        byte result7 = (byte) ((totalCans / oneClass) * 4);
        System.out.println(result7);
        System.out.println(" В школе где " + result5 + " классов, нужно " + result6 + " банок белой краски и " + result7 + " банок коричневой краски");


        short oneBanana = 80;
        System.out.println(oneBanana);
        short totalBananas = 5;
        System.out.println(totalBananas);
        int result8 = oneBanana * totalBananas;
        System.out.println(result8);
        short oneMilk = 100;
        System.out.println(oneMilk);
        short totalMilk = 200;
        System.out.println(totalMilk);
        short milkWeight = 105;
        System.out.println(milkWeight);
        int result9 = (totalMilk / oneMilk) * 105;
        System.out.println(result9);
        byte oneBriquette = 100;
        System.out.println(oneBriquette);
        byte totalBriquette = 2;
        System.out.println(totalBriquette);
        int result10 = totalBriquette * oneBriquette;
        System.out.println(result10);
        byte totalEggs = 4;
        System.out.println(totalEggs);
        byte oneEggs = 70;
        System.out.println(oneEggs);
        int result11 = totalEggs * oneEggs;
        System.out.println(result11);
        int result12 = result8 + result9 + result10 + result11;
        System.out.println(result12);
        float result13 = result8 + result9 + result10 + result11;
        System.out.println(result13);


        short totalWeight = 7000;
        System.out.println(totalWeight);
        short oneDay = 250;
        System.out.println(oneDay);
        short twoDay = 500;
        System.out.println(twoDay);
        int result14 = totalWeight / oneDay;
        System.out.println(result14);
        int result15 = totalWeight / twoDay;
        System.out.println(result15);
        int result16 = (result14 - result15) / 2 + result15;
        System.out.println(result16);


        int mP = 67760;
        System.out.println(mP);
        int dP = 83690;
        System.out.println(dP);
        int kP = 76230;
        System.out.println(kP);
        float result17 = (mP * 0.10F);
        System.out.println(result17);
        float result18 = mP + result17;
        System.out.println(result18);
        float result19 = (result18 * 12) - (mP * 12);
        System.out.println(result19);
        System.out.println(" Маша теперь получает " + result18 + " рублей." + " Годовой доход вырос на " + result19 + " рублей.");
        double result20 = dP * 0.10;
        System.out.println(result20);
        double result21 = dP + result20;
        System.out.println(result21);
        double result22 = (result21 * 12) - (dP * 12);
        System.out.println(result22);
        System.out.println(" Денис теперь получает " + result21 + " рублей." + " Годовой доход вырос на " + result22 + " рублей.");
        float result23 = kP * 0.10F;
        System.out.println(result23);
        float result24 = kP + result23;
        System.out.println(result24);
        float result25 = (result24 * 12) - (kP * 12);
        System.out.println(result25);
        System.out.println(" Денис теперь получает " + result24 + " рублей." + " Годовой доход вырос на " + result25 + " рублей.");

    }
}