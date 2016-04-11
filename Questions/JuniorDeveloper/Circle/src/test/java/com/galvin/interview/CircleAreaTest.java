package com.galvin.interview;

import org.junit.Assert;
import org.junit.Test;

public class CircleAreaTest
{
    private static final double[][] VALUES = {
        { 1, 3.14 },
        { 2, 12.57 },
        { 3, 28.27 },
        { 4, 50.27 },
        { 5, 78.54 },
        { 1.1, 3.8 },
        { 2.2, 15.21 },
        { 2.2, 15.21 },
        { 3.3, 34.21 },
        { 4.4, 60.82 },
        { 5.5, 95.03 },
        { 0.1, 0.03 },
        { 0.2, 0.13 },
        { 0.3, 0.28 },
        { 0.4, 0.5 },
        { 0.5, 0.79 },
    };
    
    @Test
    public void testArea() throws Exception {
        CircleArea circleArea = new CircleArea();
        
        for( double[] test : VALUES ){
            double input = test[0];
            double expectedOutput = test[1];
            
            double output = circleArea.area( input );
            Assert.assertEquals( "Unexpected circle area for radius " + input, expectedOutput, output, 0.01 );
        }
    }
}
