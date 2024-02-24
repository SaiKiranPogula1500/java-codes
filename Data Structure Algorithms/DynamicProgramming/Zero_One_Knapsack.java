package DynamicProgramming;
import java.util.ArrayList;
public class Zero_One_Knapsack {
    /*
    Question link :
    https://www.codingninjas.com/studio/problems/1072980?topList=striver-sde-sheet-problems&utm_source=striver&utm_medium=website&leftPanelTabValue=PROBLEM
    */

    /* 

    Question Description :
    A thief is robbing a store and can carry a maximum weight of ‘W’ into his knapsack. There are 'N' items available in the 
    store and the weight and value of each item is known to the thief. Considering the constraints of the maximum weight that a 
    knapsack can carry, you have to find the maximum profit that a thief can generate by stealing items.

    Note: The thief is not allowed to break the items.

   For example, N = 4, W = 10 and the weights and values of items are weights = [6, 1, 5, 3] and values = [3, 6, 1, 4]. 
   Then the best way to fill the knapsack is to choose items with weight 6, 1 and 3. The total value of knapsack = 3 + 6 + 4 = 13.

   */



	public static int knapsack(ArrayList<Integer> weight, ArrayList<Integer> value, int items, int Bag_Capacity, int[][]DP)
    {
        if(items>=weight.size() ||Bag_Capacity <=0) return 0;

        if(DP[items][Bag_Capacity] != -1) return DP[items][Bag_Capacity];

        int consider = 0;
        if(Bag_Capacity>=weight.get(items)) 
        consider = value.get(items)+knapsack(weight, value, items+1, Bag_Capacity-weight.get(items),DP);

        int not_consider = knapsack(weight, value, items+1, Bag_Capacity, DP);

        DP[items][Bag_Capacity] = Math.max(consider, not_consider);

        return DP[items][Bag_Capacity];
    }
	public static int maxProfit(ArrayList<Integer> values, ArrayList<Integer> weights, int n, int w) {
		
		//int n = values.size();
        int [][]DP = new int[n][w+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<w+1;j++){
                DP[i][j] = -1;
            }
        }
        return knapsack(weights, values, 0, w, DP);
	}
}

