package com.galvin.interview;

import org.junit.Assert;
import org.junit.Test;

public class SortTest
{
    public static final String ARRAY_NOT_SORTED = "Array not sorted correctly";
    
    private static final int[] expected = { -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    
    @Test
    public void testSort() throws Exception{
        Sort sort = new Sort();
        
        int[] unsorted = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5, -6, -7 ,-8, -9, -10  };
        int[] sorted = sort.sort( unsorted );
        assertCopied( sorted, unsorted );
        Assert.assertArrayEquals( ARRAY_NOT_SORTED, expected, sorted );
        
        unsorted = new int[]{ -1, -2, -3, -4, -5, -6, -7 ,-8, -9, -10, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0   };
        sorted = sort.sort( unsorted );
        assertCopied( sorted, unsorted );
        Assert.assertArrayEquals( ARRAY_NOT_SORTED, expected, sorted );
        
        unsorted = new int[]{ -10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10   };
        sorted = sort.sort( unsorted );
        assertCopied( sorted, unsorted );
        Assert.assertArrayEquals( ARRAY_NOT_SORTED, expected, sorted );
        
        unsorted = new int[]{ 0, -8, -9, -7, 7, -5, -4, 3, -3, -2, -1, 1, 4, 5, 6, 8, 2, 9, -6, 10, -10, };
        sorted = sort.sort( unsorted );
        assertCopied( sorted, unsorted );
        Assert.assertArrayEquals( ARRAY_NOT_SORTED, expected, sorted );
        
        unsorted = new int[]{ 0, 10, -10, 9, -9, 8, -8, 7, -7, 6, -6, 5, -5, 4, -4, 3, -3, 2, -2, 1, -1 };
        sorted = sort.sort( unsorted );
        assertCopied( sorted, unsorted );
        Assert.assertArrayEquals( ARRAY_NOT_SORTED, expected, sorted );
        
        unsorted = new int[]{ 10, -10, 9, -9, 8, -8, 7, -7, 6, -6, 5, -5, 4, -4, 3, -3, 2, -2, 1, -1, 0 };
        sorted = sort.sort( unsorted );
        assertCopied( sorted, unsorted );
        Assert.assertArrayEquals( ARRAY_NOT_SORTED, expected, sorted );
        
        unsorted = new int[]{ 0, -10, 10, -9, 9, -8, 8, -7, 7, -6, 6, -5, 5, -4, 4, -3, 3, -2, 2, -1, 1 };
        sorted = sort.sort( unsorted );
        assertCopied( sorted, unsorted );
        Assert.assertArrayEquals( ARRAY_NOT_SORTED, expected, sorted );
    }
    
    private void assertCopied( int[] sorted, int[] unsorted ) throws Exception{
        if( sorted == unsorted ){
            throw new Exception( "The sort method is supposed to create a defensive copy, but instead modified the original array" );
        }
    }
}
