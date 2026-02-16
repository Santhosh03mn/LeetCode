class Solution {
    public int minimumLength(String s) {
        int[]arr=new int[26];
        for(char c : s.toCharArray()){
            arr[c-'a']++;
        }
        int res=0;
        for(int a : arr){
            if(a==0) continue;
            if((a&1)==1){
                res+=1;
            }
            else{
                res+=2;
            }
        }
        return res;
    }
}