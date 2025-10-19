class Solution {
    public String findLexSmallestString(String s, int a, int b) {
      Set<String> seen = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        String res = s;
        queue.offer(s);
        seen.add(s);

        while (!queue.isEmpty()) {
            String cur = queue.poll();
            if (cur.compareTo(res) < 0) res = cur;

           
            char[] arr = cur.toCharArray();
            for (int i = 1; i < arr.length; i += 2) {
                arr[i] = (char)(((arr[i] - '0' + a) % 10) + '0');
            }
            String added = new String(arr);
            if (seen.add(added)) queue.offer(added);

            
            String rotated = cur.substring(cur.length() - b) + cur.substring(0, cur.length() - b);
            if (seen.add(rotated)) queue.offer(rotated);
        }
        return res;  
    }
}