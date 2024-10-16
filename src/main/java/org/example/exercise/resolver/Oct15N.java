package org.example.exercise.resolver;

import org.example.exercise.ExerciseMediumLevel;

import java.util.Arrays;

public class Oct15N implements ExerciseMediumLevel {
    @Override
    public int sumOfAllElementsPresentsInGivenArray(int[] input) {
        int result = 0;
        for(int i = 0; i < input.length; i++){
            result += input[i];
        }
        return result;
    }

    @Override
    public int findMax(int[] input) {
        int x = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > x) {
                x = input[i];
            }
        }
        return x;
    }

    @Override
    public int[][] transpose(int[][] input) {
        int rows = input.length;
        int columns = input[0].length;
        int [][] trasposed = new int[rows][columns];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                trasposed[j][i] = input[i][j];
            }
        }
        return trasposed;
    }

    @Override
    public int[] removeDuplicate(int[] input) {
       if(input.length == 0) return new int[0];
       if(input.length == 1) return input;
       Arrays.sort(input);
       int[] temp = new int[input.length];
       int value = 0;
       temp[value++] = input[0];
       for (int i = 1; i < input.length; i++) {
           if(input[i] != temp[value - 1]) {
               temp[value++] = input[i];
           }
       }
       return Arrays.copyOf(temp, value);
    }

    @Override
    public int[] removeAllOccurrences(int[] input) {
        return new int [0];
    }

    @Override
    public int[] removeElementsFromArray(int[] input, int toRemove) {
        int count = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] != toRemove){
                count++;
            }
        }
        int [] result = new int[count];
        int index = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] != toRemove){
                result[index++] = input[i];
            }
        }
        return result;
    }

    @Override
    public String remove0FromGivenString(String input) {
        if(input == null || input.length() == 0) return "";
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) != '0'){
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
}
