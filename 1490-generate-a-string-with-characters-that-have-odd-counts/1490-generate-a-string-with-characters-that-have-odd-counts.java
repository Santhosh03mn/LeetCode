class Solution {
    public String generateTheString(int n) {
        int count=(n%2==0) ? n-1:n;
        StringBuilder res=new StringBuilder();
        for(int i=0;i<count;i++){
            res.append('a');
        }
        if(n%2==0){
            res.append('b');
        }
        return res.toString();
    }
}