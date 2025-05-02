class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(char a : moves.toCharArray()){
            if(a=='U'){
                x+=1;
            }
            else if(a=='D'){
                x-=1;
            }
            else if(a=='L'){
                y-=1;
            }
            else if(a=='R'){
                y+=1;
            }
        }
        return x==0&&y==0;
    }
}