import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        // if(array.length==0){
        //     return 0;
        // }else if(array.length==1){
        //     return array[0];
        // }else{
        //     int i=0;
        //     int j=1;
        //     int len=array.length;
        //     while(j<len&&array[i]<=array[j]){
        //         i++;
        //         j++;
        //     }
        //     if(j==len){
        //         return array[0];
        //     }else{
        //         return array[j];
        //     }
        // }
        int i=0;
        int j=array.length-1;
        int middle=0;
        while(array[i]>=array[j]){
            if(j-i==1){
                return array[j];
            }
            middle=(i+j)/2;
            if(array[middle]>=array[i]){
                  i=middle;
            }else if(array[middle]<=array[j]){
                j=middle;
            }
        }
        return array[middle];
       
    } 
}  java