package com.itlibrium.jfft;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class B2E3Collectors {

    /**
     * Task 1
     * Description: Given a list of strings, collect them into a map with the string as the key and its length as the value.
     * Verification: Input: ["a", "bb", "ccc"], Expected Output: {"a"=1, "bb"=2, "ccc"=3}
     */
    public static Map<String, Integer> task1(List<String> strings) {
        return null;
    }

    /**
     * Task 2
     * Description: Given a list of integers, collect statistics such as sum, count, and average.
     * Verification: Input: [1, 2, 3, 4, 5], Expected Output: IntSummaryStatistics{count=5, sum=15, min=1, average=3.0, max=5}
     */
    public static java.util.IntSummaryStatistics task2(List<Integer> numbers) {
        return null;
    }

    /**
     * Task 3
     * Description: Given a list of strings, group them by their length.
     * Verification: Input: ["a", "bb", "ccc"], Expected Output: {1=["a"], 2=["bb"], 3=["ccc"]}
     */
    public static Map<Integer, List<String>> task3(List<String> strings) {
        return null;
    }

    /**
     * Task 4
     * Description: Given a list of integers, partition them into even and odd numbers.
     * Verification: Input: [1, 2, 3, 4, 5], Expected Output: {false=[1, 3, 5], true=[2, 4]}
     */
    public static Map<Boolean, List<Integer>> task4(List<Integer> numbers) {
        return null;
    }

    /**
     * Task 5
     * Description: Given a list of complex numbers, reduce them to their product using a collector.
     * Verification: Input: [1+1i, 2+2i, 3+3i], Expected Output: -18+18i
     */
    public static Complex task5(List<Complex> numbers) {
       return null;
    }

    public static class Complex {
        private final double real;
        private final double imaginary;

        public Complex(double real, double imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        public double getReal() {
            return real;
        }

        public double getImaginary() {
            return imaginary;
        }

        public Complex multiply(Complex other) {
            double realPart = this.real * other.real - this.imaginary * other.imaginary;
            double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
            return new Complex(realPart, imaginaryPart);
        }

        @Override
        public String toString() {
            return real + " + " + imaginary + "i";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Complex complex = (Complex) o;
            return Double.compare(complex.real, real) == 0 &&
                Double.compare(complex.imaginary, imaginary) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(real, imaginary);
        }
    }
}