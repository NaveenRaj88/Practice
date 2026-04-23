package Easy;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {8,9,9};
        int i = digits.length - 1;
        while (i >= 0) {

            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                break;
            }else if (digits[i] == 10 || digits[i] == 9) {

                if(i > 0) {
                    digits[i] = 0;
                    digits[i - 1] = digits[i - 1] + 1;
                }
                else{
                    digits[i] = digits[i]+1;
                }
                i--;
            }
        }

        int[] newDigits = null;
        if (digits[0] >= 10) {
            newDigits = new int[digits.length + 1];
            newDigits[0] = 1;
            digits = newDigits;
        }

        System.out.println(Arrays.toString(digits));
    }
}
