class Solution {
    public int maximumValue(String[] strs) {
        int max=0;
        for(String s : strs){
            if(s.matches("^[0-9]*$")){
                max=Math.max(max,Integer.parseInt(s));
            }
            else{
                max=Math.max(max,s.length());
            }
        }
        return max;
    }
}