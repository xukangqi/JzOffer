public class Solution {
    public double Power(double base, int exponent) {
        boolean flag=false;
        if(exponent<0){
           flag=true;
           exponent=-exponent;
        }
        double result=1.0;
        //  for(int i=0;i<exponent;i++){
        //       result*=base;
        //  }
       result=power(base, exponent);
         if(flag){
             result=1/result;
         }
        return result;
  }
   public double power(double base, int exponent){
      if(exponent==0){
          return 1;
      }
      if(exponent==1){
          return base;
      }
      double result=power(base, exponent>>1);
      result*=result;
      if((exponent&1)==1){
         result*=base;
      }
      return result; 
   }
}