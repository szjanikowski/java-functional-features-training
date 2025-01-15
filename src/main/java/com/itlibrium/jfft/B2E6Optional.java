package com.itlibrium.jfft;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class B2E6Optional {

    /**
     * Task 1
     * Description: Given a list of Optional integers, return a list of integers where each integer is doubled if present, otherwise 0.
     * Verification: Input: [Optional.of(1), Optional.empty(), Optional.of(3)], Expected Output: [2, 0, 6]
     */
    public static List<Integer> task1(List<Optional<Integer>> optionals) {
        return List.of();
    }

    /**
     * Task 2
     * Description: Given a list of Optional strings, return a concatenated string of all present values, separated by commas.
     * Verification: Input: [Optional.of("apple"), Optional.empty(), Optional.of("banana")], Expected Output: "apple,banana"
     */
    public static String task2(List<Optional<String>> optionals) {
        return "";
    }

    /**
     * Task 3
     * Description: Given a list of Optional integers, return the product of all present values. If any value is missing, or is 0 throw an IllegalArgumentException.
     * Verification: Input: [Optional.of(1), Optional.of(3)], Expected Output: 3
     */
    public static int task3(List<Optional<Integer>> optionals) {
        return 0;
    }

    /**
     * Task 4
     * Description: Given a list of Optional strings, return a list of strings where each string is converted to uppercase if present, otherwise "EMPTY".
     * Verification: Input: [Optional.of("apple"), Optional.empty(), Optional.of("banana")], Expected Output: ["APPLE", "EMPTY", "BANANA"]
     */
    public static List<String> task4(List<Optional<String>> optionals) {
        return List.of();
    }
}