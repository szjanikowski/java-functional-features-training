package com.itlibrium.jfft;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class B2E1BasicStreamOpsTest {

    @Test
    public void testTask1() {
        List<Integer> result = B2E1BasicStreamOps.task1(List.of(2, 3, 4, 5, 6));
        List<Integer> expected = List.of(16, 25, 36);
        assertEquals(expected, result);
    }

    private static Stream<Object[]> task2Data() {
        return Stream.of(
            new Object[]{List.of(2, 3, 4, 5, 6), List.of(16, 25, 36)},
            new Object[]{List.of(1, 2, 3, -4, 5, 10, 11), List.of(16, 25)},
            new Object[]{List.of(), List.of()},
            new Object[]{List.of(2, 4, 6, -8, Integer.MAX_VALUE), List.of(16, 36, 64)},
            new Object[]{List.of(Integer.MIN_VALUE, -1, -3, -5, -7), List.of(25, 49)}
        );
    }

    @ParameterizedTest
    @MethodSource("task2Data")
    public void testTask2(List<Integer> input, List<Integer> expected) {
        long startTime = System.currentTimeMillis();
        List<Integer> result = B2E1BasicStreamOps.task2(input);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        long minTime = 100L * expected.size();
        long maxTime = minTime + 100;

        assertEquals(expected, result);
        assertTrue(executionTime >= minTime, "Execution time should be at least " + minTime + "ms");
        assertTrue(executionTime <= maxTime, "Execution time should be at most " + maxTime + "ms");
    }


    private static Stream<Object[]> task3Data() {
        return Stream.of(
            new Object[]{List.of("apple", "banana", "cherry", "date"), new B2E1BasicStreamOps.Task3Result(true, true)},
            new Object[]{List.of("grape", "kiwi", "lemon", "fig"), new B2E1BasicStreamOps.Task3Result(true, false)},
            new Object[]{List.of("kiwi", "lemon", "fig"), new B2E1BasicStreamOps.Task3Result(false, false)},
            new Object[]{List.of("", "b", "c"), new B2E1BasicStreamOps.Task3Result(false, false)},
            new Object[]{List.of("pear", "plum", "peach"), new B2E1BasicStreamOps.Task3Result(true, true)}
        );
    }

    @ParameterizedTest
    @MethodSource("task3Data")
    public void testTask3(List<String> input, B2E1BasicStreamOps.Task3Result expected) {
        B2E1BasicStreamOps.Task3Result result = B2E1BasicStreamOps.task3(input);
        assertThat(result).isEqualTo(expected);
    }


    private static Stream<Object[]> data() {
        return Stream.of(
            new Object[]{List.of(-2, 1, 8, 27, 64), false},
            new Object[]{List.of(-1, 4, 9, 16, 25), true},
            new Object[]{List.of(-1, 4, 9, 16, 25, 0), false},
            new Object[]{List.of(-3, 1, 3, 0, 1), false}
        );
    }

    @ParameterizedTest
    @MethodSource("data")
    public void testTask4(List<Integer> input, boolean expected) {
        boolean result = B2E1BasicStreamOps.task4(input);
        assertEquals(expected, result);
    }
}