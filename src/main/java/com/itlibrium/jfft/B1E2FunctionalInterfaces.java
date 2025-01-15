package com.itlibrium.jfft;

import java.util.List;
import java.util.UUID;


public class B1E2FunctionalInterfaces {

        // Method to generate a random UUID
        public static UUID generateUUID() {
            //FIXME Uncomment and fix the functional interface
//            var uuidSupplier = UUID::randomUUID;
//            return uuidSupplier.get();
            return null;
        }

        // Method to filter a list of integers to only include even numbers
        public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
            //FIXME Uncomment and fix the functional interface, replcace function reference with lambda and manually call the function reference, like in the first example where get method of a Supplier is used
//            var isEven = n -> n % 2 == 0; /
//            return numbers.stream().filter(isEven).collect(Collectors.toList());
            return null;
        }

        // Method to print each element of a list
        public static void printNumbers(List<Integer> numbers) {
            //FIXME Ucomment  and fix the functional interface, use lambda manually call the function reference, like in the first example where get method of a Supplier is used
//            var print = System.out::println;
//            numbers.forEach(print);
        }

        // Method to convert a list of strings to their lengths
        public static List<Integer> getStringLengths(List<String> strings) {
            //FIXME Uncomment and fix the functional interface - manually call the function reference, like in the first example where get method of a Supplier is used
//            var lengthFunction = String::length;
//            return strings.stream().map(lengthFunction).collect(Collectors.toList());
            return null;
        }

        // Method to run a simple task in a separate thread
        public static void runTask() {
            //FIXME  Fix the functional interface, extract the lambda to a separate method and use reference
//            var task = () -> System.out.println("Task is running");
//            Thread thread = new Thread(task);
//            thread.start();
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
