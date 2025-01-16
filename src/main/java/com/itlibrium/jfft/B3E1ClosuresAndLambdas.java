package com.itlibrium.jfft;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class B3E1ClosuresAndLambdas {

    public static class Multiplier {
        private int factor;

        public Multiplier(int factor) {
            this.factor = factor;
        }

        public Multiplier() {
            this.factor = 1;
        }

        public int multiply(int number) {
            try {
                Thread.sleep(10); // Simulate some delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return number * (factor++);
        }
    }

    /**
     * Task 1
     * Description: Fix the code, which for a given list of integers, attempts to return a list of integers where each integer is multiplied by a growing factor.
     * You cannot modify Multiplier class, but you don't need to rely on it incrementing the factor - you can do it in the task code.
     * The operation must run in parallel. Tell where is the closure used in your solution.
     * Verification: Input: [1, 0, 3], Expected Output: [1, 0, 9]
     */
    public static List<Integer> task1(List<Integer> numbers) {
        Multiplier multiplier = new Multiplier();
        return numbers.parallelStream()
            .map(multiplier::multiply)
            .collect(Collectors.toList());
    }
}