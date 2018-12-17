import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    public ArrayList<String> arrayList;
    public ArrayList<String> Permutation(String str) {
        arrayList=new ArrayList<>();
        find(str.toCharArray(), 0);
        //要sort一下
        Collections.sort(arrayList);
        return arrayList;
    }
    public void find(char[] chars,int index){
        if(index==chars.length-1){
            String str=new String(chars);
            if(!arrayList.contains(str)){
                arrayList.add(str);
            }            
        }
        for(int i=index;i<chars.length;i++){
            swap(chars, index,i);
            find(chars,index+1);
            swap(chars, index,i);
        }
    }

    public void swap(char[] chars,int start,int end){
        char temp=chars[start];
        chars[start]=chars[end];
        chars[end]=temp;
    }
}