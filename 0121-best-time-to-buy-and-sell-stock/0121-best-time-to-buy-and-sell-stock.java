class Solution {
    public int maxProfit(int[] prices) {
       
       int maxp=0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            
            if(prices[i]<min){
                min=prices[i];
            }
            else{
              int  p=prices[i]-min;
              if(p>maxp){
                maxp=p;
              }
            }
        }
        return maxp;
    }
}