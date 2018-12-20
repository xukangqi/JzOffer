public class Solution{
    public int MaxValue(int[][] values,int m, int n) {
        int[] maxvalues=new int[m];
        maxvalues[0]=values[0][0];
        for(int i=1;i<m;i++){
            maxvalues[i]=values[0][i]+maxvalues[i-1];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                if(j==0){
                 maxvalues[j]=maxvalues[j]+values[i][j];
                }else{
                    maxvalues[j]=(maxvalues[j]>maxvalues[j-1]?maxvalues[j]:maxvalues[j-1])++values[i][j];
                }
            }
        }
        return maxvalues[m-1];
    }
}java