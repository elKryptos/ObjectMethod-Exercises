package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import org.example.exercise.ExerciseMediumLevelList;
import org.example.exercise.resolver.Oct16D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ExerciseMediumLevelList test = new Oct16D();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4,5,5,5,2,2,2);
        List<String> text = Arrays.asList("kj0000f", "000sadf");
        System.out.println("findMax: " + test.findMax(numbers));
        System.out.println((test.removeAllOccurrences(numbers)));
        System.out.println(test.removeDuplicate(numbers));
        System.out.println("///");
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(List.of(1,2));
        matrix.add(List.of(3,4));
        System.out.println(test.transpose(matrix));
        System.out.println(test.remove0FromGivenString(text));

    }
}