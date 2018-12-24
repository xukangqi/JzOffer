import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> arraylist=new ArrayList<>();
        if(num.length<size||size<1){
            return  arraylist;
        }
        LinkedList<Integer> linkedList=new LinkedList<>();
        for(int i=0;i<size;i++){
            while(!linkedList.isEmpty()&&num[i]>=num[linkedList.getLast()]){//比尾部的数字要大，则移除尾部的数字
                linkedList.removeLast();
            }
            linkedList.add(i);

        }
        for(int i=size;i<num.length;i++){
            arraylist.add(num[linkedList.getFirst()]);//头部的是最大的
            while(!linkedList.isEmpty()&&num[i]>=num[linkedList.getLast()]){//新一轮的滑动窗口新增的数字加入
                linkedList.removeLast();
            }
            if(!linkedList.isEmpty()&&linkedList.getFirst()<=i-size){//在头部的数字窗口已经滑出了
                linkedList.removeFirst();//去掉
            }
            linkedList.add(i);
        }
        arraylist.add(num[linkedList.getFirst()]);
        return  arraylist;
    }
}