package com.galvin.interview;

import org.junit.Assert;

import java.util.UUID;

public class PalindromeTestHarness {
    private static final Palindrome palindrome = new Palindrome();

    private static final String[] invalid = {
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
            UUID.randomUUID().toString(),
    };

    private static final String[] words = {
            "madam", "noon", "redivider",
            "deified", "civic", "radar", "level",
            "rotor", "kayak", "reviver", "racecar",
            "redder", "madam", "refer",
    };

    private static final String[] wordsIgnoreCase = {
            "Madam", "Noon", "Redivider",
            "Deified", "Civic", "Radar", "Level",
            "Rotor", "Kayak", "Reviver", "Racecar",
            "Redder", "Madam", "Refer",
    };

    private static final String[] invalidWords = {
            "madams", "anoon", "redivcider",
            "deizfied", "civaic", "ra123dar", "levelc",
            "rotory", "kayaks", "reviverr", "racecarr",
            "redderx", "amadam", "refers",

            "12345", "acbdefg"
    };

    private static final String[] sequencesWithSpaces = {
            "123 321", "1234 5 4321", "12345 54321",
            "abcde f edcba", "abc 123   321 cba",
    };

    private static final String[] sequencesWithSpacesCaseMismatch = {
            "123 321", "1234 5 4321", "12345 54321",
            "ABCDE f edcba", "abc 123   321 CBA",
            "Rats live on no evil star",
            "Live on time emit no evil",
            "Step on no pets",
    };

    private static final String[] sequencesWithoutSpaces = {
            "123321", "123454321", "12345_54321",
            "abcdefedcba", "abc123321cba",

            "123_321", "1234_5_4321", "12345_54321",
            "abcde.f.edcba", "abc_123_._321_cba"
    };

    private static final String[] sequencesWithoutSpacesCaseMatches = {
            "123321", "123454321", "12345_54321",
            "AbcdefedcbA", "aBc123321cBa",

            "123_321", "1234_5_4321", "12345_54321",
            "abCde.f.edCba", "ABC_123_._321_CBA"
    };

    private static final String[] sequencesWithoutSpacesCaseMismatch = {
            "A123321a", "1234a5A4321", "12345_ZZz_54321",
            "Abcdefedcba", "abc123321cBa",

            "z123_321Z", "q1234_5_4321Q", "12345_Zz_54321",
            "abCdE.f.eDcba", "aBC_123_._321_CbA",
    };

    private static final String[] invalidSequences = {
            "12332 1", "123 454321", "1 2345_54321",
            "A bcdef  edcb A", "aB c 123321cBa",

            "123_321 ", "1234 5_4321", "1 2345_543 21",
            "abCde.f. edCba", "ABC_123_._321_CB A"
    };

    private static final String[] validPhrases = {
            "Mr. Owl ate my metal worm.",
            "Was it a car or a cat I saw?",
            "Go hang a salami, I'm a lasagna hog.",
            "Rats live on no evil star",
            "Live on time, emit no evil",
            "Step on no pets",
    };

    private static final String[] invalidPhrases = {
            "Mr. Owl ate my metal worms.",
            "Was it a car or a cat you saw?",
            "Go hang your salami, I'm a lasagna hog.",
            "Rats live on no evil stars",
            "Live on time, emits no evil",
            "Step on pets",
    };

    /// words ///

    public static void testWord(){
        shouldMatchWord(
                new String[][]{
                        words, wordsIgnoreCase, sequencesWithoutSpaces, sequencesWithoutSpacesCaseMatches, sequencesWithoutSpacesCaseMismatch
                }
        );

        shouldNotMatchWord(
                new String[][]{
                        invalidWords, sequencesWithSpaces, invalidSequences, invalid
                }
        );
    }

    private static void shouldMatchWord( String[][] arrays ){
        for( String[] array: arrays ){
            for (String text : array) {
                Assert.assertTrue("Failed to match word: " + text, palindrome.checkWord(text));
            }
        }
    }

    private static void shouldNotMatchWord( String[][] arrays ){
        for( String[] array: arrays ){
            for (String text : array) {
                Assert.assertFalse("Incorrectly matched word: " + text, palindrome.checkWord(text) );
            }
        }
    }


    /// sequences ///

    public static void testSequence(){
        shouldMatchSequenceIgnoreCase( new String[][]{
                words, wordsIgnoreCase, sequencesWithSpaces, sequencesWithoutSpaces, sequencesWithoutSpacesCaseMatches,
                sequencesWithoutSpacesCaseMismatch, sequencesWithSpacesCaseMismatch
        } );

        shouldMatchSequenceCheckCase( new String[][]{
                words, sequencesWithSpaces, sequencesWithoutSpaces, sequencesWithoutSpacesCaseMatches
        } );

        shouldNotMatchSequenceIgnoreCase( new String[][]{
                invalidWords, invalidSequences, invalid
        } );

        shouldNotMatchSequenceCheckCase( new String[][]{
                sequencesWithoutSpacesCaseMismatch, invalidSequences, invalidWords, wordsIgnoreCase, invalid
        } );
    }



    private static void shouldMatchSequenceIgnoreCase( String[][] arrays ){
        for( String[] array: arrays ){
            for (String text : array) {
                Assert.assertTrue("Failed to match sequence: " + text, palindrome.checkSequence(text, true));
            }
        }
    }

    private static void shouldMatchSequenceCheckCase( String[][] arrays ){
        for( String[] array: arrays ){
            for (String text : array) {
                Assert.assertTrue("Failed to match sequence: " + text, palindrome.checkSequence(text, false));
            }
        }
    }

    private static void shouldNotMatchSequenceIgnoreCase( String[][] arrays ){
        final boolean[] cases = { true, false };

        for( String[] array: arrays ){
            for( boolean ignoreCase: cases ) {
                for (String text : array) {
                    Assert.assertFalse("Incorrectly matched sequence: " + text, palindrome.checkSequence(text, ignoreCase));
                }
            }
        }
    }

    private static void shouldNotMatchSequenceCheckCase( String[][] arrays ){
        for( String[] array: arrays ){
            for (String text : array) {
                Assert.assertFalse("Incorrectly matched sequence: " + text, palindrome.checkSequence(text, false));
            }
        }
    }


    /// phrase ///

    public static void testPhrase(){
        shouldMatchPhrase( new String[][]{
                words, wordsIgnoreCase, sequencesWithSpaces,
                sequencesWithoutSpaces, sequencesWithoutSpacesCaseMatches,
                sequencesWithoutSpacesCaseMismatch, validPhrases
        } );

        shouldNotMatchPhrase( new String[][]{
                invalidWords, invalidPhrases, invalid
        } );
    }

    private static void shouldMatchPhrase( String[][] arrays ){
        for( String[] array: arrays ){
            for (String text : array) {
                Assert.assertTrue("Failed to match phrase: " + text, palindrome.checkPhrase(text) );
            }
        }
    }

    private static void shouldNotMatchPhrase( String[][] arrays ){
        for( String[] array: arrays ){
            for (String text : array) {
                Assert.assertFalse("Incorrectly matched phrase: " + text, palindrome.checkPhrase(text) );
            }
        }
    }
}
