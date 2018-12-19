import java.util.*;


public class Solution {
    public String PrintMinNumber(int [] numbers) {
        String[] strings=new String[numbers.length];
        for(int i=0;i<numbers.length;i++){
            strings[i]=String.valueOf(numbers[i]) ;
        }
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1+o2)-Integer.parseInt(o2+o1);
            }
        });
        String result="";
        for(int i=0;i<numbers.length;i++){
            result=result+strings[i];
        }
        return  result;
    }
}