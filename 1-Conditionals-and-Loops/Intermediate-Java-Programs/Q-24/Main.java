// Sum Of A Digits Of Number

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number To Get It's Sum Of Digits:\t");
        int number = sc.nextInt();

        int rem=0,sum=0;
        while (number!=0) {
            rem = number%10;
            number = number/10;

            sum+=rem;
        }
        System.out.println("Sum Of "+number+"'s Digits Is : \t"+sum);
    }
}
