package org.example.exercise.resolver;

import org.example.exercise.ExerciseLowLevel;

import java.util.Arrays;

public class Resolver implements ExerciseLowLevel {
    @Override
    public String reverse(String input) {
        char[] reverse = new char[input.length()];
        for(int i = input.length() -1, j = 0; i >= 0; i--, j++){
            reverse[i] = input.charAt(j);
        }
        return new String(reverse);
    }

    @Override
    public boolean isPalindrome(String input) {
        char[] palindrome = input.toCharArray();
        for(int i = input.length() -1 , j = 0; i >= 0; i--, j++ ){
            palindrome[j] = input.charAt(i);
        }
        return new String(palindrome).equals(input);
    }

    @Override
    public int fibonacci(int input) {
        int num1 = 0;
        int num2 = 1;
        if(input == 0)  return 0;
        for(int i = 0; i <= input; i++){
            int next = num1 + num2;
            num1 = num2;
            num2 = next;
        }
        return num2;
    }

    @Override
    public int[] mergeSortedArrays(int[]... input) {
        int lunghezza = 0;
        for(int[] array : input){
            lunghezza += array.length;
        }
        int [] merger = new int[lunghezza];
        int index = 0;
        for(int[] array : input){
            for(int num : array){
                merger[index++] = num;
            }
        }
        Arrays.sort(merger);
        return merger;
    }

    @Override
    public boolean isAnagram(String value1, String value2) {
        return ExerciseLowLevel.super.isAnagram(value1, value2);
    }

    public int minValue(int[] input){
        if(input == null || input.length == 0) {
            throw new  IllegalArgumentException("Input cannot be null");
        }
        for(int i = 0; i < input.length; i++){}
        int min = input[0];
        for(int i = 1; i < input.length; i++){
            if(input[i] < min) {
                min = input[i];
            }
        }
        return min;
    }
}
