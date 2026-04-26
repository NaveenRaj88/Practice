package Easy;

public class ConvertSortedArraytoBinarySearchTree {

    public static void main(String[] args) {
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = sortedArrayToBST(nums,0, nums.length-1);
        System.out.println(root.val);
    }

    public static TreeNode sortedArrayToBST(int[] nums, int left, int right) {
        if(left > right){
            return null;
        }
            int mid = left + (right-left)/2;
            TreeNode node = new TreeNode(nums[mid]);
            node.left = sortedArrayToBST(nums, left, mid-1);
            node.right = sortedArrayToBST(nums, mid+1, right);
            return node;
    }



}
