import java.util.ArrayList;
public class Solution {
    public ArrayList < Integer > FindNumbersWithSum(int[] array, int sum) {
        ArrayList < Integer > arraylist = new ArrayList < > ();
        if (array == null || array.length == 0) {
            return arraylist;
        }
        int i = 0;
        int j = array.length - 1;
        int a = 0;
        int b = 0;
        while (i < j) {
            if (array[i] + array[j] > sum) {
                j--;
            } else if (array[i] + array[j] < sum) {
                i++;
            } else {
                if (a == 0 && b == 0) {
                    a = array[i];
                    b = array[j];
                } else {
                    if (array[i] * array[j] < a * b) {
                        a = array[i];
                        b = array[j];
                    }
                }
                i++;
                j--;
            }
        }
        if (a == 0 && b == 0) {
            return arraylist;
        }
        arraylist.add(a);
        arraylist.add(b);
        return arraylist;
    }
}

import java.util.ArrayList;
public class Solution {
    public ArrayList < ArrayList < Integer > > arraylists;
    public ArrayList < ArrayList < Integer > > FindContinuousSequence(int sum) {
        arraylists = new ArrayList < ArrayList < Integer > > ();
        if (sum == 0) {
            return arraylists;
        }
        int start = 1;
        int end = 2;
        int middle=(sum+1)/2;
        int temp=start+end;
        while(start<middle){
            if(temp==sum){
              add(start,end);
            }
            while(temp>sum&&start<middle){
                temp-=start;
                start++;
                if(temp==sum){
                    add(start,end);
                }
            }
            end++;
            temp+=end;
        }
        return arraylists;
    }

    public void add(int start, int end) {
        ArrayList<Integer> arraylist=new ArrayList<>();
        for (int i = start; i <= end; i++) {
           arraylist.add(i);
        }
        arraylists.add(arraylist);
    }
}