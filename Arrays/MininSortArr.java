<<<<<<< HEAD
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int res = nums[0];
        
        if(nums.length == 1){
            return nums[0];
        }
        
        while(left <= right){
            if(nums[left] < nums[right]){
                res = Math.min(res,nums[left]);
            }
            int mid = left + (right - left)/2;
            res = Math.min(nums[mid], res);
            if(nums[left] <= nums[mid]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
=======
class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int res = nums[0];
        
        if(nums.length == 1){
            return nums[0];
        }
        
        while(left <= right){
            if(nums[left] < nums[right]){
                res = Math.min(res,nums[left]);
            }
            int mid = left + (right - left)/2;
            res = Math.min(nums[mid], res);
            if(nums[left] <= nums[mid]){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
>>>>>>> f81769938b98f1679d6e2226cd5f0a6ab18d4e59
}