package medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaxNumOfVowelsInSubstring {
    public static void main(String[] args) {
        String s = "abciiidef";
        System.out.println(s.length());
        int k = 3;
        int result = maxVowels(s, k);
        System.out.println("Maximum number of vowels in a substring of length " + k + ": " + result);
    }

    public static int maxVowels(String s, int k) {
        var vowelsSet = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        int maxVowels = 0;
        for (int i = 0; i <= s.length()-k; i++) {
            int currentVowels =0;
            for(int j =i; j < i+k; j++) {
                if(vowelsSet.contains(s.charAt(j))){
                    currentVowels++;
                }
            }
            maxVowels = Math.max(maxVowels, currentVowels);
            if (maxVowels ==k){
                break;
            }
        }

        return maxVowels;
    }


}
