import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView {
    List<Integer> list =new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root==null)
            return list;
        Queue<TreeNode> que =new LinkedList<TreeNode>();
        que.add(root);
        que.add(null);
        while(!que.isEmpty()) {
            TreeNode node =que.poll();
            if(node!=null){
                if(que.peek()==null){
                    list.add(node.val);
                }
                if(node.left!=null){
                    que.add(node.left);
                }
                if(node.right!=null){
                    que.add(node.right);
                }
            }else {
                if(!que.isEmpty()){
                    que.add(null);
                }

            }
        }
        return list;
    }
}
