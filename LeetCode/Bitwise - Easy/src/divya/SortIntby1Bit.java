// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/

package divya;

public class SortIntby1Bit {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;

        for(int i=0; i<n ; i++)
            arr[i] += 10001*Integer.bitCount(arr[i]);

        Arrays.sort(arr);

        //System.out.println(" " + Arrays.toString(arr));

        for(int i=0 ; i<n ; i++)
            arr[i] = arr[i] % 10001;

        //System.out.println(" " + Arrays.toString(arr) );
        return arr;
    }
}
