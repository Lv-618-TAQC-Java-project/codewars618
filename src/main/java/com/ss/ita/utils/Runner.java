package com.ss.ita.utils;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;
import com.ss.ita.kata.Six;

import java.math.BigInteger;
import java.util.Arrays;


public class Runner {
    private Eight eight;
    private Seven seven;
    private Six six;
    private Five five;
    private Users users;
    private ConsoleScanner sc;

    public Runner(Users user) {
        setUsers(user);
        sc = new ConsoleScanner();
    }

    public void setUsers(Users users) {
        this.users = users;
        switch (users) {
            case IVANKA:
                five = new com.ss.ita.kata.implementation.ivannaveselovska.FiveImpl();
                six = new com.ss.ita.kata.implementation.ivannaveselovska.SixImpl();
                seven = new com.ss.ita.kata.implementation.ivannaveselovska.SevenImpl();
                eight = new com.ss.ita.kata.implementation.ivannaveselovska.EightImpl();
                break;
            case VOLODYMYR_MUR:
                five = new com.ss.ita.kata.implementation.vmuravskyi.FiveImpl();
                six = new com.ss.ita.kata.implementation.vmuravskyi.SixImpl();
                seven = new com.ss.ita.kata.implementation.vmuravskyi.SevenImpl();
                eight = new com.ss.ita.kata.implementation.vmuravskyi.EightImpl();
                break;
            case YURII:
                five = new com.ss.ita.kata.implementation.yranest.FiveImpl();
                six = new com.ss.ita.kata.implementation.yranest.SixImpl();
                seven = new com.ss.ita.kata.implementation.yranest.SevenImpl();
                eight = new com.ss.ita.kata.implementation.yranest.EightImpl();
                break;
            case MAKSYM_DEN:
                five = new com.ss.ita.kata.implementation.maxde1.FiveImpl();
                six = new com.ss.ita.kata.implementation.maxde1.SixImpl();
                seven = new com.ss.ita.kata.implementation.maxde1.SevenImpl();
                eight = new com.ss.ita.kata.implementation.maxde1.EightImpl();
                break;
            case ANASTASIIA:
                five = new com.ss.ita.kata.implementation.kubrub.FiveImpl();
                six = new com.ss.ita.kata.implementation.kubrub.SixImpl();
                seven = new com.ss.ita.kata.implementation.kubrub.SevenImpl();
                eight = new com.ss.ita.kata.implementation.kubrub.EightImpl();
                break;
            case IEVGENII:
                five = new com.ss.ita.kata.implementation.shcherbakoveugene.FiveImpl();
                six = new com.ss.ita.kata.implementation.shcherbakoveugene.SixImpl();
                seven = new com.ss.ita.kata.implementation.shcherbakoveugene.SevenImpl();
                eight = new com.ss.ita.kata.implementation.shcherbakoveugene.EightImpl();
                break;
            case VOLODYMYR_SHO:
                five = new com.ss.ita.kata.implementation.vovik4.FiveImpl();
                six = new com.ss.ita.kata.implementation.vovik4.SixImpl();
                seven = new com.ss.ita.kata.implementation.vovik4.SevenImpl();
                eight = new com.ss.ita.kata.implementation.vovik4.EightImpl();
                break;
            case MAKSYM_SEM:
                five = new com.ss.ita.kata.implementation.msemochko.FiveImpl();
                six = new com.ss.ita.kata.implementation.msemochko.SixImpl();
                seven = new com.ss.ita.kata.implementation.msemochko.SevenImpl();
                eight = new com.ss.ita.kata.implementation.msemochko.EightImpl();
                break;
            case VIKTOR:
//                five = new com.ss.ita.kata.implementation..FiveImpl();
//                six = new com.ss.ita.kata.implementation..SixImpl();
//                seven = new com.ss.ita.kata.implementation..SevenImpl();
//                eight = new com.ss.ita.kata.implementation..EightImpl();
                break;
        }

    }

    public void TASK_8_1() {
        System.out.println("Enter the time in hours: ");
        double liters = doublePositive(sc.readDouble());
        System.out.println("Result: " + eight.liters(liters));
    }

    public void TASK_8_2() {
        System.out.println("Enter length: ");
        double length = doublePositive(sc.readDouble());
        System.out.println("Enter width: ");
        double width = doublePositive(sc.readDouble());
        System.out.println("Enter height: ");
        double height = doublePositive(sc.readDouble());
        System.out.println("Result: " + eight.getVolumeOfCuboid(length, width, height));
    }

