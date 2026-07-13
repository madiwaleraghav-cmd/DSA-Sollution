/*Given an array arr[] of size n filled with numbers from 1 to n-1 in random order. The array has only one repetitive element. The task is to find the repetitive element.

Examples:

Input: arr[] = [1, 3, 2, 3, 4]
Output: 3
Explanation: The number 3 is the only repeating element.*/



import java.util.HashMap;

public class RepeatElement {
    public static void main(String... args){
        int[] arr={ 1, 3, 2, 3, 4};
        int dup=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(arr[i])>1){
                dup=arr[i];
                break;
            }
        }
        System.out.println(dup);
    }
}
