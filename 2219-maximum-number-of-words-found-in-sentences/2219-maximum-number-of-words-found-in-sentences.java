class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(String num : sentences){
            count=Math.max(count,num.split(" ").length);
        }
        return count;
    }
}