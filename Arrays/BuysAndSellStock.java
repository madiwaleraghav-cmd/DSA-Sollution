/*Given an array prices[] representing stock prices, find the maximum total profit that can be earned by buying and selling the stock any number of times.

Note: We can only sell a stock which we have bought earlier and we cannot hold multiple stocks on any day.

Examples:

Input: prices[] = [100, 180, 260, 310, 40, 535, 695]
Output: 865
Explanation: Buy the stock on day 0 and sell it on day 3 = 310 - 100 = 210 and Buy the stock on day 4 and sell it on day 6 = 695 - 40 = 655 so the Maximum Profit  is = 210 + 655 = 865.*/



public class BuysAndSellStock {
    public static void main(String... args){
        int[] prices={100, 180, 260, 310, 40, 535, 695};
        int bp=prices[0],p=0,mp=0;
        for(int i=0;i<prices.length;i++){
            int sp=prices[i];
            int tp=sp-bp;
            if(tp<p){
                mp+=p;
                p=0;
                bp=prices[i];
                continue;
            }
            p=tp;
            if(i==prices.length-1){
                mp+=p;
            }
        }
        System.out.println(mp);
    }
}
