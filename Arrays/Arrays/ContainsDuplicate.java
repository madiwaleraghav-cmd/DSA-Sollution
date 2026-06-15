package Arrays;

// LeetCode 217 - Contains Duplicate

/*
Approach:
Use a HashSet to track seen elements.
If an element already exists in the set, return true.

Time Complexity: O(n)
Space Complexity: O(n)
*/


import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
     HashSet<Integer> li=new HashSet<>();
      li.add(nums[0]);
      for(int i=1;i<nums.length;i++){
         if(li.contains(nums[i])){
            return true;
         }
         li.add(nums[i]);
      }
      return false;  
    }
}