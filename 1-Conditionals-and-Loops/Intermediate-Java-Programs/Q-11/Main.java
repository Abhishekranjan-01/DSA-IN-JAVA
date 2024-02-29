// Compound Interest Java Program

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount:\t");
        int principal = sc.nextInt();

        System.out.print("\nEnter Interest % Which Will Levied On Each Year:\t");
        float interest = sc.nextInt();

        System.out.print("Enter Number Of Years:\t");
        float year = sc.nextFloat();


        System.out.println("Compound Interest In "+year+" Year Is :\t"+principal*(Math.pow((1+(interest/100)),year)-1));

    }
}
