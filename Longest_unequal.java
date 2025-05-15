class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        ArrayList<String> result = new ArrayList<>();
        int auto = 0;
        if(words.length == 1){
            result.add(words[0]);
            return result;
        }
        result.add(words[0]);
        for(int i=1; i<words.length; i++){
            if(groups[i] != groups[i-1]){
                System.out.println(words[i]);
                result.add(words[i]);
            }
        }

        return result;
    }
}