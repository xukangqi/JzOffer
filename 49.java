public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if (index == 1) {
            return 1;
        }
        if(index==0){
            return 0;
        }
        int i = 2;
        int[] array = new int[index + 1];
        array[1] = 1;
        int p2 = 1;
        int p3 = 1;
        int p5 = 1;
        int value2=0;
        int value3 =0;
        int value5=0;
        while (i <= index) {
            while((value2=array[p2] * 2)<=array[i-1]){
                p2++;
            }
            while((value3=array[p3] * 3)<=array[i-1]){
                p3++;
            }
            while((value5=array[p5] * 5)<=array[i-1]){
                p5++;
            }

            int minIndex = getMin(value2, value3, value5);
            if (minIndex == 1) {
                array[i] = value2;
                p2++;
            } else if (minIndex == 2) {
                array[i] = value3;
                p3++;
            } else {
                array[i] = value5;
                p5++;
            }
//            System.out.println(i+"  "+array[i]);
            i++;
        }
        return array[index];
    }

    public int getMin(int a, int b, int c) {
        int min = a > b ? b : a;
        min = min > c ? c : min;
        if (min == a) {
            return 1;
        }
        if (min == b) {
            return 2;
        }
        if (min == c) {
            return 3;
        }
        return -1;
    }
}