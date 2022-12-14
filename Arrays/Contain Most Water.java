class Solution {
    public int maxArea(int[] height) {
        int max_area = 0;
        int left = 0;
        int right = height.length-1;
        
        while(left<right){
            
            int width = Math.min(height[left], height[right]);
            int length = right - left;
            max_area = Math.max(width*length, max_area);
            
            if(height[left] < height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max_area;
    }
}