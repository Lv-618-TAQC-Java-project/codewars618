package com.ss.ita.utils;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;
import com.ss.ita.kata.Six;


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
            case Yurii:
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
            case VIKTOR:
//                five = new com.ss.ita.kata.implementation..FiveImpl();
//                six = new com.ss.ita.kata.implementation..SixImpl();
//                seven = new com.ss.ita.kata.implementation..SevenImpl();
//                eight = new com.ss.ita.kata.implementation..EightImpl();
                break;
        }
        public void TASK_8_1() {
            System.out.println("Enter the time in hours: ");
            double liters = sc.readDouble();
            System.out.println(eight.liters(liters));
        }
        public void TASK_8_3() {
            System.out.println("Enter the number of Imperial Gallon: ");
            float mpg = sc.readFloat();
            System.out.println(eight.mpgToKPM(mpg));
        }
        public void TASK_8_5() {
            System.out.println("Enter the size of array: ");
            int[] array = sc.readIntArray();
            System.out.println(Arrays.toString(eight.countPositivesSumNegatives(array)));
        }
        public void TASK_8_7(){
            System.out.println("Enter the number: ");
            double digit = sc.readDouble();
            System.out.println(eight.amIWilson(digit));
        }
        public void TASK_8_9(){
            System.out.println("Enter the size of array: ");
            int[] array = sc.readIntArray();
            System.out.println("Enter the divisor: ");
            int divider = sc.readInt();
            System.out.println(Arrays.toString(eight.divisibleBy(array,divider)));
        }
        public void TASK_7_2(){
            System.out.println("Enter the number: ");
            int parameter = sc.readInt();
            System.out.println(seven.seriesSum(parameter));
        }
        public void TASK_6_1(){
            System.out.println("Enter volume: ");
            long volume = sc.readLong();
            System.out.println(six.findNb(volume));
        }
        public void TASK_6_3(){
            System.out.println("Enter the number: ");
            double number = sc.readDouble();
            System.out.println(six.f(number));
        }
        public void TASK_6_5(){
            System.out.println("Enter a string of results: ");
            String results = sc.readString();
            System.out.println("Enter the name of team: ");
            String name = sc.readString();
            System.out.println(six.nbaCup(results,name));
        }
        public void TASK_5_1(){
            System.out.println("Enter the array: ");
            int[] array = sc.readIntArray();
            System.out.println(five.artificialRain(array));
        }
    }


}
