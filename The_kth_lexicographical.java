class Solution {
    private String ans;
    private int count;

    public void fun(String s, StringBuilder sb, int ind, int n, int k) {
        if (ind == n) {
            count++;
            if (count == k) {
                ans = sb.toString();
            }
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (sb.length() == 0 || s.charAt(i) != sb.charAt(sb.length() - 1)) {
                sb.append(s.charAt(i));
                fun(s, sb, ind + 1, n, k);
                if (!ans.isEmpty()) {
                    return;
                }
                sb.deleteCharAt(sb.length() - 1); 
            }
        }
    }

    public String getHappyString(int n, int k) {
        ans = "";
        count = 0;
        fun("abc", new StringBuilder(), 0, n, k);
        return ans;
    }
}