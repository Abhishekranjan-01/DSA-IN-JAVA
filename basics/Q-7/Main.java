// To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("How Many Numbers You Want Of Fibonacci Series(in sequence)");
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        System.out.println(num1);
        System.out.println("Fibonacci Series Upto "+count+" : ");

        while (count >= 1) {
            sum = num1+num2;
            System.out.println(sum);
            num2=num1;
            num1=sum;

            count--;
        }
    }
}
