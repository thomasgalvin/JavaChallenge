package com.galvin.interview;

public interface List
{
    /**
     * Appends the specified element to the end of this list.
     * @param target the element to add to the list
     */
    public void add( Object target );
    
    /**
     * Inserts the specified element at the specified position in this list
     * @param index the index at which the element should be inserted
     * @param target the element to add to the list
     */
    public void add( int index, Object target );
    
    /**
     * Replaces the element at the specified position in this list with the specified element
     * @param index the index of the element that should be replaced
     * @param target the element to insert into the list
     */
    public void set( int index, Object target );

    /**
     * Returns the object at the specified index in the list.
     * @param index the index of the element
     * @return the element at the specified index
     */
    public Object get( int index );
    
    /**
     * Returns the first index of the given element, or -1 if it is not found
     * @param target the element being searched for
     * @return the first index of the given element, or -1 if it is not found
     */
    public int indexOf( Object target );
    
    /**
     * Returns true if the target is contained in the list, false otherwise.
     * @param target the element being searched for
     * @return true if the target is contained in the list, false otherwise.
     */
    public boolean contains( Object target );
    
    /**
     * Returns an array containing all of the elements in this list in the correct order.
     * @return an array containing all of the elements in this list in the correct order.
     */
    public Object[] toArray();
    
    /**
     * Returns a copy of the list, starting at fromIndex( inclusive) and ending at toIndex (exclusive)
     * @param fromIndex index of the first element of the sublist (inclusive)
     * @param toIndex index of the last element of the sublist (exclusive)
     * @return 
     */
    public List sublist( int fromIndex, int toIndex );
    
    /**
     * Removes the first occurrence of the specified element from this list, if it is present.
     * @param target the element to be removed
     */
    public void remove( Object target );
    
    /**
     * Removes the element at the specified position in this list.
     * @param index the index of the element to remove
     */
    public void remove( int index);
    
    /**
     * Removes all of the elements from this list .
     */
    public void clear();
    
    /**
     * Returns the number of items currently in the list.
     * @return 
     */
    public int size();
    
    /**
     * Returns true if the list contains zero elements.
     * @return  true if the list is empty, false otherwise.
     */
    public boolean isEmpty();
}
