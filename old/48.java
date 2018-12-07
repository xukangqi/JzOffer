public class Solution {

    public int getMaxLengthString(String value) {
        char[] chars = value.toCharArray();
        int[] count = new int[26];
        int maxlength = 0;
        int current = 0;
        for (int i = 0; i < count.length; i++) {
            count[i] = -1;
        }
        for (int i = 0; i < chars.length; i++) {
            int preindex = count[chars[i] - 'a'];
            //要么之前没出现过，要么之前出现过的不记在本次里面
            if (preindex < 0 || i - preindex > current) {
                current++;
            } else {
                if (current > maxlength) {
                    maxlength = current;
                    current = i - preindex;
                }
            }
            count[chars[i] - 'a'] = i;
        }
        if (current > maxlength) {
            maxlength = current;
        }
        return maxlength;
    }
}