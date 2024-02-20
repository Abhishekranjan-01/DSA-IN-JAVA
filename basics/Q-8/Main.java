// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
        System.out.println("Enter Any Number To Check Palindrom:\n");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        int rem =0;
        int rev = 0;
        int num = input;

        while (num!=0) {
            rem = num%10;
            num =num/10;
             
            rev = (rev*10)+rem;
        }
        if(input == rev){
            System.out.println(input+" is Palindrome");
        }else{
            System.out.println(input+" is not Palindrome");
        }
    }

}
