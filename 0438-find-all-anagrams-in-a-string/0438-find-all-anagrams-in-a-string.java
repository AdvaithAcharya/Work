import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if (s.length() < p.length()) {
            return result;
        }
        int[] pCount = new int[26];
        int[] sCount = new int[26];
        int k = p.length();
        for (int i = 0; i < k; i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }
        if (matches(pCount, sCount)) {
            result.add(0);
        }
        for (int i = k; i < s.length(); i++) {
            sCount[s.charAt(i) - 'a']++;
            sCount[s.charAt(i - k) - 'a']--;
            if (matches(pCount, sCount)) {
                result.add(i - k + 1);
            }
        }
        return result;
    }
    private boolean matches(int[] pCount, int[] sCount) {
        for (int i = 0; i < 26; i++) {
            if (pCount[i] != sCount[i]) {
                return false;
            }
        }
        return true;
    }
}
