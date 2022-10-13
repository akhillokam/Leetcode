class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stk = new Stack<>();
        HashSet<Integer> toRemove = new HashSet<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stk.push(i);
            } else if(s.charAt(i) == ')'){
                if(stk.isEmpty()){
                    toRemove.add(i);
                } else{
                    stk.pop();
                }
            } 
        } toRemove.addAll(stk);

        StringBuilder str = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(!toRemove.contains(i)){
                str.append(s.charAt(i));
            }
        }
        return str.toString();
    }
}