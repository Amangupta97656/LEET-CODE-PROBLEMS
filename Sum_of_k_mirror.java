class Solution {
    public long kMirror(int k, int n) {
        int L = 1;           // Start palindrome generation with length = 1
        long sum = 0;

        while (n > 0) {
            int half_length = (L + 1) / 2;

            long min_num = (long) Math.pow(10, half_length - 1);
            long max_num = (long) Math.pow(10, half_length) - 1;

            for (long num = min_num; num <= max_num; num++) {
                String first_half = String.valueOf(num);
                String second_half = new StringBuilder(first_half).reverse().toString();

                String palindrome;
                if (L % 2 == 0) {
                    palindrome = first_half + second_half;
                } else {
                    palindrome = first_half + second_half.substring(1);
                }

                long palindrome_num = Long.parseLong(palindrome);
                String baseKRepresentation = base_k(palindrome_num, k);

                if (isPalindrome(baseKRepresentation)) {
                    sum += palindrome_num;
                    n--; // We found one
                    if (n == 0) return sum;
                }
            }

            L++; // Increase palindrome length
        }

        return sum;
    }

    public String base_k(long num, int k) {
        if (num == 0) return "0";

        StringBuilder str = new StringBuilder();
        while (num > 0) {
            str.append(num % k);
            num /= k;
        }

        return str.reverse().toString();
    }

    public boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;

        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}