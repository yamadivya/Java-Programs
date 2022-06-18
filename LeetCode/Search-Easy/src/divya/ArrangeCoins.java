// https://leetcode.com/problems/arranging-coins/

/*
 * Math: Using Sum of Integers Formula
 *
 * This problem can be reduced down to:
 *      (K * (K+1))/2 <= N
 *      K^2 + K <= 2*N
 *      (K + 1/2)^2 <= 2*N + 1/4
 *      K <= sqrt(2*N + 1/4) - 1/2
 *
 * Since we want the row that has full levels, we just need to return the floor of above result.
 * Thus, K = floor(sqrt(2*N + 1/4) - 1/2)
 *
 * Time Complexity: O(1)
 *
 * Space Complexity: O(1)
 */

package divya;

public class ArrangeCoins {
    public int arrangeCoins(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input Number is invalid. Only positive numbers are allowed");
        }
        return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5);
    }
}
