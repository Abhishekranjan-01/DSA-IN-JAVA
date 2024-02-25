// To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class Main {
      public static void main(String[] args) {
        System.out.println("Enter Any Word To Check Palindrom:\n");
        Scanner sc = new Scanner(System.in);
        
        String input = sc.next();
        System.out.println("Length:\t"+input.length());
        boolean isPalindrome = true;

        for(int i = 0; i <input.length()/2;i++ ){
            if(input.charAt(i) != input.charAt(input.length()-i-1)){
                isPalindrome = false;
                break;                
            }
        }

        if(isPalindrome){
            System.out.println(input+" is Palindrome");
        }else{
            System.out.println(input+" is not Palindrome");
        }
    }

}
