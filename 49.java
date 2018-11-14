public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index <= 0) {
            return 0;
        }
        int[] array = new int[index];
        array[0] = 1;
        int nextindex = 1;
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        while (nextindex < index) {
            int min = getMin(array[index2] * 2, array[index3] * 3, array[index5] * 5);
            array[nextindex] = min;
            while (array[index2] * 2 <= min) {
                index2++;
            }
            while (array[index3] * 3 <= min) {
                index3++;
            }
            while (array[index5] * 5 <= min) {
                index5++;
            }
            nextindex++;
        }
        return array[index-1];
    }
    int getMin(int a, int b, int c) {
        int min = a > b ? b : a;
        min = min > c ? c : min;
        return min;
    }
}