    public void TASK_8_3() {
        System.out.println("Enter the number of Imperial Gallon: ");
        float mpg = floatPositive(sc.readFloat());
        System.out.println("Result: " + eight.mpgToKPM(mpg));
    }

    public void TASK_8_4() {
        System.out.println("Enter the array: ");
        int[] arr = intArrayPositive(sc.readIntArray());
        System.out.println("Result: " + Arrays.toString(eight.squareOrSquareRoot(arr)));
    }

    public void TASK_8_5() {
        System.out.println("Enter array: ");
        int[] array = sc.readIntArray();
        System.out.println("Result: " + Arrays.toString(eight.countPositivesSumNegatives(array)));
    }

    public void TASK_8_6() {
        System.out.println("Enter a string : ");
        String str = sc.readString();
        System.out.println("Result: " + eight.stringToNumber(str));
    }

    public void TASK_8_7() {
        System.out.println("Enter the number: ");
        double digit = sc.readDouble();
        System.out.println("Result: " + eight.amIWilson(digit));
    }

    public void TASK_8_8() {
        System.out.println("Enter the number: ");
        double digit = sc.readDouble();
        System.out.println("Result: " + eight.twoDecimalPlaces(digit));
    }

    public void TASK_8_9() {
        System.out.println("Enter array: ");
        int[] array = intArrayPositive(sc.readIntArray());
        System.out.println("Enter the divisor: ");
        int divider = intNotZero(sc.readInt());
        System.out.println("Result: " + Arrays.toString(eight.divisibleBy(array, divider)));
    }

    public void TASK_7_1() {
        System.out.println("Enter the array: ");
        double[] array = doubleArrayPositive(sc.readDoubleArray());
        System.out.println("Enter navg");
        double navg = doublePositive(sc.readDouble());
        System.out.println("Result: " + seven.newAvg(array, navg));
    }

    public void TASK_7_2() {
        System.out.println("Enter the number: ");
        int parameter = intPositive(sc.readInt());
        System.out.println("Result: " + seven.seriesSum(parameter));
    }

    public void TASK_7_3() {
        System.out.println("Enter the Total amount: ");
        int p = intPositive(sc.readInt());
        System.out.println("Enter the Number of people standing in front of him: ");
        int bef = intPositive(sc.readInt());
        System.out.println("Enter the Number of people standing behind him: ");
        int afr = intPositive(sc.readInt());
        System.out.println("Result: " + seven.whereIsHe(p, bef, afr));
    }

    public void TASK_6_1() {
        System.out.println("Enter volume: ");
        long volume = longPositive(sc.readLong());
        System.out.println("Result: " + six.findNb(volume));
    }

    public void TASK_6_2() {
        System.out.println("Enter balance: ");
        String book = sc.readString();
        System.out.println("Result: " + six.balance(book));
    }

    public void TASK_6_3() {
        System.out.println("Enter the number: ");
        double number = doublePositiveOrNull(sc.readDouble());
        System.out.println("Result: " + six.f(number));
    }

    public void TASK_6_4() {
        System.out.println("Enter the town: ");
        String town = sc.readString();
        System.out.println("Enter the date: ");
        String strng = sc.readString();
        System.out.println("Result: " + six.mean(town, strng));
    }

    public void TASK_6_5() {
        System.out.println("Enter a string of results: ");
        String results = sc.readString();
        System.out.println("Enter the name of team: ");
        String name = sc.readString();
        System.out.println("Result: " + six.nbaCup(results, name));
    }

    public void TASK_6_6() {
        System.out.println("Enter stocklist: ");
        String[] lstOfArt = sc.readStringArray();
        System.out.println("Enter a list of first letters: ");
        String[] lstOf1stLetter = sc.readStringArray();
        System.out.println("Result: " + six.stockSummary(lstOfArt, lstOf1stLetter));
    }

    public void TASK_5_1() {
        System.out.println("Enter the array: ");
        int[] array = intArrayPositive(sc.readIntArray());
        System.out.println("Result: " + five.artificialRain(array));
    }

