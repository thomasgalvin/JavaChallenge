package com.galvin.interview;

import java.util.List;

/**
 * This class implements the QuickSort algorithm.
 * 
 * The QuickSort algorithm can be defined as:
 * 
 * Given a List of values:
 * 1. Pick an element, called the pivot
 * 2. Reorder the list so that all elements with values less than the pivot come
 * before it and all elements with values greater than the pivot come after it.
 * 3. The pivot is now in its final place.
 * 4. Recursively apply the QuickSort algorithm to the partition containing the
 * lower values.
 * 5. Recursively apply the QuickSort algorithm to the partition containing the
 * higher values.
 * 
 * Implement the QuickSort algorithm below. You may assume all values will be
 * non-null.
 * 
 * For more information:
 * http://en.wikipedia.org/wiki/Quicksort
 */
public class QuickSort {
    public void sort( List<Integer> target ) {
        if( target.isEmpty() ) {
            return;
        }

        sort( target, 0, target.size() - 1 );
    }

    /**
     * The main implementation of the QuickSort algorithm, which always uses
     * the leftmost item as the pivot.
     * @param target the list to be sorted
     * @param low    the lowest index to partition, inclusive
     * @param high   the highest index to partition, inclusive
     */
    private void sort( List<Integer> target, int low, int high ) {
        throw new UnsupportedOperationException( "TODO: Implement the QuickSort algorithm." );
    }

    private boolean needSwap( Integer i1, Integer i2 ) {
        return i1.compareTo( i2 ) > 0;
    }

}
