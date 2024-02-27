// Calculate Electricity Bill

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number Of Units Consumed By The User:\t");
        int numberOfUnits = sc.nextInt();

        System.out.println("Enter Rate Per Unit Consumed:\t");
        float rate = sc.nextFloat();

        System.out.println("Enter Tax Percent On The Bill");
        float tax = sc.nextFloat();

        float billBeforeTax = numberOfUnits*rate;
        float  taxOnTheBill = (tax*billBeforeTax)/100;

        System.out.println("Final Bill After Tax:\t"+(taxOnTheBill+billBeforeTax));
    }
}
