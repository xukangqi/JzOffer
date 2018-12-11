public class Solution{

    public void Print(int n){
       char[] chars=new char[n];
       for(int i=0;i<n;i++){
           chars[i]='0';
       }
       for(int i=0;i<10;i++){
           chars[0]=chars[0]+i;
           getResult(chars, n, 1);
       }
    }
    public void getResult(char[] chars,int length,int index){
       if(index==length){
           printResult(chars, length);
           return ;
       }else{
        for(int i=0;i<10;i++){
            chars[index]=chars[index]+i;
            getResult(chars, length, index+1);
        }
       }
    }
    public void printResult(char[] chars,int length){
         int i=0;
         while(chars[i]==0){
             i++;
         }
         StringBuffer stringBuffer=new StringBuffer();
         for(;i<length;i++){
           stringBuffer.append(chars[i]);
         }
         System.out.println(stringBuffer.toString());
    }
}