package medium;



public class HouseRobberIII {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(1);

        int result = rob(root);
        System.out.println("Maximum amount that can be robbed: " + result);
    }

    public static int rob(TreeNode root){
        return 0;
    }
}
