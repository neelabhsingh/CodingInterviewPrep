package com.codinginterviewprep.algorithms.backtracking.combinatorics;

import java.util.ArrayList;
import java.util.List;
/**
 * Generating All Permutations of a String in Java
 *
 * Problem Statement:
 * Given an input string, generate all possible permutations of the string.
 * For example, if the input string is "abc", the output should be:
 *   abc
 *   acb
 *   bac
 *   bca
 *   cab
 *   cba
 *
 * Approach:
 * This implementation uses a backtracking algorithm to generate all permutations
 * of the input string. It swaps characters at each position and recursively generates
 * permutations for the remaining substring.
 */
public class StringPermutations {

    public static void main(String[] args) {
        String input = "abc";
        List<String> result = generatePermutations(input);
        result.forEach(System.out::println);
    }

    private static List<String> generatePermutations(String input) {
        List<String> permutations = new ArrayList<>();
        permute(new StringBuilder(input), 0, input.length() - 1, permutations);
        return permutations;
    }

    private static void permute(StringBuilder str, int start, int end, List<String> permutations) {
        if (start == end) {
            permutations.add(str.toString());
        } else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                permute(str, start + 1, end, permutations);
                str = swap(str, start, i); // Backtrack by swapping characters back
            }
        }
    }

    private static StringBuilder swap(StringBuilder str, int i, int j) {
        char temp = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, temp);
        return str;
    }
}