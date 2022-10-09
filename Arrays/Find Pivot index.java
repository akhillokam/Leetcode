class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum += nums[i];
        }

        int left_sum = 0;
        for(int i=0; i<nums.length;i++){
            if(left_sum == sum - nums[i]){
                return i;
            } else {
                left_sum += nums[i];
                sum -= nums[i];
            }
        }
        return -1;
    }
}