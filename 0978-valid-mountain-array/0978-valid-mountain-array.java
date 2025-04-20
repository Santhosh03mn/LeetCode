class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n < 3)   return false;
        int a = 0;
        for(int i=1; i<n; i++){
            if(arr[i] <= arr[i-1]){
                a = i;
                break;
            }
        }
        if(a == 0 || a == 1)  return false;
        for(int i=a; i<n; i++){
            if(a != 0 && arr[i] >= arr[i-1])   return false;
        }
        return true;
    }
}