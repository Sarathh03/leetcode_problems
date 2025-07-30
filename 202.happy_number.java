class Solution {
    public boolean isHappy(int n) {
       if(n==1||n==7){
        return true;
       } else if(n<10) return false;
       else{
        int sum=0;
        while(n>0){
            int temp = n%10;
            sum+=temp*temp;
            n/=10;
        }
        return isHappy(sum);
       }
    }
}

// This function determines if a number is a happy number using recursion.
// A happy number eventually reaches 1 when replaced by the sum of the squares of its digits.
// If the number becomes a single-digit and is not 1 or 7, it is considered unhappy.
