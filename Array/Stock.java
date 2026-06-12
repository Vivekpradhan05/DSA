//Time Complexity O(n)

import java.util.*;
class Stock
{
    public static int BuyStock(int num[])
    {
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;

        for( int i=0; i<num.length; i++)
        {
            if(buyPrice < num[i])
            {
                int profit = num[i] - buyPrice; //todays profit
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyPrice = num[i];
            }
        }
        return maxProfit;

    }
    public static void main(String args[])
    {
        int num[] = {7,1,5,3,6,4};
        System.out.println(BuyStock(num));
    }
}