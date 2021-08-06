package com.ss.ita.utils;

import com.ss.ita.kata.Eight;
import com.ss.ita.kata.Five;
import com.ss.ita.kata.Seven;
import com.ss.ita.kata.Six;

import java.math.BigInteger;


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
//                five = new com.ss.ita.kata.implementation.kubrub.FiveImpl();
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
    }

    public int runTask5_3(){
        System.out.println("Please, input positive integer number 'n'.");
        int inputNumber = sc.readInt();
        while(true){
            if(inputNumber > 0)
                break;
            System.out.println("You have to input positive integer. Please, try again!");
            inputNumber = sc.readInt();
        }
        return five.zeros(inputNumber);
    }

    public BigInteger runTask5_4(){
        System.out.println("Please, input positive BigInteger 'n'.");
        BigInteger inputNumber = sc.readBigInteger();
        while(true){
            if(inputNumber.intValue() > 0)
                break;
            System.out.println("You have to input positive BigInteger. Please, try again!");
            inputNumber = sc.readBigInteger();
        }
        return five.perimeter(inputNumber);
    }

    public double runTask5_5(){
        System.out.println("Please, input positive real 'n'.");
        double inputNumber = sc.readDouble();
        while(true){
            if(inputNumber > 0.0)
                break;
            System.out.println("You have to input positive real number. Please, try again!");
            inputNumber = sc.readDouble();
        }
        return five.solveSum(inputNumber);
    }

    public long[] runTask5_6() {
        System.out.println("Please, input positive integer 'n'.");
        long inputNumber = sc.readLong();
        while (true) {
            if (inputNumber > 0)
                break;
            System.out.println("You have to input positive integer number. Please, try again!");
            inputNumber = sc.readLong();
        }
        return five.smallest(inputNumber);
    }

}
