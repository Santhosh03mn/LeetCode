class Solution {
    public String makeSmallestPalindrome(String s) {
        char[]ch=s.toCharArray();
        int i=0,j=s.length()-1;
        while(i<j){
            if(ch[i]<ch[j]){
                ch[j--]=ch[i++];
            }
            else{
                ch[i++]=ch[j--];
            }
        }
        return new String(ch);
    }
}