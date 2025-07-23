class Solution {
    public int maximumGain(String s, int x, int y) {
        int score=0;
        char[]ch=s.toCharArray();
        int len=ch.length;
        char ch1='a',ch2='b';
        int c1=0,c2=0;
        if(x<y){
            int temp=x;
            x=y;
            y=temp;
            ch1='b';
            ch2='a';
        }
        for(int i=0;i<len;i++){
            if(ch[i]==ch1){
                c1++;
            }
            else if(ch[i]==ch2){
                if(c1>0){
                    c1--;
                    score+=x;
                }
                else{
                    c2++;
                }
            }
            else{
                score+=Math.min(c1,c2)*y;
                c1=0;
                c2=0;
            }
        }
        if(c1!=0){
            score+=Math.min(c1,c2)*y;
        }
        return score;
    }
}