public class Solution {
    public boolean[] visited;
    public int movingCount(int threshold, int rows, int cols)
    {
        visited=new boolean[rows*cols];
        if(threshold<0){
            return 0;
        }
       return arrive(threshold, rows, cols, 0, 0);
    }

    public int arrive(int threshold, int rows, int cols,int i,int j){
        int count=1;
        visited[i*cols+j]=true;
        if(judge(threshold, rows, cols, i-1, j))
            count+=arrive(threshold, rows, cols, i-1, j);
        }
        if(judge(threshold, rows, cols, i+1, j)){
            count+=arrive(threshold, rows, cols, i+1, j);
        }
        if(judge(threshold, rows, cols, i, j-1)){
            count+=arrive(threshold, rows, cols, i, j-1);
        }
        if(judge(threshold, rows, cols, i, j+1)){
            count+=arrive(threshold, rows, cols, i, j+1);
        }
        return count;
    }
    public boolean judge(int threshold, int rows, int cols,int i,int j){
        if(i<0||j<0) return false;
        if(i>=rows||j>=cols) return false;
        if(visited[i*cols+j]==true) return false;
        int sum=0;
        while(i/10>0){
            sum+=i%10;
            i=i/10;
        }
        sum+=i;
        while(j/10>0){
            sum+=j%10;
            j=j/10;
        }
        sum+=j;
        if(sum<=threshold){
            return true;
        }else{
            return false;
        }
    }
}
    
