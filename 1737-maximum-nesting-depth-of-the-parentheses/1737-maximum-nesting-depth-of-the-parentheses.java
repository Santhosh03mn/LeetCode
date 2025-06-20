class Solution {
    public int maxDepth(String s) {
        int sum=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                sum++;
                max=Math.max(max,sum);
            }
            else if(s.charAt(i)==')'){
                sum--;
            }
        }
        return max;
    }
}