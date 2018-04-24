package com.galvin.interview;

import com.galvin.interview.utils.ListFactory;
import com.galvin.interview.utils.ListTestHarness;
import org.junit.Test;

public class RemoveMethodTest {
    private ListFactory factory = new ListFactory() {
        @Override
        public List createList() {
            return new ArrayList();
        }
    };

    @Test public void testRemoveMethod() throws Exception {
        ListTestHarness harness = new ListTestHarness( factory );
        harness.testRemoveMethod();
    }
}
