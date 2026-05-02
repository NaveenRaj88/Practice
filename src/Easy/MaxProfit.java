package Easy;

public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        int i=0;
        while(i < prices.length-1){
            if(min > prices[i]){
                min = prices[i];
            }
            if(max < prices[i+1]-min){
                max = prices[i+1]-min;
            }
            i++;
        }
        if(max < 0){
            return 0;
        }
        return max;
    }
}
