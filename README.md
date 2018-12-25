# JzOffer
剑指offer java练习 还在完善中
## 知识点
由于计算机中double或者float类型的精度问题，差距小于10的-7方都能视为相等<br>
Collections.sort 对实现list接口的排序<br>
Arrays.sort 对数组排序<br>
String.valueof 其他类型转字符串<br>
看看堆的代码怎么写<br>
二分查找正常代码
```java
        while (start <= end) {
            int middle = (start + end) / 2;
            if (array[middle] > k) {
                end = middle - 1;
            } else if (array[middle] < k) {
                start = middle + 1;
            } else {
                return true;
            }
        }
```
### 树中的两个节点找公共父节点
二叉搜索树没什么好说的<br>
普通的二叉树如果有指向父节点的指针的话，可以变成两个链表找公共节点的问题<br>
普通的树话可以保存根到节点的路径，最后转化为第二种情况
## 重点关注
11,18
## 不会
19,29,43,48,51
## 3
注意结束的条件
方便起见，也可以构造辅助的数组或者hashset
## 4
从左上角开始查找<br>
比目标数字大，往左边走<br>
比目标数字小，往下走<br>
注意不要先走一边，这样可能会有问题
## 5
传统解法存在数组扩容的问题，会导致大量的元素移动
可以考虑先统计数组中空格数量，确认扩容后的数组大小并分配空间
## 8
判断自己有没有右子，有的话找右子的最左边
没有的话往上找，自己是左子的话就输出父，右子的话接着网上
## 15java
注意用位运算解题
```java
 public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }
```
## 17
采用全排列的方法比采用数学加法要好
## 18
重点，比较适合面试 有一种比较简洁的方法，不需要保存这么多指针
## 20
注意各类判别条件
尤其是指数
e表示的话前面没数字不行
后面没整数也不行
## 22
启发，如果求链表的中间节点，一个指针走一步，一个指针走两步
## 23
分成三步
两个指针一个快，一个慢，如果相遇说明有环，并且相遇的节点在环里面<br>
从找到的环里面的节点出发，再次到达这个节点，从而得出环的节点数量<br>
重新开始，一个指针先走环的节点数量的步数，一个节点正常走，两个相遇就是环的入口<br>
讲道理还不如用hashmap统计一下，一个节点出现第二次说明就是环的入口
## 24
翻转链表记熟练
## 28
判断二叉树是否对称<br>
设置两个指针，按照前序遍历，一个先右后左，一个反过来
## 30
用两个栈实现最小数栈java

## 32
queue 用LinkedList实现,删除是poll或者remove<br>
分层打印的话多一个参数保存当前层剩余节点，一个参数保存下一层节点

## 34
二叉树数值有重复，删除时要注意<br>
注意java比较器写法,如下o1在前，o2在后，如果返回为正数则交换，否则不交换
```java
arrayLists.sort(new Comparator<ArrayList<Integer>>() {
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o2.size()-o1.size();
            }
});
```

## 35
注意另外一种解法<br>
将复制的节点查到原节点的后面，最后将复制节点统一取出来

## 37
不知道为什么层序不可以

## 38
注意如何求全排列
```java
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
```
## 40
java自带的PriorityQueue 为小根堆，如果要改成大根堆的话需要操作一下<br>
堆的代码要看看java<br>
书上还有个用快排思想做的，也不错，但是出来的数组不是排好序的
## 42
逻辑要弄清楚<br>
如果前面出现了负数，就抛弃掉，以现在的为准，否则则加上<br>
每次加完都要判断最大数

## 46
再做一遍，不太理解为什么换个方向就没事了

## 49
求丑数，感觉代码不太优雅，思路还行

## 56
位运算的极致，需要仔细看看java
## 59
仔细琢磨一下,很难想到
## 60
非传统解法需要了解
## 65
位运算做加法了解一下
## 66
拆成矩阵的思路要清楚