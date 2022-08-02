class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int slow = 0, fast = 0, ans = 0, product = 1;
        while(fast < nums.length) {
            while(fast < nums.length && (product *= nums[fast]) < k) {
                ans += (fast - slow + 1);  
                fast++;
            }
             
            while(slow <= fast && product >= k) {
                product /= nums[slow];
                slow++;
            }
            if(slow > fast) {
                fast++; // nums[fast] > k
            } else if(fast < nums.length) {
                product /= nums[fast]; 
            }
        }
        return ans;
    }
}