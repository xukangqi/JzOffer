
public class Solution {
    public int InversePairs(int [] array) {
        if(array==null||array.length==0)
        {
            return 0;
        }
        int[] copy = new int[array.length];
        for(int i=0;i<array.length;i++)
        {
            copy[i] = array[i];
        }
        int count = InversePairsCore(array,copy,0,array.length-1);//数值过大求余
        return count;
         
    }
    private int InversePairsCore(int[] array,int[] copy,int low,int high)
    {
        if(low==high){
            array[low]=copy[low];
            return 0;
        }
        int mid=(low+high)/2;
        int leftcount=InversePairsCore(array,copy,low,mid-1);
        int rightcount=InversePairsCore(array,copy,mid,high);
        int total=(leftcount+rightcount)%1000000007;
        int i=mid-1;
        int j=high;
        int index=high;
        while(i>=low&&j>=mid){       
            if(copy[i]>copy[j]){
               array[index--]=copy[i];
               //有问题
               total=(total+(j-mid+1))%1000000007; 
               i--;
            }else{
               array[index--]=copy[j];
               j--;
            }
        }
        while(i>=low){
            array[index--]=copy[i];
            i--; 
        }
        while(j>=mid){
            array[index--]=copy[j];
            j--;
        }
        return total;
    }
}