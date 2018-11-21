public class Solution {
     public int maxProfit(int[] value){
         if(value==null||value.length<2){
             return 0;
         }
         int min=value[0];
         int max=value[1]-min;
         for(int i=2;i<value.length;i++){
             if(value[i-1]<min){
                 min=value[i-1];
             }
             if(value[i]-min>max){
                 max=value[i]-min;
             }
         }
         return max;
     }

}