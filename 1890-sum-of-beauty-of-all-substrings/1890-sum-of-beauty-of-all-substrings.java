class Solution {
    public int beautySum(String s) {
        int res=0;
        for(int i=0;i<s.length();i++){
            int[]arr=new int[26];
            for(int j=i;j<s.length();j++){
                arr[s.charAt(j)-'a']++;
                int a=0;
                int b=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(arr[k]>0){
                        a=Math.max(a,arr[k]);
                        b=Math.min(b,arr[k]);
                    }
                }
                res+=(a-b);
            }
        }
        return res;
    }
}