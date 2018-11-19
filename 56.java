//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array==null||array.length==0||array.length==1){
            return ;
        }
        int result=0;
        for(int i=0;i<array.length;i++){
            result^=array[i];
        }
        num1[0]=0;
        num2[0]=0;
        int index=findFirstBit(result);
        for(int i=0;i<array.length;i++){
              if(judge(array[i], index)){
                num1[0]^=array[i];
              }else{
                num2[0]^=array[i];
              }
        }
    }
    public int findFirstBit(int num){
        int index=0;
        while((num&1)==0){
            num=num>>1;
            index++;
        }
        return index;
    }
    public boolean judge(int num,int index){
        num=num>>index;
        if((num&1)>0){
            return true;
        }
        return false;
    }
}
public class Solution {
    public int FindNumsAppearOnce(int [] array,int length) {
        if(array==null||array.length==0){
            return ;
        }
        int[] bit=new int[32]{0};
        for(int i=0;i<length;i++){
             int bitcount=1;
             for(int j=31;j>=0;j--){
                 if(array[i]&bitcount!=0){
                    bit[j]++;
                 }
                 bitcount=bitcount>>1;
             }
        }
        int result=0;
        for(int i=0;i<32;i++){
            result=result<<1;
          if(bit[i]%3!=0){
                result+=bit[i]%3;
          }
        }
        return result;
    }
       
}