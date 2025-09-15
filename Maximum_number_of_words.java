class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {

        String[] words = text.split(" ");
        int size = words.length;

        for (String word : words) {
            for (char ch : brokenLetters.toCharArray()) {
                if (word.indexOf(ch) != -1) {
                    size--;
                    break;
                }
            }
        }

        return size < 0 ? 0 : size;
    }
}