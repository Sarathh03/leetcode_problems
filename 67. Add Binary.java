class Solution {
    public String addBinary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int carry  =0;
        int x  = a.length()-1;
        int y = b.length()-1;
        while(x>=0||y>=0||carry==1){
            if(x>=0){
                carry +=a.charAt(x--)-'0';
            }
            if(y>=0){
                carry +=b.charAt(y--)-'0';
            }
            s.append(carry%2);
            carry/=2;
            

        }return s.reverse().toString();
    }
}