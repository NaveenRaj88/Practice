package Easy;

import java.util.Arrays;

public class RemoveElement {

    public static void main(String[] args) {
       int[] nums = new int[]{3,2,2,3};
       int val = 3;
       int cursor = 0;
       for(int i=0; i<nums.length; i++){
           if(nums[i] != val){
               nums[cursor] = nums[i];
               cursor++;
           }
       }
        System.out.println(cursor);
        System.out.println(Arrays.toString(nums));
    }
}
