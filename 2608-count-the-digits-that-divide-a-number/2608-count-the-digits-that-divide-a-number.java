class Solution {
    public int countDigits(int num) {
        int a=0;
        int n=num;
        while(n!=0){
            if(num%(n%10)==0)
            a++;
            n/=10;
        }
        return a;
    }
}