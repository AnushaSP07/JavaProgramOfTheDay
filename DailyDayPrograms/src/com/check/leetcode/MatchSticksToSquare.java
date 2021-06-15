package com.check.leetcode;

public class MatchSticksToSquare {

	public static void main(String[] args) {
		int[] num = {1,1,2,2,2};
		System.out.println("-----------");
		makesquare(num);
	}
	
	public static boolean makesquare(int[] nums) {
      /*  int sum = 0;
        for(int i=0;i<matchsticks.length;i++){
        	sum = sum+ matchsticks[i];
        }
        System.out.println("cou "+sum);
        if(sum>4 && sum%4==0){
            System.out.println("count "+sum+"--"+sum%4);
            return true;
        }else if(sum==4){
            return true;
        }else{
            return false;
        } */
		
		if (nums == null || nums.length < 4) return false;
        int sum = 0;
        for (int num : nums) sum += num;
        if (sum % 4 != 0) return false;
        
     return dfs(nums, new int[4], 0, sum / 4);
    }
    
    private static boolean dfs(int[] nums, int[] sums, int index, int target) {
     if (index == nums.length) {
         if (sums[0] == target && sums[1] == target && sums[2] == target) {
      return true;
         }
         return false;
     }
     
     for (int i = 0; i < 4; i++) {
         if (sums[i] + nums[index] > target) continue;
         sums[i] += nums[index];
            if (dfs(nums, sums, index + 1, target)) return true;
         sums[i] -= nums[index];
     }
     
     return false;
    }
}
