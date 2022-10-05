class Solution {
    public int firstUniqChar(String s) {
        int[] count = new int[26];
        // build char count bucket : <charIndex, count>
        for(int i=0; i<s.length();i++){
            int index = s.charAt(i) - 'a';
            count[index]++;
        }

        for(int i=0; i<s.length(); i++){
            int index = s.charAt(i) - 'a';
            if(count[index] == 1){
                return i;
            }
        }
        return -1;
        //Also can use s.indexOf(s.charAt(i)) == s.lastindexOf(s.charAt(i))
        
    }
}
