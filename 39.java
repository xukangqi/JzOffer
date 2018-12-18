public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array.length==0){
            return 0;
        }
        if(array.length==1){
            return array[0];
        }
        int count=1;
        int pre=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]==pre){
                count++;
            }else{
                count--;
                if(count==0){
                    pre=array[i];
                    count=1;
                }
            }
        }
        count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==pre){
                count++;
            }
        }
        if(count>array.length/2){
            return pre;
        }else{
            return 0;
        }
    }
}