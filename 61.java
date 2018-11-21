import java.util.Arrays;

public class Solution {
    public boolean isContinuous(int [] numbers) {
       if(numbers==null||numbers.length<1){
           return false;
       }
       Arrays.sort(numbers);
       int number=0;
       int i;
       for(i=0;i<numbers.length;i++){
           if(numbers[i]==0){
              number++;
           }else{
               break;
           }
       }
       int pre=numbers[i];
       int need=0;
       boolean flag=true;
       for(i=i+1;i<numbers.length;i++){
           if(numbers[i]-pre==1){
               ;
           }else if(numbers[i]==pre){
              flag=false;
           }else{
            need+=numbers[i]-pre-1;
           }
           pre=numbers[i];
       }
       if(flag==false){
           return false;
       }
       if(need<=number){
           return true;
       }else{
           return false;
       }

    }
}