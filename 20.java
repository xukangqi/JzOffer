public class Solution {
    public boolean isNumeric(char[] str) {
        if (str == null || str.length == 0) {
            return true;
        }
        int start = 0;
        if (str[0] == '+' || str[0] == '-') {
            start++;
        }
        boolean flag = true;
        boolean eflag = false;
        int i = start;
        for (; i < str.length; i++) {
            if (str[i] >= '0' && str[i] <= '9') {
                continue;
            }
            if (str[i] == 'e' || str[i] == 'E') {
                eflag = true;
                i++;
                if (i == str.length) {
                    return false;
                }
                break;
            }
            if (str[i] == '.') {
                i++;
                break;
            }
            flag = false;
            break;
        }
        if (flag == false) {
            return false;
        }
        if (i == str.length) {
            return true;
        }
        if (eflag) {
            if (str[i] == '+' || str[i] == '-') {
                i++;
            }
            for (; i < str.length; i++) {
                if (str[i] >= '0' && str[i] <= '9') {
                    continue;
                }
                return false;
            }
            return true;
        } else {
            for (; i < str.length; i++) {
                if (str[i] >= '0' && str[i] <= '9') {
                    continue;
                }
                if (str[i] == 'e' || str[i] == 'E') {
                    i++;
                    if (i == str.length) {
                        return false;
                    }
                    break;
                }
                return false;
            }
            if (i == str.length) {
                return true;
            }

            if (str[i] == '+' || str[i] == '-') {
                i++;
            }
            for (; i < str.length; i++) {
                if (str[i] >= '0' && str[i] <= '9') {
                    continue;
                }
                return false;
            }
            return true;

        }
    }
}