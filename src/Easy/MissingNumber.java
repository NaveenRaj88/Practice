package Easy;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        int result = missingNumber(nums);
        System.out.println("Missing number: " + result);
    }
    public static int missingNumber(int[] nums){
        int n = nums.length;
        int expectedSum = n*(n+1)/2;
        int totalSum =0;
        for(int i=0; i< nums.length; i++){
            totalSum += nums[i];
        }
        return Math.abs(expectedSum- totalSum);
    }

}
