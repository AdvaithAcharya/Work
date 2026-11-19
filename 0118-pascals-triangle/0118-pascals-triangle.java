import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle=new ArrayList<>(numRows);
        if(numRows<=0){
            return triangle;
        }
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>(i+1);
            List<Integer> prevRow=i>0?triangle.get(i-1):null;
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    row.add(prevRow.get(j-1)+prevRow.get(j));
                }
            }
            triangle.add(row);
        }
        return triangle;
    }
}