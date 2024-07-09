import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter number:\t");
        Scanner sc= new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
                
    }

    static boolean isPalindrome(int num){
       
        final int palindrome = num;
        int rem=0,rev=0;

       while (num!=0) {
        rem = num%10;               
        num = num/10;               
        rev = rev*10 + rem;         
       } 

        return palindrome == rev;
}}