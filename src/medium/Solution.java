package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = solution.threeSum(nums);
        System.out.println(result);
    }

    public List<List<Integer>> threeSum(int[] nums) {
        int a =0, b=a+1, c=nums.length-1;
        List<List<Integer>> threeSums = new ArrayList<>();
        while(a<b){

            while(b<c){
                int sum = nums[a]+ nums[b]+ nums[c];
                if(sum ==0){
                    threeSums.add(Arrays.asList(new Integer[] {nums[a], nums[b], nums[c]}));
                }
                c--;
            }

            a++; b++;
            c= nums.length-1;

        }
        return threeSums;
    }
}
