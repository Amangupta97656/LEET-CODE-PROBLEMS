class Solution {
    public int countTriples(int n) {
     int count = 0;

        for (int u = 2; u * u <= n; u++) {
            for (int v = 1; v < u; v++) {

                if (((u - v) & 1) == 1 && gcd(u, v) == 1) {

                    int a0 = u * u - v * v;
                    int b0 = 2 * u * v;
                    int c0 = u * u + v * v;

                    if (c0 > n) continue;

                    for (int k = 1; k * c0 <= n; k++) {
                        count += 2; 
                    }
                }
            }
        }
        return count;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
        
 }