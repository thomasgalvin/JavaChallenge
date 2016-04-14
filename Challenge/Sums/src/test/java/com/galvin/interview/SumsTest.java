package com.galvin.interview;

import org.junit.Assert;
import org.junit.Test;

public class SumsTest
{
    public static final String INCORRECT_SUM_FOR = "For-loop calculated an incorrect sum";
    public static final String INCORRECT_SUM_WHILE = "While-loop calculated an incorrect sum";
    public static final String INCORRECT_SUM_RECURSION = "Recursion calculated an incorrect sum";
    public static final double errorMargin = 0;
    
    @Test
    public void testSums() throws Exception{
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
        Assert.assertEquals( INCORRECT_SUM_WHILE, expected, whileResult, whileResult );
        Assert.assertEquals( INCORRECT_SUM_RECURSION, expected, recursiveResult, recursiveResult );
    }
    
    private double getSum( double[] input ){
        double result = 0;
        
        for( double number : input ){
            result += number;
        }
        
        return result;
    }
}
