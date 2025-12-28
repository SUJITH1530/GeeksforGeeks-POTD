class Solution {
    public int minTime(int[] ranks, int n) {
        int l = 0, h = Integer.MAX_VALUE;
        while (l < h) {
            int m = (l + h) / 2, d = 0;
            for (int r : ranks) {
                d += (int)((Math.sqrt(1 + 8L * m / r) - 1) / 2);
                if (d >= n) break;
            }
            if (d >= n) h = m;
            else l = m + 1;
        }
        return l;
    }
}
