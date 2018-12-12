
public class Solution {
    public void reOrderArray(int [] array) {

        // for (int i = 0; i < array.length;i++)
        // {
        //     for (int j = array.length - 1; j>i;j--)
        //     {
        //         if (array[j] % 2 == 1 && array[j - 1]%2 == 0) //前偶后奇交换
        //         {
        //             swap(array[j], array[j-1]);
        //         }
        //     }
        // }
        if(array==null||array.length==1||array.length==0){
            return;
        }
        int i=0;
        int j=i+1;
        while(i<array.length&&j<array.length){
            if(array[i]%2==0){
                 while(j<array.length&&array[j]%2==0){
                  j++;
                 }
                 if(j==array.length){
                     break;
                 }else{
                   swapInt(array, i, j);
                   i++;
                   j++;
                 }
            }else{
                i++;
                j++;
            }
        }
    }

    public void swapInt(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}