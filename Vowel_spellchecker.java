class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exactWords = new HashSet<>();
        Map<String, String> caseInsensitiveMap = new HashMap<>();
        Map<String, String> vowelErrorMap = new HashMap<>();
        
        for (String word : wordlist) {
            exactWords.add(word);
            String lower = word.toLowerCase();
            String devoweled = lower.replaceAll("[aeiou]", "*");
            
            caseInsensitiveMap.putIfAbsent(lower, word);
            vowelErrorMap.putIfAbsent(devoweled, word);
        }
        
        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            if (exactWords.contains(query)) {
                result[i] = query;
                continue;
            }
            
            String lower = query.toLowerCase();
            String devoweled = lower.replaceAll("[aeiou]", "*");
            
            if (caseInsensitiveMap.containsKey(lower)) {
                result[i] = caseInsensitiveMap.get(lower);
            } else if (vowelErrorMap.containsKey(devoweled)) {
                result[i] = vowelErrorMap.get(devoweled);
            } else {
                result[i] = "";
            }
        }
        return result;
    }
}