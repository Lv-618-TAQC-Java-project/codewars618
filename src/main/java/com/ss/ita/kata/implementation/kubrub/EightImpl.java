package com.ss.ita.kata.implementation.kubrub;

import java.util.ArrayList;
import com.ss.ita.kata.Eight;

public class EightImpl implements Eight {
    @Override
    public int liters(double time) {
        double litr = Math.floor(time * 0.5);
        return (int) litr;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        double kilometersPerLiter = 0.4251 * mpg;
        String value = String.format("%.2f", kilometersPerLiter);
        float res = Float.parseFloat(value);
        return res;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i <  array.length; i++){
            double n = Math.floor(Math.sqrt(array[i]));

            if (n*n==array[i]){
                array[i] = (int)n;
            }
            else{
                array[i] *= array[i];
            }
        }

        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] myResult = new int[2];
        int i = 0,j = 0;
        for (int x = 0; x <  input.length; x++){
            if (input[x] >= 0) {
                i += 1;
            }
            else{
                j += input[x];
            }
        }
        myResult[0] = i;
        myResult[0] = j;
        return myResult;

    }

    @Override
    public int stringToNumber(String str) {
        int i = Integer.parseInt(str);
        return i;
    }

    @Override
    public boolean amIWilson(double n) {
        double p = n;
        double j,fact = 1.0;
        for(j=1; j <= n-1; j++){
            fact = fact*j;
        }
        double res = 0.0;
        if ((fact+1) % (p * p) == 0) {
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public double twoDecimalPlaces(double number) {
        //double res =("%.2f",number);
        String value  = String.format("%.2f",number);
        double res = Double.parseDouble(value );
        return res;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {

        int m = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0){
                m++;
            }
        }
        int[] res = new int[m];
        m = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] % divider == 0){
                res[m] = numbers[i];
                m++;
            }
        }
        return res;
    }
}
