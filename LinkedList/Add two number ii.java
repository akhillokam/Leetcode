//O(m+n), O(Max(m,n)) - m,n are elements in Lists
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stk1 = new Stack();
        Stack<Integer> stk2 = new Stack();
        
        while(l1!=null){
            stk1.add(l1.val);
            l1=l1.next;
        }
        
        while(l2!=null){
            stk2.add(l2.val);
            l2=l2.next;
        }
        
        //Least significant digits will at the top, easy to add as LIFO
        int carry = 0;
        ListNode res = null;
        while(!stk1.isEmpty() || !stk2.isEmpty()){
            int a=0, b=0;
            
            if(!stk1.isEmpty()){
                a=stk1.pop();
            }
            
            if(!stk2.isEmpty()){
                b=stk2.pop();
            }
            
            int total = a+b+carry;
            
            ListNode temp = new ListNode(total%10);
            carry = total/10;
            
            if(res==null){
                res=temp;
            } else {
                temp.next = res;
                res=temp;
            }
            
        }
        
        if(carry !=0){
            ListNode temp = new ListNode(carry);
            temp.next = res;
            res = temp;
        }
        return res;   
    }
}