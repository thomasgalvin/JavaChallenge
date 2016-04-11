package com.galvin.interview;

import org.junit.Assert;
import org.junit.Test;

public class StringReverseTest
{
    public static final String INCORRECT_REVERSE = "The String was not properly reversed";
    
    @Test
    public void testStringReverse() throws Exception{
        StringReverse reverse = new StringReverse();
        reverse( reverse, "Hello, world!" );
        reverse( reverse, "Now is the time for all good men to come to the aid of their country." );
        reverse( reverse, "No plan survives contact with the enemy." );
        reverse( reverse, "rgkqe  jgkqekrg q3jogjo q3gjoq  g rgq g qe rge g qerg q eg eqry h6 7 5j3 j2  24gg3otk3" );
        reverse( reverse, "" );
    }
    
    public void reverse( StringReverse reverse, String input ) throws Exception{
        StringBuilder result = new StringBuilder();
        for( int i = input.length() - 1; i >=0; i-- ){
            result.append( input.charAt( i) );
        }
        result.toString();
        
        Assert.assertEquals( INCORRECT_REVERSE, result.toString(), reverse.reverse( input ) );
    }
}
