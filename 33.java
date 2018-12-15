public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
         if(sequence==null||sequence.length==0){
             return false;
         }
         if(sequence.length==1){
             return true;
         }

         return judge(sequence, 0,sequence.length-1);
    } 

    public boolean judge(int [] sequence,int start,int end){
        if(start>=end){
            return true;
        }
        int val=sequence[end];
        int i=start;
        for(;i<end;i++){
            if(sequence[i]<val){
                continue;
            }else{
                break;
            }
        }
        for(int j=i;j<end;j++){
           if(sequence[j]<val){
               return false;
           }else{
               continue;
           }
        }
        return judge(sequence, start, i-1)&&judge(sequence, i, end-1);
    }
}