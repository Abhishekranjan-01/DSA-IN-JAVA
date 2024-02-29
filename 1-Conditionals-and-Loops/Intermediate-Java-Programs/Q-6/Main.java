// Calculate Commission Percentage

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Commission Base:\t");
        float commissionBase = sc.nextFloat();

        System.out.println("Enter Commission Rate/Percent:\t");
        float commissionRate = sc.nextFloat();

        System.out.println("The Commission You Will Get On Sell Of "+commissionBase+" Is :\t"+commissionBase*(commissionRate/100));

        
    }
}
