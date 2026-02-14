class Solution {
    public int tupleSameProduct(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int a=nums[i]*nums[j];
                map.put(a,map.getOrDefault(a,0)+1);
            }
        }
        long b=0;
        for(int x : map.values()){
            if(x>1){
                b+=4L*x*(x-1);
            }
        }
        return (int) b;
    }
}