public class Solution {
    public int GetNumberOfK(int[] array, int k) {
        int start = 0;
        int end = array.length - 1;
        int first = 0;
        int last=0;
        boolean flag=false;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] > k) {
                end = middle - 1;
            } else if (array[middle] < k) {
                start = middle + 1;
            } else {
                flag=true;
                if (middle == 0) {
                    first = middle;
                    break;
                }
                if (array[middle - 1] != k) {
                    first = middle;
                    break;
                } else {
                    end = middle-1 ;
                }
            }
        }
        if(!flag){
            return 0;
        }
        start = 0;
        end = array.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] > k) {
                end = middle - 1;
            } else if (array[middle] < k) {
                start = middle + 1;
            } else {
                if(middle==array.length-1){
                    last=middle;
                    break;
                }
                if (array[middle + 1] != k) {
                    last = middle;
                    break;
                } else {
                    start=middle+1;
                }
            }
        }
        return last-first+1;
    }
}