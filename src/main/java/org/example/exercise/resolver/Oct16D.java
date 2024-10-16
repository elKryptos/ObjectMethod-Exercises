package org.example.exercise.resolver;

import org.example.exercise.ExerciseMediumLevelList;

import java.util.ArrayList;
import java.util.List;

public class Oct16D implements ExerciseMediumLevelList {

    @Override
    public int sumOfAllElementsPresentsInGivenArray(List<Integer> input) {
        int sum = 0;
        for (Integer i : input) {
            sum = sum + i;
        }
        return sum;
    }

    @Override
    public int findMax(List<Integer> input) {
        int max = 0;
        for (Integer i : input) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }

    @Override
    public List<List<Integer>> transpose(List<List<Integer>> input) {
        List<List<Integer>> transposed = new ArrayList<>();
        int n = input.get(0).size();
        for (int i = 0; i < n; i++) {
            List<Integer> col = new ArrayList<>();
            for (List<Integer> row : input) {
                col.add(row.get(i));
            }
            transposed.add(col);
        }
        return transposed;
    }

    @Override
    public List<Integer> removeDuplicate(List<Integer> input) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : input) {
            if (!result.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    @Override
    public List<Integer> removeAllOccurrences(List<Integer> input) {
        return new ArrayList<>();
    }

    @Override
    public List<Integer> removeElementsFromArray(List<Integer> input, int toRemove) {
        List<Integer> result = new ArrayList<>();
        for (Integer i : input) {
            if (i != toRemove) {
                result.add(i);
            }
        }
        return result;
    }

    @Override
    public List<String> remove0FromGivenString(List<String> input) {
        List<String> result = new ArrayList<>();
        for (String i : input) {
            String x = i.replace("0", "");
            result.add(x);
        }
        return result;
    }
}
