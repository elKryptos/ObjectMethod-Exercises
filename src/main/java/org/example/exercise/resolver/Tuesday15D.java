package org.example.exercise.resolver;

import org.example.exercise.EserciziStringhe;

import java.util.Arrays;

public class Tuesday15D implements EserciziStringhe {
    final String vocals = "aeiou";
    final String consonants = "bcdfghjklmnpqrstvwxyz";
    @Override
    public String countVowelsAndConsonants(String str) {

        String control = str.toLowerCase();
        int vocalCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < control.length(); i++) {
            if (vocals.indexOf(control.charAt(i)) != -1) {
                vocalCount++;
            }
           if (consonants.indexOf(control.charAt(i)) != -1) {
                consonantCount++;
            }
        }
        int [] res = new int[] {vocalCount, consonantCount};
        return Arrays.toString(res);
    }

    @Override
    public boolean containing(String mainStr, String subStr) {
        return mainStr.contains(subStr);
    }

    @Override
    public boolean parenthesys(String str) {
        String open = "(";
        String close = ")";
        int control = 0;
        if (str.contains(open)) {
            control++;
        }
        if(str.contains(close)) {
            control--;
        }
        return (control < 0) ? false : true;
    }

    @Override
    public String shift(String str, int positions) {
        String result = "";
        int n = positions;
        System.out.println(n);
        int l = str.length();
        System.out.println(l);
        if (n == l) return str;
        if (n < l) {
            String part1 = str.substring(n);
            String part2 = str.substring(0, n);
            result = part1 + part2;
        }
        if (n > l) {
            int x = n % l;
            System.out.println(x);
            String part1 = str.substring(x);
            String part2 = str.substring(0, x);
            result = part1 + part2;
        }
        return result;
    }
}
