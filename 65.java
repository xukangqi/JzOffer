public class Solution {
    public int Add(int num1,int num2) {
        while (num2!=0) {
            int temp = num1^num2;//和
            num2 = (num1&num2)<<1;//进位，迟早会没有进位的
            num1 = temp;//现在就是和跟进位做加法
        }
        return num1;

    }
}