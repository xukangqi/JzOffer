import java.util.*;
public class Solution {
    private int len;
    private  boolean[] visit;
    public ArrayList<String> result;
    public ArrayList<String> Permutation(String str) {
        len=str.length();
        result=new ArrayList<>();
        if(str.length()==0){
            return  result;
        }
        result.add(str);
        if(str.length()==1){
            return result;
        }
       find(str.toCharArray(), 0);
       Collections.sort(result);
       return result;
    }
    public void find(char[] str,int index){
        if(index==str.length-1){
            String temp=new String(str);
            if(!result.contains(temp)){
                result.add(temp);
            }
        }else{
            for(int i=index;i<str.length;i++){
                //自己不变开始
                swap(str,index,i);
                find(str,index+1);
                swap(str,index,i);
            }
        }
       
    }
    public void swap(char[] str,int a,int b){
        char temp=str[a];
        str[a]=str[b];
        str[b]=temp;
    }
}