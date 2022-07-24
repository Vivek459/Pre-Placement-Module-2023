class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> table = new HashMap<>();
        int[] ans = new int[2];
        
        for(int i = 0; i < nums.length; i++) {
            if(table.get(target - nums[i]) != null) {
                ans[0] = i;
                ans[1] = table.get(target - nums[i]);
                break;
                
            } else {
                table.put(nums[i], i);
            }
        }
        
        return ans;
    }
}