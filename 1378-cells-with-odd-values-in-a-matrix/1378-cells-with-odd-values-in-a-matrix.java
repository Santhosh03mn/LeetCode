class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int count=0;
        int[][]mat = new int[m][n];
        for(int i =0; i<indices.length;i++){
            int x = indices[i][0];
            int y = indices[i][1];
            for(int j=0;j<n;j++ ){ mat[x][j]+=1;}
            for(int j =0;j<m;j++){ mat[j][y]+=1;}
        }
        for(int i =0;i<m;i++){
            for(int j =0; j<n;j++){
                if(mat[i][j]%2!=0) count+=1;
            }
        }
        return count;
    }
}