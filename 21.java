public class Solution {
    //剑指offer
    // public void reOrderArray(int [] array) {
    //     if(array.length==0||array.length==1){
    //         return;
    //     }
    //      int i=0;
    //      int j=array.length-1;
    //      while(i<j){
    //          while(i<array.length&&array[i]%2==1) i++;
    //          while(j>=0&&array[j]%2==0) j--;
    //          if(i>j){
    //              break;
    //          }else{
    //              swap(array, i, j);
    //          }
    //      }
    // }
    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    //牛客
    //貌似没什么好的解法，要么开一个数组，要么整体后移
    public void reOrderArray(int[] array) {
        if (array.length == 0 || array.length == 1) {
            return;
        }
        int i = 0;
        int j = 0;
        while (i < array.length && j < array.length) {
            while (i < array.length && array[i] % 2 == 1) i++;
            j = i + 1;
            while (j < array.length && array[j] % 2 == 0) j++;
            if (i < array.length && j < array.length) {
                int tmp = array[j];
                for (int j2 = j - 1; j2 >= i; j2--) {
                    array[j2 + 1] = array[j2];
                }
                array[i++] = tmp;
            }
        }
    }
}