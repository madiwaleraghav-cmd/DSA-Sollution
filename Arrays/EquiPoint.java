/*Given an array of integers arr[], the task is to find the first equilibrium point in the array.

The equilibrium point in an array is an index (0-based indexing) such that the sum of all elements before that index is the same as the sum of elements after it. Return -1 if no such point exists.

Examples:

Input: arr[] = [1, 2, 0, 3]
Output: 2
Explanation: The sum of left of index 2 is 1 + 2 = 3 and sum on right of index 2 is 3.*/





public class EquiPoint {
    public static void main(String... args){
        int[] arr={1,2,0,3};
        int[] left=new int[arr.length];
        int[] right=new int[arr.length];
        left[0]=0;
        right[arr.length-1]=0;
        int lsum=0,rsum=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            lsum+=arr[i-1];
            rsum+=arr[n-i];
            left[i]=lsum;
            right[n-i-1]=rsum;
        }
        boolean equi=false;
        for(int i=0;i<n;i++){
            if(left[i]==right[i]){
                System.out.println(i);
                equi=true;
            }
        }
        if(!equi){
            System.out.println(-1);
        }
    }
}
