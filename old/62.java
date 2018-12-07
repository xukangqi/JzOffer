import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
    // public int LastRemaining_Solution(int n, int m) {
    //     if(n==0){
    //         return -1;
    //     }
    //     ArrayList<Integer> arraylist=new ArrayList<>();
    //     for(int i=0;i<n;i++){
    //         arraylist.add(i);
    //     }
    //     int k=0;
    //     while(arraylist.size()!=1){
    //         k-=1;
    //        for(int i=0;i<m;i++){
    //           k++;
    //           if(k==arraylist.size()){
    //               k=0;
    //           }
    //        }
    //        arraylist.remove(k);
    //     }
    //     return arraylist.get(0);
    // }

    int LastRemaining_Solution(int n, int m) {
        if (m == 0 || n == 0) {
            return -1;
        }
        ArrayList<Integer> data = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            data.add(i);
        }
        int index = -1;
        while (data.size() > 1) {
            index = (index + m) % data.size();
            data.remove(index);
            index--;
        }
        return data.get(0);
    }
}