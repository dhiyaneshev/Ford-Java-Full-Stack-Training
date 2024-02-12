import java.util.Scanner;

public class CalculateDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int discount;
		double item1Price, item2Price;
		double totalAmount;
        System.out.print("Cost of item 1 : ");
        item1Price = sc.nextDouble();
        System.out.print("Cost of item 2 : ");
        item2Price = sc.nextDouble();
        System.out.print("Discount(in %) : ");
        discount = sc.nextInt();

        totalAmount = item1Price + item2Price;
        System.out.println("Total: "+totalAmount);

        double amountDiscounted = (double) (discount/100.0)*totalAmount;
        double discountedAmount = (double) (totalAmount-amountDiscounted);
        System.out.println("Discounted amount : "+String.format("%.2f",discountedAmount));
        System.out.println("Saved amount : "+String.format("%.2f",amountDiscounted));
    }
}