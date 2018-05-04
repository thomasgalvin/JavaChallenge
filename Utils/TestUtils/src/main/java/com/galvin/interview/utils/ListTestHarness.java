package com.galvin.interview.utils;

import com.galvin.interview.List;
import org.junit.Assert;

public class ListTestHarness
{
    public ListFactory listFactory;

    public ListTestHarness( ListFactory listFactory ) {
        this.listFactory = listFactory;
    }
    
    public void testAll() throws Exception {
        testAdd();
        testAddMultiple();
        testSetZero();
        testSetMiddle();
        testSetEnd();
        testSetInvalidIndexPositive();
        testSetInvalidIndexNegative();
        testRemoveZeroIndex();
        testRemoveMiddleIndex();
        testRemoveEndIndexAtCapacity();
        testRemoveEndIndex();
        testRemoveObjectZero();
        testRemoveObjectMiddle();
        testRemoveObjectLast();
        testRemoveObjectNotPresent();
        testClear();
        testAddIndexEmpty();
        testAddIndexZero();
        testAddIndexMiddle();
        testAddIndexEnd();
        testAddIndexInvalid();
        testAddIndexInvalidNegative();
        testGetIndexInvalidEmpty();
        testGetIndexInvalidNegative();
        testGetIndexInvalidEnd();
        testIndexOfNotFound();
        testContainsTrue();
        testContainsFalse();
        testSize();
        testIsEmpty();
        testIsEmptyRemove();
        testIsEmptyClear();
        testToArray();
        testToArrayEmpty();
        testSublistWhole();
        testSublistMiddle();
        testSublistEnd();
        testSublistNone();
        testSublistEmpty();
        testSublistInvalidFromNegative();
        testSublistInvalidFromPositive();
        testSublistInvalidToNegative();
        testSublistInvalidToPositive();
        testSublistFromLargerThanTo();
        testFindNullZero();
        testFindNullMiddle();
        testFindNullEnd();
        testFindNullNotFound();
        testFindWithNulls();
    }

    public void testAddMethod() throws Exception{
        testAdd();
        testAddMultiple();
        testSetZero();
        testSetMiddle();
        testSetEnd();
        testSetInvalidIndexPositive();
        testSetInvalidIndexNegative();

        testClear();

        testGetIndexInvalidEmpty();
        testGetIndexInvalidNegative();
        testGetIndexInvalidEnd();
        testIndexOfNotFound();

        testContainsTrue();
        testContainsFalse();
        testSize();
        testIsEmpty();


        testIsEmptyClear();
        testToArray();
        testToArrayEmpty();
        testSublistWhole();
        testSublistMiddle();
        testSublistEnd();
        testSublistNone();
        testSublistEmpty();
        testSublistInvalidFromNegative();
        testSublistInvalidFromPositive();
        testSublistInvalidToNegative();
        testSublistInvalidToPositive();
        testSublistFromLargerThanTo();
        testFindNullZero();
        testFindNullMiddle();
        testFindNullEnd();
        testFindNullNotFound();
        testFindWithNulls();
    }

    public void testAddAtMethod() throws Exception{
        testAddIndexEmpty();
        testAddIndexZero();
        testAddIndexMiddle();
        testAddIndexEnd();
        testAddIndexInvalid();
        testAddIndexInvalidNegative();
    }

    public void testRemoveMethod() throws Exception{
        testRemoveZeroIndex();
        testRemoveMiddleIndex();
        testRemoveEndIndexAtCapacity();
        testRemoveEndIndex();
        testRemoveObjectZero();
        testRemoveObjectMiddle();
        testRemoveObjectLast();
        testRemoveObjectNotPresent();

        testIsEmptyRemove();
    }

    public void testAdd() throws Exception {
        List list = listFactory.createList();
        
        Object object = "Hello, world";
        list.add( object );
        
        Assert.assertEquals( "Wrong list size", 1, list.size() );
        Assert.assertEquals( "Wrong element in list", object, list.get(0) );
    }
    
