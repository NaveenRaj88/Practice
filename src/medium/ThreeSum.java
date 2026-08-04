package medium;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
//        int[] nums = {-1, 0, 1, 2, -1, -4};
//        int[] nums = {0,0,0,0};
        int[] nums = {-100,-70,-60,110,120,130,160};
        System.out.println(threeSum.threeSum(nums));
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int a =0, b=1, c=nums.length-1;
        Set<List<Integer>> threeSums = new HashSet<>();
        while(b<nums.length-1){
            while(b<c) {
                int sum = nums[a]+ nums[b]+ nums[c];
                if(sum == 0) {
                    Integer[] intArray = new Integer[] {nums[a], nums[b], nums[c]};
                    threeSums.add(Arrays.asList(intArray));
                    b++;
                    c--;
                } else if(sum < 0) {
                    b++;
                } else {
                    c--;
                }

            }

            a++; b=a+1;
            c=nums.length-1;
        }
        return new ArrayList<>(threeSums);
    }
}
