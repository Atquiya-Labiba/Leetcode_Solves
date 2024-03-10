class Solution {
    public int maximumWealth(int[][] accounts) {
        int [] sum_arr=new int[accounts.length];       
        for (int row=0;row<accounts.length;row++){
            int total=0;
            for(int col=0;col<accounts[row].length;col++){
                total=total+accounts[row][col];                
            }
            sum_arr[row]=total;
        } 
        
        int max=0;
        for(int i=0;i<sum_arr.length;i++){
            if (sum_arr[i]>max){
                max=sum_arr[i];
            }
        }
        return max;
    }
}