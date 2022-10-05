<<<<<<< HEAD
class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
    
        int left = 0;
        int right = nums.length -1;

        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else{
                right = mid;
            }
        }

        int start = left;
        left =0;
        right = nums.length -1;

        if(target >= nums[start] && target <= nums[right]){
            left = start;
        } else {
            right = start;
        }

        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target){
                left = mid+1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }
=======
class Solution {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) return -1;
    
        int left = 0;
        int right = nums.length -1;

        while(left < right){
            int mid = left + (right-left)/2;
            if(nums[mid] > nums[right]){
                left = mid + 1;
            } else{
                right = mid;
            }
        }

        int start = left;
        left =0;
        right = nums.length -1;

        if(target >= nums[start] && target <= nums[right]){
            left = start;
        } else {
            right = start;
        }

        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target){
                left = mid+1;
            } else {
                right = mid -1;
            }
        }
        return -1;
    }
>>>>>>> f81769938b98f1679d6e2226cd5f0a6ab18d4e59
}