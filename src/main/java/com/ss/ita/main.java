package com.ss.ita;

import com.ss.ita.kata.implementation.vmuravskyi.FiveImpl;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

        FiveImpl f = new FiveImpl();
        System.out.println(Arrays.toString(f.gap(8, 300, 400)));
    }
}
