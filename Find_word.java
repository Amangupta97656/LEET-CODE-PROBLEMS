class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> res = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(String.valueOf(x))!=-1){
                res.add(i);
            }
        }
        return res;
    }
}