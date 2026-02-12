class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[]arr1=new int[m];
        int[]arr2=new int[n];
        Arrays.fill(arr1,Integer.MAX_VALUE);
        Arrays.fill(arr2,Integer.MIN_VALUE);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int val=matrix[i][j];
                if(val<arr1[i]){
                    arr1[i]=val;
                }
                if(val>arr2[j]){
                    arr2[j]=val;
                }
            }
        }
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int val=matrix[i][j];
                if(val==arr1[i]&&val==arr2[j]){
                    list.add(val);
                }
            }
        }
        return list;
    }
}