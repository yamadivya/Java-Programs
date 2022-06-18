// https://leetcode.com/problems/hamming-distance/

package divya;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int res = 0;

        while (x != y) {
            res += (1 & x) ^ (1 & y);
            x >>= 1;
            y >>= 1;
        }
        return res;
    }
}
