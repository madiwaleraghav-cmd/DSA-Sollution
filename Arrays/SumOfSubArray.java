/*Given an integer array arr[], compute the sum of all possible sub-arrays of the array. A sub-array is a contiguous part of the array.

Examples:

Input: arr[] = [1, 4, 5, 3, 2]
Output: 116
Explanation: Sum of all possible subarrays of the array [1, 4, 5, 3, 2] is 116.*/




public class SumOfSubArray {
    public static void main(String... args){
        int[] arr={1,2,3};
        int sum=0,fsum=0;
        for(int i=0;i<arr.length;i++){
            int mul=(i+1)*arr[i];
            sum+=mul;
            fsum+=sum;
        }
        System.out.println(fsum);

    }
}
