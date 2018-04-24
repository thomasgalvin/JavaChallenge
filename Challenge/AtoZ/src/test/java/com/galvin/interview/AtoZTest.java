package com.galvin.interview;

import org.junit.Assert;
import org.junit.Test;

public class AtoZTest
{
    @Test public void testAll() throws Exception {
        new TestHarness().testAll();
    }
    
    @Test public void testMatchCase() throws Exception {
        new TestHarness().testMatchCase();
    }

    @Test public void testIgnoreCase() throws Exception{
        new TestHarness().testIgnoreCase();
    }
}
