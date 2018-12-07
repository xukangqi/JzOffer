public class Solution {
    public boolean Find(int target, int [][] array) {
       if(array==null||array.length==0){
           return false;
       }
       int width=array[0].length;
       int height=array.length;
       int i=0;
       int j=width-1;
       while(i<height&&j>=0){
           if(array[i][j]<target){
                i++;
           }else if(array[i][j]>target){
                j--;
           }else{
               return true;
           }
       }java
       return false;
    }
       
}