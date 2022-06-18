// https://leetcode.com/problems/reverse-words-in-a-string-iii/

package divya;

public class ReverseWordsInString {
    public String reverseWords(String s) {
        int i = 0;
        char[] arr = s.toCharArray(); // converting string to array
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == ' ') { // if we find a ' ', we reverse the word from i to j-1
                reverse(arr, i, j-1);
                i = j+1; // updating the value of i
            }
            if (j == arr.length -1) { // if we find the last letter in the string
                reverse(arr, i, j);
            }
        }
        return String.valueOf(arr);
    }

    public void reverse (char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
