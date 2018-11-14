import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static int count;
    public static void main(String[] args){
        Solution solution=new Solution();
        solution.translate(10); //2种:bc(1,0)或k(10)
        solution.translate(125); //3
        solution.translate(12258); //5
    }
    public void translate(int number) {
        count = 0;
        ArrayList < Char > arrayList = new ArrayList < > ();
        while (number / 10 != 0) {
            arrayList.add(number % 10);
            number /= 10;java
        }
        arrayList.add(number);
        // Collections.reverse(arrayList);
        find(arrayList, 0);
        System.out.println(count);

    }

    public void find(ArrayList < Char > arrayList, int index) {
        if (index > arrayList.size() - 1) {
            return;
        }
        if (index == arrayList.size() - 1) {
            count++;
            return;
        }
        if (arrayList.get(index) == '1') {
            find(arrayList, index + 1);
            find(arrayList, index + 2);
        } else if (arrayList.get(index) == '2') {
            if (arrayList.get(index + 1) >= '1' && arrayList.get(index + 1) <= 5) {
                find(arrayList, index + 1);
                find(arrayList, index + 2);
            } else {
                find(arrayList, index + 1);
            }
        }
    }
}

public class NumberToString {
    public static void main(String[] args) {
        System.out.println(getTranslationCount(10)); //2种:bc(1,0)或k(10)
        System.out.println(getTranslationCount(125)); //3
        System.out.println(getTranslationCount(12258)); //5
    }

    private static int getTranslationCount(int number) {
        if (number < 0) return 0; //负数默认可翻译个数为0
        return translationCount(String.valueOf(number));
    }

    private static int translationCount(String number) {
        int length = number.length();
        int[] countRecords = new int[length];
        //只有一个数字，则只有一种翻译方式
        countRecords[length - 1] = 1;
        int count;
        for (int i = length - 2; i >= 0; i--) {
            //f(i+1)
            count = countRecords[i + 1];
            int digit1 = number.charAt(i) - '0';
            int digit2 = number.charAt(i + 1) - '0';
            int connectedNumber = digit1 * 10 + digit2; //拼接两个数字
            //拼接的数字在10~25范围内
            if (connectedNumber >= 10 && connectedNumber <= 25) {
                if (i < length - 2) {
                    //f(i) = f(i+1) + f(i+2)
                    count += countRecords[i + 2];
                } else if (i == length - 2) {
                    count += 1; //拼接的数字只有一种翻译方式
                }
            }
            countRecords[i] = count;
        }
        count = countRecords[0];
        return count;
    }
}