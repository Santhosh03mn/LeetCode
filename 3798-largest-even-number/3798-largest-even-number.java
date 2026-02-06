class Solution {
    public String largestEven(String s) {
        int a=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='2'){
                a=i;
            }
        }
        if(a==-1){
            return "";
        }
        return s.substring(0,a+1);
    }
}