class Solution {
    public boolean isPossible(int[] target) {
        long sum = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b) -> b-a); //custom comparator to have max value at top

        for(int i=0; i<target.length;i++){
            sum += target[i];
            pq.offer(target[i]); //pushing or adding the element on to queue
        }

        while(pq.peek() != 1){
            int value = pq.poll(); //top element is max element and we poll to get it
            long diff = sum - value;

            if(diff==1) return true;

            if(diff>value || diff==0 || value%diff==0) return false; 

            value%=diff; //% in place of -
            sum = diff+value; //sum should get updated
            pq.offer(value); //putting this value again to pq for further ops
        }
        return true;
    }
}