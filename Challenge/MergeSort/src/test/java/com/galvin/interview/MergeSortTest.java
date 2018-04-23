package com.galvin.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest
{
    @Test public void testMergesortPresorted() throws Exception {
        List<Integer> target = getTestData();
        doMergeSort( target );
    }
    
    @Test public void testMergesortBackwards() throws Exception {
        List<Integer> target = getTestData();
        Collections.reverse( target );
        doMergeSort( target );
    }
    
    @Test public void testMergesortShuffle() throws Exception {
        List<Integer> target = getTestData();
        Collections.shuffle( target );
        doMergeSort( target );
    }
    
    @Test public void testMergesortDuplicates() throws Exception {
        List<Integer> target = new ArrayList();
        target.addAll( getTestData() );
        target.addAll( getTestData() );
        target.addAll( getTestData() );
        target.addAll( getTestData() );
        target.addAll( getTestData() );
        Collections.shuffle( target );
        doMergeSort( target );
    }
    
    @Test public void testMergesortRandom() throws Exception {
        for( int i = 0; i < 1000; i++ ){
            doRandomMergeSort();
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
    
    private void doMergeSort(List<Integer> target ) throws Exception {
        List<Integer> expected = new ArrayList();
        expected.addAll( target );
        Collections.sort( expected );
        
        MergeSort sort = new MergeSort();
        sort.sort( target );
        
        Assert.assertEquals( "MergeSort failed", expected, target );
    }
    
    private void doRandomMergeSort() throws Exception {
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
        
        MergeSort sort = new MergeSort();
        sort.sort( target );
        
        Assert.assertEquals( "MergeSort failed", expected, target );
    }
}
