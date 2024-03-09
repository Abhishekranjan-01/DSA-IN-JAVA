// Reverse A String In Java

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The String:\t");
        
        String input = sc.next();
        String reverse = "" ;

        for(int i =0;i< input.length();i++){
            reverse = reverse + input.charAt((input.length()-i-1));

        }
        System.out.println("Reverse Of "+input+" Is :\t"+reverse);

    }
}
