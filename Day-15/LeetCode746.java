public class LeetCode746 {
    public static int minCostClimbingStairs(int[] cost, int index){

        if(index >= cost.length){
            return 0;
        }

        return cost[index] + Math.min(minCostClimbingStairs(cost, index+1), minCostClimbingStairs(cost, index+2));
    }

    public static int minCost(int[] cost){
        return Math.min(minCostClimbingStairs(cost, 0), minCostClimbingStairs(cost, 1));
    }

    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCost(cost));
    }    
}
