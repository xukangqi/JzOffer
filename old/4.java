public class Solution {
   
    public boolean Find(int target, int [][] array) {
      int weight=array[0].length;
      int height=array.length;
      int i=height-1;
      int j=0;
      while(i>=0&&j<weight){
          if(array[i][j]>target){    
                i--;
          }else if(array[i][j]<target){
              j++;
          }else if(array[i][j]==target){
              return true;
          }
      }
      return false;
  

    }
}