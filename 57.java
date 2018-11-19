import java.util.ArrayList;
public class Solution {
    public ArrayList < Integer > FindNumbersWithSum(int[] array, int sum) {
        if (array == null || array.length < 2) {
            return new ArrayList < Integer > ();
        }
        ArrayList < Integer > list = new ArrayList < Integer > ();
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] < sum) {
                i++;
            } else if (array[i] + array[j] > sum) {
                j--;
            } else {
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }
        }
        return list;
    }
}

public class Solution {
    public ArrayList < ArrayList < Integer > > FindContinuousSequence(int sum) {
        ArrayList < ArrayList < Integer > > list = new ArrayList < ArrayList < Integer > > ();
        if (sum < 3) {
            return list;
        }
        int i = 1;
        int j = 2;
        int endpoint = (sum + 1) / 2;
        int temp = i + j;
        while (i < endpoint) {
            if (temp < sum) {
                j++;
                temp += j;
            } else if (temp > sum) {
                temp -= i;
                i++;
            } else {
                ArrayList < Integer > array = new ArrayList < > ();
                for (int k = i; k <= j; k++) {
                    array.add(k);
                }
                list.add(array);
                j++;
                temp += j;
            }
        } 
        return list;
    }
}