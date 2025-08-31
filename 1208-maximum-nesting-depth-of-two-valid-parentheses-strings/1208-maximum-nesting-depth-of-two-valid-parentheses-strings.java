class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int[]a=new int[seq.length()];
        int count=0;
        for(int i=0;i<seq.length();i++){
            if(seq.charAt(i)=='('){
                a[i]=count++%2;
            }
            else{
                a[i]=--count%2;
            }
        }
        return a;
    }
}