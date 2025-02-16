class Solution {
    public int[] constructDistancedSequence(int n) {
        int s = 2 * n - 1;  // Size of array 
        int[] a = new int[s]; 
        boolean[] u = new boolean[n + 1];// checks which no. are used 
        back(a, u, 0, n);
        return a;
    }
    private boolean back(int[] a, boolean[] u, int ii, int n) {
        if (ii == a.length) return true; // if whole array full, we got our solution
        if (a[ii] != 0) return back(a, u, ii + 1, n); // if position alreay filled up then move to next index 
        for (int num = n; num >= 1; num--) {
            if (u[num]) continue; // if no. alreay there then move forward skipping it.
            if (num == 1) { // placing 1 at 1 position and it will appears only one time.
                a[ii] = 1;
                u[1] = true;
                if (back(a, u, ii + 1, n)) return true;
                a[ii] = 0;  // Backtracking
                u[1] = false;
            } 
            // Place other numbers at ii and ii + num (distance = num)
            else if (ii + num < a.length && a[ii + num] == 0) {
                a[ii] = num;
                a[ii + num] = num;
                u[num] = true;
                if (back(a, u, ii + 1, n)) return true; // Found solution
                // no solution found then backtrack
                a[ii] = 0;
                a[ii + num] = 0;
                u[num] = false;
            }
        }
        return false; 
    }
}