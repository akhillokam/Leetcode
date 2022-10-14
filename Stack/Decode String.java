//O(maxK*n)
//O(m+n)
class Solution {
    public String decodeString(String s) {
        Stack<Integer> numstk = new Stack();
        Stack<StringBuilder> strstk = new Stack();
        StringBuilder str = new StringBuilder();
        int num =0;

        for(char c : s.toCharArray()){
            //4 types of char : [,],digit,letter
            if(c>='0' && c<='9'){ //default function is Character.isDigit()
                num = num*10 + c -'0'; //this is if there are digits like 30 or 300
            } else if(c == '['){
                strstk.push(str);
                str = new StringBuilder();

                numstk.push(num);
                num=0;
            } else if(c ==']'){
                StringBuilder temp = str;
                str=strstk.pop();
                int count = numstk.pop();

                while(count-->0){
                    str.append(temp);
                }
            } else{
                str.append(c);
            }            
        }
        return str.toString();
    }
}