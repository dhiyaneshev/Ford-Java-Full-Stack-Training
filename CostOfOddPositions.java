import java.util.Scanner;

public class CostOfOddPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] mobilePrices = new int[6];
		int counter;
		
		System.out.println("Enter 6 mobile prices:");
        for(counter = 0; counter < 6; counter++){
            mobilePrices[counter] = sc.nextInt();
        }

        int oddPositionstotalCost = 0;

        for(counter = 1; counter < 6; counter+=2){
            oddPositionstotalCost+=mobilePrices[counter];
        }

        System.out.println("Sum of odd positions: "+oddPositionstotalCost);
    }
}