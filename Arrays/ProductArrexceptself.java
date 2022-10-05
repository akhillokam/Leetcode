<<<<<<< HEAD
//TC-O(n)
//SC-O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int pre = 1, post =1;
        
        for(int i=0; i<nums.length; i++){
            result[i] = pre;
                pre = nums[i] * pre;
        }
        
        for(int i=nums.length-1; i>=0; i--){
            result[i] = post * result[i];
                post = nums[i] * post;
        }
        return result;
    }
=======
//TC-O(n)
//SC-O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        int pre = 1, post =1;
        
        for(int i=0; i<nums.length; i++){
            result[i] = pre;
                pre = nums[i] * pre;
        }
        
        for(int i=nums.length-1; i>=0; i--){
            result[i] = post * result[i];
                post = nums[i] * post;
        }
        return result;
    }
>>>>>>> f81769938b98f1679d6e2226cd5f0a6ab18d4e59
}