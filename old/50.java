import java.util.HashMap;

public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str==null||str==""){
            return -1;
        }
        HashMap<Character,Integer> hashMap=new  HashMap<>();
        char[] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            if(hashMap.containsKey(chars[i])){
                hashMap.put(chars[i], hashMap.get(chars[i])+1);
            }else{
                hashMap.put(chars[i], 1);
            }
        }
        for(int i=0;i<chars.length;i++){
           if(hashMap.get(chars[i])==1){
               return i;
           }
        }
        return -1;

    }
}