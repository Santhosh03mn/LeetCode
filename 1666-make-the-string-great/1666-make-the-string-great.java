class Solution {
    public String makeGood(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch : s.toCharArray()){
            int a=sb.length();
            if(a>0&&Math.abs(sb.charAt(a-1)-ch)==32){
                sb.deleteCharAt(a-1);
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}