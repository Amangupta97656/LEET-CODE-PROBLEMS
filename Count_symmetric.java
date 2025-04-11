class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        
        for (int i = low; i <= high; i++) {
            String str = Integer.toString(i);
            int len = str.length();
            
            if (len % 2 != 0) continue; // Only even digit numbers are considered
            
            int half = len / 2;
            int sum1 = 0, sum2 = 0;
            
            for (int j = 0; j < half; j++) {
                sum1 += str.charAt(j) - '0';
            }
            for (int j = half; j < len; j++) {
                sum2 += str.charAt(j) - '0';
            }
            
            if (sum1 == sum2) count++;
        }
        
        return count;
    }
}