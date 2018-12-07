
public class Solution {
    public String replaceSpace(StringBuffer str) {
        StringBuffer stringBuffer=new StringBuffer("");
    	for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                stringBuffer.append(str.charAt(i));
            }else{
                stringBuffer.append("%20");
            }
        }
        return stringBuffer.toString();
    }
}