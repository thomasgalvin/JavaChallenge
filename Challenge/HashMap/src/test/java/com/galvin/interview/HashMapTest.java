package com.galvin.interview;

import java.util.List;
import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class HashMapTest
{
    @Test
    public void testHashMap() throws Exception {
        HashMap hashMap = new HashMap();
        String[][] entries = {
            { "A", "Alli" },
            { "B", "Briana" },
            { "C", "Charlotte" },
            { "D", "Denni" },
            { "E", "Elli" },
            { "F", "Faye" },
            { "G", "Grace" },
            { "H", "Helen" },
            { "I", "Imogen" },
            { "J", "Jessica" },
            { "K", "Kelly" },
            { "L", "Lenna" },
            { "M", "Mallory" },
            { "N", "Nichole" },
            { "O", "Ophelia" },
            { "P", "Paula" },
            { "Q", "Quora" },
            { "R", "Rachel" },
            { "S", "Sarah" },
            { "T", "Tamara" },
            { "U", "Uma" },
            { "V", "Veronica" },
            { "W", "Wendy" },
            { "X", "Xena" },
            { "Y", "Yuffi" },
            { "Z", "Zelda" },
        };
        
        for( String[] entry : entries ){
            hashMap.put( entry[0], entry[1] );
        }
        
        for( String[] entry : entries ){
            Object value = hashMap.get( entry[0] );
            Assert.assertEquals( "HashMap returned wrong value for " + entry[0], entry[1], value );
        }
        
        String[] badKeys = new String[]{
            "1", "2", "3", "ABC", "DEF", "GHI"
        };
        
        for( String key : badKeys ){
            Object value = hashMap.get( key );
            Assert.assertNull( "HashMap returned a value when null was expected for key: " + key, value  );
        }
        
        List<String> removedKeys = new ArrayList();
        String[] toRemove = { "Z", "A", "C", "M", "B", "Y" };
        for( String key : toRemove ){
            removedKeys.add( key );
            hashMap.remove( key );
            
            for( String[] entry : entries ){
                Object value = hashMap.get( entry[0] );
                
                if( removedKeys.contains( entry[0] ) ){
                    Assert.assertNull( "HashMap returned a value when null was expected for key: " + key, value  );
                }
                else {
                    Assert.assertEquals( "HashMap returned wrong value for " + entry[0], entry[1], value );
                }
            }
        }
        
        for( String[] entry : entries ){
            hashMap.remove( entry[0] );
        }
        
        for( String[] entry : entries ){
            Object value = hashMap.get( entry[0] );
            Assert.assertNull( "HashMap returned a value when null was expected for key: " + entry[0], value  );
        }
    }
}
