public class Solution {
    public int calculatePosition(int n) {
        int index = 0;
        int nowdigit = 1;
        while (true) {
            int current = digit(nowdigit);
            if (n > current) {
                n -= current;
                nowdigit++;
            } else {
                break;
            }
        }
        index=n/nowdigit;
        int value=n%nowdigit;
        int count = 1;
        for(int i=0;i<nowdigit-1;i++){
            count*=10;
        }
        count+=index;
        char ch=String.valueOf(count).charAt(value);
         return ch-'0';
    }

    public int digit(int n) {
        int count = 1;
        for (int i = 0; i < n - 1; i++) {
            count *= 10;
        }
        count = count * 9 * n;
        return count;
    }
}