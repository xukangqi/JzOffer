

public class Solution {
    private char[] chars;
    private int maxindex=0;
   public void print(int n){
       chars=new char[n];
       for(int i=0;i<n;i++){
           chars[i]='0';
       }
       while(judge()){
           printToConsole();
       }
   }
   public void printToConsole(){
       for(int i=0;i<=maxindex;i++){
           System.out.print(chars[i]);
       }
       System.out.print('\n');
   }
   public boolean judge(){
       int carry=0;
       for(int i=0;i<chars.length;i++){
           if(i>maxindex){
               maxindex=i;
           }
           carry=chars[i]-'0'+carry;
           chars[i]=carry%10;
           carry=carry/10;
           if(carry==0){
               break;
           }
       }
       if(carry!=0){
           return false;
       }else{
           return true;
       }
   }
}