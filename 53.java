// public class Solution {
//     public int GetNumberOfK(int [] array , int k) {
//         int index=0;
//        while(index<array.length&&array[index]!=k){
//            index++;
//        }
//        if(index==array.length){
//            return 0;
//        }
//        int count=0;
//        for(int i=index;i<array.length;i++){
//            if(array[i]!=k){
//                break;
//            }else{
//                count++;
//            }
//        }
//        return count;
//     }
// }

public class Solution {
    public int GetNumberOfK(int[] array, int k) {
        if (array == null||array.length==0) {
            return 0;
        } else {
            boolean flag=false;
            int low = 0;
            int high = array.length - 1;
            int mink = 0;
            while (low <= high) {
                int mid = (high + low) / 2;
                if (array[mid] > k) {
                    high = mid - 1;
                } else if (array[mid] < k) {
                    low = mid + 1;
                } else {
                    if ((mid>=1&&array[mid - 1] != k)||mid==0) {
                        mink = mid;
                        break;
                    } else {
                        high = mid - 1;                      
                    }
                }
                if(low>high){
                    flag=true;
                }
            }
            int maxk = 0;
            low = 0;
            high = array.length - 1;
            while (low <= high) {
                int mid = (high + low) / 2;
                if (array[mid] > k) {
                    high = mid - 1;
                } else if (array[mid] < k) {
                    low = mid + 1;
                } else {
                    if ((mid<array.length-1&&array[mid + 1] != k)||mid==array.length-1) {
                        maxk=mid;
                        break;
                    } else {
                        low=mid+1;
                    }
                }
                if(low>high){
                    flag=true;
                }
            }
            if(flag){
                return 0;
            }else{
                return maxk-mink+1;
            }
        }
    }
}