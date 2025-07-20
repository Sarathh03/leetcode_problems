class Solution {
    public int minimumMoves(String s) {
        int moves =0,i=0;
        while(i<s.length()){
            if(s.charAt(i)=='X'){
               moves++;
               i =i+3;
            }
            
            else {
                i +=1;
            }
        }
        return moves;
    }
}