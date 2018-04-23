package com.galvin.interview;

import com.galvin.interview.utils.ListFactory;
import com.galvin.interview.utils.ListTestHarness;
import org.junit.Test;

public class ArrayListTest
{
     private ListFactory factory = new ListFactory() {
        @Override
        public List createList() {
            return new ArrayList();
        }
    };
    
    @Test public void testAll() throws Exception {
        ListTestHarness harness = new ListTestHarness( factory );
        harness.testAll();
    }

    @Test public void testAddMethod() throws Exception {
        ListTestHarness harness = new ListTestHarness( factory );
        harness.testAddMethod();
    }

    @Test public void testAddAtMethod() throws Exception {
        ListTestHarness harness = new ListTestHarness( factory );
        harness.testAddAtMethod();
    }

    @Test public void testRemoveMethod() throws Exception {
        ListTestHarness harness = new ListTestHarness( factory );
        harness.testRemoveMethod();
    }
}
