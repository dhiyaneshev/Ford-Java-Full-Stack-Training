import java.util.Scanner;

public class MinimumCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int x, y, z;
        System.out.println("Enter x");
        x = sc.nextInt();
        System.out.println("Enter y");
        y = sc.nextInt();
        System.out.println("Enter z");
        z = sc.nextInt();

        System.out.println(x < y && x < z ? "L1" : (y < z ? "L2" : "L3" ) + " has minimal capacity");
    }
}