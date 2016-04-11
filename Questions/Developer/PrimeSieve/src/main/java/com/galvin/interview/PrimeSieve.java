package com.galvin.interview;

/**
 * This class implements the Sieve of Eratosthenes, an efficient way of finding
 * primes below a given stop point.
 * 
 * A prime number is a number evenly divisible only by 1 and itself. 
 * 
 * By definition, neither 0 nor 1 are prime.
 * 
 * For example, 7 is prime because it can only be evenly divided by 1 and 7, 
 * but 33 is not prime, because it can be evenly divided by 3.
 * 
 * The Sieve of Eratosthenes is an efficient algorithm for calculating prime
 * numbers. It's steps are as follows:
 * 
 * 1. Create a list of consecutive integers from 2 to N (e.g. 2, 3, 4, 5 ... N)
 * 2. Let p = 2, the first prime
 * 3. Starting from p, remove its multiples from the list (e.g. 2*2, 2*3, 2*4 ...)
 * 4. Find the first number greater than p in the list.
 * 4A. If there is no such number, the remaining list contains only prime numbers
 * 4B. if there is such a number, let p equal that number, and repeat starting
 *     with step 3.
 * 
 * For more information:
 * http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 * 
 * Your task is to implement this method.
 */
public class PrimeSieve
{
    public int[] findPrimes( int stop ) {
        throw new UnsupportedOperationException( "TODO: Implement the Sieve of Eratosthenes." );
    }
}
