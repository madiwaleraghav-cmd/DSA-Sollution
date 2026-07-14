/*Given an integer array nums of length n and an integer target, find three integers at distinct indices in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.



Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).*/





import java.util.Arrays;

public class ThreeSumCloset {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result=nums[0]+nums[1]+nums[2];
        int psum=0;
        for(int i=0;i<nums.length-2;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==target){
                    return sum;
                }

                if(Math.abs(sum-target)<Math.abs(result-target)){
                    result=sum;
                }
                if(sum>target){
                    k--;
                }else{
                    j++;
                }
            }

        }
        return result;
    }
    public static void main(String... args){
     int[] nums={-1,2,1,-4};
     int k=2;
     ThreeSumCloset t=new ThreeSumCloset();
        System.out.println(t.threeSumClosest(nums,k));
    }
}
