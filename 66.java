import java.util.ArrayList;
public class Solution {
    public int[] multiply(int[] A) {
    //     int[] b=new int[A.length];
    //     for(int i=0;i<A.length;i++){
    //         b[i]=1;
    //     } 
    //   for(int i=0;i<A.length;i++){
    //       for(int j=0;j<A.length;j++){
    //           if(i==j){
    //               continue;
    //           }
    //           b[i]*=A[j];
    //       }
    //   }
    //   return b;
    int length = A.length;
    int[] B = new int[length];
    if(length != 0 ){
        B[0] = 1;
        //计算下三角连乘
        for(int i = 1; i < length; i++){
            B[i] = B[i-1] * A[i-1];
        }
        int temp = 1;
        //计算上三角
        for(int j = length-2; j >= 0; j--){
            temp *= A[j+1];
            B[j] *= temp;
        }
    }


    }
}