package divya;

public class SmallestLetterGreaterThanLetter {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'g', 's', 'u'};
        char ans = nextGreatestLetter(arr, 'g');
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target){

        int start = 0;
        int end = letters.length - 1;
        while (start <= end){
            // find middle element
            int mid = start + (end - start) / 2;

            if (target < letters[mid]){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
