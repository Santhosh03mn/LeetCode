class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer>list=new ArrayList<>();
        int n=num.length;
        for(int i=n-1;i>=0||k>0;i--){
            if(i>=0){
                k+=num[i];
            }
            int ans=k%10;
            list.add(ans);
            k/=10;
        }
        Collections.reverse(list);
        return list;
    }
}