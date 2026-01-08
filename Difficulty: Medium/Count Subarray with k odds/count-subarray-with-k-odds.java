class Solution {
    public int countSubarrays(int[] arr, int k) {
        return atMost(arr, k) - atMost(arr, k - 1);
    }
    private int atMost(int[] arr, int k) {
        int l = 0, count = 0, odd = 0;
        for (int r = 0; r < arr.length; r++) {
            if (arr[r] % 2 != 0) odd++;
            while (odd > k) {
                if (arr[l] % 2 != 0) odd--;
                l++;
            }
            count += (r - l + 1);
        }
        return count;
    }
}