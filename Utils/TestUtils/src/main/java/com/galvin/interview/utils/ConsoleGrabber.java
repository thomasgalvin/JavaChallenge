package com.galvin.interview.utils;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ConsoleGrabber
{
    private static final PrintStream original = System.out;
    private static final ByteArrayOutputStream bytes = new ByteArrayOutputStream();
    private static final PrintStream printStream = new PrintStream( bytes );
    
    
    private ConsoleGrabber(){}
    
    public static void grabConsole(){
        bytes.reset();
        System.setOut( printStream );
    }
    
    public static String releaseConsole(){
        printStream.flush();
        System.setOut( original );
        
        String result = bytes.toString();
        System.out.println( result );
        return result;
    }
}
