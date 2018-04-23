package com.galvin.interview;

import static com.galvin.interview.FindPrimes.PRIME_COUNT;
import org.junit.Assert;
import org.junit.Test;

public class FindPrimesTest
{
    public static final String ERROR = "Incorrect list of primes";
    
    @Test public void testFindPrimes() throws Exception{
        FindPrimes findPrimes = new FindPrimes();
        int[] result = findPrimes.findPrimes();
        int[] expected = findPrimes();
        
        Assert.assertArrayEquals( ERROR, expected, result );
    }
    
    private int[] findPrimes(){
        int[] result = new int[ PRIME_COUNT ];
        
        int index = 0;
        int nextPrime = 2;
        while( index < PRIME_COUNT ){
            if( isPrime( nextPrime ) ){
                result[index] = nextPrime;
                index++;
            }
            nextPrime++;
        }
        
        return result;
    }
    
    private boolean isPrime( int value ){
        for( int i = 2; i <= value / 2; i++ ){
            if( value % i == 0 ){
                return false;
            }
        }
        return true;
    }
}
