class Solution {
    public int maxNumberOfBalloons(String text) {
        char[]c=text.toCharArray();
        double d[]=new double[5];
        for(char i : c){
            if(i=='b'){
                d[0]+=1;
            }
            else if(i=='a'){
                d[1]+=1;
            }
            else if(i=='l'){
                d[2]+=.5;
            }
            else if(i=='o'){
                d[3]+=.5;
            }
            else if(i=='n'){
                d[4]+=1;
            }
        }
        Arrays.sort(d);
        return (int)d[0];
    }
}