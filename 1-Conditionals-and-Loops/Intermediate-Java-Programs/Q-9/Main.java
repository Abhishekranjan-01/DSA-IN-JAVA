// Calculate Batting Average

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number Of Of Runs Scored By Batter:\t");
        int runs = sc.nextInt();

        System.out.print("\nEnter Number Of Innings:\t");
        int numberOfInnings = sc.nextInt();

        System.out.print("\nEnter Number Of Not Outs:\t");
        int numberOfNotOuts = sc.nextInt();

        float numberOfTimesBatterWasDismissed = numberOfInnings-numberOfNotOuts;

        System.out.println("Batter's Batting Average Is:\t"+runs/numberOfTimesBatterWasDismissed);
    }
}
