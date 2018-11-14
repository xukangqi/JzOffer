public class Solution{

    public int maxValue(int[][] values){
        int height=values.length;
        int width=values[0].length;
        //全部统计出来结果就出来了
        // int[][] maxValue=new int[height][width];
        // for(int i=0;i<width;i++){
        //   for(int j=0;j<height;j++){
        //       int up=0;
        //       int left =0;
        //       if(i!=0){
        //           up=maxValue[i-1][j];
        //       }
        //       if(j!=0){
        //          left=maxValue[i][j-1];
        //       }
        //       maxValue[i][j]=up>left?up+values[i][j]:left+values[i][j];
        //     }
        // }
        // return maxValue[height-1][width-1];
         
        int[] maxValue=new int[width];
         for(int i=0;i<width;i++){
          for(int j=0;j<height;j++){
              int up=0;
              int left =0;
              if(i!=0){
                  up=maxValue[j];
              }
              if(j!=0){
                 left=maxValue[j-1];
              }
              maxValue[j]=up>left?up+values[i][j]:left+values[i][j];
            }
        }


    }
}
