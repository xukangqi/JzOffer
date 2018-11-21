public class Solution {
    public String ReverseSentence(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] string = str.toCharArray();
        reverse(string, 0, string.length - 1);
        int start = 0;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == ' ') {
                reverse(string, start, i - 1);
                start = i + 1;java
            }
        }
        if (string[string.length - 1] != ' ') {
            reverse(string, start, string.length - 1);
        }
        return new String(string);
    }
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] string = str.toCharArray();
        reverse(string, 0, n-1);
        reverse(string, n, string.length - 1);
        reverse(string, 0,string.length - 1);
        return new String(string);
    }
    public void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }
}