// Input a number and print all the factors of that number (use loops).

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter The Number:\t");
        int number = sc.nextInt();
        int i =1;

        while (i<=(number/2)) {
            if(number%i==0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println(number);
    }
}