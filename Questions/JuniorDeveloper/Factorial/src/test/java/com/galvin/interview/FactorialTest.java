package com.galvin.interview;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest
{
    public static final String ERROR = "Incorrect Factorial";

    @Test
    public void testArrayMerge() throws Exception{
        Factorial factorial = new Factorial();
        fact( factorial, 0 );
        fact( factorial, 1 );
        fact( factorial, 2 );
        fact( factorial, 5 );
        fact( factorial, 10 );
        fact( factorial, 15 );
    }
    
    private void fact( Factorial factorial, int input ){
        long result = factorial.factorial( input );
        long expected = expected( input );
        Assert.assertEquals( ERROR, expected, result );
    }
    
    private long expected( int input ){
        long result = 1;
        
        for( int i = 1; i <= input; i++ ){
            result *= i;
        }
        
        return  result;
    }
}
