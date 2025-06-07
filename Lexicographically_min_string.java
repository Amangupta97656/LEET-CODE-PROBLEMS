class Solution {
    public String clearStars(String s){
        StringBuilder str = new StringBuilder();
        TreeMap<Character, ArrayDeque<Integer>> map = new TreeMap<>();

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch != '*'){
                str.append(ch);
                map.putIfAbsent(ch, new ArrayDeque<>());
                map.get(ch).addLast(str.length() - 1);
            }
            else{
                if(!map.isEmpty()){
                    char smallest = map.firstKey();
                    ArrayDeque<Integer> smIndices = map.get(smallest);
                    int removeIdx = smIndices.removeLast();
                    str.setCharAt(removeIdx, '@');
                    if(smIndices.isEmpty()){
                        map.remove(smallest);
                    }
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != '@'){
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
    
}