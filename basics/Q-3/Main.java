// Write a program to input principal, time, and rate (P, T, R) from the user and
// find Simple Interest.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome To Program Of Simple Interest:-");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Principal Amount:\t");
        float principal = input.nextFloat();
        System.out.print("Enter The Rate :\t");
        float rate = input.nextFloat();
        System.out.print("Enter The Time :\t");
        float interest = input.nextFloat();

        System.out.println("Simple Interest =\t"+(principal*rate*interest)/100);
    }
}
