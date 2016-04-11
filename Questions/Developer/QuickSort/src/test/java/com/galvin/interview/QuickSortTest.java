package com.galvin.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest
{
    @Test
    public void testQuicksortPresorted() throws Exception {
        List<Integer> target = getTestData();
        doQuickSort( target );
    }
    
    @Test
    public void testQuicksortBackwards() throws Exception {
        List<Integer> target = getTestData();
        Collections.reverse( target );
        doQuickSort( target );
    }
    
    @Test
    public void testQuicksortShuffle() throws Exception {
        List<Integer> target = getTestData();
        Collections.shuffle( target );
        doQuickSort( target );
    }
    
    @Test
    public void testQuicksortDuplicates() throws Exception {
        List<Integer> target = new ArrayList();
        target.addAll( getTestData() );
        target.addAll( getTestData() );
        target.addAll( getTestData() );
        target.addAll( getTestData() );
        target.addAll( getTestData() );
        Collections.shuffle( target );
        doQuickSort( target );
    }
    
    @Test
    public void testQuicksortRandom() throws Exception {
        for( int i = 0; i < 1000; i++ ){
            doRandomQuickSort();
        }
    }
    
    private List<Integer> getTestData(){
        List<Integer> target = new ArrayList();
        target.add( -10 );
        target.add( -9 );
        target.add( -8 );
        target.add( -7 );
        target.add( -6 );
        target.add( -5 );
        target.add( -4 );
        target.add( -3 );
        target.add( -2 );
        target.add( -1 );
        target.add( 0 );
        target.add( 1 );
        target.add( 2 );
        target.add( 3 );
        target.add( 4 );
        target.add( 5 );
        target.add( 6 );
        target.add( 7 );
        target.add( 8 );
        target.add( 9 );
        target.add( 10 );
        return target;
    }
    
    private void doQuickSort(List<Integer> target ) throws Exception {
        List<Integer> expected = new ArrayList();
        expected.addAll( target );
        Collections.sort( expected );
        
        QuickSort sort = new QuickSort();
        sort.sort( target );
        
        Assert.assertEquals( "QuickSort failed", expected, target );
    }
    
    private void doRandomQuickSort() throws Exception {
        List<Integer> expected = new ArrayList();
        for( int i = 0; i < 5; i++ ) {
            for( int j = 0; j < 500; j++ ) {
                expected.add( j );
            }
        }
        Collections.sort( expected );
        
        List<Integer> target = new ArrayList();
        target.addAll( expected );
        Collections.shuffle( target );
        
        QuickSort sort = new QuickSort();
        sort.sort( target );
        
        Assert.assertEquals( "QuickSort failed", expected, target );
    }
}
