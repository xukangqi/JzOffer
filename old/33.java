public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==1){
            return true;
        }
        if(sequence.length==0){
            return false;
        }
        return find(sequence,0,sequence.length-1);
    } 
    public boolean find(int [] sequence,int start,int end) {
        if(end==start||start>end){
            return true;
        }else{
            int root=sequence[end];
            int i=start;
            for(i=start;i<end;i++){
                if(sequence[i]>root){
                    break;
                }
            } 
            for(int j=i;j<end;j++){
                if(sequence[j]<root){
                    return false;
                }
            } 
            return find(sequence,start,i-1)&&find(sequence,i,end-1);
        }
    } 
}