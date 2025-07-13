class Solution {
    public int getLucky(String s, int k) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            int a=c-'a'+1;
            sb.append(a);
        }
        String num=sb.toString();
        while(k>=1){
            int sum=0;
            for(char ch : num.toCharArray()){
                sum+=(ch-'0');
            }
            k--;
            num=""+sum;
        }
        return Integer.valueOf(num);
    }
}