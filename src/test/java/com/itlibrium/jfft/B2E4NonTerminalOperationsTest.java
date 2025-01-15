package com.itlibrium.jfft;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class B2E4NonTerminalOperationsTest {

    @ParameterizedTest
    @MethodSource("task1Data")
    void testTask1(List<Integer> input, List<Integer> expected) {
        assertEquals(expected, B2E4NonTerminalOperations.task1(input));
    }

    private static Stream<Object[]> task1Data() {
        return Stream.of(
                new Object[]{List.of(1, 3, 5, 7, 9, 1, 3), List.of(2, 6, 10)},
                new Object[]{List.of(19, 13, 17, 15, 11), List.of(22, 26, 30)},
                new Object[]{List.of(-1, -3, -5, -7, -9), List.of(-18, -14, -10)}
        );
    }

    @ParameterizedTest
    @MethodSource("task2Data")
    void testTask2(List<Integer> input, List<Integer> expected) {
        assertEquals(expected, B2E4NonTerminalOperations.task2(input));
    }

    private static Stream<Object[]> task2Data() {
        return Stream.of(
                new Object[]{List.of(1, 2, 3, 4, 5, 1, 2, 3), List.of(5, 4)},
                new Object[]{List.of(10, 20, 30, 40, 50), List.of(50, 40, 30)},
                new Object[]{List.of(-1, -2, -3, -4, -3, -5), List.of(-5, -4, -2)}
        );
    }

    @ParameterizedTest
    @MethodSource("task3Data")
    void testTask3(List<String> input, Map<Character, Map<Integer, List<String>>> expected) {
        assertEquals(expected, B2E4NonTerminalOperations.task3(input));
    }

    private static Stream<Object[]> task3Data() {
        return Stream.of(
                new Object[]{List.of("apple", "ape", "bat", "ball"), Map.of('a', Map.of(3, List.of("ape"), 5, List.of("apple")), 'b', Map.of(3, List.of("bat"), 4, List.of("ball")))},
                new Object[]{List.of("cat", "car", "dog", "deer"), Map.of('c', Map.of(3, List.of("car", "cat")), 'd', Map.of(3, List.of("dog"), 4, List.of("deer")))},
                new Object[]{List.of("elephant", "eagle", "fish", "frog"), Map.of('e', Map.of(5, List.of("eagle"), 8, List.of("elephant")), 'f', Map.of(4, List.of("fish", "frog")))}
        );
    }
}