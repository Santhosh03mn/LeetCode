class Solution {
    public boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<3)
        return false;
        int i=1;
        while(i<arr.length&&arr[i]>arr[i-1])
        i++;
        if(i==1||i==arr.length) return false;
        while(i<arr.length&&arr[i]<arr[i-1])
        i++;
        if(i==arr.length)
        return true;
        return false;
    }
}