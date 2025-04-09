class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> currentCombination = new ArrayList<>();
        backtrack(combinations, currentCombination, 1, n, k);
        return combinations;
    }
    
    private void backtrack(List<List<Integer>> combinations, List<Integer> currentCombination, int start, int n, int k) {
        if (currentCombination.size() == k) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }
        
        for (int i = start; i <= n; i++) {
            currentCombination.add(i);
            backtrack(combinations, currentCombination, i + 1, n, k);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
}
