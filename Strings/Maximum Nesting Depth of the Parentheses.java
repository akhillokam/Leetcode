//O(n), O(1)
class Solution {
    public int maxDepth(String s) {
     int depth = 0, count = 0;
     for(char c : s.toCharArray())   {
         if(c == '('){ 
             count++;
         } else if (c == ')'){
             count--;
         }
         depth = Math.max(depth, count);
     }
     return depth;
    }
}