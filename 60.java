public class Solution {
    public int PrintRandomResult(int n) {
      int[][] array=new int[2][n*6+1];
      int flag=0;
      for(int i=0;i<2;i++){
          for(int j=0;j<n*6+1;j++){
              array[i][j]=0;
          }
      }
      for(int i=1;i<=6;i++){
          array[flag][i]=1;
      }
      for(int k=2;k<=n;k++){
          for(int i=0;i<k;i++){
            array[1-flag][i]=0;
          }
          for(int i=k;i<=6*k;i++){
            array[1-flag][i]=0;
            for(int j=1;j<=i&&j<=6;j++){
                array[1-flag][i]+=array[flag][i-j];
            }
           flag=1-flag;
          }
      }

      int i=0;
      int total=1;
      while(i<n){
         total*=6;
         i++;
      }
      
      
    }
}