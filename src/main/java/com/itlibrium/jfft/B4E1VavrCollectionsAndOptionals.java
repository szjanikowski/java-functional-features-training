package com.itlibrium.jfft;


import io.vavr.collection.HashMap;
import io.vavr.collection.List;
import io.vavr.collection.Map;
import io.vavr.control.Option;

import java.time.LocalDate;

public class B4E1VavrCollectionsAndOptionals {

    public record Person(String name, int age, LocalDate dateOfBirth) {}

    /**
     * Task 1
     * Description: SOLVE USING VAVR!!
     * Write a method that zips three lists into a list of Persons.
     * The resulting list should have the length of the shortest input list.
     * HINT: VAVR collections have Zip method!!
     * Verification: Input: ["Alice", "Bob"], [30, 25], [1991-01-01, 1996-05-15], Expected Output: [(Alice, 30, 1991-01-01), (Bob, 25, 1996-05-15)]
     */
    public static List<Person> zip(List<String> names, List<Integer> ages, List<LocalDate> datesOfBirth) {
        return List.of();
    }

    /**
     * Task 2 - SOLVE USING VAVR
     * Description: Given a list of integers, return a list of the last 3 distinct numbers in reverse order.
     * Values which are repeated should never occur in the output. So sometimes the output list may contain less than 3 elements.
     * Verification: Input: [1, 2, 3, 4, 5, 1, 2, 3] -> [ 4, 5], Expected Output: [5, 4]
     */
    public static List<Integer> task2(List<Integer> numbers) {
        return List.of();
    }

    /**
     * Task 3 - SOLVE USING VAVR
     * Description: Given a list of strings, return a map where the key is the first character of the string and the value is another map where the key is the length of the string and the value is a list of strings of that length, sorted alphabetically.
     * Verification: Input: ["apple", "ape", "bat", "ball", "bag"],
     * Expected Output: {"a"={3=["ape"], 5=["apple"]}, "b"={3=["bag", "bat"], 4=["ball"]}}
     */
    public static Map<Character, Map<Integer, List<String>>> task3(List<String> strings) {
        return HashMap.empty();
    }

    /**
     * Task 4 - SOLVE USING VAVR
     * Description: Given a list of Optional strings, return a concatenated string of all present values, separated by commas.
     * Verification: Input: [Optional.of("apple"), Optional.empty(), Optional.of("banana")], Expected Output: "apple,banana"
     */
    public static String task4(List<Option<String>> optionals) {
        return null;
    }

    /**
     * Task 5 - SOLVE USING VAVR
     * Description: Given a list of Optional strings, return a list of strings where each string is converted to uppercase if present, otherwise "EMPTY".
     * Verification: Input: [Optional.of("apple"), Optional.empty(), Optional.of("banana")], Expected Output: ["APPLE", "EMPTY", "BANANA"]
     */
    public static List<String> task5(List<Option<String>> optionals) {
        return null;
    }
}