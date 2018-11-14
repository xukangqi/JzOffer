import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public String PrintMinNumber(int [] numbers) {
        String[] string=new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            string[i]=numbers[i]+"";
        }
        Arrays.sort(string, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1=o1+o2;
                String s2=o2+o1;
               return  s1.compareTo(s2);
            }java
        });

        String result="";
        for(int i=0;i<string.length;i++){
            result+=string[i];
        }
        return  result;
    }
}