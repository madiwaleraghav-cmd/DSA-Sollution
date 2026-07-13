/*Given an array arr[] of n integers, find the 3 elements such that a[i] < a[j] < a[k] and i < j < k in O(n) time. If there are multiple such triplets, then print any one of them.

Examples:

Input: arr[] = [12, 11, 10, 5, 6, 2, 30]
Output: 5, 6, 30
Explanation: As 5 < 6 < 30, and they  appear in the same sequence in the array */



import java.util.ArrayList;

public class SunsequenceOf3 {
    public static void main(String... args){

        int[] arr={12, 11, 10, 5, 6, 2, 30};
        ArrayList<Integer> list=new ArrayList<>();
        int[] min=new int[arr.length];
        int[] max=new int[arr.length];
        min[0]=arr[0];
        max[arr.length-1]=arr[arr.length-1];
        for(int i=1;i<arr.length;i++){
            min[i]=Math.min(arr[i],min[i-1]);
            max[arr.length-1-i]=Math.max(arr[arr.length-1-i],max[arr.length-i]);
        }

        for(int i=1;i<arr.length;i++){
            if(arr[i]>min[i] && arr[i]<max[i]){
                list.add(min[i]);
                list.add(arr[i]);
                list.add(max[i]);

            }
        }
        System.out.println(list);
    }
}
