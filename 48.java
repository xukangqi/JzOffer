public class Solution {
    public int getMaxLen(String str) {
        int currentlen = 0;
        int maxLen = 0;
        int[] position = new int[26];
        for (int i = 0; i < 26; i++) {//用来表示上一个出现的位置
            position[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            int preIndex = position[str.charAt(i) - 1];
            if (preIndex < 0 || i - preIndex > currentlen) {//如果没出现过或者不在本次序列中
                currentlen++;
            } else {
                if (currentlen > maxLen) {
                    maxLen = currentlen;
                }
                currentlen = i - preIndex;//把上一次的去掉，重新开始计数
            }
            position[str.charAt(i) - 1] = i;
        }
        if (currentlen > maxLen) {
            maxLen = currentlen;
        }
        return maxLen;

    }
}