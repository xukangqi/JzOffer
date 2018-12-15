import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

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
    public ArrayList < ArrayList < Integer >> arrayLists;
    public ArrayList < ArrayList < Integer >> FindPath(TreeNode root, int target) {

        arrayLists = new ArrayList < > ();
        if (root == null || target == 0) {
            return arrayLists;
        }
        ArrayList < Integer > arrayList =new ArrayList<>();
        find(root, target, arrayList);
        arrayLists.sort(new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o2.size()-o1.size();
            }
        });
        return arrayLists;
    }

    public void find(TreeNode root, int target, ArrayList < Integer > arrayList) {
        if (root.val > target) {
            return;
        }
        if (root.val == target&&root.left == null && root.right == null) {
            arrayList.add(root.val);
            ArrayList < Integer > array = new ArrayList < > ();
            for (int i = 0; i < arrayList.size(); i++) {
                array.add(arrayList.get(i));
            }
            arrayLists.add(array);
            arrayList.remove(arrayList.size()-1);
            return;
        } else{
            if (root.left == null && root.right == null) {
                return;
            }
            if(root.val == target){
                return ;
            }
            arrayList.add(root.val);
            if (root.left != null) {
                find(root.left, target - root.val, arrayList);
            }
            if (root.right != null) {
                find(root.right, target - root.val, arrayList);
            }
            arrayList.remove(arrayList.size()-1);
        }
    }
}

