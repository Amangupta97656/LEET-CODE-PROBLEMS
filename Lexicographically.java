
import java.util.*;

class Solution {
    private int find(int[] dsuf, int v) {
        if (dsuf[v] == -1)
            return v;
        return dsuf[v] = find(dsuf, dsuf[v]);
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[] dsuf = new int[26];
        Arrays.fill(dsuf, -1);

        // Step-1: Build Disjoint Joint equivalent sets (with smallest in each set as absolute parent)
        for (int i = 0; i < s1.length(); ++i) {
            if (s1.charAt(i) == s2.charAt(i)) continue;

            int px = find(dsuf, s1.charAt(i) - 'a');
            int py = find(dsuf, s2.charAt(i) - 'a');
            if (px == py) continue;

            // Union by smallest char as absolute parent
            if (px > py) dsuf[px] = py;
            else dsuf[py] = px;
        }

        // Step-2: Iterate for baseStr and find lexicographical smallest equivalent string
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < baseStr.length(); ++i) {
            int parent = find(dsuf, baseStr.charAt(i) - 'a');
            res.append((char) (parent + 'a'));
        }
        return res.toString();
    }
}