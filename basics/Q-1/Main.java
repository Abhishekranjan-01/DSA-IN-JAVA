// Write a program to print whether a number is even or odd, also take
// input from the user.

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter The Number:\t");
        int number = input.nextInt();
        if(number%2==0){
            System.out.println(number+" is Even");
        }else{
            System.out.println(number+" is not Odd");
        }

        
    }
}