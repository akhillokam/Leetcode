<<<<<<< HEAD
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = startIndex(nums, target);
        res[1] = endIndex(nums, target);
        return res;
    }

        public int startIndex(int[] nums, int target){
            int index = -1;
            int start = 0;
            int end = nums.length -1;

            while(start <= end){
                int mid = start + (end - start)/2;
                if(nums[mid] >= target){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
                if(nums[mid] == target) index=mid;

            }

            return index;
        }

        public int endIndex(int[] nums, int target){
            int index = -1;
            int start = 0;
            int end = nums.length -1;

            while(start <= end){
                int mid = start + (end - start)/2;
                if(nums[mid] <= target){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
                if(nums[mid] == target) index=mid;
            }

            return index;
        }
=======
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = startIndex(nums, target);
        res[1] = endIndex(nums, target);
        return res;
    }

        public int startIndex(int[] nums, int target){
            int index = -1;
            int start = 0;
            int end = nums.length -1;

            while(start <= end){
                int mid = start + (end - start)/2;
                if(nums[mid] >= target){
                    end = mid - 1;
                } else{
                    start = mid + 1;
                }
                if(nums[mid] == target) index=mid;

            }

            return index;
        }

        public int endIndex(int[] nums, int target){
            int index = -1;
            int start = 0;
            int end = nums.length -1;

            while(start <= end){
                int mid = start + (end - start)/2;
                if(nums[mid] <= target){
                    start = mid + 1;
                } else{
                    end = mid - 1;
                }
                if(nums[mid] == target) index=mid;
            }

            return index;
        }
>>>>>>> f81769938b98f1679d6e2226cd5f0a6ab18d4e59
}