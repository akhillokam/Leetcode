<<<<<<< HEAD
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> orderMap = new HashMap<>();

        for(int i =0; i<order.length(); i++){
            orderMap.put(order.charAt(i),i);
        }

        for(int i=0; i<words.length-1;i++){
            for(int j=0; j<words[i].length(); j++){
                if(j >= words[i+1].length()){
                    return false;
                }

                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    int curr_letter = orderMap.get(words[i].charAt(j));
                    int next_letter = orderMap.get(words[i+1].charAt(j));

                    if(next_letter < curr_letter){
                        return false;
                    } else { break; }
                }
            }
        }
        return true;
    }
=======
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character,Integer> orderMap = new HashMap<>();

        for(int i =0; i<order.length(); i++){
            orderMap.put(order.charAt(i),i);
        }

        for(int i=0; i<words.length-1;i++){
            for(int j=0; j<words[i].length(); j++){
                if(j >= words[i+1].length()){
                    return false;
                }

                if(words[i].charAt(j) != words[i+1].charAt(j)){
                    int curr_letter = orderMap.get(words[i].charAt(j));
                    int next_letter = orderMap.get(words[i+1].charAt(j));

                    if(next_letter < curr_letter){
                        return false;
                    } else { break; }
                }
            }
        }
        return true;
    }
>>>>>>> f81769938b98f1679d6e2226cd5f0a6ab18d4e59
}