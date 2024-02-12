import java.util.Scanner;

public class FoodBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;

        while(flag==0) {
            System.out.println("---------------Hotel TAJ--------------\n" +
                    "1.\tCAKES (2 USD)\n" +
                    "2.\tCOOLDRINK (1 USD)\n" +
                    "3.\tSNAKS (3 USD)\n" +
                    "4.\tCURRIES (4 USD)\n" +
                    "5.\tEXIT");
            System.out.print("ENTER THE FOOD ITEM CODE: ");
            String code = sc.nextLine();
            int packs;

            switch (code) {
                case "1":
                    System.out.print("No.of packs : ");
                    packs = sc.nextInt();
                    System.out.println("Pay amount: " + 2 * packs + " UDS");

                    break;
                case "2":
                    System.out.print("No.of packs : ");
                    packs = sc.nextInt();
                    System.out.println("Pay amount: " + packs + " UDS");
                    break;
                case "3":
                    System.out.print("No.of packs : ");
                    packs = sc.nextInt();
                    System.out.println("Pay amount: " + 3 * packs + " UDS");
                    break;
                case "4":
                    System.out.print("No.of packs : ");
                    packs = sc.nextInt();
                    System.out.println("Pay amount: " + 4 * packs + " UDS");
                    break;
                case "5":
                    flag = 1;
                    break;
                default:
                    System.out.println("Enter only numbers from 1 to 5");
                    break;
            }
        }

    }
}