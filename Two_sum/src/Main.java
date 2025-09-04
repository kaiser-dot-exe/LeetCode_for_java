class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] + nums[j] == target) {
                    System.out.println("Solution = [" + (i - 1) + "," + (j - 1) + "]");
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {};
    }
}
