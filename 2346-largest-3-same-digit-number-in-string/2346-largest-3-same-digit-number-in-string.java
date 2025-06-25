class Solution {
    public String largestGoodInteger(String num) {
        String a="";
        for(char ch='9';ch>='0';ch--){
            String b=""+ch+ch+ch;
            if(num.contains(b)){
            a=b;
            break;
            }
        }
        return a;
    }
}