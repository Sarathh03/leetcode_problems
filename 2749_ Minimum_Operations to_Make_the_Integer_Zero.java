class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(long k=1; ;k++){
            long targetsum = num1-k*num2;
            if(targetsum<0){break;}  
            if(Long.bitCount(targetsum)<=k && k<=targetsum){
                return (int)k;
            }
        }
        return -1;
    }
}