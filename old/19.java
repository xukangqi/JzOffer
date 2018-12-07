// public class Solution {
//     public boolean match(char[] str, char[] pattern)
//     {
//         int i=0,j=0;
//         int len1=str.length;
//         int len2=pattern.length;
//         while(i<len1&&j<len2){
//             if(j+1<len2&&pattern[j+1]=='*'){
//                 while(i<len){
//                     if(str[i]!=pattern[j]){
//                         j+=2;
//                         break;
//                     }else{
//                         i++;
//                     }
//                 }
//             }else{
//                 if(pattern[j]=='.'){
//                     i++;
//                     j++;
//                 }else if(str[i]==pattern[j]){
//                     i++;
//                     j++;
//                 }else{
//                     return false;
//                 }
//             }
//         }
//         if(len1==0){
//            if(len2%2!=0){
//                return false;
//            }else{
//                for(int k=1;k<len2;k+=2){
//                     if(pattern[k]!='*'){
//                         return false;
//                     }
//                }
//                return true;
//            }
//         }else if(len2==0){
//             return false;
//         }
//         return true;
//     }
// }


public class Solution {
    public boolean match(char[] str, char[] pattern) {
    if (str == null || pattern == null) {
        return false;
    }
    int strIndex = 0;
    int patternIndex = 0;
    return matchCore(str, strIndex, pattern, patternIndex);
}
  
public boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
    //有效性检验：str到尾，pattern到尾，匹配成功
    if (strIndex == str.length && patternIndex == pattern.length) {
        return true;
    }
    //pattern先到尾，匹配失败
    if (strIndex != str.length && patternIndex == pattern.length) {
        return false;
    }
    //模式第2个是*，且字符串第1个跟模式第1个匹配,分3种匹配模式；如不匹配，模式后移2位
    if (patternIndex + 1 < pattern.length && pattern[patternIndex + 1] == '*') {
        //如果有匹配上，就是.或者完全一致
        if ((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex] == '.' && strIndex != str.length)) {
            //移不移随便
            return matchCore(str, strIndex, pattern, patternIndex + 2)//模式后移2，视为x*匹配0个字符
                    || matchCore(str, strIndex + 1, pattern, patternIndex + 2)//视为模式匹配1个字符
                    || matchCore(str, strIndex + 1, pattern, patternIndex);//*匹配1个，再匹配str中的下一个
        } else {
            return matchCore(str, strIndex, pattern, patternIndex + 2);
        }
    }
    //模式第2个不是*，且字符串第1个跟模式第1个匹配，则都后移1位，否则直接返回false
    if ((strIndex != str.length && pattern[patternIndex] == str[strIndex]) || (pattern[patternIndex] == '.' && strIndex != str.length)) {
        return matchCore(str, strIndex + 1, pattern, patternIndex + 1);
    }
    return false;
    }
}