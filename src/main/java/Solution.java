import java.util.HashMap;

class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        HashMap<Integer, Integer> cache = new HashMap<>();

        int result = 0;

        for(int i = 0; i < worker.length; i++){

            int intermediate_profit = 0;

            for(int j = 0; j < difficulty.length; j++){

                if(difficulty[j] <= worker[i]){

                    intermediate_profit = Math.max(intermediate_profit, profit[j]);
                }

            }

            result += intermediate_profit;

        }

        return result;
    }
}