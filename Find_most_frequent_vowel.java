import java.util.*;

class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        
        // Count frequencies
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int vc = 0; // max vowel frequency
        int ac = 0; // max consonant frequency

        // Find max vowel & consonant frequency
        for (Map.Entry<Character,Integer> entry : freq.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vc = Math.max(vc, count);
            } else {
                ac = Math.max(ac, count);
            }
        }
        return ac + vc;
    }
}