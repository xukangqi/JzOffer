public class Solution {
    public int InversePairs(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return Inverse(array, copy, 0, array.length - 1);
    }

    public int Inverse(int[] array, int[] copy, int start, int end) {
        if (start == end) {
            copy[start] = array[start];
            return 0;
        } else {
            int len = (end - start) >> 1;
            int left = Inverse(copy, array, start, start + len);
            int right = Inverse(copy, array, start + len + 1, end);

            int i = start + len;
            int j = end;
            int index = end;
            int count = 0;
            while (i >= start && j >= start + len + 1) {
                if (array[i] > array[j]) {
                    copy[index--] = array[i--];
                    count = (count + j - (start + len + 1) + 1) % 1000000007;
                } else {
                    copy[index--] = array[j--];
                }
            }
            while (j >= start + len + 1) {
                copy[index--] = array[j--];

            }
            while (i >= start) {
                copy[index--] = array[i--];

            }
            return (left + right + count) % 1000000007;

        }
    }
}