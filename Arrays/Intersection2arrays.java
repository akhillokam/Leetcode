class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i : nums1){
            set.add(i);
        }

        HashSet<Integer> intersect  = new HashSet<Integer>();
        for(int i : nums2){
            if(set.contains(i)){
                intersect.add(i);
            }
        }

        int[] res = new int[intersect.size()];
        int j = 0;
        for(int i : intersect){
            res[j++] = i;
        }
        return res;
        
    }
}