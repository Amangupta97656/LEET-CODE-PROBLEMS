class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        int length = 0;
        boolean hasCentre = false;

        for(String word : words){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            String word = entry.getKey();                                                                                                                                                                                       
            String reversedWord = new StringBuilder(word).reverse().toString(); 

            if(word.equals(reversedWord)&& !set.contains(word)){
                int countNumberOfWords = map.get(word);
                length+=countNumberOfWords/2  * 4;
                if(countNumberOfWords % 2 == 1){
                    hasCentre = true;
                }
                set.add(word);
                
            }else if(!set.contains(word) && !set.contains(reversedWord) && map.containsKey(reversedWord)){
                int minNumberOfWords = Math.min(map.get(reversedWord),map.get(word));
                length+=minNumberOfWords*4;
                set.add(word);
                set.add(reversedWord);
            }
        }
        if(hasCentre){
            length+=2;
        }
        return length;
    }
}