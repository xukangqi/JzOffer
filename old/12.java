public class Solution {
    //没有解决
    public boolean[] visited;
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
            visited=new boolean[matrix.length];
            int temp=0;
            for(int i=0;i<matrix.length;i++){
                if(str[0]==matrix[i]){
                    visited[i]=true;
                    if(find(matrix, rows, cols, str,i/cols, i%cols,1)){
                        return true;
                    }
                    visited[i]=false;
                }
            }
            return false;
    }
    public boolean find(char[] matrix, int rows, int cols, char[] str,int i,int j,int count){
        if(count==str.length){
            return true;
        }
        int temp=0;
        if(judge(rows, cols, i-1, j)&&str[count]==matrix[(i-1)*cols+j]){
            visited[(i-1)*cols+j]=true;
            if(find(matrix, rows, cols, str, i-1, j, count+1)){
                return true;
            }
            visited[(i-1)*cols+j]=false;
        }
        if(judge(rows, cols, i+1, j)&&str[count]==matrix[(i+1)*cols+j]){
            visited[(i+1)*cols+j]=true;
            if(find(matrix, rows, cols, str, i+1, j, count+1)){
                return true;
            }
            visited[(i+1)*cols+j]=false;
        }
        if(judge(rows, cols, i, j-1)&&str[count]==matrix[i*cols+j-1]){
            visited[i*cols+j-1]=true;
            if(find(matrix, rows, cols, str, i, j-1, count+1)){
                return true;
            }
            visited[i*cols+j-1]=false;
        }
        if(judge(rows, cols, i, j+1)&&str[count]==matrix[i*cols+j+1]){
            visited[i*cols+j]=true;
            if(find(matrix, rows, cols, str, i, j+1, count+1)){
                return true;
            }
            visited[i*cols+j+1]=false;
        }
        return false;
    }

    public boolean judge(int rows, int cols,int i,int j){
        if(i<0||j<0) return false;
        if(i>=rows||j>=cols) return false;
        if(visited[i*cols+j]==true) return false;
        return true;
    }




}