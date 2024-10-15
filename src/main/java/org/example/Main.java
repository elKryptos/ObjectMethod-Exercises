package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import org.example.exercise.resolver.Tuesday15D;
import org.example.exercise.resolver.Tuesday15N;

import java.lang.reflect.Array;
import java.util.Arrays;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Tuesday15N test2 = new Tuesday15N();
    System.out.println(test2.sumOfAllElementsPresentsInGivenArray(new int[] {1,2,3,4,5}));
    int [] b = {1,2,3,4,5,4,4,2,3};
    System.out.println(Arrays.toString(test2.removeDuplicate(b)));
    System.out.println(Arrays.toString(test2.removeAllOccurrences(b)));
    System.out.println(Arrays.toString(test2.removeElementsFromArray(b,4)));
    System.out.println(test2.remove0FromGivenString("1002040"));
    System.out.println(Arrays.deepToString(test2.transpose(new int[][] {{1, 2}, {3, 4}})));
    }
}