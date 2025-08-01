import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ans = new ArrayList<>();
       for(int i=0;i<numRows;i++){
        List<Integer>temp = new ArrayList<>();
        for(int j=0;j<=i;j++){
            if(j==0||i==j){
                temp.add(1);
            }
            else{
                List<Integer> pre = ans.get(i-1);
                temp.add(pre.get(j)+pre.get(j-1));
            }
           
        } ans.add(temp);
        
       } return ans;
    }
}


//This code generates Pascal’s Triangle with numRows rows. 
//Each row starts and ends with 1. The inner numbers are calculated by adding the two numbers directly above it from the previous row. 
//All rows are stored in a list of lists and returned at the end.