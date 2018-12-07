public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate2(int numbers[], int length, int[] duplication) {

        for (int i = 0; i < length; i++) {
            if (numbers[i] < 0 || numbers[i] > length - 1) {
                return false;
            }
        }

        for (int i = 0; i < length;) {
            if (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                swap(numbers, i, numbers[i]);
            } else {
                i++;
            }
        }
        return false;
    }
    public void swap(int numbers[], int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }

    public boolean duplicate(int numbers[], int length, int[] duplication) {

        for (int i = 0; i < length; i++love) {
            if (numbers[i] < 0 || numbers[i] > length - 1) {
                return false;
            }
        }
        int start = 1;
        int end = length - 1;
        while (end >= start) {
            int middle = (start + end) >> 1;
            if (end == start) {
                if (numbers[start] == numbers[end]) {
                    duplication[0] = numbers[start];
                    return true;
                } else {
                    return false;
                }
            }
            if (countnumber(numbers, start, middle) > (midddle - start + 1)) {
                end = midddle;
            } else {
                start = midddle;
            }
        }

        return false;
    }
    public int countnumber(int numbers[], int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                count++;
            }
        }
        return count;
    }
}