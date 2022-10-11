class Solution {
    public String countAndSay(int n) {
        if(n<=0) return "";
        String res = "1";
        while(n > 1){ //until all elements are visited
            StringBuilder curr = new StringBuilder(); //Stringbuffer because it is mutable
            for(int i=0; i<res.length(); i++){
                int count = 1;
                while(i+1 < res.length() && res.charAt(i) == res.charAt(i+1)){
                    count++;
                    i++;
                }
                curr.append(count).append(res.charAt(i));
            }
            res = curr.toString();
            n--;
        }
        return res;
    }
}