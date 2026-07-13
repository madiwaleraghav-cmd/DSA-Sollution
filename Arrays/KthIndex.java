/*Given an integer array arr[] and an integer k, determine whether there exist two indices i and j such that arr[i] == arr[j] and |i - j| ≤ k. If such a pair exists, return 'Yes', otherwise return 'No'.

Examples:

Input: k = 3, arr[] = [1, 2, 3, 4, 1, 2, 3, 4]
Output: No
Explanation: Each element in the given array arr[] appears twice and the distance between every element and its duplicate is 4.*/



import java.util.HashMap;

public class KthIndex {
    public static void main(String... args){
        HashMap<Integer,Integer> map=new HashMap<>();
        boolean flag=false;
        int[] arr={1,2,3,1,4,5};
        int k=3;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                if(i-map.get(arr[i])<=k){
                   flag=true;

                   break;
                }
            }
            map.put(arr[i],i);
        }
        System.out.println(flag);
    }
}
