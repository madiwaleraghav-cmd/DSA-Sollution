/*Given an array arr[], rearrange its elements according to 1-based indexing such that for every even index i, arr[i] is greater than or equal to arr[i-1], and for every odd index i, arr[i] is less than or equal to arr[i-1]. Return the rearranged array that satisfies these conditions for all valid indices.

Find the resultant array.[consider 1-based indexing] .

Examples:

Input: arr[] = [1, 2, 2, 1]
Output: [1 2 1 2]
 Explanation:
For i = 2, arr[i] >= arr[i-1]. So, 2 >= 1.
For i = 3, arr[i] <= arr[i-1]. So, 1 <= 2.
For i = 4, arr[i] >= arr[i-1]. So, 2 >= 1*/




import java.util.Arrays;
import java.util.List;

public class EvenAndOdd {
    public static void main(String... args) {

        List<Integer> arr = Arrays.asList(1, 2, 2, 1);

        for (int i = 1; i < arr.size(); i++) {

            if ((i + 1) % 2 == 0) {

                if (arr.get(i) < arr.get(i - 1)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(i - 1));
                    arr.set(i - 1, temp);
                }

            } else {

                if (arr.get(i) > arr.get(i - 1)) {
                    int temp = arr.get(i);
                    arr.set(i, arr.get(i - 1));
                    arr.set(i - 1, temp);
                }

            }
        }

        System.out.println(arr);
    }
}
