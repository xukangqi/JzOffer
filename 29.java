import java.util.ArrayList;
public class Solution {
    public ArrayList < Integer > arrayList;
    public int height;
    public int width;
    public ArrayList < Integer > printMatrix(int[][] matrix) {
        arrayList = new ArrayList < > ();
        if (matrix == null) {
            return arrayList;
        }
        height = matrix.length;
        width = matrix[0].length;
        if(height==0){
            for(int i=0;i<width;i++){
                arrayList.add(matrix[0][i]);
            }
            return arrayList;
        }
        if(width==0){
            for(int i=0;i<height;i++){
                arrayList.add(matrix[i][0]);
            }
            return arrayList;
        }
        int minwidth=0;
        int minheight=0;
        int i=0;
        int j=0;
        while(arrayList.size()!=height*width){
            while(j<width){
                arrayList.add(matrix[i][j++]);
            }
            j--;
            width--;
            minheight++;
            while(i<height){
                arrayList.add(matrix[i++][j]);
            }
            i--;
            height--;
            while(j>=minwidth){
                arrayList.add(matrix[i][--j]);
            }
            j++;
            minwidth++;
            while(i>=minheight){
                arrayList.add(matrix[--i][j]);
            }
            i++;
        }
        return arrayList;
       

    }

}

public class Solution {
    public ArrayList<Integer> printMatrix(int [][] array) {
        ArrayList<Integer> result = new ArrayList<Integer> ();
        if(array.length==0) return result;
        int n = array.length,m = array[0].length;
        if(m==0) return result;
        int layers = (Math.min(n,m)-1)/2+1;//这个是层数
        for(int i=0;i<layers;i++){
            for(int k = i;k<m-i;k++) result.add(array[i][k]);//左至右
            for(int j=i+1;j<n-i;j++) result.add(array[j][m-i-1]);//右上至右下
            for(int k=m-i-2;(k>=i)&&(n-i-1!=i);k--) result.add(array[n-i-1][k]);//右至左
            for(int j=n-i-2;(j>i)&&(m-i-1!=i);j--) result.add(array[j][i]);//左下至左上
        }
        return result;       
    }
}