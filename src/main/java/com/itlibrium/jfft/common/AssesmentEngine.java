package com.itlibrium.jfft.common;

import java.util.Scanner;

public class AssesmentEngine {

    public static final String[] B1_BASICS = {
        """
          Functional programming is like creating Excel sheets (or ‘math machines’)
            - I know what a pure function is in programming and why it is similar to math functions.
            - I know what is immutability and why it is important for pure functions.
            - I know why more advanced programs created out of pure functions will require functions to accept functions as arguments :)
            - I know how to define anonymous lambda function in Java
        """,
        """
          Generic types – essential abstractions for machinery interfaces: 
            - I know why Generic types add so much flexibility to functions composition
            - I know what is Covariance (<? extends SomeClass>) and Contravariance (<? super SomeClass>) and how to use it in Java
            - I know typical situations where Covariance and Contravariance is useful
         """,
        """
          Functional interfaces – smaller typical operations
            - I know the meaning of @FunctionalInterface annotation
            - I know typical Functional interfaces in Java like Predicate, Consumer, Supplier, Function, Runnable
            - I know how to define them with and without/lambdas
            - I know their relationships to Covariance, Contravariance etc. 
         """,
        """
          Static and Instance method references
           - I know how to reference static and instance methods in Java
           - I know how to reference constructors in Java
        """
    };

    public static final String[] B2_STREAMS_OPTIONS = {
        """
          Stream – a conveyer belt
            - I know different types of Stream in Java IntStream, LongStream, DoubleStream, Stream
            - I know how to create a Stream from a collection or a sequence of elements
            - I know how to use intermediate operations like map, filter, flatMap, distinct, sorted, peek, limit, skip
            - I know how to use terminal operations like forEach, collect, reduce, count, anyMatch, allMatch, noneMatch, findFirst, findAny
            - I understand short-circuiting operations like anyMatch, allMatch, noneMatch, findFirst, findAny
        """,
        """
          FlatMap - smart connector for containers of the same type
            - I understand abstract flatMap concept - what is accepted by flatMap function and what is returned
            - I know what are the used cases for flatMap except only converting arrays to flat lists
            - I know how to use flatMap with Java Streams and Optionals
        """,
        """
          Option – a box with an emptiness indicator
           - I know how Optional is similar to a Stream or a Collection
           - I know the basic methods of Optional
           - I know how to deal with emtpy optionals in functional way (instead of using ifPresent)
        """
    };

    public static int assessSection(Scanner scanner, String sectionName, String[] topics) {
        int sectionPoints = 0;
        System.out.println("\nSection: " + sectionName);
        for (String topic : topics) {
            int rating;
            do {
                System.out.println("Assess your knowledge on a scale of 1 to 5: " + topic);
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                    scanner.next(); // Clear the invalid input
                }
                rating = scanner.nextInt();
                if (rating < 1 || rating > 5) {
                    System.out.println("Invalid input. Please enter a number between 1 and 5.");
                }
            } while (rating < 1 || rating > 5);
            sectionPoints += rating;
        }
        return sectionPoints;
    }
}
