
public class Solution {

    public int maxProductLength(int length) {
        if (length < 2) {
            return 0;
        } else if (length == 2) {
            return 1;
        } else if (length == 3) {
            return 2;
        } else {
            int[] product = new int[length + 1];
            product[0] = product[1] = 0;
            product[2] = 1;
            product[3] = 2;
            int max = 0;
            for (int i = 4; i <= length; i++) {
                max = 0;
                for (int j = 1; j <= i / 2; j++) {
                    int temp = product[j] * product[i - j];
                    if (temp > max) {
                        max = temp;
                    }
                }
                product[i] = max;
            }

            return product[length];
        }

    }
}