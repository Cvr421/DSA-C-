package BinarySearch;
//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class SmallestLetterGreaterThenTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j' };
        char ans = nextGreatestLetter(letters, 'z');
        System.out.println(ans);
    }
    // Step 1: Implement the binary search algorithm to find the next greatest letter.
    // Step 2: Since we are not looking to return the target element, we do not return the mid value.
    // Step 3: After the loop ends, return letters[start % letters.length] to handle wrap-around correctly.
    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
//            int mid= (start+end)/2; Here issue is when the limit of integer value exceed for large no while addition in jave
            int mid = start + (end - start) / 2;
            if (target < letters[mid]) { // not run when target=middle element in array
                end = mid - 1;
            } else { // not run when target=middle element in array
                start = mid + 1;

            }
        }
        //Ceiling no = Smallest element in the array which is greater or = target element
        return letters[start % letters.length];
    }

}