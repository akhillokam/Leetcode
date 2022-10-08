//TC - O(nlogk)
//SC - O(n)
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>(); //create a map to count the values of each string
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1); //iterate and put each word in map and if seen first default to 0 and add 1 or add 1 to existing value of string
        }

        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator <String>() {
            @Override //comparing two strings with their frequencies
            public int compare(String word1, String word2){
                int freq1 = map.get(word1);
                int freq2 = map.get(word2);
                if(freq1 == freq2) return word2.compareTo(word1); //string with greater alphabetical order will come first
                return freq1 - freq2; //sort by lesser frequency
            }
        });
        
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            pq.add(entry.getKey()); //add string in priority queue
            if(pq.size() > k) pq.poll();
        }

        List<String> res = new ArrayList<>();
        while(!pq.isEmpty()) res.add(pq.poll());

        Collections.reverse(res);

        return res;
    }
}