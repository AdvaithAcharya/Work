class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs = 0;
        int[] frequency = new int[101]; 
        for (int num : nums) {
            goodPairs += frequency[num];
            frequency[num]++;
        }
        return goodPairs;
    }
}
