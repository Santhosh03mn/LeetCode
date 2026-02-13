class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int res=0;
        for(int j=0;j<n;j++){
            int lleft=0,gleft=0;
            int lright=0,gright=0;
            for(int i=0;i<j;i++){
                if(rating[i]<rating[j]){
                    lleft++;
                }
                else if(rating[i]>rating[j]){
                    gleft++;
                }
            }
            for(int k=j+1;k<n;k++){
                if(rating[k]<rating[j]){
                    lright++;
                }
                else if(rating[k]>rating[j]){
                    gright++;
                }
            }
            res+=lleft*gright+gleft*lright;
        }
        return res;
    }
}