class Solution {
    public long mostPoints(int[][] questions) {
        int n=questions.length;
        long[]a=new long[n];
        a[n-1]=questions[n-1][0];
        for(int i=n-2;i>=0;i--){
            if(questions[i][1]+i+1>=n){
                a[i]=Math.max(questions[i][0],a[i+1]);
            }
            else{
                a[i]=Math.max(a[i+1],questions[i][0]+a[i+1+questions[i][1]]);
            }
        }
        return a[0];
    }
}