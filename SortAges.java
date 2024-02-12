import java.util.Arrays;
import java.util.Scanner;

public class SortAges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ages[] = new int[6];

        System.out.println("Enter 6 student ages:");
        for(int i=0;i<6;i++){
            ages[i] = sc.nextInt();
        }

        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                if(ages[i]>ages[j]){
                    int t = ages[i];
                    ages[i] = ages[j];
                    ages[j] = t;
                }
            }
        }

        System.out.println("Students ages in Ascending Order):");
        for(int i=0;i<6;i++){
            System.out.println(ages[i]);
        }

        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                if(ages[i]<ages[j]){
                    int t = ages[i];
                    ages[i] = ages[j];
                    ages[j] = t;
                }
            }
        }

        System.out.println("Students ages in Descending Order:");
        for(int i=0;i<6;i++){
            System.out.println(ages[i]);
        }

    }
}