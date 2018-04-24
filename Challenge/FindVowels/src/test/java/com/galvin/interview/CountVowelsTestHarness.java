package com.galvin.interview;

import org.junit.Assert;

import java.util.HashSet;
import java.util.Set;

public class CountVowelsTestHarness {
    private static final Set<Character> VOWELS = new HashSet<>();
    static{
        for( char c: "aeiou".toCharArray() ) VOWELS.add(c);
    }

    private static final String[] input = {
            "This is who I am",
            "aeiou",
            "aeiouaeiou",
            "",
            null,
            "bcdfghjklmnpqrstvwxyz",
            "abcedfghijklmnopqrstuvwxyz",
            "abcedfghijklmnopqrstuvwxyzabcedfghijklmnopqrstuvwxyz",
            "a",
            "e",
            "i",
            "o",
            "u",
            "y",
            "a",
            "b",
            "c",
            "d",
            "e",
            "f",
            "g",
            "h",
            "i",
            "j",
            "k",
            "l",
            "m",
            "n",
            "o",
            "p",
            "q",
            "r",
            "s",
            "t",
            "u",
            "v",
            "w",
            "x",
            "y",
            "z",
            "AEIOU",
            "AEIOUAEIOU",
            "BCDFGHJKLMNPQRSTVWXYZ",
            "ABCEDFGHIJKLMNOPQRSTUVWXYZ",
            "ABCEDFGHIJKLMNOPQRSTUVWXYZABCEDFGHIJKLMNOPQRSTUVWXYZ",
            "A",
            "E",
            "I",
            "O",
            "U",
            "Y",
            "A",
            "B",
            "C",
            "D",
            "E",
            "F",
            "G",
            "H",
            "I",
            "J",
            "K",
            "L",
            "M",
            "N",
            "O",
            "P",
            "Q",
            "R",
            "S",
            "T",
            "U",
            "V",
            "W",
            "X",
            "Y",
            "Z",
            "1",
            "2",
            "3",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "0",
            "[",
            "]",
            "\\",
            "{",
            "}",
            "|",
            ";",
            "'",
            ":",
            "\"",
            ",",
            ".",
            "/",
            "<",
            ">",
            "?",
            "~",
            "!",
            "@",
            "#",
            "$",
            "%",
            "&",
            "*",
            "(",
            ")",
            "dkqfk3409kgggw934laeoci844fghee8d43lasdsdwe000988iiiiii223sseedciuvoip",
    };

    public void testCountVowels(){
        FindVowels findVowels = new FindVowels();
        for( String text: input ){
            int expected = countVowels(text);
            int result = findVowels.countVowels(text);
            Assert.assertEquals("Invalid vowel count for string: " + text, expected, result );
        }
    }

    public void testCountUniqueVowels(){
        FindVowels findVowels = new FindVowels();
        for( String text: input ){
            int expected = countUniqueVowels(text);
            int result = findVowels.countUniqueVowels(text);
            Assert.assertEquals("Invalid unique vowel count for string: " + text, expected, result );
        }
    }

    ///

    private int countVowels(String text){
        if( text == null || text.isEmpty() ) return 0;
        String lower = text.toLowerCase();

        int count = 0;
        for( char c: lower.toCharArray() ){
            if( isVowel(c) ) count++;
        }
        return count;
    }

    private int countUniqueVowels(String text){
        if( text == null || text.isEmpty() ) return 0;
        String lower = text.toLowerCase();

        Set<Character> set = new HashSet<>();
        for( char c: lower.toCharArray() ){
            if( isVowel(c) ) set.add(c);
        }

        return set.size();
    }

    private boolean isVowel(char c){
        return VOWELS.contains(c);
    }
}
