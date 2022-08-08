package secondary.own;


import java.util.LinkedList;

public class Test623 {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

        public TreeNode addOneRow(TreeNode root, int val, int depth) {
            if (depth==1){
                TreeNode treeNode=new TreeNode(val);
                treeNode.left=root;
                return treeNode;
            }
            int index=1;
            LinkedList<TreeNode> linkedList=new LinkedList();
            LinkedList<TreeNode> list=new LinkedList<>();
            linkedList.add(root);
            while ((depth-index)!=1){
                while (!linkedList.isEmpty()){
                    TreeNode node=linkedList.pop();
                    if (node.left!=null) list.add(node.left);
                    if (node.right!=null) list.add(node.right);
                }
                LinkedList<TreeNode> temp=linkedList;
                linkedList=list;
                list=temp;
                index++;
            }
            while (!linkedList.isEmpty()){
                TreeNode node=linkedList.pop();
                TreeNode newOne=new TreeNode(val);
                TreeNode twoOne=new TreeNode(val);
                newOne.left=node.left;
                twoOne.right=node.right;
                node.left=newOne;
                node.right=twoOne;
            }
            return root;
        }
}
