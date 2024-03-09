// Write a program to print the sum of negative numbers, sum of positive even numbers and the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Start Entering The Number & Press 0 To Exit:\t");

         int number = 1;
        
        int sumOfNegativeNumbers = 0;
        int sumOfPositiveEvenNumbers = 0;
        int sumOfPositiveOddNumbers = 0;

        while (number!=0) {
           number = sc.nextInt();
            if(number<0)
                sumOfNegativeNumbers-=number;

            else if(number>=0 && number%2==0)
                sumOfPositiveEvenNumbers+=number;

            else if(number>=0 && number%2!=0)
                sumOfPositiveOddNumbers+=number;
        }

        System.out.println("Sum Of Negative Numbers:\t"+sumOfNegativeNumbers);
        System.out.println("Sum Of Positive Even Numbers:\t"+sumOfPositiveEvenNumbers);
        System.out.println("Sum Of Positive Odd Numbers:\t"+sumOfPositiveOddNumbers);
    }
}
