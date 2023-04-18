import java.util.*;

public class Solution {
    public int numTilePossibilities(String tiles) {
        // create a map to count the frequency of each letter
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : tiles.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        return dfs(freq);
    }
    
    private int dfs(Map<Character, Integer> freq) {
        int count = 0;
        for (char c : freq.keySet()) {
            int f = freq.get(c);
            if (f > 0) {
                freq.put(c, f - 1);
                count++; // add the current letter to the count
                count += dfs(freq); // recursive call to count all possible sequences
                freq.put(c, f); // backtrack
            }
        }
        return count;
    }
}
