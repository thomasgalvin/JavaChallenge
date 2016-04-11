package com.galvin.interview;

/**
 * This class is an Array List implementation of the List interface.
 * 
 * Your task is to implements the two add() and one remove methods below, 
 * without breaking any of the existing functionality.
 */
public class ArrayList implements List {
    //the initial capacity for a new list, if none is specified
    private static final int DEFAULT_SIZE = 10;
    
    //the rate at which to grow the array when we run out of room. For example,
    // if we have a list of ten items, and added an eleventh, the data array
    // would be resized to 10 * GROWTH_FACTOR = 20.
    private static final int GROWTH_FACTOR = 2;
    
    // the array backing the list implementation
    private Object[] data;
    
    //the index that the next element will be insterted into. As a nice 
    //side-effect, this is also the current size of the list.
    private int nextFreeIndex = 0;

    public ArrayList() {
        this( DEFAULT_SIZE );
    }

    public ArrayList( int initialCapacity ) {
        data = new Object[ initialCapacity ];
    }

    @Override
    public void add( Object target ) {
        throw new UnsupportedOperationException( "TODO: Not implemented yet" );
    }

    @Override
    public void add( int index, Object target ) {
        throw new UnsupportedOperationException( "TODO: Not implemented yet" );
    }
    
    @Override
    public void remove( int index ) {
        throw new UnsupportedOperationException( "TODO: Not implemented yet" );
    }
    
    @Override
    public void set( int index, Object target ) {
        if( index >= nextFreeIndex ) {
            throw new ArrayIndexOutOfBoundsException( "Size of array exceeded" );
        }
        else if( index < 0 ) {
            throw new ArrayIndexOutOfBoundsException( "Size of array exceeded" );
        }
        else {
            data[index] = target;
        }
    }

    @Override
    public Object get( int index ) {
        checkIndex( index );
        return data[index];
    }

    @Override
    public int indexOf( Object target ) {
        for( int i = 0; i < nextFreeIndex; i++ ) {
            if( equals( target, data[i] ) ) {
                return i;
            }
        }

        return -1;
    }
    
    @Override
    public boolean contains( Object target ) {
        return indexOf( target ) != -1;
    }
    
    @Override
    public Object[] toArray() {
        int size = size();
        Object[] result = new Object[ size ];
        for( int i = 0; i < size; i++ ) {
            result[i] = data[i];
        }
        return result;
    }
    
    @Override
    public List sublist( int fromIndex, int toIndex ) {
        checkSublistIndex( fromIndex );
        checkSublistIndex( toIndex );
        if( fromIndex > toIndex ) {
            throw new IllegalArgumentException( "From index [" + fromIndex + " cannot be larger than to index [" + toIndex + "]" );
        }
        
        List result = new ArrayList();
        
        int size = toIndex - fromIndex;
        if( size > 0 ) {
            for( int i = fromIndex; i < toIndex; i++ ) {
                result.add( data[i] );
            }
        }
        
        return result;
    }

    @Override
    public void remove( Object target ) {
        int index = indexOf( target );
        if( index >= 0 ) {
            remove( index );
        }
    }

    @Override
    public void clear() {
        for( int i = 0; i < nextFreeIndex; i++ ) {
            data[i] = null;
        }
        nextFreeIndex = 0;
    }

    @Override
    public int size() {
        return nextFreeIndex;
    }
    
    @Override
    public boolean isEmpty() {
        return size() == 0;
    }
    
    /// utility methods ///
    
    private void checkIndex( int index ) throws ArrayIndexOutOfBoundsException {
        if( index < 0 || index >= nextFreeIndex ) {
            throw new ArrayIndexOutOfBoundsException( "Size of array exceeded" );
        }
    }
    
    private void checkSublistIndex( int index ) throws ArrayIndexOutOfBoundsException {
        if( index < 0 || index > nextFreeIndex ) {
            throw new ArrayIndexOutOfBoundsException( "Size of array exceeded" );
        }
    }

    private void growArrayIfNecessary() {
        if( nextFreeIndex >= data.length ) {
            Object[] newData = new Object[ data.length * GROWTH_FACTOR ];
            for( int i = 0; i < data.length; i++ ) {
                newData[i] = data[i];
                data[i] = null;
            }
            data = newData;
            newData = null;
        }
    }
    
    private boolean equals( Object one, Object two ) {
        if( one == null && two == null ){
            return true;
        } else if( one == null && two != null ) {
            return false;
        } else if( one != null && two == null ) {
            return false;
        } else {
            return one.equals( two );
        }
    }
}
