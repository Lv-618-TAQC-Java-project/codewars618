package com.ss.ita.kata.implementation.yranest;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return (int)(time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return  length*width*height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return (float) Math.round(1.609344* mpg/4.54609188*100)/100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        {
            for(int i = 0; i<array.length;i++){
                if ((Math.sqrt(array[i]) - Math.floor(Math.sqrt(array[i]))) == 0) {
                    array[i] = (int)Math.sqrt(array[i]);
                }
                else{
                    array[i]*=array[i];
                }}
            return array;
        }
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        {
            if (input == null || input.length == 0) return new int[] {};
            int count = 0,sum = 0;
            for (int i : input) {
                if (i > 0) count ++;
                if (i < 0) sum += i;
            }
            return new int[] {count,sum};
        }
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        if(n>1)
            return ((factorial(n-1) + 1) % (n*n) == 0);
        else
            return false;
    }
    public static double factorial(double number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
        }


    @Override
    public double twoDecimalPlaces(double number) {
        return (double)Math.round(number*100)/100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count=0;
        int number = 0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%divider==0)
                count+=1;
        }
        int[] array = new int[count];
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%divider==0) {
                array[number] = numbers[i];
                number+=1;
            }
        }
        return array;
    }
}
