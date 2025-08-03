class Solution {
    public boolean isPerfectSquare(int num) {
        if(num>=0){
            int scr = (int)Math.sqrt(num);
            return (scr*scr==num);
        }
        return false;
    }
}