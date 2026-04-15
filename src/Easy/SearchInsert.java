package Easy;

public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = {1, 3};
        int target = 3;
        int index =0;
        int left = 0;
        int right = nums.length - 1;
        if(nums[0] >= target){
            index =0;

        }else if (nums[right]< target){
            index = nums.length;
        }else if(nums[right] == target){
            index = nums.length-1;
        }


        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            }
            else if(mid ==0 && nums[mid] > target){
                index = 0;
                break;
            }else if (mid == nums.length-1){
                index = nums.length -1;
                break;
            }else if(nums[mid]>target && nums[mid-1]< target){
                index = mid;
                break;
            }else if (nums[mid]< target && nums[mid+1] > target){
                index = mid+1;
                break;
            }else if(nums[mid]< target){
                left = mid;
            }else {
                right = mid;
            }

        }
        System.out.println(index);
    }
}
