import java.util.*;
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    // public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
    //     HashMap<Integer,Integer> hashMap=new HashMap<>();
    //     for(int i=0;i<array.length;i++){
    //         if(hashMap.containsKey(array[i])){
    //              hashMap.remove(array[i]);
    //         }else{
    //               hashMap.put(array[i], 1);
    //         }
    //     }
    //     Set<Integer> set=hashMap.keySet();
    //     Iterator<Integer> iterator=set.iterator();
    //     num1[0]=iterator.next();
    //     num2[0]=iterator.next();
    // }

    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int result=0;
        for(int i=0;i<array.length;i++){
            result^=array[i];
        }
        int index=findIndex(result);
        for(int i=0;i<array.length;i++){
            if(judge(array[i], index)){
                num1[0]^=array[i];
            }else{
                num2[0]^=array[i];
            }
        }

    }

    public int findIndex(int result){
        int index=0;
        while((result&1)==0){
              result>>=1;
              index++;
        }
        return index;
    }

    public boolean judge(int value,int index){
        int temp=value>>index;
     return (temp&1)==1?true:false;
    }
}