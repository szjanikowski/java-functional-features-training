package com.itlibrium.jfft;

import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;


public class B1E2FunctionalInterfaces {

        // Method to generate a random UUID
        public static UUID generateUUID() {
//            FIXME Uncomment and fix the functional interface
            Supplier<UUID> uuidSupplier = UUID::randomUUID;
            return uuidSupplier.get();
        }

        // Method to filter a list of integers to only include even numbers
        public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
            //FIXME Uncomment and fix the functional interface, replcace function reference with lambda and manually call the function reference, like in the first example where get method of a Supplier is used
            Predicate<Integer> isEven = n -> n % 2 == 0;
            return numbers.stream().filter(isEven).toList();
        }

        // Method to print each element of a list
        public static void printNumbers(List<Integer> numbers) {
            //FIXME Ucomment  and fix the functional interface, use lambda manually call the function reference, like in the first example where get method of a Supplier is used
            Consumer<Integer> print = System.out::println;
            numbers.forEach(print);
        }

        // Method to convert a list of strings to their lengths
        public static List<Integer> getStringLengths(List<String> strings) {
            //FIXME Uncomment and fix the functional interface - manually call the function reference, like in the first example where get method of a Supplier is used
            Function<String, Integer> lengthFunction = String::length;
            return strings.stream().map(lengthFunction).toList();
        }

        // Method to run a simple task in a separate thread
        public static void runTask() {
            //FIXME  Fix the functional interface, extract the lambda to a separate method and use reference
            Thread thread = new Thread(B1E2FunctionalInterfaces::getTaskIsRunning);
            thread.start();
        }

    private static void getTaskIsRunning() {
        System.out.println("Task is running");
    }

    public static void main(String[] args) {
            // Test the methods with appropriate input data
            List<Integer> numbers = List.of(1, 2, 3, 4, 5);
            List<String> strings = List.of("one", "two", "three");

            System.out.println("Even Numbers: " + filterEvenNumbers(numbers));
            System.out.println("Printing Numbers:");
            printNumbers(numbers);
            System.out.println("Generated UUID: " + generateUUID());
            System.out.println("String Lengths: " + getStringLengths(strings));
            runTask();
        }
}
