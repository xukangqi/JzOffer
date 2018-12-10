public class Solution {
    public int[] x = {
        1,
        -1,
        0,
        0
    };
    public int[] y = {
        0,
        0,
        1,
        -1
    };
    public boolean findALL(char[][] metrix, String str) {
        //todo 还要判断格子之前有没有进过
        char[] array = str.toCharArray();
        int width = metrix[0].length;
        int height = metrix.length;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                if (find(metrix, array, i, j, 0)) {
                    return true;
                }java
            }
        }

    }
    public boolean find(char[][] metrix, char[] array, int i, int j, int index) {
        if (index == array.length) {
            return true;
        } else {
            for (int k = 0; k < 4; k++) {
                if (judge(metrix, array, i + x[i], j + y[i], index)) {
                    if (find(metrix, array, i + x[i], j + y[i], index + 1)) {
                        return true;
                    }
                }
            }
        }
    }
    public boolean judge(char[][] metrix, char[] array, int i, int j, int index) {
        if (i >= metrix.length || j > metrix[0].length || i < 0 || j < 0) {
            return false;
        }
        if (metrix[i][j] != array[index]) {
            return false;
        }
        return true;

    }
}