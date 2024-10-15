package org.example.exercise;

public interface ExerciseLowLevel {
    /**
     * Inverts the given string.
     *
     * @param input The string to be reversed.
     * @return The reversed string.
     *
     * <p>Example:</p>
     * <pre>
     * Input: "hello"
     * Output: "olleh"
     * </pre>
     */
    String reverse(String input);

    /**
     * Checks if the given string is a palindrome.
     *
     * @param input The string to be checked.
     * @return {@code true} if the input string is a palindrome, {@code false} otherwise.
     *
     * <p>Example:</p>
     * <pre>
     * Input: "racecar"
     * Output: true
     *
     * Input: "hello"
     * Output: false
     * </pre>
     */
    boolean isPalindrome(String input);

    /**
     * Calculates the Fibonacci number at the specified position.
     *
     * @param input The position in the Fibonacci sequence (0-based index).
     * @return The Fibonacci number at the specified position.
     *
     * <p><strong>Example:</strong></p>
     * <p>Funzione: F_n = F_{n-1} + F_{n-2} </p>
     * <p>Sequenza: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ecc...</p>
     *
     * <p><strong>Input:</strong> 5</p>
     * <p><strong>Output:</strong> 5</p>
     *
     * <p><strong>Input:</strong> 10</p>
     * <p><strong>Output:</strong> 55</p>
     */
    int fibonacci(int input);

    /**
     * Merges multiple sorted arrays into a single sorted array.
     *
     * @param input Varargs of sorted arrays to be merged.
     * @return A single sorted array containing all the elements from the input arrays.
     *
     * <p>Example:</p>
     * <pre>
     * Input: new int[]{1, 3, 5}, new int[]{2, 4, 6}
     * Output: [1, 2, 3, 4, 5, 6]
     * </pre>
     */
    int[] mergeSortedArrays(int[]... input);

    /**
     * Checks if the given strings are anagrams of each other.
     *
     * @param input Varargs of strings to be checked.
     * @return {@code true} if all the input strings are anagrams of each other, {@code false} otherwise.
     *
     * <p>Example:</p>
     * <pre>
     * Input: "listen", "silent"
     * Output: true
     *
     * Input: "hello", "world"
     * Output: false
     * </pre>
     */
    default boolean isAnagram(String value1, String value2) {
        return false;
    } ;
}
