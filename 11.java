import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int[] array) {
        int i = 0;
        int j = array.length - 1;
        int middle = 0;
        while (array[i] >= array[j]) {
            if (j - i == 1) {
                return array[j];
            }
            middle = (i + j) / 2;
            if (array[middle] >= array[i]) {
                i = middle;
            } else if (array[middle] <= array[j]) {
                j = middle;
            }
        }
        return array[middle];
    }
}