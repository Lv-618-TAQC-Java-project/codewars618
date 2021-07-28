package com.ss.ita.kata.implementation.maxde1;

import com.ss.ita.kata.Eight;

import static java.lang.Math.sqrt;
import static java.lang.Math.ceil;


public class EightImpl implements Eight {


    @Override
    public int liters(double time) {
        int result = (int)(time*0.5);
        return result;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        //
        double volumeOfCuboid=length * width * height;
        return volumeOfCuboid;
    }

    @Override
    public float mpgToKPM(float mpg) {
        if (mpg >= 0){
            float kpl = (mpg*1.609344f)/4.54609188f;
            float rounded =(float) (Math.round(kpl*100)/100D);
            return rounded;

        }
        else {
            return -1;
        }
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] arr = new int[array.length];
        double root;
        for (int i = 0; i < array.length; i++){
            root = sqrt(array[i]);
            if (root == ceil(root)){
                arr[i] = (int) root;
            }
            else{
                arr[i] = array[i]*array[i];
            }

        }

        return arr;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0){
            return new int[0];
        }
        int positiveElementCount = 0;
        int negativeElementSum = 0;

        for (int i = 0; i < input.length; i++){
            if (input[i] > 0){
                positiveElementCount += 1;
            }
            if(input[i] < 0){
                negativeElementSum += input[i];
            }
        }

        return new int[] {positiveElementCount, negativeElementSum};
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
