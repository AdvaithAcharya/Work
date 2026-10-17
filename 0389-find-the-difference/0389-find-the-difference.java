class Solution {
    public char findTheDifference(String s, String t) {
        int xorSum = 0;
        for (char c : s.toCharArray()) xorSum ^= c;
        for (char c : t.toCharArray()) xorSum ^= c;
        return (char) xorSum;
    }
}
