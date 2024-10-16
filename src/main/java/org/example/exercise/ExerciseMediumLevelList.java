package org.example.exercise;

import java.util.List;

public interface ExerciseMediumLevelList {

    /**
     * Calculates the sum of all elements present in the given array.
     *
     * @param input The array containing the elements to be summed.
     * @return The sum of all elements in the array.
     *
     * <p>Example:</p>
     * <pre>
     * input = {1, 2, 3, 4}
     * output = 10
     * </pre>
     */
    int sumOfAllElementsPresentsInGivenArray(List<Integer> input);

    /**
     * Finds the maximum element in the given array.
     *
     * @param input The array containing the elements to be checked.
     * @return The maximum element in the array.
     *
     * <p>Example:</p>
     * <pre>
     * input = {1, 3, 7, 2, 5}
     * output = 7
     * </pre>
     */
    int findMax(List<Integer> input);

    /**
     * Transposes the given 2D array (matrix).
     *
     * @param input The 2D array to be transposed.
     * @return The transposed 2D array.
     *
     * <p>Example:</p>
     * <pre>
     * input = {{1, 2}, {3, 4}}
     * output = {{1, 3}, {2, 4}}
     * </pre>
     */
    List<List<Integer>> transpose(List<List<Integer>> input);

    /**
     * Removes duplicate elements from the given array.
     *
     * @param input The array from which duplicates are to be removed.
     * @return A new array with duplicates removed.
     *
     * <p>Example:</p>
     * <pre>
     * input = {1, 2, 2, 3, 4, 4}
     * output = {1, 2, 3, 4}
     * </pre>
     */
    List<Integer> removeDuplicate(List<Integer> input);

    /**
     * Removes all occurrences of elements from the given array.
     *
     * @param input The array from which all occurrences of elements are to be removed.
     * @return A new array with all occurrences of elements removed.
     *
     * <p>Example:</p>
     * <pre>
     * input = {1, 2, 2, 3, 4, 4}
     * output = {}
     * </pre>
     */
    List<Integer> removeAllOccurrences(List<Integer> input);
    /**
     * Removes all occurrences of elements from the given array.
     *
     * @param input The array from which all occurrences of elements are to be removed.
     * @param toRemove .
     * @return A new array with all occurrences of elements removed.
     *
     * <p>Example:</p>
     * <pre>
     * input = {1, 2, 2, 3, 4, 4}
     * toRemove = 2
     * output = {1, 3, 4, 4}
     * </pre>
     */
    List<Integer> removeElementsFromArray(List<Integer> input, int toRemove);

    /**
     * Removes all '0' characters from the given string.
     *
     * @param input The string from which '0' characters are to be removed.
     * @return The new string with all '0' characters removed.
     *
     * <p>Example:</p>
     * <pre>
     * input = "1002040"
     * output = "124"
     * </pre>
     */
    List<String> remove0FromGivenString(List<String> input);

}
