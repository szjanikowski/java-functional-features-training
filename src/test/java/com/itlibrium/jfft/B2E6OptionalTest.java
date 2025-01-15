package com.itlibrium.jfft;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class B2E6OptionalTest {

    @ParameterizedTest
    @MethodSource("task1Data")
    void testTask1(List<Optional<Integer>> input, List<Integer> expected) {
        assertEquals(expected, B2E6Optional.task1(input));
    }

    private static Stream<Object[]> task1Data() {
        return Stream.of(
                new Object[]{List.of(Optional.of(1), Optional.empty(), Optional.of(3)), List.of(2, 0, 6)},
                new Object[]{List.of(Optional.of(2), Optional.of(4), Optional.empty()), List.of(4, 8, 0)}
        );
    }

    @ParameterizedTest
    @MethodSource("task2Data")
    void testTask2(List<Optional<String>> input, String expected) {
        assertEquals(expected, B2E6Optional.task2(input));
    }

    private static Stream<Object[]> task2Data() {
        return Stream.of(
                new Object[]{List.of(Optional.of("apple"), Optional.empty(), Optional.of("banana")), "apple,banana"},
                new Object[]{List.of(Optional.of("cat"), Optional.of("dog"), Optional.empty()), "cat,dog"}
        );
    }

    @ParameterizedTest
    @MethodSource("task3Data")
    void testTask3(List<Optional<Integer>> input, int expected) {
        assertEquals(expected, B2E6Optional.task3(input));
    }

    @ParameterizedTest
    @MethodSource("task3ExceptionData")
    void testTask3Exception(List<Optional<Integer>> input) {
        assertThrows(IllegalArgumentException.class, () -> B2E6Optional.task3(input));
    }

    private static Stream<Object[]> task3Data() {
        return Stream.of(
                new Object[]{List.of(Optional.of(1), Optional.of(3)), 3},
                new Object[]{List.of(Optional.of(2), Optional.of(4)), 8}
        );
    }

    private static Stream<Object[]> task3ExceptionData() {
        return Stream.of(
                new Object[]{List.of(Optional.of(1), Optional.empty(), Optional.of(3))},
                new Object[]{List.of(Optional.empty(), Optional.of(4))},
                new Object[]{List.of(Optional.of(1), Optional.of(0))},
                new Object[]{List.of(Optional.empty(), Optional.of(0))}
        );
    }

    @ParameterizedTest
    @MethodSource("task4Data")
    void testTask4(List<Optional<String>> input, List<String> expected) {
        assertEquals(expected, B2E6Optional.task4(input));
    }

    private static Stream<Object[]> task4Data() {
        return Stream.of(
                new Object[]{List.of(Optional.of("apple"), Optional.empty(), Optional.of("banana")), List.of("APPLE", "EMPTY", "BANANA")},
                new Object[]{List.of(Optional.of("cat"), Optional.of("dog"), Optional.empty()), List.of("CAT", "DOG", "EMPTY")}
        );
    }
}