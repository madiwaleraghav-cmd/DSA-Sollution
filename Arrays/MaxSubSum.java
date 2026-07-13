/*Given an integer array arr[], find the subarray (containing at least one element) which has the maximum possible sum, and return that sum.
Note: A subarray is a continuous part of an array.

Examples:

Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
Output: 11
Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.*/



public class MaxSubSum {
    public static void main(String... args){
        int[] arr={2, 3, -8, 7, -1, 2, 3};
        int sum=0,msum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            msum=Math.max(msum,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(msum);
    }
}
