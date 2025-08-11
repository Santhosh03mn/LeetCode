class Solution {
    public List<String> commonChars(String[] words) {
        int[][] a = new int[words.length][26];
        for (int i = 0; i < words.length; i++) {
            for (char c : words[i].toCharArray()) {
                a[i][c - 'a']++;
            }
        }
        List<String> ans = new ArrayList<>();
        for (int i = 'a'; i <= 'z'; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < a.length; j++) {
                min = Math.min(min, a[j][i-'a']);
            }
            for (int j = 0; j < min; j++) {
                ans.add(String.valueOf((char) i));
            }
        }
        return ans;
    }
}