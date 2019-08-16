class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class MinimumDepthBST {

    /*

    Given a binary tree, find its minimum depth.
    The minimum depth is the number of nodes along the
    shortest path from the root node down to the nearest leaf node.
    Note: A leaf is a node with no children.

    0MS SOLUTION
    39MB SPACE


     */
    public static int minDepth(TreeNode root) {

        if(root == null){return 0;}

        int result = 0;

        return depthFirstSearch(root, 0);

    }

    public static int depthFirstSearch(TreeNode node, int depth){

        // the recursive call bottoms out at a leaf node
        if(node.left == null && node.right == null){return 1;}

        else if(node.right == null){return depth + depthFirstSearch(node.left, 1);}
        else if(node.left == null){return depth + depthFirstSearch(node.right, 1);}

        else{
            //return the path that has the largest depth.
            return depth + Math.min(depthFirstSearch(node.left, 1), depthFirstSearch(node.right, 1));
    }

    }

}



