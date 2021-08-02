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
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
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
}

