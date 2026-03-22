package practice.dsa.treesAndGraphs;

public class LowestCommonAncestor {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        TreeNode p = root.left; // Node with value 2
        TreeNode q = root.right; // Node with value 3
        System.out.println(lowestCommonAncestor(root, p, q).val); // Output: 1
    }

    private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       if(root == null || root == p || root == q)
           return root;

       TreeNode leftLCA = lowestCommonAncestor(root.left,p,q);
       TreeNode rightLCA = lowestCommonAncestor(root.right,p,q);

       if(leftLCA != null && rightLCA !=null)
           return root;

       return leftLCA == null ? rightLCA : leftLCA;
    }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val=val;
    }
}
