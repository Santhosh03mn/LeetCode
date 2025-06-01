class Solution {
    public long distributeCandies(int n, int limit) {
        long ans = 0;
        int max = 0;
        int min = 0;
        for(int i=0;i<=Math.min(limit, n);i++){
            int rem = n - i;
            if(rem > limit*2) continue;
            if(rem > limit){
                 max = limit;
                 min = rem - limit;
            }else{
                 max = rem;
                 min = 0;
            }
            ans += max - min + 1;
        }
        return ans ;
    }
}