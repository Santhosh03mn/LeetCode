class Solution {
    public int[] evenOddBit(int n) {
        int[]ans=new int[2];
        String a=Integer.toBinaryString(n);
        int even=0;
        int odd=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(a.length()-1-i)=='1'){
                if(i%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        ans[0]=even;
        ans[1]=odd;
        return ans;
    }
}