package com.galvin.interview;

import com.galvin.interview.utils.ConsoleGrabber;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest
{
    public static final String UNEXPECTED_CONSOLE_OUTPUT = "Unexpected console output";
    
    public static final String HELLO_WORLD = "Hello, world!";
    public static final String HELLO_SALLY = "Hello, Sally!";
    public static final String INPUT_SALLY = "Sally";
    
    @Test
    public void testHello() throws Exception {
        ConsoleGrabber.grabConsole();
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
        
        String result = ConsoleGrabber.releaseConsole().trim();
        Assert.assertEquals( UNEXPECTED_CONSOLE_OUTPUT, HELLO_WORLD, result );
        
        ConsoleGrabber.grabConsole();
        helloWorld.sayHello( INPUT_SALLY );
        
        result = ConsoleGrabber.releaseConsole().trim();
        Assert.assertEquals( UNEXPECTED_CONSOLE_OUTPUT, HELLO_SALLY, result );
    }
}
