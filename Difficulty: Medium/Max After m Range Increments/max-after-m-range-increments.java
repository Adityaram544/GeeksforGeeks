class Solution {
    public int findMax(int n, int[] a, int[] b, int[] k) {
        int[] diff = new int[n + 1];
        for (int i = 0; i < a.length; i++) {
            diff[a[i]] += k[i];
            if (b[i] + 1 < n)
                diff[b[i] + 1] -= k[i];
        }
        int max = diff[0];
        int sum = diff[0];
        for (int i = 1; i < n; i++) {
            sum += diff[i];
            max = Math.max(max, sum);
        }
        return max;
    }
}