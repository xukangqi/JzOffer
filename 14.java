public class Solution {
    public int cut(int lenght) {
        if (lenght == 0) {
            return 0;
        }
        if (lenght == 1) {
            return 1;
        }
        if (lenght == 2) {
            return 1;
        }
        if (lenght == 3) {
            return 2;
        }
        int[] array=new int[lenght+1];
        array[0]=0;
        array[1]=1;
        array[2]=2;
        array[3]=3;
        for(int i=4;i<=lenght;i++){
            int max=0;
            for(int j=1;j<=i/2;j++){
                int temp=array[j]*array[i-j];
                if(temp>max){
                    max=temp;
                }

            }
            array[i]=max;
        }
        return array[lenght];
    }
}