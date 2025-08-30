class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean [][]a=new boolean[9][9];
        boolean [][]b=new boolean[9][9];
        boolean [][]c=new boolean[9][9];
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    int num=board[i][j]-'1';
                    int d=(i/3)*3+(j/3);
                    if(a[i][num]||b[j][num]||c[d][num]){
                        return false;
                    }
                    a[i][num]=b[j][num]=c[d][num]=true;
                }
            }
        }
        return true;
    }
}