    public void testAddMultiple() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testSetZero() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }

        int index = 0;
        String newString = "Hi there!";
        list.set( index, newString );
        strings[index] = newString;
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testSetMiddle() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }

        int index = 7;
        String newString = "Hi there!";
        list.set( index, newString );
        strings[index] = newString;
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testSetEnd() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }

        int index = list.size() - 1;
        String newString = "Hi there!";
        list.set( index, newString );
        strings[index] = newString;
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testSetInvalidIndexPositive() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }

        int index = list.size() + 1;
        try {
            list.set( index, "123" );
        } catch( ArrayIndexOutOfBoundsException a ) {
            //this exception should have been thrown. Great success!
            return;
        }
        
        throw new Exception( "List should have thrown due to invalid index: " + index );
    }
    
    public void testSetInvalidIndexNegative() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }

        int index = -1;
        try {
            list.set( index, "123" );
        } catch( ArrayIndexOutOfBoundsException a ) {
            //this exception should have been thrown. Great success!
            return;
        }
        
        throw new Exception( "List should have thrown due to invalid index: " + index );
    }
    
    public void testRemoveZeroIndex() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        //first remove, middle index
        list.remove( 0 );
        
        // this is what our list should now contai
        strings = new String[] {
          "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testRemoveMiddleIndex() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        //first remove, middle index
        list.remove( 3 );
        
        // this is what our list should now contain
        strings = new String[] {
          "A", "B", "C", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testRemoveEndIndexAtCapacity() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        //first remove, middle index
        list.remove( strings.length - 1 );
        
        // this is what our list should now contain
        strings = new String[] {
          "0", "1", "2", "3", "4", "5", "6", "7", "8",
        };
        
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testRemoveEndIndex() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        list.remove( strings.length - 1 );
        
        strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y"
        };
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testRemoveObjectZero() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        list.remove( "A" );
        strings = new String[] {
          "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testRemoveObjectMiddle() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        list.remove( "M" );
        strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testRemoveObjectLast() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        list.remove( "Z" );
        strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y"
        };
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testRemoveObjectNotPresent() throws Exception {
        List list = listFactory.createList();
        
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        list.remove( "Bye!" );
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testClear() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        
        list.clear();
        Assert.assertEquals( "Wrong list size", 0, list.size() );
    }
    
    public void testAddIndexEmpty() throws Exception {
        List list = listFactory.createList();
        
        Object object = "Hello, world";
        list.add( 0, object );
        
        Assert.assertEquals( "Wrong list size", 1, list.size() );
        Assert.assertEquals( "Wrong element in list", object, list.get(0) );
    }
    
    public void testAddIndexZero() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        String newString = "Hi there!";
        list.add( 0, newString );
        
        strings = new String[] {
          "Hi there!",
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testAddIndexMiddle() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        String newString = "Hi there!";
        list.add( 10, newString );
        
        strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "Hi there!",
          "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testAddIndexEnd() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        String newString = "Hi there!";
        list.add( strings.length, newString );
        
        strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z",
          "Hi there!",
        };
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], list.get(i) );
        }
    }
    
    public void testAddIndexInvalid() throws Exception {
        List list = listFactory.createList();
        
        try {
            Object object = "Hello, world";
            list.add( 1, object );
        } catch( Exception e ){
            //this should happen; we intentionally tried to add
            // an element to an invalid location
            return;
        }
        
        //if we *didn't* catch the expected error, fail the test
        throw new Exception( "ArrayList didn't throw when an invalid index was specified" );
    }
    
    public void testAddIndexInvalidNegative() throws Exception {
        List list = listFactory.createList();
        
        try {
            Object object = "Hello, world";
            list.add( -11, object );
        } catch( Exception e ){
            //this should happen; we intentionally tried to add
            // an element to an invalid location
            return;
        }
        
        //if we *didn't* catch the expected error, fail the test
        throw new Exception( "ArrayList didn't throw when an invalid index was specified" );
    }
    
    public void testGetIndexInvalidEmpty() throws Exception {
        List list = listFactory.createList();
        
        try {
            list.get( 0 );
        } catch( Exception e ){
            //this should happen; we intentionally tried to add
            // an element to an invalid location
            return;
        }
        
        //if we *didn't* catch the expected error, fail the test
        throw new Exception( "ArrayList didn't throw when an invalid index was specified" );
    }
    
    public void testGetIndexInvalidNegative() throws Exception {
        List list = listFactory.createList();
        
        try {
            list.get( -1 );
        } catch( Exception e ){
            //this should happen; we intentionally tried to add
            // an element to an invalid location
            return;
        }
        
        //if we *didn't* catch the expected error, fail the test
        throw new Exception( "ArrayList didn't throw when an invalid index was specified" );
    }
    
    public void testGetIndexInvalidEnd() throws Exception {
        List list = listFactory.createList();
        
        try {
            Object object = "Hello, world";
            list.add( object );
            list.get( 1 );
        } catch( Exception e ){
            //this should happen; we intentionally tried to add
            // an element to an invalid location
            return;
        }
        
        //if we *didn't* catch the expected error, fail the test
        throw new Exception( "ArrayList didn't throw when an invalid index was specified" );
    }
    
    public void testIndexOfNotFound() throws Exception {
        List list = listFactory.createList();
        list.add( "Hi!" );
        int index = list.indexOf( "Bye!" );
        Assert.assertEquals( "Element should not have been found", -1, index );
    }
    
    public void testContainsTrue() throws Exception {
        List list = listFactory.createList();
        
        Object object = "Hello, world";
        list.add( object );
        
        Assert.assertTrue( "Element not found", list.contains( object ) );
    }
    
    public void testContainsFalse() throws Exception {
        List list = listFactory.createList();
        
        Object object = "Hello, world";
        Assert.assertFalse( "Element should not have been found", list.contains( object ) );
    }
    
    public void testSize() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        Assert.assertEquals( "Wrong list size", strings.length, list.size() );
    }
    
    public void testIsEmpty() throws Exception {
        List list = listFactory.createList();
        Assert.assertTrue( "List should be empty", list.isEmpty() );
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        Assert.assertFalse( "List should not be empty", list.isEmpty() );
    }
    
    public void testIsEmptyRemove() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        Assert.assertFalse( "List should not be empty", list.isEmpty() );
        
        for( String string : strings ){
            list.remove( string );
        }
        
        Assert.assertTrue( "List should be empty", list.isEmpty() );
    }
    
    public void testIsEmptyClear() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        Assert.assertFalse( "List should not be empty", list.isEmpty() );
        
        list.clear();
        Assert.assertTrue( "List should be empty", list.isEmpty() );
    }
    
    public void testToArray() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        Object[] copy = list.toArray();
        
        Assert.assertEquals( "Wrong copy size", strings.length, copy.length );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], copy[i] );
        }
    }
    
    public void testToArrayEmpty() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {};
        
        for( String string : strings ){
            list.add( string );
        }
        
        Object[] copy = list.toArray();
        
        Assert.assertEquals( "Wrong copy size", strings.length, copy.length );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], copy[i] );
        }
    }
    
    public void testSublistWhole() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        List sublist = list.sublist( 0, list.size() );
        
        Assert.assertEquals( "Wrong copy size", list.size(), sublist.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", list.get(i), sublist.get(i) );
        }
    }
    
    public void testSublistMiddle() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        List sublist = list.sublist( 5, 8 );
        strings = new String[] {
          "F", "G", "H"
        };
        
        Assert.assertEquals( "Wrong copy size", strings.length, sublist.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], sublist.get(i) );
        }
    }
    
    public void testSublistEnd() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        List sublist = list.sublist( 5, list.size() );
        strings = new String[] {
          "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        Assert.assertEquals( "Wrong copy size", strings.length, sublist.size() );
        for( int i = 0; i < strings.length; i++ ){
            Assert.assertEquals( "Wrong element in list", strings[i], sublist.get(i) );
        }
    }
    
    public void testSublistNone() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        List sublist = list.sublist( 0, 0 );
        Assert.assertEquals( "Wrong copy size", 0, sublist.size() );
    }
    
    public void testSublistEmpty() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {};
        
        for( String string : strings ){
            list.add( string );
        }
        
        List sublist = list.sublist( 0, 0 );
        Assert.assertEquals( "Wrong copy size", 0, sublist.size() );
    }
    
    public void testSublistInvalidFromNegative() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        try {
            List sublist = list.sublist( -1, strings.length );
        } catch( ArrayIndexOutOfBoundsException e ) {
            //this was supposed to happen
            return;
        }
        
        throw new Exception( "List should have thrown an exception for a negative index" );
    }
    
    public void testSublistInvalidFromPositive() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        try {
            List sublist = list.sublist( strings.length + 1, strings.length + 2 );
        } catch( ArrayIndexOutOfBoundsException e ) {
            //this was supposed to happen
            return;
        }
        
        throw new Exception( "List should have thrown an exception for an out of bounds index" );
    }
    
    public void testSublistInvalidToNegative() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        try {
            List sublist = list.sublist( 0, -1 );
        } catch( ArrayIndexOutOfBoundsException e ) {
            //this was supposed to happen
            return;
        }
        
        throw new Exception( "List should have thrown an exception for a negative index" );
    }
    
    public void testSublistInvalidToPositive() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        try {
            List sublist = list.sublist( 0, strings.length + 1 );
        } catch( ArrayIndexOutOfBoundsException e ) {
            //this was supposed to happen
            return;
        }
        
        throw new Exception( "List should have thrown an exception for an out of bounds index" );
    }
    
    public void testSublistFromLargerThanTo() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        try {
            List sublist = list.sublist( strings.length, 0 );
        } catch( IllegalArgumentException e ) {
            //this was supposed to happen
            return;
        }
        
        throw new Exception( "List should have thrown an exception for an out of bounds index" );
    }
    
    public void testFindNullZero() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          null,
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        int index = list.indexOf( null );
        Assert.assertEquals( "Wrong index for null", 0, index );
    }
    
    public void testFindNullMiddle() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          null,
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z"
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        int index = list.indexOf( null );
        Assert.assertEquals( "Wrong index for null", 9, index );
    }
    
    public void testFindNullEnd() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z",
          null,
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        int index = list.indexOf( null );
        Assert.assertEquals( "Wrong index for null", 26, index );
    }
    
    public void testFindNullNotFound() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          "S", "T", "U", "V", "W", "X", "Y", "Z",
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        int index = list.indexOf( null );
        Assert.assertEquals( "Wrong index for null", -1, index );
    }
    
    public void testFindWithNulls() throws Exception {
        List list = listFactory.createList();
        
        String[] strings = new String[] {
          null,
          "A", "B", "C", "D", "E", "F", "G", "H", "I",
          null,
          "J", "K", "L", "M", "N", "O", "P", "Q", "R",
          null,
          "S", "T", "U", "V", "W", "X", "Y", "Z",
        };
        
        for( String string : strings ){
            list.add( string );
        }
        
        int index = list.indexOf( "X" );
        Assert.assertEquals( "Wrong index", 26, index );
    }
}
