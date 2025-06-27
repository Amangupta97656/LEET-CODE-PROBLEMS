class Solution {
    public String longestSubsequenceRepeatedK(String s, int k) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray()) freq[ch - 'a']++;
        
        Set<Character> allowed = new HashSet<>();
        int maxLen = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] >= k) {
                allowed.add((char)(i + 'a'));
                maxLen += freq[i] / k;
            }
        }

        String res = "";
        Queue<String> q = new LinkedList<>();
        q.add("");

        while (!q.isEmpty()) {
            String cur = q.poll();
            for (char ch = 'z'; ch >= 'a'; ch--) {
                if (!allowed.contains(ch)) continue;

                String next = cur + ch;
                if (next.length() > maxLen) continue;

                if (isK(next, s, k)) {
                    if (next.length() > res.length() || 
                        (next.length() == res.length() && next.compareTo(res) > 0)) {
                        res = next;
                    }
                    q.add(next);
                }
            }
        }

        return res;
    }

    boolean isK(String sub, String s, int k) {
        int count = 0, i = 0;
        for (char ch : s.toCharArray()) {
            if (ch == sub.charAt(i)) {
                i++;
                if (i == sub.length()) {
                    count++;
                    i = 0;
                    if (count == k) return true;
                }
            }
        }
        return false;
    }
}