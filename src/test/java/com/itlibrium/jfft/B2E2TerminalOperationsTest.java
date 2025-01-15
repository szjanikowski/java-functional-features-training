package com.itlibrium.jfft;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class B2E2TerminalOperationsTest {

    @ParameterizedTest
    @MethodSource("task1Data")
    void testTask1(List<Integer> input) {
        // This test is for visual verification, as task1 prints to the console
        B2E2TerminalOperations.task1(input);
    }

    private static Stream<List<Integer>> task1Data() {
        return Stream.of(
            List.of(1, 2, 3, 4, 5),
            List.of(10, 20, 30),
            List.of(-1, -2, -3)
        );
    }

    @ParameterizedTest
    @MethodSource("task2Data")
    void testTask2(List<Integer> input, List<Integer> expected) {
        assertNotSame(expected, input);
        assertEquals(expected, B2E2TerminalOperations.task2(input));
    }

    private static Stream<Object[]> task2Data() {
        return Stream.of(
            new Object[]{List.of(1, 2, 3, 4, 5), List.of(1, 2, 3, 4, 5)},
            new Object[]{List.of(10, 20, 30), List.of(10, 20, 30)},
            new Object[]{List.of(-1, -2, -3), List.of(-1, -2, -3)}
        );
    }

    @ParameterizedTest
    @MethodSource("task3Data")
    void testTask3(List<Integer> input, Optional<Integer> expected) {
        assertEquals(expected, B2E2TerminalOperations.task3(input));
    }

    private static Stream<Object[]> task3Data() {
        return Stream.of(
            new Object[]{List.of(1, 2, 3, 4, 5), Optional.of(1)},
            new Object[]{List.of(10, 20, 30), Optional.of(10)},
            new Object[]{List.of(-1, -2, -3), Optional.of(-3)}
        );
    }

    @ParameterizedTest
    @MethodSource("task4Data")
    void testTask4(List<Integer> input, Optional<Integer> expected) {
        assertEquals(expected, B2E2TerminalOperations.task4(input));
    }

    private static Stream<Object[]> task4Data() {
        return Stream.of(
            new Object[]{List.of(1, 2, 3, 4, 5), Optional.of(5)},
            new Object[]{List.of(10, 20, 30), Optional.of(30)},
            new Object[]{List.of(-1, -2, -3), Optional.of(-1)}
        );
    }

    @ParameterizedTest
    @MethodSource("task5Data")
    void testTask5(List<Integer> input, long expected) {
        assertEquals(expected, B2E2TerminalOperations.task5(input));
    }

    private static Stream<Object[]> task5Data() {
        return Stream.of(
            new Object[]{List.of(1, 2, 3, 4, 5), 5L},
            new Object[]{List.of(10, 20, 30), 3L},
            new Object[]{List.of(-1, -2, -3), 3L}
        );
    }

    @ParameterizedTest
    @MethodSource("task6Data")
    void testTask6(List<Integer> input, Optional<Integer> expected) {
        assertEquals(expected, B2E2TerminalOperations.task6(input));
    }

    private static Stream<Object[]> task6Data() {
        return Stream.of(
            new Object[]{List.of(1, 2, 3, 4, 5), Optional.of(1)},
            new Object[]{List.of(10, 20, 30), Optional.of(10)},
            new Object[]{List.of(-1, -2, -3), Optional.of(-1)}
        );
    }

    @ParameterizedTest
    @MethodSource("task7Data")
    void testTask7(List<Integer> input) {
        Optional<Integer> result = B2E2TerminalOperations.task7(input);
        assertTrue(result.isPresent());
        assertTrue(input.contains(result.get()));
    }

    private static Stream<List<Integer>> task7Data() {
        return Stream.of(
            List.of(1, 2, 3, 4, 5),
            List.of(10, 20, 30),
            List.of(-1, -2, -3)
        );
    }

    @ParameterizedTest
    @MethodSource("task8Data")
    void testTask8(List<Integer> input, int expected) {
        assertEquals(expected, B2E2TerminalOperations.task8(input));
    }

    private static Stream<Object[]> task8Data() {
        return Stream.of(
            new Object[]{List.of(1, 2, 3, 4, 5), 15},
            new Object[]{List.of(10, 20, 30), 60},
            new Object[]{List.of(-1, -2, -3), -6}
        );
    }

    @ParameterizedTest
    @MethodSource("task9Data")
    void testTask9(List<String> input, String expected) {
        assertEquals(expected, B2E2TerminalOperations.task9(input));
    }

    private static Stream<Object[]> task9Data() {
        return Stream.of(
            new Object[]{List.of("a", "b", "c"), "abc"},
            new Object[]{List.of("hello", " ", "world"), "hello world"},
            new Object[]{List.of("1", "2", "3"), "123"}
        );
    }

    @ParameterizedTest
    @MethodSource("task10Data")
    void testTask10(List<Integer> input, B2E2TerminalOperations.Statistics expected) {
        assertEquals(expected, B2E2TerminalOperations.task10(input));
    }

    private static Stream<Object[]> task10Data() {
        return Stream.of(
            new Object[]{List.of(1, 2, 3, 4, 5), new B2E2TerminalOperations.Statistics(15, 5)},
            new Object[]{List.of(10, 20, 30), new B2E2TerminalOperations.Statistics(20, 3)},
            new Object[]{List.of(-1, -2, -3), new B2E2TerminalOperations.Statistics(-6, 3)}
        );
    }
}