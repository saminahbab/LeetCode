import java.util.*;

@SuppressWarnings("Duplicates")
public class BinaryTreeLevelOrderTraversal {

        class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
     }

    // https://leetcode.com/problems/binary-tree-level-order-traversal/

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if(root == null){ return null;}

        Queue<TreeNode> first = new LinkedList<>();
        Queue<TreeNode> second = new LinkedList<>();

        List<Integer> root_list = Arrays.asList(root.val);

        result.add(root_list);

        //there may be null values that we must deal with.
        first.add(root.left);
        first.add(root.right);


        while(!first.isEmpty() || !second.isEmpty()){

            if(!first.isEmpty()){

                List<Integer> current_level = new ArrayList<>();

                while(!first.isEmpty()){
                    TreeNode current_node = first.remove();

                    if(current_node!=null){
                        current_level.add(current_node.val);
                        second.add(current_node.left);
                        second.add(current_node.right);
                    }

                }

                // By this point the first level of the BFS should be done and the queue should be empty.
                // Time to move on to second
                if(!current_level.isEmpty()){result.add(current_level);}

            }

            if(!second.isEmpty()){

                List<Integer> current_level = new ArrayList<>();

                while(!second.isEmpty()){

                    TreeNode current_node = second.remove();

                    if(current_node!=null){

                        current_level.add(current_node.val);
                        first.add(current_node.left);
                        first.add(current_node.right);

                    }

                }

                if(!current_level.isEmpty()){result.add(current_level);}
            }
        }

        return result;


    }

}
