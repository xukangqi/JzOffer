public class Solution {
    public static boolean flag;

    public static int StrToInt(String str) {
        flag = false;
        // 判断输入是否合法
        if (str == null || str.trim().equals("")) {
            flag = true;
            return 0;
        }
        // symbol=0,说明该数为正数;symbol=1，该数为负数;start用来区分第一位是否为符号位
        int symbol = 0;
        int start = 0;
        char[] chars = str.trim().toCharArray();
        if (chars[0] == '+') {
            start = 1;
        } else if (chars[0] == '-') {
            start = 1;
            symbol = 1;
        }
        int result = 0;
        for (int i = start; i < chars.length; i++) {
            if (chars[i] > '9' || chars[i] < '0') {
                flag = true;
                return 0;
            }
            int sum = result * 10 + (int) (chars[i] - '0');

            if ((sum - (int) (chars[i] - '0')) / 10 != result) {// 溢出？？
                flag = true;
                return 0;
            }

            result = result * 10 + (int) (chars[i] - '0');
            /*
             * 本人认为java热门第一判断是否溢出是错误的，举个反例 当输入为value=2147483648时，在计算机内部的表示应该是-2147483648
             * 显然value>Integer.MAX_VALUE是不成立的
             */
        }
        // 注意：java中-1的n次方不能用：(-1)^n .'^'异或运算
        // 注意，当value=-2147483648时，value=-value
        result = (int) Math.pow(-1, symbol) * result;
        return result;
    }

}

public class Solution {
    public int[] x = new int[] { 0, 0, 1, -1 };
    public int[] y = new int[] { 1, -1, 0, 0 };
    public boolean[] visited;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if(str==null||str.length==0){
            return false;
        }
        visited = new boolean[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            visited[i] = false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == str[0]) {
                if (find(matrix, rows, cols, str,i/cols,i%cols,0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean find(char[] matrix, int rows, int cols, char[] str, int i, int j, int index) {
        if (index == str.length) {
            return true;
        }
        if (matrix[i * cols + j] == str[index]) {
            visited[i * cols + j]=true;
            for (int k = 0; k < 4; k++) {
                if (judge(rows, cols, i + x[k], j + y[k])&&visited[(i+x[k])*cols+j+y[k]]==false) {
                    if (find(matrix, rows, cols, str, i + x[k], j + y[k], index + 1)) {
                        return true;
                    }
                }
            }
            visited[i * cols + j]=false;
            return false;
        } else {
            return false;
        }
    }

    public boolean judge(int rows, int cols, int i, int j) {
        if (i < 0 || i >= rows) {
            return false;
        }
        if (j < 0 || j >= cols) {
            return false;
        }
        return true;
    }
}