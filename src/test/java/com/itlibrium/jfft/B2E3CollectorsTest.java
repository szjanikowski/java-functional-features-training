package com.itlibrium.jfft;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class B2E3CollectorsTest {

    @ParameterizedTest
    @MethodSource("task1Data")
    void testTask1(List<String> input, Map<String, Integer> expected) {
        assertEquals(expected, B2E3Collectors.task1(input));
    }

    private static Stream<Object[]> task1Data() {
        return Stream.of(
            new Object[]{List.of("a", "bb", "ccc"), Map.of("a", 1, "bb", 2, "ccc", 3)},
            new Object[]{List.of("hello", "world"), Map.of("hello", 5, "world", 5)},
            new Object[]{List.of("1", "22", "333"), Map.of("1", 1, "22", 2, "333", 3)}
        );
    }

    @ParameterizedTest
    @MethodSource("task2Data")
    void testTask2(List<Integer> input, java.util.IntSummaryStatistics expected) {
        assertAll(
            () -> assertEquals(expected.getCount(), B2E3Collectors.task2(input).getCount(), "Count mismatch"),
            () -> assertEquals(expected.getSum(), B2E3Collectors.task2(input).getSum(), "Sum mismatch"),
            () -> assertEquals(expected.getMin(), B2E3Collectors.task2(input).getMin(), "Min mismatch"),
            () -> assertEquals(expected.getMax(), B2E3Collectors.task2(input).getMax(), "Max mismatch"),
            () -> assertEquals(expected.getAverage(), B2E3Collectors.task2(input).getAverage(), "Average mismatch")
        );
    }

    private static Stream<Object[]> task2Data() {
        return Stream.of(
            new Object[]{List.of(1, 2, 3, 4, 5), new java.util.IntSummaryStatistics(5, 1, 5, 15)},
            new Object[]{List.of(10, 20, 30), new java.util.IntSummaryStatistics(3, 10, 30, 60)},
            new Object[]{List.of(-1, -2, -3), new java.util.IntSummaryStatistics(3, -3, -1, -6)}
        );
    }

    @ParameterizedTest
    @MethodSource("task3Data")
    void testTask3(List<String> input, Map<Integer, List<String>> expected) {
        assertEquals(expected, B2E3Collectors.task3(input));
    }

    private static Stream<Object[]> task3Data() {
        return Stream.of(
            new Object[]{List.of("a", "bb", "ccc"), Map.of(1, List.of("a"), 2, List.of("bb"), 3, List.of("ccc"))},
            new Object[]{List.of("hello", "world"), Map.of(5, List.of("hello", "world"))},
            new Object[]{List.of("1", "22", "333"), Map.of(1, List.of("1"), 2, List.of("22"), 3, List.of("333"))}
        );
    }

    @ParameterizedTest
    @MethodSource("task4Data")
    void testTask4(List<Integer> input, Map<Boolean, List<Integer>> expected) {
        assertEquals(expected, B2E3Collectors.task4(input));
    }

    private static Stream<Object[]> task4Data() {
        return Stream.of(
            new Object[]{List.of(1, 2, 3, 4, 5), Map.of(false, List.of(1, 3, 5), true, List.of(2, 4))},
            new Object[]{List.of(10, 20, 30), Map.of(true, List.of(10, 20, 30), false, List.of())},
            new Object[]{List.of(-1, -2, -3), Map.of(false, List.of(-1, -3), true, List.of(-2))}
        );
    }

    @ParameterizedTest
    @MethodSource("task5Data")
    void testTask5(List<B2E3Collectors.Complex> input, B2E3Collectors.Complex expected) {
        assertEquals(expected, B2E3Collectors.task5(input));
    }

    private static Stream<Object[]> task5Data() {
        return Stream.of(
            new Object[]{List.of(new B2E3Collectors.Complex(1, 1), new B2E3Collectors.Complex(2, 2), new B2E3Collectors.Complex(3, 3)), new B2E3Collectors.Complex(-12, 12)},
            new Object[]{List.of(new B2E3Collectors.Complex(1, 0), new B2E3Collectors.Complex(0, 1)), new B2E3Collectors.Complex(0, 1)},
            new Object[]{List.of(new B2E3Collectors.Complex(-1, -1), new B2E3Collectors.Complex(-2, -2)), new B2E3Collectors.Complex(0, 4)}
        );
    }
}