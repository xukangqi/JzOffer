// public class Solution {
//     public int len;
//     public int result;
//     public int MoreThanHalfNum_Solution(int [] array) {
//         int index=0;
//         len=array.length/2;
//         if(len==0){
//             return 0;
//         }
//         find(1,array.length-1 ,0, array);
//         return result;
//     }
//     public void find(int start,int end,int index,int[] array){
//         if(end>=start||end>=array.length||start>=array.length||index>=array.length){
//             return ;
//         }
//         int i=start;
//         int j=end;
//         while(i<j){
//             while(array[i]<array[index]&&i<j){
//                 i++;
//             }
//             if(i<j){
//                 swap(i,index, array);
//                 index=i;
//             }
//             while(array[j]>array[index]&&i<j){
//                 j--;
//             }
//             if(i<j){
//                 swap(j,index, array);
//                 index=j;
//             }   
//         }
//         if(index==len){
//            result=array[index];
//            return;
//         }else if(index>len){
//             find(1,index-1,0,array);
//         }else{
//             find(index+2,array.length-1,index+1,array);
//         }
//     }
//     public void swap(int i,int j,int[] array){
//         int temp=array[i];
//         array[i]=array[j];
//         array[j]=temp;
//     }
// }

 public class Solution {

     public int MoreThanHalfNum_Solution(int [] array) {
         if(array.length==0){
             return 0;
         }else if(array.length==1){
             return array[0];
         }else{
             int result=array[0];
             int times=1;
             for(int i=1;i<array.length;i++){
                 if(array[i]==result){
                    times++;
                 }else{
                     times--;
                     if(times==0){
                         result=array[i];
                         times=1;
                     }
                 }
             }
             times=0;
             for(int i=0;i<array.length;i++){
                if(array[i]==result){
                   times++;
                }
            }
            if(times*2>array.length){
             return result;                
            }else{
                return 0;
            }
         }
     }
}