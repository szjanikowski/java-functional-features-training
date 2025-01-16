package com.itlibrium.jfft;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class B3E2Records {

    public record Person(String name, int age, LocalDate dateOfBirth) {}

    /**
     * Task 1
     * Description: Write a method that zips three lists into a list of Persons.
     * The resulting list should have the length of the shortest input list.
     * Verification: Input: ["Alice", "Bob"], [30, 25], [1991-01-01, 1996-05-15], Expected Output: [(Alice, 30, 1991-01-01), (Bob, 25, 1996-05-15)]
     */
    public static List<Person> zip(List<String> names, List<Integer> ages, List<LocalDate> datesOfBirth) {
        return List.of();
    }
}