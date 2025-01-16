package com.itlibrium.jfft;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class B3E2RecordsTest {

    private static Stream<Object[]> task1Data() {
        return Stream.of(
            new Object[]{List.of("Alice", "Bob"), List.of(30, 25), List.of(LocalDate.of(1991, 1, 1), LocalDate.of(1996, 5, 15)), List.of(
                new B3E2Records.Person("Alice", 30, LocalDate.of(1991, 1, 1)),
                new B3E2Records.Person("Bob", 25, LocalDate.of(1996, 5, 15))
            )},
            new Object[]{List.of("Charlie"), List.of(35), List.of(LocalDate.of(1986, 7, 20)), List.of(
                new B3E2Records.Person("Charlie", 35, LocalDate.of(1986, 7, 20))
            )},
            new Object[]{List.of(), List.of(40), List.of(LocalDate.of(1981, 3, 10)), List.of()}
        );
    }

    @ParameterizedTest
    @MethodSource("task1Data")
    public void testTask2(List<String> names, List<Integer> ages, List<LocalDate> datesOfBirth, List<B3E2Records.Person> expected) {
        List<B3E2Records.Person> result = B3E2Records.zip(names, ages, datesOfBirth);
        assertThat(result).isEqualTo(expected);
    }
}