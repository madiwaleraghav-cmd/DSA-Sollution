/*Given an array of integers, every element in the array appears twice except for one element which appears only once. The task is to identify and return the element that occurs only once.

Examples:

Input:  arr[] = [2, 3, 5, 4, 5, 3, 4]
Output: 2
Explanation: Since 2 occurs once, while other numbers occur twice, 2 is the answer.*/



import java.util.HashMap;
import java.util.Map;

public class UniqueNum {
    public static void main(String... args){
        int[] arr={1,2,1,5,5};
        HashMap<Integer,Integer> map=new HashMap<>();
        int num=0;
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);

        }
        for(Map.Entry<Integer,Integer> map1:map.entrySet()){
            if(map1.getValue()<2){
                num=map1.getKey();
                break;
            }
        }
        System.out.println(num);
    }
}
