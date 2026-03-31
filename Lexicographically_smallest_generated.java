class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length(), m = str2.length(), L = n + m - 1;
        char[] s1 = str1.toCharArray(), s2 = str2.toCharArray();
        
        char[] res = new char[L];
        Arrays.fill(res, '?');

        int[] z = calc_z(s2);
        int last_s2 = -m;

        for (int i = 0; i < n; i++) {
            if (s1[i] != 'T') continue;

            int overlap = Math.max(last_s2 + m - i, 0);

            if (overlap > 0 && z[m - overlap] < overlap) return "";

            for (int j = overlap; j < m; j++) {
                res[i + j] = s2[j];
            }
            last_s2 = i;
        }

        int[] last_free = new int[L];
        int curr = -1;
        for (int i = 0; i < L; i++) {
            if (res[i] == '?') {
                res[i] = 'a';
                curr = i;
            }
            last_free[i] = curr;
        }

        char[] combined = new char[m + L];
        System.arraycopy(s2, 0, combined, 0, m);
        System.arraycopy(res, 0, combined, m, L);
        int[] z_combined = calc_z(combined);

        for (int i = 0; i < n; i++) {
            if (s1[i] != 'F') continue;

            if (z_combined[m + i] >= m) {
                int post_to_change = last_free[i + m - 1];
                if (post_to_change < i) return "";

                res[post_to_change] = 'b';

                i = post_to_change;
            }
        }

        return new String(res);
    }

    private int[] calc_z(char[] s2) {
        int n = s2.length;
        int[] z = new int[n];
        int L = 0, R = 0;

        for (int i = 1; i < n; i++) {
            if (i <= R) {
                z[i] = Math.min(R - i + 1, z[i - L]);
            }

            while (i + z[i] < n && s2[z[i]] == s2[i + z[i]]) {
                L = i;
                R = i + z[i];
                z[i]++;
            }
        }

        if (n > 0) z[0] = n;
        return z;
    }
}