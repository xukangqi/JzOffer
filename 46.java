import java.util.*;


public class Solution {
    public int calculateTimes(int number) {
        String string=String.valueOf(number);
    return calculate(string);
    }

    public int calculate(String string){
      int[] counts=new int[string.length()];
      int len=string.length();
      for(int i=len-1;i>=0;i--){
        int count=0;
         if(i==len-1){
           count=1;
         }else{
           count=counts[i+1];
         }
         if(i!=len-1){
             int value=Integer.parseInt(string.subSequence(i, i+1).toString());
             if(value>=10&&value<=25){
               if(i<len-2){
                 count+=counts[i+2];
               }else{
                count++;
               }
             }
         }
         counts[i]=count;
      }
      return counts[0];
    }
}