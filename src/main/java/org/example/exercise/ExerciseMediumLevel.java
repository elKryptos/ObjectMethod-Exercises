package org.example.exercise;

public interface ExerciseMediumLevel {

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
    int sumOfAllElementsPresentsInGivenArray(int[] input);

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
    int findMax(int[] input);

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
    int[][] transpose(int[][] input);

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
    int[] removeDuplicate(int[] input);

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
    int[] removeAllOccurrences(int[] input);
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
    int[] removeElementsFromArray(int[] input, int toRemove);

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
    String remove0FromGivenString(String input);

}
