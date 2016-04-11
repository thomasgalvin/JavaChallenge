# InterviewQuestions #

This project is designed to test your skills as a back-end Java developer,
using the same tools and technologies our team employs on a daily basis.

This project contains a number of unit-tested challenges designed to make sure you have at least a basic familiarity with Java and the ability to solve general proramming problems.

## Necessary Tools ##

The majority of the software my team develops runs on Java and is built with
Maven. This project is no different. To get started, make sure you have 
[Java version 1.8.45 or later](https://java.com/en/download/) installed on 
your machine. Then, [download](https://maven.apache.org/download.cgi) and
[install](https://maven.apache.org/install.html) Apache Maven 3.3 or later.

When installation is complete, you should be able to run the following 
commands and see something similar to the following output:

```
> java -version
java version "1.8.0_45"
Java(TM) SE Runtime Environment (build 1.8.0_45-b14)
Java HotSpot(TM) 64-Bit Server VM (build 25.45-b02, mixed mode)

> mvn -v
Apache Maven 3.3.9 (bb52d8502b132ec0a5a3f4c09453c07478323dc5; 2015-11-10T11:41:47-05:00)
Maven home: /Users/thomas/Applications/bin/maven/3.3.9
Java version: 1.8.0_45, vendor: Oracle Corporation
Java home: /Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre
Default locale: en_US, platform encoding: UTF-8
OS name: "mac os x", version: "10.11.3", arch: "x86_64", family: "mac"
```

## Using this project ##

To use this project, clone it:

`git clone https://github.com/thomasgalvin/JavaChallenge.git`

And then build it:

```
cd JavaChallenge
mvn clean install 
```

This will build some utilities needed by the unit tests. After that, we'll have you open up some of the subprojects in an IDE (or not, it's up to you), and let you work through them. 

## Junior Developer Questions ##

The interview for a Junior Developer position includes the following projects:

* **Junior Developer 01 - Hello, World** - Write a "Hello, World!" and "Hello, ${name}!" method.
* **Junior Developer 02 - FizzBuzz** - Solve the classic FizzBuzz problem.
* **Junior Developer 03 - Sort** - Sort an array of integers, using whatever algorithm they like.
* **Junior Developer 04 - Array Merge** - Merge two arrays, alternating elements from each.
* **Junior Developer 05 - Clever Array Merge** - Same as Array Merge, but the arrays might be of differing lengths.
* **Junior Developer 06 - Fibonacci** - Write a function that returns the first 100 Fibonacci numbers.
* **Junior Developer 07 - Sums** - Write three methods that sum the numbers in an array, using a for-loop, a while-loop, and recursion.
* **Junior Developer 08 - String Reverse** - Reverse a String.
* **Junior Developer 09 - Factorial** - Write a method that calculates the factorial of an integer.
* **Junior Developer 10 - Find Primes** - Write a method that finds the first 100 prime numbers.

## Developer Questions ##

The interview for a Developer position includes the following projects:

* **Developer 01 - Array List** - Write `add` and `delete` methods for an Array List.
* **Developer 02 - Linked List** - Write `add` and `delete` methods for a Linked List.
* **Developer 03 - Comparator** - Write an implementation of a java.util.Comparator, using provided criteria
* **Developer 04 - Prime Sieve** -Implement the Sieve of Eratosthenes to find prime numbers
* **Developer 05 - Quick Sort** -Implement the QuickSort algorithm