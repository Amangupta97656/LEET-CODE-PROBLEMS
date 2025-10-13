class Solution {
    public List<String> removeAnagrams(String[] words) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add(words[0]);
        char[] chars = words[0].toCharArray();
        Arrays.sort(chars);
        String newS = new String(chars);
        for(int i=1;i<words.length;i++){
            char[] chars2 = words[i].toCharArray();
            Arrays.sort(chars2);
            String newS2 = new String(chars2);
            if(!newS2.equals(newS)) arr.add(words[i]);
            newS = newS2;
        }
        return arr;
    }
}