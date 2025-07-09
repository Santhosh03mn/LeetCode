class Solution {
    public int countTriplets(int[] arr) {
       int n=arr.length;
       int[]ans=new int[n+1];
       for(int i=0;i<n;i++){
        ans[i+1]=ans[i]^arr[i];
       } 
       int count=0;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(ans[i]==ans[j+1]){
                count+=(j-i);
            }
        }
        
       }
       return count;
    }
}