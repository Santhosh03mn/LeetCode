class Solution {
    public String largestOddNumber(String num) {
        int n=0;
        for(int i=num.length()-1;i>=0;i--){
            n=num.charAt(i)-'0';
            if(n>0&&n%2!=0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }
}