class Solution {
    public String[] divideString(String s, int k, char fill) {
        int nChar = s.length();
        int nFill = nChar % k;
        int nGroup = (nFill == 0) ? nChar / k : nChar /k + 1;

        String[] res = new String[nGroup];
        
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < nGroup * k - nChar; i++) {
            sb.append(fill);
        }

        for (int i = 0; i < nGroup; i++) {
            res[i] = sb.substring(i * k, i * k + k);
        }

        return res;
    }
}