import java.util.ArrayList;
/**
public class TreeNode {
int val = 0;
TreeNode left = null;
TreeNode right = null;

public TreeNode(int val) {
this.val = val;

}

}
*/
public class Solution {
    private ArrayList < ArrayList < Integer >> arrayList;
    public ArrayList < ArrayList < Integer >> FindPath(TreeNode root, int target) {
        arrayList = new ArrayList < > ();
        ArrayList < Integer > temp = new ArrayList < > ();
        if (root == null) {
            return arrayList;
        }
       
            find(root, target, temp);
            return arrayList;
    }

    public void find(TreeNode root, int target, ArrayList < Integer > temp) {
        if (root.val == target) {
            if (root.left == null && root.right == null) {
                temp.add(root.val);
                arrayList.add(copy(temp));
                temp.remove(temp.size()-1);
            } else {
                return;
            }
        } else if (root.val < target) {
            temp.add(root.val);
            if (root.left != null) {
                find(root.left, target - root.val, temp);
            }
            if (root.right != null) {
                find(root.right, target - root.val, temp);
            }
            temp.remove(temp.size()-1);
        } else {
            return;
        }
    }

    public ArrayList<Integer> copy(ArrayList<Integer> array){
        ArrayList<Integer> temp=new ArrayList<>();
        for(int i=0;i<array.size();i++){
            temp.add(array.get(i));
        }
        return temp;
    }
}