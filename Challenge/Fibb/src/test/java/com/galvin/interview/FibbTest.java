package com.galvin.interview;

import static com.galvin.interview.Fibb.FIBB_COUNT;
import org.junit.Assert;
import org.junit.Test;

public class FibbTest
{
    public static final String FIBONACCI_FAILURE = "Incorrect Fibonacci sequence";
    
    @Test public void testFibb() throws Exception{
        Fibb fibb = new Fibb();
        int[] result = fibb.fibb();
        int[] expected = getFibb();
        
        Assert.assertArrayEquals( FIBONACCI_FAILURE, expected, result );
    }
    
    private int[] getFibb() {
        int[] result = new int[ FIBB_COUNT ];
        
        result[0] = 0;
        result[1] = 1;
        for( int i = 2; i < FIBB_COUNT; i++ ){
            result[i] = result[i-1] + result[i-2];
        }
        
        return result;
    }
}
