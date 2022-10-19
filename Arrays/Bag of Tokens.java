//O(nlogn), O(1)
class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int points=0;
        int maxPoints=0;
        int i=0;
        int j=tokens.length -1;
        while(i <= j){
            if(power >= tokens[i]){
                points++; //increasing poitns
                power -= tokens[i++]; //decreasing power
                maxPoints = Math.max(maxPoints, points);
            } else if( points > 0){ // taking back power by giving off the point 
                points--; //decreasing poitns
                power += tokens[j--];  //increasing power
            } else {
                return maxPoints;
            }
        }
        return maxPoints;
    }
}