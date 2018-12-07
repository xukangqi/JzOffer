public class Solution {
   
    public int getSequence(int n){
        int count=1;
        int index=0;
        int number=0;
        while(true){
            int temp=calculate(count);
            if(n>temp){
                n-=temp;
                count++;
            }else{
                number=n/count;
                index=n%count;
                break;
            }
        }
        int temp=1;
        while(count!=1){
            temp*=10;
            count--;
        }
        temp+=number;
        
        String s=""+temp;
        return s.indexOf(index);
    }

    public int calculate(int current){
        int result=1;
        for(int i=1;i<current;i++){
            result*=10;
        } 
        return current*result*9;
    }

}