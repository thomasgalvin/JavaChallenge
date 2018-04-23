package com.galvin.interview;

import org.junit.Assert;
import org.junit.Test;

public class SumsTest
{
    public static final String INCORRECT_SUM_FOR = "For-loop calculated an incorrect sum";
    public static final String INCORRECT_SUM_WHILE = "While-loop calculated an incorrect sum";
    public static final String INCORRECT_SUM_RECURSION = "Recursion calculated an incorrect sum";
    public static final double errorMargin = 0;

    private static final double[] ONE = { 1,2,3,4,5 };
    private static final double[] TWO = { -1, -2, -3, 3, 2, 1 };
    private static final double[] THREE = { 0, 100, 500, 1_000 };
    private static final double[] FOUR = { 1.5, -2.25, 10.95, 6.21 };
    private static final double[][] TEST_DATA = { ONE, TWO, THREE, FOUR };

    @Test public void testAll() throws Exception{
        Sums sums = new Sums();
        
        double[] input = new double[]{ 1,2,3,4,5 };
        run( sums, input );
        
        input = new double[]{ -1, -2, -3, 3, 2, 1 };
        run( sums, input );
        
        input = new double[]{ 0, 100, 500, 1_000 };
        run( sums, input );
        
        input = new double[]{ 1.5, -2.25, 10.95, 6.21 };
        run( sums, input );
    }

    private void run( Sums sums, double[] input ){
        double forResult = sums.forLoopSum( input );
        double whileResult = sums.whileLoopSum( input );
        double recursiveResult = sums.recursiveSum( input );
        double expected = getSum( input );

        Assert.assertEquals( INCORRECT_SUM_FOR, expected, forResult, errorMargin );
        Assert.assertEquals( INCORRECT_SUM_WHILE, expected, whileResult, errorMargin );
        Assert.assertEquals( INCORRECT_SUM_RECURSION, expected, recursiveResult, errorMargin );
    }

    @Test public void testForLoop(){
        for( double[] data: TEST_DATA ) doTestForLoop(data);
    }

    private void doTestForLoop( double[] input ){
        Sums sums = new Sums();
        double expected = getSum( input );
        double forResult = sums.forLoopSum( input );
        Assert.assertEquals( INCORRECT_SUM_FOR, expected, forResult, errorMargin );
    }

    @Test public void testWhileLoop(){
        for( double[] data: TEST_DATA ) doTestWhileLoop(data);
    }

    private void doTestWhileLoop( double[] input ){
        Sums sums = new Sums();
        double expected = getSum( input );
        double forResult = sums.whileLoopSum( input );
        Assert.assertEquals( INCORRECT_SUM_WHILE, expected, forResult, errorMargin );
    }

    @Test public void testRecursion(){
        for( double[] data: TEST_DATA ) doTestRecursion(data);
    }

    private void doTestRecursion( double[] input ){
        Sums sums = new Sums();
        double expected = getSum( input );
        double forResult = sums.recursiveSum( input );
        Assert.assertEquals( INCORRECT_SUM_RECURSION, expected, forResult, errorMargin );
    }

    private double getSum( double[] input ){
        double result = 0;
        
        for( double number : input ){
            result += number;
        }
        
        return result;
    }
}
