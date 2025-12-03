import java.util.*;

class Solution {

    static class Pair {
        long s1, s2;  // slope as dy,dx OR intercept OR slope for midpoint
        Pair(long s1, long s2) { this.s1 = s1; this.s2 = s2; }

        @Override
        public int hashCode() { return Objects.hash(s1, s2); }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof Pair)) return false;
            Pair p = (Pair) o;
            return s1 == p.s1 && s2 == p.s2;
        }
    }

    private long gcd(long a, long b) {
        if (b == 0) return Math.abs(a);
        return gcd(b, a % b);
    }

    public int countTrapezoids(int[][] points) {
        int n = points.length;

        // slope -> list of intercepts (intercept stored as integer numerator)
        Map<Pair, List<Long>> slopeToIntercept = new HashMap<>();

        // midpoint -> list of slopes (stored as dy/dx)
        Map<Pair, List<Pair>> midToSlope = new HashMap<>();

        // ---- BUILD ALL SEGMENTS ----
        for (int i = 0; i < n; i++) {
            long x1 = points[i][0], y1 = points[i][1];

            for (int j = i + 1; j < n; j++) {
                long x2 = points[j][0], y2 = points[j][1];

                long dx = x2 - x1;
                long dy = y2 - y1;

                long g = gcd(dx, dy);
                dx /= g;
                dy /= g;

                // normalize slope
                if (dx == 0) {
                    dy = 1;
                } else if (dx < 0) {
                    dx = -dx; dy = -dy;
                }

                Pair slope = new Pair(dy, dx);

                // exact intercept calculation
                long intercept;
                if (dx == 0) {
                    intercept = x1;  // vertical line x = const
                } else {
                    intercept = y1 * dx - x1 * dy;
                }

                slopeToIntercept
                    .computeIfAbsent(slope, k -> new ArrayList<>())
                    .add(intercept);

                // midpoint exact hashing
                long mx = x1 + x2;
                long my = y1 + y2;
                Pair mid = new Pair(mx, my);

                midToSlope
                    .computeIfAbsent(mid, k -> new ArrayList<>())
                    .add(slope);
            }
        }

        long ans = 0;

        // ---- COUNT TRAPEZOIDS ----
        for (var entry : slopeToIntercept.entrySet()) {
            List<Long> intercepts = entry.getValue();
            int k = intercepts.size();
            if (k < 2) continue;

            long total = (long) k * (k - 1) / 2;

            // subtract collinear same-line pairs
            Map<Long, Integer> freq = new HashMap<>();
            for (long b : intercepts)
                freq.merge(b, 1, Integer::sum);

            long bad = 0;
            for (int c : freq.values())
                if (c >= 2) bad += (long) c * (c - 1) / 2;

            ans += (total - bad);
        }

        // ---- SUBTRACT PARALLELOGRAMS ----
        for (var entry : midToSlope.entrySet()) {
            List<Pair> slopes = entry.getValue();
            if (slopes.size() < 2) continue;

            long total = (long) slopes.size() * (slopes.size() - 1) / 2;

            Map<Pair, Integer> freq = new HashMap<>();
            for (Pair s : slopes)
                freq.merge(s, 1, Integer::sum);

            long sameSlope = 0;
            for (int c : freq.values())
                if (c >= 2) sameSlope += (long) c * (c - 1) / 2;

            ans -= (total - sameSlope);
        }

        return (int) ans;
    }
}