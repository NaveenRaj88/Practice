package Easy;

public class MinimumDepthofBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        if(leftDepth == 0 || rightDepth == 0){
            return leftDepth + rightDepth + 1;
        }

        return Math.min(leftDepth, rightDepth)+1 ;
    }
}
