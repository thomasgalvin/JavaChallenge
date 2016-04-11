package com.galvin.interview;

import org.junit.Assert;
import org.junit.Test;

public class ArrayMergeTest
{
    public static final String ARRAYS_NOT_MERGED = "Arrays not merged correctly";
    
    @Test
    public void testArrayMerge() throws Exception{
        ArrayMerge arrayMerge = new ArrayMerge();
        
        Object[] foo = new Object[]{ 1, 2, 3 };
        Object[] bar = new Object[]{ "A", "B", "C" };
        Object[] expected = new Object[]{ 1, "A", 2, "B", 3, "C" };
        
        Object[] result = arrayMerge.merge( foo, bar );
        Assert.assertArrayEquals( ARRAYS_NOT_MERGED, expected, result );
    }
}
