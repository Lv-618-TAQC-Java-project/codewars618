package com.ss.ita.kata;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

public class FiveTest extends FiveDataProvider{

    @Test
    public void testArtificialRain() {
    }

    @Test
    public void testGap() {
    }

    @Test
    public void testZeros() {
    }

    @Test
    public void testPerimeter() {
    }

    @Test
    public void testSolveSum() {
    }

    @Test(dataProvider = "findTheSmallest")
    public void testSmallest(Five imp, long n, String res) {
        Assert.assertEquals(Arrays.toString(imp.smallest(n)), res);
    }

    @Test(dataProvider = "invalidFindTheSmallest")
    public void negativeTestSmallest(Five imp, long n, String res){
        Assert.assertEquals(Arrays.toString(imp.smallest(n)), res);
    }

}