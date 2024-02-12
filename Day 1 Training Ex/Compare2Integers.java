import java.util.Scanner;

public class Compare2Integers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int x = sc.nextInt();
        System.out.println("Enter the second number");
        int y = sc.nextInt();
        System.out.println(x+(x>y?" is greater than ":(x==y? " is equal to " : " is lesser than "))+y);
    }
}