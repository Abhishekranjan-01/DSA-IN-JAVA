// Find if a number is palindrome or not

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number:\t");

        int input = sc.nextInt();
        int number = input;
        int rem=0,rev = 0;

        while (number!=0) {
            
            rem = number%10;
            number = number/10;

            rev = rev*10+rem;
        }
        if(rev==input){
            System.out.println(rev+" Is Palindrome");
        }else{
             System.out.println(rev+" Is Not Palindrome");
        }
        

    }    
}
