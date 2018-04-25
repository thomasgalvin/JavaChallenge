package com.galvin.interview;

/**
 * This class determines if a String is a palindrome; that is, a word, phrase,
 * or sequence of characters that reads the same forwards and backwards.
 *
 * Example words: "madam"; "noon"; "kayak"
 *
 * Example sequences: "123454321"; "abc def ghi ihg fed cba";
 *
 * Example phrases: "A man, a plan, a canal, Panama"; "Madam, I'm Adam"; "Never odd or even"
 *
 * There are three different methods in this class; one which checks is a word is a palindrome,
 * one that checks if a sequence is a palindrome, and one that checks if a phrase is a palindrome.
 *
 * An empty String is not considered a palindrome.
 *
 * Each method has slightly different rules, so read their documentation carefully.
 *
 * Implement all three methods.
 */
public class Palindrome {
    /**
     * This method returns true if and only if:
     *   1. the text reads the same forwards and backwards, ignoring case
     *   2. the text contains no spaces
     *
     * @param text
     * @return true if the text is a palindrome
     */
    public boolean checkWord( String text ){
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * A sequence is considered a palindrome if the text reads the same forwards
     * and backwards.
     *
     * Punctuation, spaces, and so on are all considered valid characters in this
     * calculation, so the sequence
     *
     *   "123 321" would be considered a palindrome, but the sequence
     *   "1233 21" would **not* be considered a palindrome.
     *
     * @param text the text to be tested
     * @param ignoreCase if true, case is ignored
     * @return true if the sequence is a palindrome
     */
    public boolean checkSequence( String text, boolean ignoreCase ){
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * A phrase is considered a palindrome if the text reads the same forwards
     * and backwards.
     *
     * Punctuation and spaces are **not** included in this calculation.
     * For the purposes of this exercise, you may consider and non-alphanumeric
     * character to be punctuation
     *
     * Case is also ignored in this calculation.
     *
     * For example, the phrase "Mr. Owl ate my metal worm." would be considered
     * a palindrome under these rules.
     *
     * @param text the text to be tested
     * @return true if the phrase is a palindrome
     */
    public boolean checkPhrase( String text ){
        throw new UnsupportedOperationException("Not implemented yet.");
    }
}
