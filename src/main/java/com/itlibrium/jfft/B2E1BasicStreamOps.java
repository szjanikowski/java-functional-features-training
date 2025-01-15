package com.itlibrium.jfft;

import java.util.List;

public class B2E1BasicStreamOps {

    /**
     * Task 1: Mapping and Filtering
     * Description: Given a list of integers, square each number and then filter out the squares that are less than 10.
     * Verification: Input: [1, 2, 3, 4, 5], Expected Output: [16, 25]
     */
    public static List<Integer> task1(List<Integer> numbers) {
        return numbers.stream()
            .toList();
    }

    /**
     * Task 2: Prefiltering and Costly Mapping
     * Description: Return a squares of integers from the list, but only if the result have 2 digits. Imagine that the operation of squaring is costly and takes 100ms (use costlyOperation method).
     * Verification: Input: [1, 2, 3, 4, -5], Expected Output: [16, 25]
     */
    public static List<Integer> task2(List<Integer> numbers) {
        return numbers.stream()
            .toList();
    }

    public static Integer costlySquaring(Integer n) {
        try {
            Thread.sleep(100); // Simulate costly operation
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return n * n;
    }


    /**
     * Task 3: Combined Usage of anyMatch and allMatch
     * Description: Given a list of strings, check if any string contains the letter 'a' and if all strings have a length greater than 2.
     * Verification: Input: ["apple", "banana", "cherry", "date"], Expected Output: true for any containing 'a', true for all length > 3
     */
    public static Task3Result task3(List<String> words) {
        boolean anyContainsA = false;
        boolean allLengthGreaterThanThree = false;
        return new Task3Result(anyContainsA, allLengthGreaterThanThree);
    }

    public record Task3Result(boolean anyContainsA, boolean allLengthGreaterThanThree) {}


    /**
     * Task 4: Complex Combination of Operators
     * Description: Given a list of integers, filter out the negative numbers, then map the remaining numbers to their square roots (Math::sqrt), and finally check if none of the results are less than 2.
     * Verification: Input: [-1, 4, 9, 16, 25], Expected Output: true
     */
    public static boolean task4(List<Integer> numbers) {
        return false;
    }
}
