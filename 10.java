public class Solution {
    public int Fibonacci(int n) {
       int a=0;
       int b=1;
       if(n==0){
           return 0;
       }else if(n==1){
           return 1;
       }else{
           int temp=0;
           for(int i=2;i<=n;i++){
                 temp=a+b;
                 a=b;
                 b=temp;
           }
           return temp;
       }
    }
}

public class Solution {
    public int JumpFloor(int target) {
       if(target==1){
           return 1;
       }else if(target==2){
           return 2;
       }else{
        int temp=0;
        int a=1;
        int b=2;
        for(int i=3;i<=target;i++){
              temp=a+b;
              a=b;
              b=temp;
        }
        return temp;
       }
    }
}