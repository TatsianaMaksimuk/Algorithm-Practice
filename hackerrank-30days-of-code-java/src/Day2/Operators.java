package Day2;

public class Operators {
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        // Write your code here
        double tip_cost = (meal_cost/100) * tip_percent;
        double tax_cost = (meal_cost/100) * tax_percent;
        double total_cost = meal_cost+tip_cost+tax_cost;
        // System.out.print((int)total_cost) - gives an int, we need double;
        System.out.print(Math.round(total_cost));

    }
}
