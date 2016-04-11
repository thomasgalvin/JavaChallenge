package com.galvin.interview;

/**
 * This class is an Singly-linked List implementation of the List interface.
 * 
 * Your task is to implements the two add() and one remove methods below, 
 * without breaking any of the existing functionality.
 */
public class LinkedList implements List {
    private Node head = null;
    
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
        checkIndex( index );
        Node node = getNode( index );
        node.setData( target );
    }

    @Override
    public Object get( int index ) {
        checkIndex( index );
        return getNode( index ).getData();
    }

    @Override
    public int indexOf( Object target ) {
        int count = 0;
        Node node = head;
        while( node != null ) {
            if( equals( target, node.getData() ) ) {
                return count;
            }
            count++;
            node = node.getNext();
        }
        
        return -1;
    }

    @Override
    public boolean contains( Object target ) {
        int index = indexOf( target );
        return index >= 0;
    }

    @Override
    public Object[] toArray() {
        int size = size();
        Object[] result = new Object[size];
        int index = 0;
        Node node = head;
        while( node != null ){
            result[index] = node.getData();
            node = node.getNext();
            index++;
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
        
        List result = new LinkedList();
        Node node = getNode( fromIndex );
        while( fromIndex < toIndex ) {
            result.add( node.getData() );
            fromIndex++;
            node = node.getNext();
        }
        return result;
    }

    @Override
    public void remove( Object target ) {
        int index = indexOf( target );
        if( index >= 0 ){
            remove( index );
        }
    }

    @Override
    public void clear() {
        Node node = head;
        while( node != null ) {
            Node next = node.getNext();
            node.setData( null );
            node.setNext( null );
            node = next;
        }
        head = null;
    }

    @Override
    public int size() {
        int size = 0;
        Node node = head;
        while( node != null ){
            size++;
            node = node.getNext();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }
    
    /// utility methods ///
    
    private void checkIndex( int index ) throws ArrayIndexOutOfBoundsException {
        if( index < 0 || index >= size() ) {
            throw new ArrayIndexOutOfBoundsException( "Size of array exceeded" );
        }
    }
    
    private void checkSublistIndex( int index ) throws ArrayIndexOutOfBoundsException {
        if( index < 0 || index > size() ) {
            throw new ArrayIndexOutOfBoundsException( "Size of array exceeded" );
        }
    }
    
    private Node getNode( int index ){
        if( index >= size() ){
            return null;
        }
        
        Node result = head;
        for( int i = 1; i <= index; i++ ){
            result = result.getNext();
        }
        return result;
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
    
    /**
     * The Node class if a fairly simple container, with an Object to hold data
     * and a reference to the next Node. If this is the end of the list, next
     * will be null.
     */
    private class Node {
        private Object data;
        private Node next;

        public Node( Object data ) {
            this( data, null );
        }

        public Node( Object data, Node next ) {
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        public void setData( Object data ) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext( Node next ) {
            this.next = next;
        }
    }
}
