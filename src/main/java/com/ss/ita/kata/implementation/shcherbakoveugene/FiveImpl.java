package com.ss.ita.kata.implementation.shcherbakoveugene;

import com.ss.ita.kata.Five;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
        return new long[0];
    }
}
