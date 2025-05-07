class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int sum=0;
        int a=1;
        for(char ch : s.toCharArray()){
            int b=widths[ch-'a'];
            if(sum+b<=100)
            sum+=b;
            else{
                a++;
                sum=b;
            }
        }
        return new int[]{a,sum};
    }
}