    public void TASK_5_2() {
        System.out.println("Enter the gap we are looking for: ");
        int g = sc.readInt();
        System.out.println("Enter the start of the search: ");
        int m = sc.readInt();
        System.out.println("Enter the end of the search: ");
        int n = sc.readInt();
        while (g < 2 || m <= 2 || n < m) {
            System.out.println("Enter the gap we are looking for: ");
            g = sc.readInt();
            System.out.println("Enter the start of the search: ");
            m = sc.readInt();
            System.out.println("Enter the end of the search: ");
            n = sc.readInt();
        }
        System.out.println("Result: " + Arrays.toString(five.gap(g, m, n)));
    }
    public void TASK_5_3(){
        System.out.println("Please, input positive integer number 'n'.");
        int inputNumber = intPositive(sc.readInt());
        System.out.println("Result: " + five.zeros(inputNumber));
    }

    public void TASK_5_4(){
        System.out.println("Please, input positive BigInteger 'n'.");
        BigInteger inputNumber = sc.readBigInteger();
        while(true){
            if(inputNumber.intValue() > 0)
                break;
            System.out.println("You have to input positive BigInteger. Please, try again!");
            inputNumber = sc.readBigInteger();
        }
        System.out.println("Result: " + five.perimeter(inputNumber).intValue());
    }

    public void TASK_5_5(){
        System.out.println("Please, input positive real 'n'.");
        double inputNumber = doublePositive(sc.readDouble());
        System.out.println("Result: " + five.solveSum(inputNumber));
    }

    public void TASK_5_6() {
        System.out.println("Please, input positive integer 'n'.");
        long inputNumber = longPositive(sc.readLong());
        System.out.println("Result: " + five.smallest(inputNumber));
    }
    private int intPositive(int num) {
        while (num <= 0) {
            System.out.println("Please enter number > 0");
            num = sc.readInt();
        }
        return num;
    }

    private double doublePositive(double number) {
        while (number <= 0) {
            System.out.println("Please enter number >= 0");
            number = sc.readDouble();
        }
        return number;
    }

    private float floatPositive(float number) {
        while (number <= 0) {
            System.out.println("Please enter number >= 0");
            number = sc.readFloat();
        }
        return number;
    }

    private int[] intArrayPositive(int[] number) {
        for (int i = 0; i < number.length; i++) {
            while (number[i] <= 0) {
                System.out.println("Please enter all numbers >= 0");
                number = sc.readIntArray();
            }
        }
        return number;
    }

    private int intNotZero(int number) {
        while (number == 0) {
            System.out.println("Please enter number >= 0");
            number = sc.readInt();
        }
        return number;
    }

    private long longPositive(long number) {
        while (number <= 0) {
            System.out.println("Please enter number > 0");
            number = sc.readLong();
        }
        return number;
    }

    double doublePositiveOrNull(double number) {
        while (number < 0) {
            System.out.println("Please enter number >= 0");
            number = sc.readDouble();
        }
        return number;
    }

    private double[] doubleArrayPositive(double[] number) {
        for (int i = 0; i < number.length; i++) {
            while (number[i] <= 0) {
                System.out.println("Please enter all numbers >= 0");
                number = sc.readDoubleArray();
            }
        }
        return number;
    }


    public void setTasks(int number) {
        switch (number) {
            case 1:
                TASK_8_1();
                break;
            case 2:
                TASK_8_2();
                break;
            case 3:
                TASK_8_3();
                break;
            case 4:
                TASK_8_4();
                break;
            case 5:
                TASK_8_5();
                break;
            case 6:
                TASK_8_6();
                break;
            case 7:
                TASK_8_7();
                break;
            case 8:
                TASK_8_8();
                break;
            case 9:
                TASK_8_9();
                break;
            case 10:
                TASK_7_1();
                break;
            case 11:
                TASK_7_2();
                break;
            case 12:
                TASK_7_3();
                break;
            case 13:
                TASK_6_1();
                break;
            case 14:
                TASK_6_2();
                break;
            case 15:
                TASK_6_3();
                break;
            case 16:
                TASK_6_4();
                break;
            case 17:
                TASK_6_5();
                break;
            case 18:
                TASK_6_6();
                break;
            case 19:
                TASK_5_1();
                break;
            case 20:
                TASK_5_2();
                break;
            case 21:
                TASK_5_3();
                break;
            case 22:
                TASK_5_4();
                break;
            case 23:
                TASK_5_5();
                break;
            case 24:
                TASK_5_6();
                break;
        }
    }
}
