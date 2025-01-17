package com.itlibrium.jfft;

import io.vavr.collection.HashMap;
import io.vavr.collection.List;
import io.vavr.collection.Map;
import io.vavr.control.Option;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class B4E1VavrCollectionsAndOptionalsTest {

    @Test
    public void testZip() {
        List<String> names = List.of("Alice", "Bob");
        List<Integer> ages = List.of(30, 25);
        List<LocalDate> datesOfBirth = List.of(LocalDate.of(1991, 1, 1), LocalDate.of(1996, 5, 15));
        List<B4E1VavrCollectionsAndOptionals.Person> expected = List.of(
            new B4E1VavrCollectionsAndOptionals.Person("Alice", 30, LocalDate.of(1991, 1, 1)),
            new B4E1VavrCollectionsAndOptionals.Person("Bob", 25, LocalDate.of(1996, 5, 15))
        );
        List<B4E1VavrCollectionsAndOptionals.Person> result = B4E1VavrCollectionsAndOptionals.zip(names, ages, datesOfBirth);
        assertEquals(expected, result);
    }

    private static Stream<Object[]> task2Data() {
        return Stream.of(
            new Object[]{List.of(1, 2, 3, 4, 5, 1, 2, 3), List.of(5, 4)},
            new Object[]{List.of(1, 2, 3), List.of(3, 2, 1)},
            new Object[]{List.of(1, 1, 1), List.of(1)},
            new Object[]{List.of(), List.of()}
        );
    }

    @ParameterizedTest
    @MethodSource("task2Data")
    public void testTask2(List<Integer> input, List<Integer> expected) {
        List<Integer> result = B4E1VavrCollectionsAndOptionals.task2(input);
        assertEquals(expected, result);
    }

    private static Stream<Object[]> task3Data() {
        return Stream.of(
            new Object[]{List.of("apple", "ape", "bat", "ball", "bag"),
                HashMap.of('a', HashMap.of(3, List.of("ape"), 5, List.of("apple")),
                    'b', HashMap.of(3, List.of("bag", "bat"), 4, List.of("ball")))},
            new Object[]{List.of("cat", "car", "dog", "deer"),
                HashMap.of('c', HashMap.of(3, List.of("car", "cat")),
                    'd', HashMap.of(3, List.of("dog"), 4, List.of("deer")))}
        );
    }

    @ParameterizedTest
    @MethodSource("task3Data")
    public void testTask3(List<String> input, Map<Character, Map<Integer, List<String>>> expected) {
        Map<Character, Map<Integer, List<String>>> result = B4E1VavrCollectionsAndOptionals.task3(input);
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Object[]> task4Data() {
        return Stream.of(
            new Object[]{List.of(Option.of("apple"), Option.none(), Option.of("banana")), "apple,banana"},
            new Object[]{List.of(Option.none(), Option.none()), ""},
            new Object[]{List.of(Option.of("one"), Option.of("two")), "one,two"}
        );
    }

    @ParameterizedTest
    @MethodSource("task4Data")
    public void testTask4(List<Option<String>> input, String expected) {
        String result = B4E1VavrCollectionsAndOptionals.task4(input);
        assertEquals(expected, result);
    }

    private static Stream<Object[]> task5Data() {
        return Stream.of(
            new Object[]{List.of(Option.of("apple"), Option.none(), Option.of("banana")), List.of("APPLE", "EMPTY", "BANANA")},
            new Object[]{List.of(Option.none(), Option.none()), List.of("EMPTY", "EMPTY")},
            new Object[]{List.of(Option.of("one"), Option.of("two")), List.of("ONE", "TWO")}
        );
    }

    @ParameterizedTest
    @MethodSource("task5Data")
    public void testTask5(List<Option<String>> input, List<String> expected) {
        List<String> result = B4E1VavrCollectionsAndOptionals.task5(input);
        assertEquals(expected, result);
    }
}