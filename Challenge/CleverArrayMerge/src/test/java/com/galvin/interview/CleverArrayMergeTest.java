package com.galvin.interview;

import org.junit.Assert;
import org.junit.Test;

public class CleverArrayMergeTest
{
    public static final String ARRAYS_NOT_MERGED = "Arrays not merged correctly";
    
    @Test
    public void testArrayMerge() throws Exception{
        CleverArrayMerge cleverArrayMerge = new CleverArrayMerge();
        
        Object[] foo = new Object[]{ 1, 2, 3 };
        Object[] bar = new Object[]{ "A", "B", "C" };
        Object[] expected = new Object[]{ 1, "A", 2, "B", 3, "C" };
        
        Object[] result = cleverArrayMerge.merge( foo, bar );
        Assert.assertArrayEquals( ARRAYS_NOT_MERGED, expected, result );
        
        foo = new Object[]{ 1, 2, 3, 4, 5 };
        bar = new Object[]{ "A", "B", "C" };
        expected = new Object[]{ 1, "A", 2, "B", 3, "C", 4, 5 };
        
        result = cleverArrayMerge.merge( foo, bar );
        Assert.assertArrayEquals( ARRAYS_NOT_MERGED, expected, result );
        
        foo = new Object[]{ 1, 2, 3 };
        bar = new Object[]{ "A", "B", "C", "D", "E", "F" };
        expected = new Object[]{ 1, "A", 2, "B", 3, "C", "D", "E", "F" };
        
        result = cleverArrayMerge.merge( foo, bar );
        Assert.assertArrayEquals( ARRAYS_NOT_MERGED, expected, result );
    }
}
