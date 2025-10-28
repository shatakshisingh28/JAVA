import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null)
            return true;
        if (p == null || q == null)
            return false;

        return (p.val == q.val)
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}

public class Main {
    static Scanner sc = new Scanner(System.in);

    // Function to build the tree using user input
    static TreeNode buildTree(String position) {
        System.out.print("Enter value for " + position + " node (-1 for no node): ");
        int val = sc.nextInt();

        if (val == -1)
            return null;

        TreeNode node = new TreeNode(val);
        node.left = buildTree("left child of " + val);
        node.right = buildTree("right child of " + val);

        return node;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println("🌳 Build first tree:");
        TreeNode root1 = buildTree("root");

        System.out.println("\n🌲 Build second tree:");
        TreeNode root2 = buildTree("root");

        if (sol.isSameTree(root1, root2))
            System.out.println("\n✅ Both trees are IDENTICAL!");
        else
            System.out.println("\n❌ Trees are DIFFERENT!");
    }
}
