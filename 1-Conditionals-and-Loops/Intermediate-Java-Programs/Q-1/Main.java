// Factorial Program In Java

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter The Number Get It's Factorial:\t");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int fact=1;
        for(int i = 2;i<=input;i++){
            fact *= i;
        }
        System.out.println("Factorial Of "+input+" Is :\t"+fact);
    }
}