class Solution {
    public int splitNum(int num) {
        char[]ans=String.valueOf(num).toCharArray();
        Arrays.sort(ans);
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        for(int i=0;i<ans.length;i++){
            if(i%2==0){
                s1.append(ans[i]);
            }
            else{
                s2.append(ans[i]);
            }
        }
        return Integer.parseInt(s1.toString())+Integer.parseInt(s2.toString());
    }
}