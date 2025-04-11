class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
            String s=i+"";
            int len=s.length();
            if(len%2==0){
                int leftsum=0,rightsum=0;
                for(int j=0;j<len/2;j++){
                    leftsum+=s.charAt(j)-'0';
                }
                for(int k=len/2;k<len;k++){
                    rightsum+=s.charAt(k)-'0';
                }
                if(leftsum==rightsum){
                    count++;
                }
            }
        }
        return count;
    }
}