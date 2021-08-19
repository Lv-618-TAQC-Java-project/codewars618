package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class FiveImpl implements Five {
    @Override
    public int artificialRain(int[] v) {
        int count = 1;
        List<Integer> list = new ArrayList<>();

        if (v.length == 1) {
            return 1;
        }

        for (int i = 0; i < v.length; i++) {
            if (i == v.length - 1) {
                list.add(count);
                break;
            }
            if (v[i] < v[i + 1]) {
                list.add(count);
                count = 1;
                list.add(count);
            } else if (v[i] >= v[i + 1]) {
                count++;
                if (i != 0) {
                    if (v[i] > v[i - 1]) {
                        count++;
                    }
                }
            }
        }

        return Collections.max(list);
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long[] result = new long[2];
        int increment = 0;

        for (long i = m; i <= n; i++) {
            BigInteger bigInteger = BigInteger.valueOf(i);
            if (bigInteger.isProbablePrime((int) Math.log(i))) {
                result[increment] = i;
                increment ++;
            }
            if (increment == 2) {
                if (result[1] - result[0] == g) {
                    return result;
                } else {
                    result[0] = result[1];
                    increment = 1;
                }
            }
        }

        return null;
    }

    @Override
    public int zeros(int n) {
        long f = factorial(n);
        String[] str = String.valueOf(f).split("");
        int count = 0;

        for (int i = str.length - 1; i >= 0; i --) {
            if (str[i].equals("0")) {
                count ++;
            } else {
                break;
            }
        }

        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        int a = n.intValue();
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(1);
        BigInteger res = BigInteger.valueOf(1);

        for (int i = 1; i <= a; i ++) {
            num2 = num2.add(num1);
            num1 = num2.subtract(num1);
            res = res.add(num2);
        }

        return res.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        String[] inputToStringArr = Long
                .toString(n)
                .split("");
        List<Integer> list = Arrays
                .stream(inputToStringArr)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> outputList = new ArrayList<>();
        int min = Collections.min(list);
        int indexMinTo = 0;
        int indexMinFrom = 0;
        boolean repeat = false;

        for (int i = 2; i < list.size(); i++) {
            if (list.get(i).equals(list.get(1))) {
                repeat = true;
            }
        }

        if (repeat && list.get(1) < list.get(0)) {
            int temp = list.get(list.size() - 1);
            list.set((list.size() - 1), list.get(0));
            list.set(0, temp);
            indexMinTo = list.size() - 1;

            return listToArr(list, indexMinFrom, indexMinTo);
        } else if (repeat && list.get(1) > list.get(0)) {
            return listToArr(list, 0, 0);
        }

        for (int i = 0; i < list.size(); i++) {
            List<Integer> tempList = new ArrayList<>();
            if (list.indexOf(min) == i) {
                for (int j = i + 1; j < list.size(); j++) {
                    tempList.add(list.get(j));
                }
                min = Collections.min(tempList);
            } else {
                indexMinTo = i;
                break;
            }
        }

        if (list.indexOf(min) == 1) {
            list.set(1, list.get(0));
            list.set(0, min);
            indexMinTo = 1;

            return listToArr(list, indexMinFrom, indexMinTo);
        }

        indexMinFrom = list.indexOf(min);
        list.remove((Integer) min);

        for (int j = 0; j < list.size(); j++) {
            if (j == indexMinTo) {
                outputList.add(min);
            }
            outputList.add(list.get(j));

        }

        return listToArr(outputList, indexMinFrom, indexMinTo);
    }

    private long[] listToArr(List<Integer> list, int indexMinFrom, int indexMinTo) {
        long[] result = new long[3];
        StringBuilder sb = new StringBuilder();
        for (int el : list) {
            sb.append(el);
        }
        result[0] = Long.parseLong(sb.toString());
        result[1] = indexMinFrom;
        result[2] = indexMinTo;

        return result;
    }

    private long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }
}

