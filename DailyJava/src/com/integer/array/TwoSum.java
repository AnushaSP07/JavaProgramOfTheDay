package com.integer.array;

public class TwoSum {

	public static void main(String[] args) throws IllegalAccessException {
		int[] nums = {1,2,3,4};
		int tar = 5;
		twoSum(nums, tar);
	}
	
	 public static int[] twoSum(int[] nums, int target) throws IllegalAccessException {
		 for(int i=0;i<nums.length;i++) {
			 for(int j=i+1;j<nums.length;j++) {
				 if(nums[j] == target - nums[i]) {
					 return new int[] {i,j};
				 }
			 }
		 }
		 throw new IllegalAccessException("No Such Data");
	 }
}
