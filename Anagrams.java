class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, list<String>> groupedAnagrans = new HashMap<>();
        for(String str:inputArr){
            char[] charArr = str.toCharArray();
            Arrays.sort(CharArr);
            String sortedstr = String.valueof(charArr);
            if(!groupedAnagrams.containskey(sortedstr)){
                groupedAnagrams.put(sortedsrt, new ArrayList<>());

            }
            groupedAnagrams.get(sortedSrt).add(str);
        }
        return new ArrayList<>(groupedAnagrams.values());

        
    }
}