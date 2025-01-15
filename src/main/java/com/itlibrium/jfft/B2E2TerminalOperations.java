package com.itlibrium.jfft;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class B2E2TerminalOperations {

    /**
     * Task 1
     * Description: Given a list of integers, print each number.
     * Verification: Input: [1, 2, 3, 4, 5], Expected Output: 1 2 3 4 5 (each number on a new line)
     */
    public static void task1(List<Integer> numbers) {
        System.out.println("Task 1 Mock result! TASK NOT IMPLEMENTED!");
    }

    /**
     * Task 2
     * Description: Given a list of integers, return a new list containing the same elements.
     * Verification: Input: [1, 2, 3, 4, 5], Expected Output: [1, 2, 3, 4, 5]
     */
    public static List<Integer> task2(List<Integer> numbers) {
        return null;
    }

    /**
     * Task 3
     * Description: Given a list of integers, return the minimum value.
     * Verification: Input: [1, 2, 3, 4, 5], Expected Output: 1
     */
    public static Optional<Integer> task3(List<Integer> numbers) {
        return null;
    }

    /**
     * Task 4
     * Description: Given a list of integers, return the maximum value.
     * Verification: Input: [1, 2, 3, 4, 5], Expected Output: 5
     */
    public static Optional<Integer> task4(List<Integer> numbers) {
        return null;
    }

    /**
     * Task 5
     * Description: Given a list of integers, return the count of elements.
     * Verification: Input: [1, 2, 3, 4, 5], Expected Output: 5
     */
    public static long task5(List<Integer> numbers) {
        return 0L;
    }

    /**
     * Task 6
     * Description: Given a list of integers, return the first element.
     * Verification: Input: [1, 2, 3, 4, 5], Expected Output: 1
     */
    public static Optional<Integer> task6(List<Integer> numbers) {
        return null;
    }

    /**
     * Task 7
     * Description: Given a list of integers, return any element.
     * Verification: Input: [1, 2, 3, 4, 5], Expected Output: Any element from the list
     */
    public static Optional<Integer> task7(List<Integer> numbers) {
        return null;
    }

    /**
     * Task 8
     * Description: Given a list of integers, return the sum of all elements. *USE REDUCE TERMINAL OPERATION*.
     * Verification: Input: [1, 2, 3, 4, 5], Expected Output: 15
     */
    public static int task8(List<Integer> numbers) {
        return 0;
    }

    /**
     * Task 9
     * Description: Given a list of strings, return a single string that concatenates all elements. *USE COLLECT TERMINAL OPERATION*.
     * Verification: Input: ["a", "b", "c"], Expected Output: "abc"
     */
    public static String task9(List<String> strings) {
        return null;
    }

    /**
     * Task 10
     * Description: Given a list of integers, return a custom statistics object containing the sum, count, and average of the elements. Add appropriate methods to the Statistics class if necessary!
     * Verification: Input: [1, 2, 3, 4, 5], Expected Output: Statistics{sum=15, count=5, average=3.0}
     */
    public static Statistics task10(List<Integer> numbers) {
        return null;
    }

    public static class Statistics {
        private int sum;
        private int count;

        public Statistics() {
            this.sum = 0;
            this.count = 0;
        }

        public Statistics(int sum, int count) {
            this.sum = sum;
            this.count = count;
        }

        public double getAverage() {
            return count == 0 ? 0 : (double) sum / count;
        }

        @Override
        public String toString() {
            return "Statistics{" +
                "sum=" + sum +
                ", count=" + count +
                ", average=" + getAverage() +
                '}';
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Statistics that = (Statistics) o;
            return sum == that.sum && count == that.count;
        }

        @Override
        public int hashCode() {
            return Objects.hash(sum, count);
        }
    }
}