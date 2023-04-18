import java.util.*;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        // convert the paragraph to lowercase and split into words
        String[] words = paragraph.toLowerCase().split("[^a-zA-Z]+");
        
        // create a set of banned words for O(1) lookup
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
        // count the occurrence of each word that is not banned
        Map<String, Integer> counts = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word)) {
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }
        
        // find the most common word
        String mostCommonWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommonWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        
        return mostCommonWord;
    }
}
