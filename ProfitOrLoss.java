import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		double x, y, z;
		double costPrice;
		double profit, profitPercent;
        System.out.println("Enter the number of dozens of toys purchased");
        x = sc.nextDouble();
        System.out.println("Enter the price per dozen");
        y = sc.nextDouble();
        System.out.println("Enter the selling price of 1 toy");
        z = sc.nextDouble();

        costPrice = y / 12.0;
        profit = z - costPrice;
        profitPercent = 100 * profit / costPrice;
        System.out.println("Sam's profit percentage is " + profitPercent + " percent");


    }
}