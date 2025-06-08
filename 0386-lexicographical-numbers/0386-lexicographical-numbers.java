class Solution {
    public List<Integer> lexicalOrder(int n) {
        int[] ans = new int[n];
        int a = 1;
        for (int i = 0; i < n; i++) {
            ans[i] = a;
            if (a * 10 <= n) {
                a *= 10;
            } else {
                if (a >= n) a /= 10;
                a++;
                while (a % 10 == 0) a /= 10;
            }
        }
        List<Integer> res = new ArrayList<>(n);
        for (int v : ans) res.add(v);
        return res;
    }
}