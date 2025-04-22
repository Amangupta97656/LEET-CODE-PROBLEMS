import java.math.BigInteger;

class Solution {
    public static final int MODULO = (int) 1e9 + 7;

    public static int idealArrays(int n, int maxValue) {
        // 🧮 Step 1: Sieve to get smallest prime divisor
        int[] smallestPrime = new int[maxValue + 1];
        for (int i = 2; i <= maxValue; i++) {
            if (smallestPrime[i] == 0) {
                for (int j = i; j <= maxValue; j += i) {
                    if (smallestPrime[j] == 0) {
                        smallestPrime[j] = i;
                    }
                }
            }
        }

        // 🧷 Step 2: Precompute binomial coefficients C(n + k - 1, k)
        int maxExponent = (int) (Math.log(maxValue) / Math.log(2));
        int[] binomial = new int[maxExponent + 1];
        BigInteger comb = BigInteger.ONE;
        BigInteger mod = BigInteger.valueOf(MODULO);

        for (int k = 1; k <= maxExponent; k++) {
            comb = comb.multiply(BigInteger.valueOf(n + k - 1));
            comb = comb.divide(BigInteger.valueOf(k));
            binomial[k] = comb.mod(mod).intValue();
        }

        // 🔁 Step 3: Count ways for each value from 1 to maxValue
        int result = 0;
        for (int i = 1; i <= maxValue; i++) {
            int number = i;
            long ways = 1;

            // 🧩 Factorize and multiply combinations
            while (number > 1) {
                int prime = smallestPrime[number];
                int exponent = 0;
                while (number % prime == 0) {
                    exponent++;
                    number /= prime;
                }
                ways = ways * binomial[exponent] % MODULO;
            }

            result = (result + (int) ways) % MODULO;
        }

        return result;
    }
}