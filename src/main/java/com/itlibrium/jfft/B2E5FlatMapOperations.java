package com.itlibrium.jfft;

import com.itlibrium.jfft.b2e5.TreeNode;

import java.util.List;
import java.util.Map;

public class B2E5FlatMapOperations {

    /**
     * Exercise 1
     * Description: Given a list of lists of integers, return a single list containing all the integers.
     * Verification: Input: [[1, 2, 3], [4, 5], [6, 7, 8]], Expected Output: [1, 2, 3, 4, 5, 6, 7, 8]
     */
    public static List<Integer> flattenListOfLists(List<List<Integer>> lists) {
        return List.of();
    }


    /**
     * Task 2
     * Description: Given a tree structure where each node contains a value and a list of child nodes, return a list of all values in the tree.
     * Verification: Input: A tree with root value 1 and children [2, [3, [4, 5]], 6], Expected Output: [1, 2, 3, 4, 5, 6]
     */
    public static List<Integer> flattenTree(TreeNode root) {
        return List.of();
    }

    /**
     * Exercise 3
     * Description: Given a list of strings, return a map where the key is the first character of the string and the value is a list of all characters in the strings that start with that character.
     * Verification: Input: ["apple", "ape", "bat", "ball"], Expected Output: {'a'=[a, p, p, l, e, a, p, e], 'b'=[b, a, t, b, a, l, l]}
     */
    public static Map<Character, List<Character>> groupAndFlatten(List<String> strings) {
        return Map.of();
    }

}