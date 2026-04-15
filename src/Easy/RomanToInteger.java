package Easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        String roman = "III";
        Map<Character, Integer> ri = new HashMap<>();
        ri.put('I', 1);
        ri.put('V', 5);
        ri.put('X', 10);
        ri.put('L', 50);
        ri.put('C', 100);
        ri.put('D', 500);
        ri.put('M', 1000);
        int result =0;
        int i = roman.length()-1;
        while(i>=0) {
            if (i == 0) {
                result += ri.get(roman.charAt(i));
                i--;
            }
        else if(ri.get(roman.charAt(i)) > ri.get(roman.charAt(i-1)) ) {
                result = result + ri.get(roman.charAt(i)) - ri.get(roman.charAt(i - 1));
                i = i - 2;
            }
        else{
            result += ri.get(roman.charAt(i));
            i--;
            }
        }
    }
}
