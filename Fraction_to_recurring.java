public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        
        StringBuilder result = new StringBuilder();
        
        // Handle sign
        if ((numerator < 0) ^ (denominator < 0)) {
            result.append("-");
        }
        
        // Convert to long to avoid overflow
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        
        // Integer part
        result.append(num / den);
        long remainder = num % den;
        
        if (remainder == 0) return result.toString(); // No fractional part
        
        result.append(".");
        
        // Map to store remainders and their corresponding index in result
        Map<Long, Integer> remainderMap = new HashMap<>();
        
        while (remainder != 0) {
            if (remainderMap.containsKey(remainder)) {
                int startIndex = remainderMap.get(remainder);
                result.insert(startIndex, "(");
                result.append(")");
                break;
            }
            
            remainderMap.put(remainder, result.length());
            remainder *= 10;
            result.append(remainder / den);
            remainder %= den;
        }
        
        return result.toString();
    }

}