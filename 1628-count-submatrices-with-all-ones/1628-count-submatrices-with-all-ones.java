class Solution {
    public int numSubmat(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int[][] newmat=new int[n][m];
        for(int i=0;i<n;i++){
            newmat[i][m-1]= mat[i][m-1]==0 ? 0 : 1;
            for(int j=m-2;j>=0;j--){
                newmat[i][j]= mat[i][j]==0 ? 0 : newmat[i][j+1]+1;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int minwidth=newmat[i][j];
                for(int d=i;d<n;d++){
                    if(newmat[d][j]==0) {
                        break;
                    }
                    minwidth=Math.min(newmat[d][j],minwidth);
                    count+=minwidth;
                }
            }
        }
        return count;
    }
}