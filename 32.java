import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
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
// public class Solution {
//     public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
//       Queue<TreeNode> queue=new LinkedList<>();
//       ArrayList<Integer> arrayList=new ArrayList<>();
//       if(root==null){
//           return arrayList;
//       }
//       queue.add(root);
//       while(!queue.isEmpty()){
//           TreeNode temp=queue.peek();
//           queue.poll();
//           arrayList.add(temp.val);
//           if(temp.left!=null){
//            queue.add(temp.left);
//           }
//           if(temp.right!=null){
//             queue.add(temp.right);
//           }
//       } 
//       return arrayList;
//     }
// }

// import java.util.ArrayList;


/*
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
// public class Solution {
//     ArrayList < ArrayList < Integer > > Print(TreeNode pRoot) {
//         Queue < TreeNode > queue = new LinkedList < > ();
//         ArrayList < Integer > arrayList = new ArrayList < > ();
//         ArrayList < ArrayList < Integer > > arrayLists = new ArrayList <ArrayList < Integer > > ();
//         if (pRoot == null) {
//             return arrayLists;
//         }
//         queue.add(pRoot);
//         int next = 0;
//         int thislevel = 1;
//         while (!queue.isEmpty()) {
//             TreeNode temp = queue.peek();
//             queue.poll();
//             arrayList.add(temp.val);
//             thislevel--;
//             if (temp.left != null) {
//                 queue.add(temp.left);
//                 next++;
//             }
//             if (temp.right != null) {
//                 queue.add(temp.right);
//                 next++;
//             }
//             if (thislevel == 0) {
//                 arrayLists.add(arrayList);
//                 arrayList = new ArrayList < > ();
//                 thislevel=next;
//                 next=0;
//             }
//         }

//         return arrayLists;
//     }
// }

public class Solution {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        Queue < TreeNode > queue = new LinkedList < > ();
        ArrayList < Integer > arrayList = new ArrayList < > ();
        Stack<Integer> stack=new Stack<>();
        ArrayList < ArrayList < Integer > > arrayLists = new ArrayList <ArrayList < Integer > > ();
        if (pRoot == null) {
            return arrayLists;
        }
        queue.add(pRoot);
        int next = 0;
        int thislevel = 1;
        int nowlevel=0;
        while (!queue.isEmpty()) {
            TreeNode temp = queue.peek();
            queue.poll();
            if(nowlevel%2==0){
                arrayList.add(temp.val);
            }else{
              stack.push(temp.val);
            }
            thislevel--;
            if (temp.left != null) {
                queue.add(temp.left);
                next++;
            }
            if (temp.right != null) {
                queue.add(temp.right);
                next++;
            }
            if (thislevel == 0) {
                if(nowlevel%2==0){
                   ;
                }else{
                  arrayList=new ArrayList < > ();
                  while(!stack.isEmpty()){
                      arrayList.add(stack.pop());
                  }
                }
                arrayLists.add(arrayList);
                arrayList = new ArrayList < > ();
                thislevel=next;
                next=0;
                nowlevel++;
            }
        }

        return arrayLists;
    }
}

