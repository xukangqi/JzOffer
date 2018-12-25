public class Solution {
    public int maxProfit(int[] array){
        int min=-1;
        int max=0;
       for(int i=0;i<array.length;i++){
           if(array[i]<min||min<0){
               min=array[i];
           }else if(array[i]-min>max){
               max=array[i]-min;
           }
       }
       return max;
    }
}