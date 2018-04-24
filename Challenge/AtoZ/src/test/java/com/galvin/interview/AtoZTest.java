package com.galvin.interview;

import org.junit.Test;

public class AtoZTest
{
    @Test public void testAll() throws Exception {
        new AZTestHarness().testAll();
    }
    
    @Test public void testMatchCase() throws Exception {
        new AZTestHarness().testMatchCase();
    }

    @Test public void testIgnoreCase() throws Exception{
        new AZTestHarness().testIgnoreCase();
    }
}
