package com.itlibrium.jfft;

import java.util.List;
import java.util.Map;

public class B2E4NonTerminalOperations {

    /**
     * Task 1
     * Description: Given a list of integers, return a list of the first 3 elements of a sorted list of distinct
     * odd numbers. Repeated results should occur only once in result. Each result element should be multiplied by 2.
     * Verification: Input: [1, 3, 5, 7, 9, 1, 3], Expected Output: [2, 6, 10]
     */
    public static List<Integer> task1(List<Integer> numbers) {
        return List.of();
    }

    /**
     * Task 2
     * Description: Given a list of integers, return a list of the last 3 distinct numbers in reverse order.
     * Values which are repeated should never occur in the output. So sometimes the output list may contain less than 3 elements.
     * Verification: Input: [1, 2, 3, 4, 5, 1, 2, 3], Expected Output: [5, 4]
     */
    public static List<Integer> task2(List<Integer> numbers) {
        return List.of();
    }

    /**
     * Task 3
     * Description: Given a list of strings, return a map where the key is the first character of the string and the value is another map where the key is the length of the string and the value is a list of strings of that length, sorted alphabetically.
     * Verification: Input: ["apple", "ape", "bat", "ball", "bag"],
     * Expected Output: {"a"={3=["ape"], 5=["apple"]}, "b"={3=["bag", "bat"], 4=["ball"]}}
     */
    public static Map<Character, Map<Integer, List<String>>> task3(List<String> strings) {
        return Map.of();
    }
}