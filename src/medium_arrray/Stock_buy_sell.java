package medium_arrray;

public class Stock_buy_sell {
	static int maxProfit(int[] prices) {
		int profit = 0;
		int lowprice = prices[0];
		for (int i = 1; i < prices.length; i++) {

			if (lowprice > prices[i]) {
				lowprice = prices[i];
			} else {
				int potential = prices[i] - lowprice;
				if (profit < potential) {
					profit = potential;
				}

			}

		}

		return profit;

	}

	public static void main(String[] args) {
		int[] prices = { 2, 1, 2, 0, 1 };

		System.out.println(maxProfit(prices));

	}
}
