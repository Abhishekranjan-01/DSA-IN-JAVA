// Java Program Vowel Or Consonant

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Alphabet To Check Whether It Is Vowel Or Consonant:\t");
        char character = sc.next().charAt(0);

        if(character=='a'|| character=='A' || character=='e' || character=='E' || character=='i' || character=='I' || character=='o' || character=='O' || character=='u' || character=='U'){
            System.out.println(character + " Is :\t"+"Vowel");
        }
        else
        {
            System.out.println(character + " Is :\t"+"Consonant");
        }
    }    
}
