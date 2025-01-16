package com.itlibrium.jfft;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class B3E1ClosuresAndLambdasTest {

    private static Stream<Object[]> task1Data() {
        return Stream.of(
            new Object[]{List.of(1, 0, 3), List.of(1, 0, 9)},
            new Object[]{List.of(2, 4, 6), List.of(2, 8, 18)},
            new Object[]{List.of(0, 0, 0), List.of(0, 0, 0)},
            new Object[]{List.of(5), List.of(5)}
        );
    }

    @ParameterizedTest
    @MethodSource("task1Data")
    public void testTask1(List<Integer> input, List<Integer> expected) {
        long startTime = System.currentTimeMillis();
        List<Integer> result = B3E1ClosuresAndLambdas.task1(input);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;

        long maxTime = 10L * input.size();

        assertThat(result).isEqualTo(expected);
        assertTrue(executionTime <= maxTime, "Execution time should be less than or equal to " + maxTime + "ms");
    }
}