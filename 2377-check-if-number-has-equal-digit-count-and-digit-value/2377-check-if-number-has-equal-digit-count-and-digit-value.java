class Solution {
    public boolean digitCount(String num) {
        int[]ans=new int[10];
        for(char ch : num.toCharArray()){
            ans[ch-'0']++;
        }
        for(int i=0;i<num.length();i++){
            if(ans[i]!=num.charAt(i)-'0'){
                return false;
            }
        }
        return true;
    }
}