package CardDetails;

import java.util.Scanner;

public class CardMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Payback Card\n" +"2.Membership Card\n");
        System.out.print("Select the Card: ");
        int cardType = sc.nextInt();

        System.out.println("Enter the Card Details:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] values = input.split("\\|");

        switch(cardType){
            case 1:
                System.out.println("Enter points in card:");
                Integer pointsEarned = sc.nextInt();
                System.out.println("Enter Amount:");
                Double totalAmount = sc.nextDouble();
                PaybackCard paybackCard = new PaybackCard(values[0],values[1],values[2],pointsEarned,totalAmount);
                System.out.println(paybackCard.getHolderName()+"'s Payback Card Details:");
                System.out.println("Card Number - "+paybackCard.getCardNumber());
                System.out.println("Point Earned - "+paybackCard.getPointsEarned());
                System.out.println("Total Amount - "+paybackCard.getTotalAmount());

                break;
            case 2:
                System.out.println("Enter Integer pointsEarned:");
                Integer rating = sc.nextInt();
                MembershipCard membershipCard = new MembershipCard(values[0],values[1],values[2],rating);
                System.out.println(membershipCard.getHolderName()+"'s Payback Card Details:");
                System.out.println("Card Number - "+membershipCard.getCardNumber());
                System.out.println("Rating - "+membershipCard.getRating());

                break;
        }
    }
}