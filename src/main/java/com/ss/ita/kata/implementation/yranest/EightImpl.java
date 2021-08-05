package com.ss.ita.kata.implementation.yranest;

import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        return (int)(time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
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
