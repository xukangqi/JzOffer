public class Solution{
    public static volatile Solution solution;
    public Solution getInstance(){
        if(solution==null){
            synchronized(Solution.class){
                if(solution==null){
                    return new Solution();
                }
            }
        }
        return solution;
    }
    public static  Solution solutio2=new Solution();
    public Solution getInstance2(){
        return solutio2;
    }
    java
}