package com.itlibrium.jfft;

import com.itlibrium.jfft.b2e5.TreeNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class B2E5FlatMapOperationsTest {

    @ParameterizedTest
    @MethodSource("flattenListOfListsData")
    void testFlattenListOfLists(List<List<Integer>> input, List<Integer> expected) {
        assertEquals(expected, B2E5FlatMapOperations.flattenListOfLists(input));
    }

    private static Stream<Object[]> flattenListOfListsData() {
        return Stream.of(
                new Object[]{List.of(List.of(1, 2, 3), List.of(4, 5), List.of(6, 7, 8)), List.of(1, 2, 3, 4, 5, 6, 7, 8)},
                new Object[]{List.of(List.of(9, 10), List.of(11, 12)), List.of(9, 10, 11, 12)},
                new Object[]{List.of(List.of(), List.of(13, 14)), List.of(13, 14)}
        );
    }

    @ParameterizedTest
    @MethodSource("flattenTreeData")
    void testFlattenTree(TreeNode input, List<Integer> expected) {
        assertEquals(expected, B2E5FlatMapOperations.flattenTree(input));
    }

    private static Stream<Object[]> flattenTreeData() {
        return Stream.of(
                new Object[]{new TreeNode(1, List.of(
                        new TreeNode(2, List.of()),
                        new TreeNode(3, List.of(
                                new TreeNode(4, List.of()),
                                new TreeNode(5, List.of())
                        )),
                        new TreeNode(6, List.of())
                )), List.of(1, 2, 3, 4, 5, 6)},
                new Object[]{new TreeNode(7, List.of(
                        new TreeNode(8, List.of(
                                new TreeNode(9, List.of())
                        ))
                )), List.of(7, 8, 9)}
        );
    }

    @ParameterizedTest
    @MethodSource("groupAndFlattenData")
    void testGroupAndFlatten(List<String> input, Map<Character, List<Character>> expected) {
        assertEquals(expected, B2E5FlatMapOperations.groupAndFlatten(input));
    }

    private static Stream<Object[]> groupAndFlattenData() {
        return Stream.of(
                new Object[]{List.of("apple", "ape", "bat", "ball"), Map.of('a', List.of('a', 'p', 'p', 'l', 'e', 'a', 'p', 'e'), 'b', List.of('b', 'a', 't', 'b', 'a', 'l', 'l'))},
                new Object[]{List.of("cat", "car", "dog", "deer"), Map.of('c', List.of('c', 'a', 't', 'c', 'a', 'r'), 'd', List.of('d', 'o', 'g', 'd', 'e', 'e', 'r'))},
                new Object[]{List.of("elephant", "eagle", "fish", "frog"), Map.of('e', List.of('e', 'l', 'e', 'p', 'h', 'a', 'n', 't', 'e', 'a', 'g', 'l', 'e'), 'f', List.of('f', 'i', 's', 'h', 'f', 'r', 'o', 'g'))}
        );
    }
}