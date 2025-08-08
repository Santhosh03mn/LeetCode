class Solution {
    public String sortString(String s) {
        int[]a=new int[26];
        for(char ch : s.toCharArray()){
            a[ch-'a']+=1;
        }
        StringBuilder sb=new StringBuilder();
        while(sb.length()<s.length()){
            for(int i=0;i<26;i++){
                if(a[i]>0){
                    sb.append((char)(i+'a'));
                    a[i]-=1;
                }
            }
            for(int i=25;i>=0;i--){
                if(a[i]>0){
                    sb.append((char)(i+'a'));
                    a[i]-=1;
                }
            }
        }
        return sb.toString();
    }
}