class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        
        for (int i = 0; i<nums.length -1;i++){
            if (nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
        
}


//Hashing
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        
        for (int i = 0; i<nums.length;i++){
            if(seen.contains(nums[i])){
                return true;
            } else {
                seen.add(nums[i]);
            }
            
        }
        return false;
        
	}
}
