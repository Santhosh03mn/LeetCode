class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> traingle = new ArrayList<>();
        for(int r=0;r<numRows;r++){
            List<Integer> row = new ArrayList<>();
            long ans = 1;
            for (int c = 0; c <= r; c++) {
                row.add((int)ans); 
                ans = ans * (r - c);
                ans = ans / (c+1);
            }
            traingle.add(row);
        }
        return traingle;
    }
}