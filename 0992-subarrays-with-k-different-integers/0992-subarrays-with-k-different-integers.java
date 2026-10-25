class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1);
    }
    private int atMostKDistinct(int[] nums, int k) {
        if (k <= 0) return 0;
        int n = nums.length;
        int[] freq = new int[n + 1]; 
        int left = 0;
        int distinctCount = 0;
        int totalSubarrays = 0;
        for (int right = 0; right < n; right++) {
            if (freq[nums[right]] == 0) {
                distinctCount++;
            }
            freq[nums[right]]++;
            while (distinctCount > k) {
                freq[nums[left]]--;
                if (freq[nums[left]] == 0) {
                    distinctCount--;
                }
                left++;
            }
            totalSubarrays += (right - left + 1);
        }
        return totalSubarrays;
    }
}
